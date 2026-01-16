package Creational.Builder.Product;

public class Pizza {
    String pizzaSize;
    String crush;
    boolean cheeseBurst;
    boolean pepperoni;

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setCrush(String crush) {
        this.crush = crush;
    }

    public void setCheeseBurst(boolean cheeseBurst) {
        this.cheeseBurst = cheeseBurst;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void show(){
        System.out.println(pizzaSize+" pizza with "+crush+" crust. Cheese burst: "+cheeseBurst+" Pepperoni: "+pepperoni);
    }
}
