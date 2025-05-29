package Veterinaria;

public class Perro extends Animal{
    protected String raza;

    public Perro(String nombre, int edad, String especie, String raza) {
        super(nombre, edad, "Perro");
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + " |Raza: " + raza;
    }
}
