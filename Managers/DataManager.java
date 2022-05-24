package Managers;

import Datos.Libro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;

public class DataManager {
    private HashSet<Libro> data;
    private static DataManager instance;

    private  DataManager(){
    }

    public static DataManager getInstance(){
        if (instance == null){
            instance = new DataManager();
            SearchManager.getInstance();
        }
        return instance;
    }
    public void setData(HashSet<Libro> data) {
        this.data = data;
    }



}
