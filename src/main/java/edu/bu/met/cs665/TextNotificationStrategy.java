package edu.bu.met.cs665;

public class TextNotificationStrategy implements NotificationStrategy{
    @Override
    public void sendNotification(DeliveryRequest deliveryRequest, Driver driver) {
        System.out.println("Sending text notification to " + driver.getName() + " about delivery request: " + deliveryRequest);
    }
}
