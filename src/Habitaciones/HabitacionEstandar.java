package Habitaciones;

public class HabitacionEstandar extends Habitacion{

    public HabitacionEstandar(int numero, String tipo, double precioBase) {
    super(numero, tipo, precioBase);
    }
    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
    }
    @Override
    public void calcularPrecioFinal(int dias) {
        double resultado = precioBase * dias;
        System.out.println("Precio final de la habitación: " + resultado);
    }


}
