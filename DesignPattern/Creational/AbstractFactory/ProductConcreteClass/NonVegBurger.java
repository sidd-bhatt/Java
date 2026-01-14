package Creational.AbstractFactory.ProductConcreteClass;

import Creational.AbstractFactory.ProductInterface.Burger;

public class NonVegBurger implements Burger {
    public String getType(){
        return "Non-Veg Burger";
    }
}