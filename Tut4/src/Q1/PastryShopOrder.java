package Q1;

public abstract class PastryShopOrder {

    private String orderId;
    private int noOfItems;
    private String status;
    private double total;

    public PastryShopOrder(String orderId, int noOfItems, String status, double total) {
        this.orderId = orderId;
        this.noOfItems = noOfItems;
        this.status = status;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public abstract void updateStatus();

    public void calcOrderTotal(){
        System.out.println("Total: "+this.total);
    }
}
