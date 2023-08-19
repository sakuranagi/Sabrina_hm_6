public class Boss extends GameEntity {
    private Weapon weapon;


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return super.info() + " Weapon:" + this.weapon.getWeaponType() + " Weapon name: " + weapon.getWeaponName();
    }
}

