package Creational.Builder.BuilderConcrete;

import Creational.Builder.BuilderInterface.PizzaBuilder;
import Creational.Builder.Product.Pizza;

public class CustomPizzaBuilder implements PizzaBuilder {

    private Pizza pizza = new Pizza();

    public PizzaBuilder setSize(String size) {
        pizza.setPizzaSize(size);
        //Fluent Chaining/Fluent Interface
        return this;
    }

    public PizzaBuilder setCrust(String crust) {
        pizza.setCrush(crust);
        return this;
    }

    public PizzaBuilder addCheeseBurst(boolean cheeseBurst) {
        pizza.setCheeseBurst(cheeseBurst);
        return this;
    }

    public PizzaBuilder addPepperoni(boolean pepperoni) {
        pizza.setPepperoni(pepperoni);
        return this;
    }

    public Pizza build(){
        return pizza;
    }
}
