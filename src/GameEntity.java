public class GameEntity {
    public int healt;
    public int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public GameEntity(int healt, int damage) {
        this.healt = healt;
        this.damage = damage;
    }
}
