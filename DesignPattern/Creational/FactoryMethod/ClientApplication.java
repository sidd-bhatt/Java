package Creational.FactoryMethod;

import Creational.FactoryMethod.Creator.NotificationService;
import Creational.FactoryMethod.CreatorConcrete.EmailNotification;
import Creational.FactoryMethod.CreatorConcrete.PushNotification;
import Creational.FactoryMethod.CreatorConcrete.SMSNotification;

public class ClientApplication {

    public static void main(String[] args){
        //Simply Instantiate the Factory Method by
        //Keeping reference variable type as NotificationService achieves Loose Coupling
        //This is the core concept of Factory method.
        //Client code depend upon Factory service NotificationService which can be changed to either Email, SMS or Push
        NotificationService emailNotification = new EmailNotification();
        emailNotification.notifyUser("Hi I am Siddharth");
        NotificationService smsNotification = new SMSNotification();
        smsNotification.notifyUser("Hi I am Siddharth");
        NotificationService pushNotification = new PushNotification();
        pushNotification.notifyUser("Hi I am Siddharth");

    }
}
