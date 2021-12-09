
public class Main {
    public static void main(String[] args) {
        Contenedor contenedor1 = new Contenedor(1, "china",true);
        Contenedor contenedor2 = new Contenedor(2, "Desconocida",true);
        Contenedor contenedor3 = new Contenedor(5, "Desconocida",true);
        Contenedor contenedor4 = new Contenedor(4, "Desconocida",true);
        Puerto puertoColombia = new Puerto("colombia");

        puertoColombia.agregarContenedor(contenedor1);
        puertoColombia.agregarContenedor(contenedor2);
        puertoColombia.agregarContenedor(contenedor3);
        puertoColombia.agregarContenedor(contenedor4);

        puertoColombia.mostrarContenedores();
        System.out.println(puertoColombia.cantidadContenedoresPeligrosos());
    }
}
