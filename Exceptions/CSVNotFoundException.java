package Exceptions;

public class CSVNotFoundException extends Exception {

    public CSVNotFoundException() {
        super("El Archivo que se paso como parametro no existe!");
    }
}