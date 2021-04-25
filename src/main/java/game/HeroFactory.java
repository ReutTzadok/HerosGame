package game;

import Characters.*;

import java.util.Random;

public class HeroFactory {
    private Random rand = new Random();

    public Hero createHero() {
        Hero hero;
        int tmp = rand.nextInt(4) +1;

        if (tmp == 1)
            hero = new Hobbit();
        else if (tmp == 2)
            hero = new Elf();
        else if (tmp == 3)
            hero = new King();
        else
            hero = new Knight();

        return hero;
    }
}
