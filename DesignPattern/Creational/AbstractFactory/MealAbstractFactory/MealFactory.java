package Creational.AbstractFactory.MealAbstractFactory;

import Creational.AbstractFactory.ProductInterface.Burger;
import Creational.AbstractFactory.ProductInterface.Drink;

//Concept: Meal Combo can be veg or non veg, which may include product(object) of same family.
//Here same family means - if its Burger then it can be veg or non veg. Similarly drink can be juice or soda.
public interface MealFactory {
    Burger createBurger();
    Drink createDrink();
}
