package Datos;

import com.opencsv.bean.CsvBindByName;

public class Libro {
    public Libro() {
    }

    @CsvBindByName(column = "id")
    private String id;
    @CsvBindByName(column = "titulo")
    private String titulo;
    @CsvBindByName(column = "autor")
    private String autor;
    @CsvBindByName(column = "anno")
    private String anno;
    @CsvBindByName(column = "estante_numero")
    private String estante_numero;
    @CsvBindByName(column = "estante_seccion")
    private String estante_seccion;
    @CsvBindByName(column = "piso")
    private String piso;
    @CsvBindByName(column = "edificio")
    private String edificio;
    @CsvBindByName(column = "sede")
    private String sede;

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnno() {
        return anno;
    }

    public String getEstante_numero() {
        return estante_numero;
    }

    public String getEstante_seccion() {
        return estante_seccion;
    }

    public String getPiso() {
        return piso;
    }

    public String getEdificio() {
        return edificio;
    }

    public String getSede() {
        return sede;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnno(String anno) {
        this.anno = anno;
    }
    public void setEstante_numero(String estante_numero) {
        this.estante_numero = estante_numero;
    }
    public void setEstante_seccion(String estante_seccion) {
        this.estante_seccion = estante_seccion;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
}

