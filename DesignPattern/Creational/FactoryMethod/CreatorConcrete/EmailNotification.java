package Creational.FactoryMethod.CreatorConcrete;

import Creational.FactoryMethod.Creator.NotificationService;
import Creational.FactoryMethod.ProductConcrete.Email;
import Creational.FactoryMethod.ProductInterface.Notifier;

public class EmailNotification extends NotificationService {

    protected Notifier createNotifier(){
        return new Email();
    }
}
