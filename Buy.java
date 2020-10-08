public class Buy {
    private String sessionId;
    private String productId;
    private double price;
    private double quantity;

    public Buy(String sessionId, String productId, double price, double quantity){
        this.sessionId = sessionId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSessionId(){return this.sessionId;}
    public String getProductId(){return this.productId;}
    public double getPrice(){return this.price;}
    public double getQuantity(){return this.quantity;}

}
