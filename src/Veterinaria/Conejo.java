package Veterinaria;

public class Conejo extends Animal{
    protected double peso;

    public Conejo(String nombre, int edad, String especie, double peso) {
        super(nombre, edad, "Conejo");
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + " |Peso: " + peso;
    }
}
