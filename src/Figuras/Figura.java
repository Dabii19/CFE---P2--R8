package Figuras;

public class Figura {

    //Si no tiene visibilidad por defecto queda en publico
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void calcularArea() {
        System.out.println("Figura no definida");
    }


}
