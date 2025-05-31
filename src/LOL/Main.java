package LOL;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Campeon[] equipo1 = new Campeon[3];
        Campeon[] equipo2 = new Campeon[3];

        equipo1[0] = new TopLaner("Rafa", "TopLaner", 80, 70, 40, 30);
        equipo1[1] = new MidLaner("Eze", "MidLaner", 70, 50, 60, 100);
        equipo1[2] = new ADC("LucasR", "ADC", 85, 40, 75, 100);

        equipo2[0] = new Jungla("LucasS", "Jungla", 75, 60, 65,45);
        equipo2[1] = new Support("Thiago", "Support", 40, 80, 30, 50);
        equipo2[2] = new MidLaner("Teo", "Midlaner", 68, 55, 60,8);

        System.out.println("EQUIPO 1: ");
        for (Campeon c : equipo1) System.out.println(c);
        System.out.println("EQUIPO 2");
        for (Campeon c : equipo2) System.out.println(c);

        System.out.println("--- COMIENZA LA BATALLA ---");

        int roundNumber = 1;


        while (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
            System.out.println("--- RONDA " + roundNumber + " ---");

            // Turno del equipo 1
            Campeon atacante1 = obtenerVivoAleatorio(equipo1, rand);
            Campeon defensor1 = obtenerVivoAleatorio(equipo2, rand);
            boolean usaEspecial1 = rand.nextBoolean();
            int danio1 = usaEspecial1 ? atacante1.ataqueEspecial() : atacante1.atacar();

            defensor1.recibirDanio(danio1);
            System.out.println(atacante1.nombre + " ataca a " + defensor1.nombre + " causando " + danio1 + " de daño. Salud restante de " + defensor1.nombre + ": " + defensor1.salud);

            // Verificar si el equipo 2 ya perdió después del ataque del equipo 1
            if (!equipoSigueVivo(equipo2)) {
                System.out.println("¡El Equipo 2 ha sido derrotado!");
                break; // End the battle
            }

            // Turno del equipo 2
            Campeon atacante2 = obtenerVivoAleatorio(equipo2, rand);
            Campeon defensor2 = obtenerVivoAleatorio(equipo1, rand);
            boolean usaEspecial2 = rand.nextBoolean();
            int danio2 = usaEspecial2 ? atacante2.ataqueEspecial() : atacante2.atacar();
            defensor2.recibirDanio(danio2);
            System.out.println(atacante2.nombre + " ataca a " + defensor2.nombre + " causando " + danio2 + " de daño. Salud restante de " + defensor2.nombre + ": " + defensor2.salud);

            // Verificar si el equipo 1 ya perdió después del ataque del equipo 2
            if (!equipoSigueVivo(equipo1)) {
                System.out.println("¡El Equipo 1 ha sido derrotado!");
                break; // End the battle
            }

            roundNumber++;
        }

        System.out.println("--- FIN DE LA BATALLA ---");
        // Determine the winner
        if (equipoSigueVivo(equipo1)) {
            System.out.println("¡Ganó el Equipo 1!");
        } else if (equipoSigueVivo(equipo2)) {
            System.out.println("¡Ganó el Equipo 2!");
        } else {

            System.out.println("¡Es un empate! Ambos equipos fueron derrotados simultáneamente.");
        }

    }

    public static boolean equipoSigueVivo(Campeon[] equipo) {
        for (Campeon c : equipo) {
            if (c.estaVivo()) return true;
        }
        return false;
    }

    public static Campeon obtenerVivoAleatorio(Campeon[] equipo, Random rand) {
        Campeon elegido;

        do {
            elegido = equipo[rand.nextInt(equipo.length)];
        } while (!elegido.estaVivo());
        return elegido;
    }
}
