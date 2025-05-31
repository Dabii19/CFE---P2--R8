package LOL;

public class Support extends Campeon{
    protected int curacion;

    public Support(String nombre, String rol, int ataque, int defensa, int velocidad, int curacion) {
        super(nombre, "Support", ataque, defensa, velocidad);
        this.curacion = curacion;
    }

    @Override
    public int ataqueEspecial(){
        salud += curacion / 10;
        if (salud > 100) salud = 100;
        return super.ataqueEspecial();
    }
}
