package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{
    private List<Observer> observers;
    private NotificationStrategy notificationStrategy;

    public Shop() {
        observers = new ArrayList<>();
    }

    public Shop(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
        observers = new ArrayList<>();
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object data) {
        for (Observer observer : observers) {
            if (observer instanceof Driver) {
                Driver driver = (Driver) observer;
                notificationStrategy.sendNotification((DeliveryRequest) data, driver);
//                observer.update(data);
            }
        }
    }
//    @Override
//    public void notifyObservers(Object data) {
//        for (Observer observer : observers) {
//            if (observer instanceof Driver) {
//                Driver driver = (Driver) observer;
//                notificationStrategy.sendNotification((DeliveryRequest) data, driver);
//            }
//        }
//    }
}
