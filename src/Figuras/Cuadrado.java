package Figuras;

public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del cuadrado es: " + (this.lado * this.lado));
    }

}
