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
    
    public Item (int orderID, int itemsID, String itemsName, double itemsPrice, int itemsQuant, String itemsDesc, boolean itemsStatus){
        super(orderID);
        this.itemID = itemsID;
        this.itemName = itemsName;
        this.itemPrice = itemsPrice;
        this.itemQuantity = itemsQuant;
        this.itemDesc = itemsDesc;
        this.itemStatus = itemsStatus;
    }
    
    
    public String getName (){
        return this.itemName;
    }
    
    public void setName (String name){
        this.itemName = name;
    }
    
    public int getID (){
        return this.itemID;
    }
    
    public void setID (int id){
        this.itemID = id;
    }
    
    public int getQuantity(){
        return this.itemQuantity;
    }
    
    public void setQuantity(int quant){
        this.itemQuantity = quant;
    }
    
    public double getPrice(){
        return this.itemPrice;
    }
    
    public void setPrice (double price){
        this.itemPrice = price;
    }
    
    public String getDesc () {
        return this.itemDesc;
    }
    
    public void setDesc (String descrip) {
        this.itemDesc = descrip;
    }
    
    public boolean getItemStatus (){
        return this.itemStatus;
    }
    
    public void setItemStatus (boolean bool){
        this.itemStatus = bool;
    }
}
