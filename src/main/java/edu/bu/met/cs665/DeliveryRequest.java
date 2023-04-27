package edu.bu.met.cs665;

public class DeliveryRequest {
    private String productInfo;
    private String deliveryAddress;
    private int requestId;

    private static int requestCounter = 0;

    public DeliveryRequest(String productInfo, String deliveryAddress) {
        this.productInfo = productInfo;
        this.deliveryAddress = deliveryAddress;
        this.requestId = ++requestCounter;
    }

    public DeliveryRequest() {

    }

    // Getter and setter methods for each field
    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "productInfo='" + productInfo + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", requestId=" + requestId +
                '}';
    }
}
