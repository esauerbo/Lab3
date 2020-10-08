public class View {
    private String sessionId;
    private String productId;
    private double price;

    public View(String sessionId,String productId, double price){
        this.sessionId = sessionId;
        this.productId = productId;
        this.price = price;
    }

    public String getSessionId(){return this.sessionId;}
    public String getProductId(){return this.productId;}
    public double getPrice(){return this.price;}
}
