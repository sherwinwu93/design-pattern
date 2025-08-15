package headfirst.c01.slay;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public abstract class Character {
    WeaponBehavior weapon;

    abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
