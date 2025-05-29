package Veterinaria;

public class Gato extends Animal{
    protected String color;

    public Gato(String nombre, int edad, String especie, String color){
        super(nombre, edad, "Gato");
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " |Color: " + color;
    }
}
