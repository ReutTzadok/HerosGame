package Characters;

public class Elf extends Hero {
    public Elf() {
        power = ELF_POWER;
        hp = ELF_HP;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }

    @Override
    public void kick(Hero enemy) {
        int damage = power > enemy.getPower() ? enemy.getHp() :  1;
        enemy.setHp( enemy.getHp() - damage );

        String enemyName = enemy.getClass().getSimpleName(), name = "Elf";

        System.out.println(name + " kick " + enemyName + ", " +
                enemyName + " lose " + damage + " health points.\n" +
                name + ": " + hp + ", " + enemyName + ": " + enemy.getHp());
    }
}
