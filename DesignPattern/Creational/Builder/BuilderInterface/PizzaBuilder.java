package Creational.Builder.BuilderInterface;

import Creational.Builder.Product.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setCrust(String crust);
    PizzaBuilder addCheeseBurst(boolean cheeseBurst);
    PizzaBuilder addPepperoni(boolean pepperoni);
    Pizza build();
}
