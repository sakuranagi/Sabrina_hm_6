public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Mistsplitter Reforged");
        Boss boss = new Boss();
        boss.setName("Azhdaha");
        boss.setHealth(1000000);
        boss.setDamage(1000);
        boss.setWeapon(bossWeapon);

        Weapon skeletonWeapon = new Weapon(WeaponType.BOW, "Polar Star");
        Skeleton skeleton = new Skeleton();
        skeleton.setName("Tartaglia");
        skeleton.setHealth(3000000);
        skeleton.setDamage(3000);
        skeleton.setWeapon(skeletonWeapon);
        skeleton.setArrowAmount(500);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.CATALYST, "Skyward Atlas");
        Skeleton skeleton2= new Skeleton();
        skeleton2.setName("Rhodeia of Loch");
        skeleton2.setHealth(100000);
        skeleton2.setDamage(2000);
        skeleton2.setWeapon(skeletonWeapon2);
        skeleton2.setArrowAmount(250);

        Boss[] bosses = {boss, skeleton, skeleton2};

        for (Boss amount : bosses) {
            System.out.println(amount.info());
        }
    }
}