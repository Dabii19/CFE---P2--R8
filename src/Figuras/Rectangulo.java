package Figuras;

public class Rectangulo extends Figura {

    private int largo;
    private int ancho;

    public Rectangulo(String nombre, int largo, int ancho) {

        super(nombre);
        this. largo = largo;
        this.ancho = ancho;
    }

    // Polimorfismo usa el calcularArea en las diferentes clases pero de otra forma
    @Override
    public void calcularArea() {
        System.out.println("El área del Rectángulo es: " + (this.largo * this.ancho));
    }
}
