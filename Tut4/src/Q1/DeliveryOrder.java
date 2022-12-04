package Q1;

public class DeliveryOrder extends PastryShopOrder {

    private String deliveryAddress;

    public DeliveryOrder(String orderId, int noOfItems, String status, double total, String deliveryAddress) {
        super(orderId, noOfItems, status, total); // constructor chaining
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void updateStatus() {
        this.setStatus("Delivered");
    }

    @Override
    public void calcOrderTotal(){

        double  deliveryCharge = 200.00;
        System.out.println("Order Total:"+getTotal()+deliveryCharge);
    }
}
