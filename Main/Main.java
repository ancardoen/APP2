package Main;

import Datos.Leer_csv;
import Datos.Libro;
import UI.Menus;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Leer el csv
        List<Libro> libros = Leer_csv.csvRead();
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