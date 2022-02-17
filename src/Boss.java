public class Boss extends GameEntity {
    public Boss(int healt, int damage) {
        super(healt, damage);
    }

    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return getHealt() + " " + getDamage() + weapon.getName() + weapon.getType();
    }
}
