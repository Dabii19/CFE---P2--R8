package LOL;

public class Jungla extends Campeon {
    protected int controlMapa;

    public Jungla(String nombre, String rol, int ataque, int defensa, int velocidad, int controlMapa) {
        super(nombre, "Jungla", ataque, defensa, velocidad);
        this.controlMapa = controlMapa;
    }

    @Override
    public int ataqueEspecial() {
        return super.ataqueEspecial() + (controlMapa / 5);
    }
}
