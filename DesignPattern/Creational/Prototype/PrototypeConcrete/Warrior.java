package Creational.Prototype.PrototypeConcrete;

import Creational.Prototype.PrototypeInterface.GameCharacter;

public class Warrior implements GameCharacter {
    private String characterName;
    private String characterWeapon;
    private String weaponPower;

    public Warrior(String characterName, String characterWeapon, String weaponPower){
        this.characterName = characterName;
        this.characterWeapon = characterWeapon;
        this.weaponPower = weaponPower;
    }

    public GameCharacter clone(){
        return new Warrior(this.characterName, this.characterWeapon, this.weaponPower);
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setCharacterWeapon(String characterWeapon) {
        this.characterWeapon = characterWeapon;
    }

    public void setWeaponPower(String weaponPower) {
        this.weaponPower = weaponPower;
    }

    @Override
    public String toString() {
        return "Warrior {" +
                "characterName='" + characterName + '\'' +
                ", characterWeapon='" + characterWeapon + '\'' +
                ", weaponPower='" + weaponPower + '\'' +
                '}';
    }
}
