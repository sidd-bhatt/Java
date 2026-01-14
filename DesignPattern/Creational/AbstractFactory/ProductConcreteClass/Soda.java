package Creational.AbstractFactory.ProductConcreteClass;

import Creational.AbstractFactory.ProductInterface.Drink;

public class Soda implements Drink {
    public String getType(){
        return "Soda";
    }
}