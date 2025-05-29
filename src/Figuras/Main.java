package Figuras;

public class Main {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado("Cuadrado", 15);
        Rectangulo r1 = new Rectangulo("Rectánngulo", 10, 5);

        c1.calcularArea();
        r1.calcularArea();
    }
}
