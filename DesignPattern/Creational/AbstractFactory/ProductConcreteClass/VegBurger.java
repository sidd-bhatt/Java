package Creational.AbstractFactory.ProductConcreteClass;

import Creational.AbstractFactory.ProductInterface.Burger;

public class VegBurger implements Burger {

    public String getType(){
        return "Veg Burger";
    }
}
