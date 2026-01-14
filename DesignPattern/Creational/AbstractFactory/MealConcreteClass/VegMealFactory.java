package Creational.AbstractFactory.MealConcreteClass;

import Creational.AbstractFactory.MealAbstractFactory.MealFactory;
import Creational.AbstractFactory.ProductConcreteClass.Juice;
import Creational.AbstractFactory.ProductConcreteClass.VegBurger;
import Creational.AbstractFactory.ProductInterface.Burger;
import Creational.AbstractFactory.ProductInterface.Drink;

public class VegMealFactory implements MealFactory {
    public Burger createBurger(){
        return new VegBurger();
    }

    public Drink createDrink(){
        return new Juice();
    }
}