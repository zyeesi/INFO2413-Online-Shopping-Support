import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Order {
    
    private static int totalOrder = 0;
    private int orderID;
    private String trkNum;
    private String orderComp;
    private int totalItem;
    private double totalPrice;
    private boolean orderStatus;
    private int itemID;
    
    // newOrder with 0 items
    public Order (String trackingNum, String orderCompany){
        try {
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
            Statement statement = con.createStatement();
            
            String sqlSelect = 
                    "SELECT orderID FROM Orders ORDER BY orderID DESC LIMIT 0, 1;";
            
            ResultSet rs = statement.executeQuery(sqlSelect);
            if (rs.next()){
                this.orderID = rs.getInt("orderID") + 1;
                totalOrder = rs.getInt("orderID") + 1;
            } else {
                this.orderID = totalOrder;
            }
            
            statement.close();
            con.close();
        } catch (SQLException ex){
            System.err.println(ex);
        }
        
        this.trkNum = trackingNum;
        this.orderComp = orderCompany;
        this.totalItem = 0;
        this.totalPrice = 0;
        this.itemID = 0;
        this.orderStatus = false;
        totalOrder++;
    }
    
    // existing order
    public Order (Order order){
        this.orderID = order.getID();
        this.trkNum = order.getTrkNum();
        this.orderComp = order.getOrderComp();
        this.orderStatus = order.getStatus();
    }
    
    public void addToTotalItems (int amount){
        this.totalItem += amount;
    }
    
    public void addToTotalPrice (double amount){
        this.totalPrice += amount;
    }
    
    public int getID (){
        return this.orderID;
    }
    
    public String getTrkNum(){
        return this.trkNum;
    }
    
    public String getOrderComp(){
        return this.orderComp;
    }
    
    public int getTotalItem (){
        return this.totalItem;
    }
    public double getTotalPrice (){
        return this.totalPrice;
    }
    
    public boolean getStatus (){
        return this.orderStatus;
    }
    
    public void setStatus (boolean bool){
        this.orderStatus = bool;
    }
    
    public int getItemID (){
        return this.itemID;
    }
    
    public void incItemID (Order order){
        order.itemID++;
    }
}
