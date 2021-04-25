package Characters;

public class Knight extends Person{
    public Knight() {
        minPower = KNIGHT_MIN_POWER;
        maxPower = KNIGHT_MAX_POWER;
        minHp = KNIGHT_MIN_HP;
        maxHp = KNIGHT_MAX_HP;

        setPowerAndHp();
    }

    @Override
    public String toString() {
        return "Knight{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
