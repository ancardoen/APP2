package UI;

public class Menus {
    private int opcion;

    public void mostrar_menu(){
        System.out.println("Menu de opciones: ");
        System.out.println("1)  Mostrar base de datos");
        System.out.println("2)  Agregar un nuevo libro");
        System.out.println("3)  Quitar un libro");
        System.out.println("4)  Editar un libro");
        System.out.println("5)  Agregar una sede");
        System.out.println("6)  Quitar una sede");
        System.out.println("7)  Agregar una seccion");
        System.out.println("8)  Quitar una seccion");
        System.out.println("9)  Agregar un piso");
        System.out.println("10) Quitar un piso");
        System.out.println("11) Buscar un libro");
        System.out.println("12) Salir  del programa");
    }

    public void ejecutar(int opcion){
        boolean flag = true;
        while(flag) {
            switch (opcion) {
                case 1:

                    flag = false;
                    break;
                case 2:

                    flag = false;
                    break;
                case 3:

                    flag = false;
                    break;
                case 4:

                    flag = false;
                    break;
                case 5:

                    flag = false;
                    break;
                case 6:

                    flag = false;
                    break;
                case 7:

                    flag = false;
                    break;
                case 8:

                    flag = false;
                    break;
                case 9:

                    flag = false;
                    break;
                case 10:

                    flag = false;
                    break;
                case 11:

                    flag = false;
                    break;
                case 12:
                    flag = false;
                    break;
                default:
                    System.out.println("Por favor elija un opcion valida");
                    break;
            }
        }
    }
}
