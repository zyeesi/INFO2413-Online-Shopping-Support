public class Item extends Order{

    private int itemID;
    private int itemQuantity;
    private double itemPrice; // individual price
    private String itemName;
    
    public Item (Order order, int amount, double price, String name){
        super (order);
        this.itemID = order.getItemID();
        this.itemQuantity = amount;
        this.itemPrice = price;
        this.itemName = name;
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
}
