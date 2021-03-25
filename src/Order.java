public class Order {
    
    private static int totalOrder = 0;
    private int orderID;
    private String trkNum;
    private int totalItem;
    private double totalPrice;
    private int itemID;
    
    // newOrder with 0 items
    public Order (String trackingNum){
        /* pseduo code? 
        if (myDB){
            orderID = "
                SELECT 
                    orderID 
                FROM 
                    Order 
                WHERE trakNum = ( SELECT MAX(orderID) FROM Order)
                ";
        } else {
            orderID = 0;
        }
        */
        
        this.orderID = totalOrder;
        this.trkNum = trackingNum;
        this.totalItem = 0;
        this.totalPrice = 0;
        this.itemID = 0;
        totalOrder++;
    }
    
    // existing order
    public Order (Order order){
        this.orderID = order.getID();
        this.trkNum = order.getTrkNum();
        this.itemID = itemID++;
    }
    
    public void setTotalItems (int amount){
        this.totalItem += amount;
    }
    
    public void setTotalPrice (double amount){
        this.totalPrice += amount;
    }
    
    public int getID (){
        return this.orderID;
    }
    
    public String getTrkNum(){
        return this.trkNum;
    }
    
    public int getTotalItem (){
        return this.totalItem;
    }
    public double getTotalPrice (){
        return this.totalPrice;
    }
    
    public int getItemID (){
        return this.itemID;
    }
}
