package Creational.FactoryMethod.ProductConcrete;

import Creational.FactoryMethod.ProductInterface.Notifier;

public class Push implements Notifier {

    public void send(String message){
        System.out.println("Send Push Notification "+message);
    }
}
