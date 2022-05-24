package Main;

import Datos.Libro;
import Exceptions.CSVNotFoundException;
import Managers.FileManager;
import Managers.DataManager;
import Managers.SearchManager;
import UI.Menus;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class APP2 {
    public static void main(String[] args) throws IOException, CSVNotFoundException {
        //Setear los datos
        String theFile = "inventario.csv";
        FileManager f = new FileManager(theFile);
        DataManager.getInstance().setData(f.getData());
        HashSet<Libro> resultados = SearchManager.getInstance().findPersonByAttribute(Tittles.NAME, "Mary");

        //Mostrar el menu
        Menus menu_activo = new Menus();
        menu_activo.mostrar_menu();
        //Pedir una opcion
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // Llamar al menu con la opcion "num"
        menu_activo.ejecutar(num);
    }
}