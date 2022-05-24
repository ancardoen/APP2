package Main;

import Exceptions.CSVNotFoundException;
import Managers.FileManager;
import Managers.DataManager;
import UI.Menus;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class APP2 {
    public static void main(String[] args) throws FileNotFoundException, CSVNotFoundException {
        //Setear los datos
        private File theFile = "inventario.csv";
        FileManager f = new FileManager(theFile);
        DataManager.getInstance().setData(f.getData());
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