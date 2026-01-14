package Creational.FactoryMethod.ProductConcrete;

import Creational.FactoryMethod.ProductInterface.Notifier;

public class SMS implements Notifier {

    public void send(String message){
        System.out.println("Send SMS "+message);
    }
}
