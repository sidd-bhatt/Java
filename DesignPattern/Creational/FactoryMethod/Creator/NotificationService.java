package Creational.FactoryMethod.Creator;

import Creational.FactoryMethod.ProductInterface.Notifier;

public abstract class NotificationService {

    //Factory method: It will be used by Client application.
    public void notifyUser(String message){
        Notifier notifier = createNotifier();
        notifier.send(message);
    }

    //abstract method
    //Sub-classes can define it. These subclasses will be used by client application
    protected abstract Notifier createNotifier();
}
