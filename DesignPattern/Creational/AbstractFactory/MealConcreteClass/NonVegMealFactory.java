package Creational.AbstractFactory.MealConcreteClass;

import Creational.AbstractFactory.MealAbstractFactory.MealFactory;
import Creational.AbstractFactory.ProductConcreteClass.NonVegBurger;
import Creational.AbstractFactory.ProductConcreteClass.Soda;
import Creational.AbstractFactory.ProductInterface.Burger;
import Creational.AbstractFactory.ProductInterface.Drink;

public class NonVegMealFactory implements MealFactory {
    public Burger createBurger(){
        return new NonVegBurger();
    }

    public Drink createDrink(){
        return new Soda();
    }
}