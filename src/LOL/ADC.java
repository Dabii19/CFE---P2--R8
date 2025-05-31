package LOL;

public class ADC extends Campeon {
    protected int rango;

    public ADC(String nombre, String rol, int ataque, int defensa, int velocidad, int rango) {
        super(nombre, "ADC", ataque, defensa, velocidad);
        this.rango = rango;
    }

    @Override
    public int atacar() {
        return super.atacar() + (rango / 4);
    }
}
