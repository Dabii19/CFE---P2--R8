package Habitaciones;

public class HabitacionSuitePresidencial extends Habitacion {

    public HabitacionSuitePresidencial(int numero, String tipo, double precioBase) {
        super(numero, tipo, precioBase);
    }
    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
    }
    @Override
    public void calcularPrecioFinal(int dias) {
        double resultado = precioBase * 1.5 * dias;
        if (dias > 5) {
            resultado *= 0.90;
        }
        System.out.println("Precio final de la habitación: " + resultado);

    }
}
