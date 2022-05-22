package Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class  Leer_csv {
    static List<Libro> listLibros;

    // Este metodo retorna una lista obtenida de la tabla en CSV
    public static List<Libro> csvRead(){
        BufferedReader bufferReader = null;
        try {
            // Abrir el .csv en buffer de lectura
            bufferReader = new BufferedReader(new FileReader("Datos/inventario.csv"));

            // Leer primera línea del archivo
            String line = bufferReader.readLine();
            listLibros = new ArrayList<Libro>();

            while (line != null) {
                // Separar la linea leída con el separador definido previamente
                String[] campos = line.split(",");

                Libro libro = new Libro();
                libro.setId(campos[0]);
                libro.setTitulo(campos[1]);
                libro.setAutor(campos[2]);
                libro.setAnno(campos[3]);
                libro.setEstante_numero(campos[4]);
                libro.setEstante_seccion(campos[5]);
                libro.setPiso(campos[6]);
                libro.setEdificio(campos[7]);
                libro.setSede(campos[8]);

                listLibros.add(libro);

                // leer siguiente línea del fichero
                line = bufferReader.readLine();
            }
            return listLibros;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // Cierro el buffer de lectura
            if (bufferReader != null) {
                try {
                    bufferReader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
