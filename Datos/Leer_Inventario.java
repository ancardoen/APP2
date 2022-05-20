package Datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Archivo {

    private String nombre;
    private File internalFile;

    public Archivo(String nombre) {
        this.nombre = nombre;
        internalFile = new File(nombre);
    }

    public List<Libro> leerDatos() throws IOException {
        List<Libro> libros = new ArrayList<Libro>();
        File r = new File("./Ejemplo.txt");
        r.createNewFile();
        Scanner obj = null;
        try {
            obj = new Scanner(internalFile);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe!");
        } finally {
            System.out.println("Adios!");
        }
        return libros;
    }
}

