package Habitaciones;

public class HabitacionSuite extends Habitacion{

    public HabitacionSuite(int numero, String tipo, double precioBase) {
        super(numero, tipo, precioBase);
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
    }
    @Override
    public void calcularPrecioFinal(int dias) {
        double resultado = precioBase * 1.2 * dias;
        System.out.println("Precio final de la habitación: " + resultado);
    }
}
