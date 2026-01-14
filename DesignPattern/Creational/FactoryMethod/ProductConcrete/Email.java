package Creational.FactoryMethod.ProductConcrete;

import Creational.FactoryMethod.ProductInterface.Notifier;

public class Email implements Notifier {

    public void send(String message){
        System.out.println("Send Email "+message);
    }
}
