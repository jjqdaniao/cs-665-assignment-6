package edu.bu.met.cs665;

public abstract class Driver implements Observer{
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Object data) {
        if (data instanceof DeliveryRequest) {
            DeliveryRequest deliveryRequest = (DeliveryRequest) data;
            System.out.println(getName() + " received a delivery request：" + deliveryRequest.toString());
        }
    }
}
