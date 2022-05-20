package UI;

public class Menus {
    private int opcion;

    public void mostrar_menu(){
        System.out.println("Menu de opciones: ");
        System.out.println("1) Mostrar base de datos");
        System.out.println("2) Agregar un nuevo libro");
        System.out.println("3) Quitar un libro");
        System.out.println("4) Editar un libro");
        System.out.println("5) Agregar o quitar una sede");
        System.out.println("6) Agregar o quitar una seccion");
        System.out.println("7) Agregar o quitar un piso");
        System.out.println("8) Buscar un libro");
        System.out.println("9) Salir  del programa");
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
                default:
                    System.out.println("Por favor elija un opcion valida");
                    break;
            }
        }
    }
}
