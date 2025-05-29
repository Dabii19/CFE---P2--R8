package Habitaciones;

public class Habitacion {

    protected int numero;
    protected String tipo;
    protected double precioBase;

    public Habitacion(int numero, String tipo, double precioBase) {

        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public void mostrarDetalle() {
        System.out.println("Habitación N°: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio base: " + this.precioBase);
    }

    public void calcularPrecioFinal(int dias) {
        double resultado = precioBase * dias;
        System.out.println("Precio final de la abitación:" + resultado);
    }

    public static void main(String[] args) {

        HabitacionEstandar he1 = new HabitacionEstandar(1, "Estandar", 100);
        HabitacionSuite hs1 = new HabitacionSuite(2, "Suite", 250);
        HabitacionSuitePresidencial hsp1 = new HabitacionSuitePresidencial(3,"Suite Presidencial", 300);

        he1.mostrarDetalle();
        he1.calcularPrecioFinal(5);

        System.out.println("...........................");

        hs1.mostrarDetalle();
        hs1.calcularPrecioFinal(5);

        System.out.println("...........................");

        hsp1.mostrarDetalle();
        hsp1.calcularPrecioFinal(5);
    }
}
