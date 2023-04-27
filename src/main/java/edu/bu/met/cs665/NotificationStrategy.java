package edu.bu.met.cs665;

public interface NotificationStrategy {
    void sendNotification(DeliveryRequest deliveryRequest, Driver driver);
}
