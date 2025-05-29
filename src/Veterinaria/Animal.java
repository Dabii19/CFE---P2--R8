package Veterinaria;

public class Animal {

    protected String nombre;
    protected int edad;
    protected String especie;

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " |Edad: " + edad +
                " |Especie: " + especie;
    }

    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Perro("Luci", 10, "Perro", "Salchica");
        animales[1] = new Gato("Batman", 5, "Gato", "Blanco y negro");
        animales[2] = new Conejo("Copito", 2, "Conejo", 2.5);

        for(int i = 0; i < 3; i ++) {
            System.out.println(animales[i]);
        }
    }
}