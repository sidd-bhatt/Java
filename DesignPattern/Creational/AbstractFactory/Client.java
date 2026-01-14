package Creational.AbstractFactory;

import Creational.AbstractFactory.MealAbstractFactory.MealFactory;
import Creational.AbstractFactory.MealConcreteClass.NonVegMealFactory;
import Creational.AbstractFactory.MealConcreteClass.VegMealFactory;

public class Client {

    public static void main(String[] args){
        //For VegMeal
        MealFactory vegFactory = new VegMealFactory();
        //For Non-VegMeal
        MealFactory nonVegMealFactory = new NonVegMealFactory();

        Order vegOrder = new Order(vegFactory);
        vegOrder.serve();
        Order nonvegOrder = new Order(nonVegMealFactory);
        nonvegOrder.serve();
    }
}
