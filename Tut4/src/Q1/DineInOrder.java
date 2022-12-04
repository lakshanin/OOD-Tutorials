package Q1;

public class DineInOrder extends PastryShopOrder{

    private String comments;

    public DineInOrder(String orderId, int noOfItems, String status, double total, String comments) {
        super(orderId, noOfItems, status, total); // constructor chaining
        this.comments = comments;
    }

    // getters and setters
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public void updateStatus() {
        this.setStatus("");
    }

    @Override
    public void calcOrderTotal(){

        double serviceCharge = 100.00;
        System.out.println("Order Total: "+getTotal()+serviceCharge);
    }
}
