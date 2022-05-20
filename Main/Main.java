package Main;

import UI.Menus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leer el csv

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