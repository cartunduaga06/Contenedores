public class Contenedor {
    private int identificacion;
    private String pais;
    private boolean marca;

    public Contenedor(int identificacion, String pais, boolean marca) {
        this.identificacion = identificacion;
        this.pais = pais;
        this.marca = marca;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getPais() {
        return pais;
    }

    public boolean isMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "identificacion=" + identificacion +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                '}';
    }
}
