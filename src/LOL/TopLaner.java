package LOL;

public class TopLaner extends Campeon {
    protected int resistencia;

    public TopLaner(String nombre, String rol, int ataque, int defensa, int velocidad, int resistencia) {
        super(nombre, "TopLaner", ataque, defensa, velocidad);
        this.resistencia = resistencia;
    }

    @Override
    public void recibirDanio(int danio) {
        int danioFinal = danio - (resistencia / 10);
        if (danioFinal < 0) {
        super.recibirDanio(danioFinal);
        }
    }
}
