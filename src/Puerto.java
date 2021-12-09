import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }



    public void mostrarContenedores() {
        System.out.println(contenedores);
    }

    public void agregarContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public int cantidadContenedoresPeligrosos() {
        int cantidad = 0;
        for (Contenedor contenedor: this.contenedores  ){
            if(contenedor.getPais().equals("Desconocida") && contenedor.isMarca()){
                cantidad += 1;
            }
        }
        return cantidad;
    }
}
