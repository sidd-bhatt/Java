package Creational.FactoryMethod.CreatorConcrete;

import Creational.FactoryMethod.Creator.NotificationService;
import Creational.FactoryMethod.ProductConcrete.SMS;
import Creational.FactoryMethod.ProductInterface.Notifier;

public class SMSNotification extends NotificationService {

    @Override
    protected Notifier createNotifier() {
        return new SMS();
    }
}
