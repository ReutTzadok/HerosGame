package Characters;

import java.util.Random;

public abstract class Person extends Hero {
    protected Random rand = new Random();
    protected int minPower;
    protected int maxPower;
    protected int minHp;
    protected int maxHp;

    protected void setPowerAndHp () {
        power = rand.nextInt( maxPower - minPower + 1) + minPower;
        hp = rand.nextInt( maxHp - minHp + 1) + minHp;
    }

    @Override
    public void kick(Hero enemy) {
        int damage = Math.min(rand.nextInt(power + 1), enemy.getHp());
        enemy.setHp( enemy.getHp() - damage );

        String name = this.getClass().getSimpleName(), enemyName = enemy.getClass().getSimpleName();

        System.out.println(name + " kick " + enemyName + ", " +
                enemyName + " lose " + damage + " health points.\n" +
                name + ": " + hp + ", " + enemyName + ": " + enemy.getHp());
    }
}
