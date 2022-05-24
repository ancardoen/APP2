package Datos;

public enum Titulos {

    TITULO("titulo"),AUTOR("autor"),ANNO("anno"),NUMERO("estante_numero"),SECCION("estante_seccion"),PISO("piso"),EDIFICIO("edificio"),SEDE("sede");

    private String val;

    public String getVal() {
        return val;
    }

    Titulos(String val) {
        this.val = val;
    }
}
