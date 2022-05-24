package Managers;

import Datos.Libro;
import Exceptions.CSVNotFoundException;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;

public class FileManager {
    private File theFile;
    private String[] titles = {"id","titulo","autor","anno","estante_numero","estante_seccion","piso","edificio","sede"};

    public FileManager(String fileName) throws CSVNotFoundException {
        this.theFile = new File(fileName);
        if (!theFile.exists()){
            throw new CSVNotFoundException();
        }
    }

    public HashSet<Libro> getData() {
        List<Libro> beans = null;
        try {
            FileReader ff = new FileReader(theFile, Charset.forName("UTF-8"));
            beans = new CsvToBeanBuilder(ff)
                    .withType(Libro.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            System.err.println("No existe el archivo");
        } catch (IOException e) {
            System.err.println("No se puede leer el archivo");
        }
        //  Collections.sort(beans);
        HashSet<Libro> personasFinales = new HashSet();
        personasFinales.addAll(beans);
        return personasFinales;
    }

}
