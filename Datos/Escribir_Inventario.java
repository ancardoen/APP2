package Datos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import com.opencsv.CSVWriter;

public class Escribir_Inventario {
    private void doWrite() throws IOException{
        CSVWriter writer = new CSVWriter(new FileWriter("inventario.csv"));
    }
}
