package Characters;

public abstract class Hero implements Const{
    protected int power;
    protected int hp;

    public abstract void kick(Hero enemy);

    public boolean isAlive(){
        return hp > 0;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
