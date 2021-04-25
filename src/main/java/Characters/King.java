package Characters;

public class King extends Person{
    public King() {
        minPower = KING_MIN_POWER;
        maxPower = KING_MAX_POWER;
        minHp = KING_MIN_HP;
        maxHp = KING_MAX_HP;

        setPowerAndHp();
    }

    @Override
    public String toString() {
        return "King{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
