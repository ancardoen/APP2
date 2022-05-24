package Managers;

import Datos.Libro;
import Datos.Titulos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public class SearchManager {

    private static LevenshteinDistance lv = new LevenshteinDistance();

    private static SearchManager instance;

    private SearchManager(){

    }

    public static SearchManager getInstance(){
        if (instance == null){
            instance = new SearchManager();
        }
        return instance;
    }

    public HashSet<Libro> findPersonByAttribute(Titulos title, String theSearch){
        //ahora instancio un mapa con esas claves
        HashSet<Libro> data = DataManager.getInstance().getData();;
        HashSet<Libro> ciudadanos = new HashSet<Libro>();
        for (Libro p : data){
            //Uso lo mismo que en el data manager
            Class<?> classObj = p.getClass();
            Method printMessage = null;
            try {
                String camelCase = CaseUtils.toCamelCase(title.getVal(), true);
                printMessage = classObj.getDeclaredMethod("get"+camelCase);
                String filterName = String.valueOf(printMessage.invoke(p));

                // si es un numero entonces no uso distancia de leventeihns
                if (printMessage.getReturnType().isPrimitive() ||
                        printMessage.getReturnType().isAssignableFrom(Integer.class)){
                    if (theSearch.trim().equalsIgnoreCase(filterName)){
                        ciudadanos.add(p);
                    }
                } else {
                    //Con una distancia de 3 estamos bien cubiertos
                    if (lv.apply(theSearch, filterName) < 4){
                        ciudadanos.add(p);
                    }
                }


            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

        }
        return ciudadanos;
    }

}
