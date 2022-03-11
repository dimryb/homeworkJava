import weapon.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new Gun(),
                new Machine(),
                new Rpg(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > getSlotsCount()-1){
            System.out.println("Не верный номер слота: " + slot);
            return;
        }

        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
