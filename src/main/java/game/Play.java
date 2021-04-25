package game;

import Characters.Hero;

public class Play {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory(); //not necessary
        Hero h1 = factory.createHero(), h2 = factory.createHero();

        GameManager.fight(h1, h2);
    }
}
