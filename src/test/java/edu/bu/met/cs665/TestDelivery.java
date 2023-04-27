package edu.bu.met.cs665;
import org.junit.Test;
public class TestDelivery {
    public TestDelivery() {

    }
    @Test
    public void testDe() {
        NotificationStrategy emailStrategy = new TextNotificationStrategy();
        Shop shop = new Shop(emailStrategy);

        shop.registerObserver(DriverFactory.createDriver(DriverType.VAN_DRIVER, "Liang"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.TAXI_DRIVER, "Kim"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.SCOOTER_DRIVER, "Crystal"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.FREELANCE_DRIVER, "Fan"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.FREELANCE_DRIVER, "Tu"));

        DeliveryRequest deliveryRequest = new DeliveryRequest("iPhone", "10 Buick St");
        shop.notifyObservers(deliveryRequest);

    }
    @Test
    public void testRequestId() {
        NotificationStrategy emailStrategy = new TextNotificationStrategy();
        Shop shop = new Shop(emailStrategy);

        shop.registerObserver(DriverFactory.createDriver(DriverType.VAN_DRIVER, "Liang"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.TAXI_DRIVER, "Kim"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.SCOOTER_DRIVER, "Crystal"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.FREELANCE_DRIVER, "Fan"));
        shop.registerObserver(DriverFactory.createDriver(DriverType.FREELANCE_DRIVER, "Tu"));

        DeliveryRequest deliveryRequest = new DeliveryRequest("iPhoneX", "10 Buick St");
        DeliveryRequest deliveryRequest1 = new DeliveryRequest("iPhone14", "10 Buick St");
        shop.notifyObservers(deliveryRequest1);

    }
}
