package Characters;

public class Hobbit extends Hero {
    public Hobbit() {
        power = HOBBIT_POWER;
        hp = HOBBIT_HP;
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }

    @Override
    public void kick(Hero enemy) {
        String name = "Hobbit", enemyName = enemy.getClass().getSimpleName();
        System.out.println("Hobbit is crying.\n" + name + ": " + hp + ", " + enemyName + ": " + enemy.getHp());
    }
}
