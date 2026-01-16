package Creational.Builder;

import Creational.Builder.BuilderConcrete.CustomPizzaBuilder;
import Creational.Builder.Product.Pizza;

public class Client {
    public static void main(String[] args){
        Pizza pizza = new CustomPizzaBuilder()
                .setSize("Large")
                .setCrust("thin")
                .addCheeseBurst(true)
                .addPepperoni(true)
                .build();

        pizza.show();

        pizza = new CustomPizzaBuilder()
                .setSize("Medium")
                .setCrust("Pan")
                .addCheeseBurst(false)
                .addPepperoni(false)
                .build();
        pizza.show();

    }
}
