package Creational.Prototype;

import Creational.Prototype.PrototypeConcrete.Warrior;
import Creational.Prototype.PrototypeInterface.GameCharacter;

public class Client {
    public static void main(String[] args){
        GameCharacter spiderman = new Warrior("Spider Man", "Webs", "100");
        Warrior spiderman_v2 = (Warrior) spiderman.clone();
        Warrior spiderman_v3 = (Warrior) spiderman.clone();

        spiderman_v2.setCharacterWeapon("Stun gun");
        spiderman_v2.setWeaponPower("200");
        spiderman_v3.setCharacterWeapon("Web bomb");
        spiderman_v3.setWeaponPower("300");

        System.out.println(spiderman);
        System.out.println(spiderman_v2);
        System.out.println(spiderman_v3);
    }
}
