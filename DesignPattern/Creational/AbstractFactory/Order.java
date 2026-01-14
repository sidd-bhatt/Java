package Creational.AbstractFactory;

import Creational.AbstractFactory.MealAbstractFactory.MealFactory;
import Creational.AbstractFactory.ProductInterface.Burger;
import Creational.AbstractFactory.ProductInterface.Drink;

public class Order {

    private Burger burger;
    private Drink drink;

    Order(MealFactory factory){
        burger = factory.createBurger();
        drink = factory.createDrink();
    }

    void serve(){
        System.out.println(burger.getType());
        System.out.println(drink.getType());
    }
}
