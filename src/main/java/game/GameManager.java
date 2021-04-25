package game;

import Characters.Hero;

public class GameManager {
    public static void fight (Hero c1, Hero c2) {
        System.out.println(c1 + "\nagainst\n" + c2 + "\nFight is starting:\n");

        do {
            c1.kick(c2);
            if (c2.isAlive())
                c2.kick(c1);
        } while (c1.isAlive() && c2.isAlive());

        Hero dead = c1.isAlive() ? c2 : c1;

        System.out.println(dead.getClass().getSimpleName() + " is dead, fight is over");
    }
}

