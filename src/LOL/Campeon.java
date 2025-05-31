package LOL;

public class Campeon {

    protected String nombre;
    protected String rol;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int salud;

    public Campeon(String nombre, String rol, int ataque, int defensa, int velocidad){
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.salud = 100;
    }

    public int atacar() {
        return (ataque + velocidad) / 2;
    }

    public int ataqueEspecial() {
        return (int) ((ataque + defensa) * 1.5);
    }

    public void recibirDanio(int danio) {
        this.salud -= danio;
        if (this.salud < 0) {
            this.salud = 0;
            System.out.println("¡" + nombre + " ha sido derrotado!");
        }
    }

    public boolean estaVivo() {
        return salud > 0;
    }

    @Override
    public String toString() {
        return rol + " - " + nombre + " | Salud: " + salud + " | Ataque: " + ataque + " | Defensa: " + defensa + " | Velocidad: " + velocidad;
    }
}



