public class Item extends Order{

    private int itemID;
    private int itemQuantity;
    private double itemPrice; // individual price
    private String itemName;
    private String itemDesc;
    private boolean itemStatus;
    
    public Item (Order order, int amount, double price, String name, String desc){
        super (order);
        this.itemID = order.getItemID();
        super.incItemID(order);
        this.itemQuantity = amount;
        this.itemPrice = price;
        this.itemName = name;
        this.itemDesc = desc;
        this.itemStatus = false;
    }
    
    public String getName (){
        return this.itemName;
    }
    
    public int getID (){
        return this.itemID;
    }
    
    public int getQuantity(){
        return this.itemQuantity;
    }
    
    public double getPrice(){
        return this.itemPrice;
    }
    
    public String getDesc () {
        return this.itemDesc;
    }
    
    public boolean getItemStatus (){
        return this.itemStatus;
    }
    
    public void setItemStatus (boolean bool){
        this.itemStatus = bool;
    }
}
