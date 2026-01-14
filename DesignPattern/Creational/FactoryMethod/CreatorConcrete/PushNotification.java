package Creational.FactoryMethod.CreatorConcrete;

import Creational.FactoryMethod.Creator.NotificationService;
import Creational.FactoryMethod.ProductConcrete.Push;
import Creational.FactoryMethod.ProductInterface.Notifier;

public class PushNotification extends NotificationService {

    @Override
    protected Notifier createNotifier() {
        return new Push();
    }
}
