import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import java.sql.Connection;// MySQL Connector/j 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/*      Disclaimer:  
        I didn't put the mySQL query and some other stuff like switching cards into a method call
        Honestly, it's because I got lazy at the start and got even lazier to fix it.
        I wrote this by myself, and I'm assuming the rest of my group wouldn't 
        be tempering with it. So I'm just gonna leave as such, but I can fix it,
        if given the time.
*/

public class OnlineShoppingSupport extends javax.swing.JFrame {

    // hashmaps to pass object and items easier
    private HashMap<Integer, Order> orderHash = new HashMap<Integer, Order>();
    private HashMap<Integer, Item> itemHash = new HashMap<Integer, Item>();
    private int curOrder;
    
    private boolean[] canEdit = new boolean [] {
        false, false, false, false, true
    };
    
    public OnlineShoppingSupport() {
        initComponents();
        // Load previous order data
        loadOrderData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        reporTableScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        newOrderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        orderIDText = new javax.swing.JTextField();
        trackingNumText = new javax.swing.JTextField();
        totalItemsText = new javax.swing.JTextField();
        totalPriceText = new javax.swing.JTextField();
        confirmOrderButton = new javax.swing.JButton();
        addOrderButton = new javax.swing.JButton();
        addItemButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        itemQuantityText = new javax.swing.JTextField();
        itemPriceText = new javax.swing.JTextField();
        itemNameText = new javax.swing.JTextField();
        itemIDText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        orderCompanyText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        itemDescScrollPane = new javax.swing.JScrollPane();
        itemDescText = new javax.swing.JTextArea();
        itemsInfoSplitPane = new javax.swing.JSplitPane();
        itemsTableScrollPane = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        itemsInfoPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        itemTabIDText = new javax.swing.JTextField();
        itemTabNameText = new javax.swing.JTextField();
        itemTabQuantText = new javax.swing.JTextField();
        itemTabPriceText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        itemDescDetailScrollPane = new javax.swing.JScrollPane();
        itemDescDetailText = new javax.swing.JTextArea();
        updateItemsButton = new javax.swing.JButton();
        newItemsButton = new javax.swing.JButton();
        deleteItemsButton = new javax.swing.JButton();
        completeOrderButton = new javax.swing.JButton();
        newOrderButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Shopping Support");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(682, 450));
        setMinimumSize(new java.awt.Dimension(682, 450));
        setResizable(false);

        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPanel.setPreferredSize(new java.awt.Dimension(670, 300));
        mainPanel.setLayout(new java.awt.CardLayout());

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tracking #", "Order Company", "Total Items", "Total Price", "Order Date", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportTable.setFocusable(false);
        reportTable.getTableHeader().setReorderingAllowed(false);
        reportTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                reportTableMouseMoved(evt);
            }
        });
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTableMouseClicked(evt);
            }
        });
        reporTableScrollPane.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(0).setResizable(false);
            reportTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            reportTable.getColumnModel().getColumn(1).setResizable(false);
            reportTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            reportTable.getColumnModel().getColumn(2).setResizable(false);
            reportTable.getColumnModel().getColumn(2).setPreferredWidth(75);
            reportTable.getColumnModel().getColumn(3).setResizable(false);
            reportTable.getColumnModel().getColumn(3).setPreferredWidth(25);
            reportTable.getColumnModel().getColumn(4).setResizable(false);
            reportTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(5).setResizable(false);
            reportTable.getColumnModel().getColumn(5).setPreferredWidth(25);
            reportTable.getColumnModel().getColumn(6).setResizable(false);
            reportTable.getColumnModel().getColumn(6).setPreferredWidth(25);
        }

        mainPanel.add(reporTableScrollPane, "reportTablePanel");

        jLabel1.setText("Order ID:");

        jLabel2.setText("Tracking #:");

        jLabel3.setText("Total Items:");

        jLabel4.setText("Total Price ($):");

        orderIDText.setEnabled(false);
        orderIDText.setMaximumSize(new java.awt.Dimension(200, 22));
        orderIDText.setMinimumSize(new java.awt.Dimension(200, 22));
        orderIDText.setPreferredSize(new java.awt.Dimension(200, 22));

        trackingNumText.setMaximumSize(new java.awt.Dimension(200, 22));
        trackingNumText.setMinimumSize(new java.awt.Dimension(200, 22));
        trackingNumText.setPreferredSize(new java.awt.Dimension(200, 22));

        totalItemsText.setText("0");
        totalItemsText.setEnabled(false);
        totalItemsText.setMaximumSize(new java.awt.Dimension(200, 22));
        totalItemsText.setMinimumSize(new java.awt.Dimension(200, 22));
        totalItemsText.setPreferredSize(new java.awt.Dimension(200, 22));

        totalPriceText.setText("0");
        totalPriceText.setEnabled(false);
        totalPriceText.setMaximumSize(new java.awt.Dimension(200, 22));
        totalPriceText.setMinimumSize(new java.awt.Dimension(200, 22));
        totalPriceText.setPreferredSize(new java.awt.Dimension(200, 22));

        confirmOrderButton.setText("Confirm");
        confirmOrderButton.setEnabled(false);
        confirmOrderButton.setFocusPainted(false);
        confirmOrderButton.setFocusable(false);
        confirmOrderButton.setMaximumSize(new java.awt.Dimension(87, 22));
        confirmOrderButton.setMinimumSize(new java.awt.Dimension(87, 22));
        confirmOrderButton.setPreferredSize(new java.awt.Dimension(87, 22));
        confirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderButtonActionPerformed(evt);
            }
        });

        addOrderButton.setText("Add Order");
        addOrderButton.setMaximumSize(new java.awt.Dimension(87, 22));
        addOrderButton.setMinimumSize(new java.awt.Dimension(87, 22));
        addOrderButton.setPreferredSize(new java.awt.Dimension(87, 22));
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        addItemButton.setText("Add Item");
        addItemButton.setEnabled(false);
        addItemButton.setMaximumSize(new java.awt.Dimension(87, 22));
        addItemButton.setMinimumSize(new java.awt.Dimension(87, 22));
        addItemButton.setPreferredSize(new java.awt.Dimension(87, 22));
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Item ID:");

        jLabel6.setText("Item Name:");

        jLabel7.setText("Item Price:");

        jLabel8.setText("Item Quantity:");

        itemQuantityText.setEnabled(false);
        itemQuantityText.setMaximumSize(new java.awt.Dimension(200, 22));
        itemQuantityText.setMinimumSize(new java.awt.Dimension(200, 22));
        itemQuantityText.setPreferredSize(new java.awt.Dimension(200, 22));

        itemPriceText.setEnabled(false);
        itemPriceText.setMaximumSize(new java.awt.Dimension(200, 22));
        itemPriceText.setMinimumSize(new java.awt.Dimension(200, 22));
        itemPriceText.setPreferredSize(new java.awt.Dimension(200, 22));

        itemNameText.setEnabled(false);
        itemNameText.setMaximumSize(new java.awt.Dimension(200, 22));
        itemNameText.setMinimumSize(new java.awt.Dimension(200, 22));
        itemNameText.setPreferredSize(new java.awt.Dimension(200, 22));

        itemIDText.setEnabled(false);
        itemIDText.setMaximumSize(new java.awt.Dimension(200, 22));
        itemIDText.setMinimumSize(new java.awt.Dimension(200, 22));
        itemIDText.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabel9.setText("Order Company:");

        orderCompanyText.setMaximumSize(new java.awt.Dimension(200, 22));
        orderCompanyText.setMinimumSize(new java.awt.Dimension(200, 22));
        orderCompanyText.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabel10.setText("Item Description:");

        itemDescText.setColumns(20);
        itemDescText.setLineWrap(true);
        itemDescText.setRows(5);
        itemDescText.setEnabled(false);
        itemDescScrollPane.setViewportView(itemDescText);

        javax.swing.GroupLayout newOrderPanelLayout = new javax.swing.GroupLayout(newOrderPanel);
        newOrderPanel.setLayout(newOrderPanelLayout);
        newOrderPanelLayout.setHorizontalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(35, 35, 35)
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trackingNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(totalItemsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderCompanyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemQuantityText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemPriceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemIDText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemDescScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(confirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        newOrderPanelLayout.setVerticalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(itemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(itemQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(itemDescScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(trackingNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(totalItemsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderCompanyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(confirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(newOrderPanel, "newOrderPanel");

        itemsInfoSplitPane.setDividerLocation(350);
        itemsInfoSplitPane.setDividerSize(0);
        itemsInfoSplitPane.setEnabled(false);

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quant", "Price", "Received"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsTable.setFocusable(false);
        itemsTable.getTableHeader().setReorderingAllowed(false);
        itemsTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                itemsTableMouseMoved(evt);
            }
        });
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTableMouseClicked(evt);
            }
        });
        // Rather painful to find this place with netbean's code protection
        itemsTable.getModel().addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent evt) {
                itemsTableValueChanged(evt);
            }
        });
        itemsTableScrollPane.setViewportView(itemsTable);
        if (itemsTable.getColumnModel().getColumnCount() > 0) {
            itemsTable.getColumnModel().getColumn(0).setResizable(false);
            itemsTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            itemsTable.getColumnModel().getColumn(1).setResizable(false);
            itemsTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            itemsTable.getColumnModel().getColumn(2).setResizable(false);
            itemsTable.getColumnModel().getColumn(2).setPreferredWidth(5);
            itemsTable.getColumnModel().getColumn(3).setResizable(false);
            itemsTable.getColumnModel().getColumn(3).setPreferredWidth(25);
            itemsTable.getColumnModel().getColumn(4).setResizable(false);
            itemsTable.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        itemsInfoSplitPane.setRightComponent(itemsTableScrollPane);

        jLabel11.setText("Item ID:");

        jLabel12.setText("Item Quantity:");

        jLabel13.setText("Item Price ($):");

        jLabel15.setText("Item Name:");

        itemTabIDText.setEnabled(false);
        itemTabIDText.setPreferredSize(new java.awt.Dimension(232, 22));

        itemTabNameText.setPreferredSize(new java.awt.Dimension(232, 22));

        itemTabQuantText.setMinimumSize(new java.awt.Dimension(200, 22));
        itemTabQuantText.setPreferredSize(new java.awt.Dimension(232, 22));

        itemTabPriceText.setPreferredSize(new java.awt.Dimension(232, 22));

        jLabel14.setText("Item Description:");

        itemDescDetailText.setColumns(20);
        itemDescDetailText.setLineWrap(true);
        itemDescDetailText.setRows(5);
        itemDescDetailScrollPane.setViewportView(itemDescDetailText);

        updateItemsButton.setText("Update");
        updateItemsButton.setFocusPainted(false);
        updateItemsButton.setFocusable(false);
        updateItemsButton.setPreferredSize(new java.awt.Dimension(87, 22));
        updateItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemsButtonActionPerformed(evt);
            }
        });

        newItemsButton.setText("New");
        newItemsButton.setFocusPainted(false);
        newItemsButton.setFocusable(false);
        newItemsButton.setPreferredSize(new java.awt.Dimension(87, 22));
        newItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemsButtonActionPerformed(evt);
            }
        });

        deleteItemsButton.setText("Delete");
        deleteItemsButton.setFocusPainted(false);
        deleteItemsButton.setFocusable(false);
        deleteItemsButton.setPreferredSize(new java.awt.Dimension(87, 22));
        deleteItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemsButtonActionPerformed(evt);
            }
        });

        completeOrderButton.setText("Complete");
        completeOrderButton.setFocusPainted(false);
        completeOrderButton.setFocusable(false);
        completeOrderButton.setPreferredSize(new java.awt.Dimension(87, 22));
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemsInfoPanelLayout = new javax.swing.GroupLayout(itemsInfoPanel);
        itemsInfoPanel.setLayout(itemsInfoPanelLayout);
        itemsInfoPanelLayout.setHorizontalGroup(
            itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(newItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(itemsInfoPanelLayout.createSequentialGroup()
                        .addComponent(deleteItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemTabIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemTabPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemTabQuantText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemTabNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDescDetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        itemsInfoPanelLayout.setVerticalGroup(
            itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsInfoPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(itemTabIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemTabNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemTabQuantText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemTabPriceText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemDescDetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(itemsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemsInfoSplitPane.setLeftComponent(itemsInfoPanel);

        mainPanel.add(itemsInfoSplitPane, "itemsTablePanel");

        newOrderButton.setText("New Order");
        newOrderButton.setFocusPainted(false);
        newOrderButton.setFocusable(false);
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        ordersButton.setText("Orders");
        ordersButton.setFocusPainted(false);
        ordersButton.setFocusable(false);
        ordersButton.setMaximumSize(new java.awt.Dimension(87, 22));
        ordersButton.setMinimumSize(new java.awt.Dimension(87, 22));
        ordersButton.setPreferredSize(new java.awt.Dimension(87, 22));
        ordersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newOrderButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrderButton)
                    .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        Object order = reportTable.getValueAt (reportTable.getSelectedRow(),0);
        int orderID = order != null ? Integer.parseInt(order.toString()) : -1;
        
        if (orderID >= 0){
            setItemsTable(orderID);
            CardLayout card = (CardLayout)mainPanel.getLayout();
            card.show(mainPanel, "itemsTablePanel");
        }
    }//GEN-LAST:event_reportTableMouseClicked

    private void reportTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseMoved
        final int x = evt.getX();
        final int y = evt.getY();
        
        final Rectangle tableBounds = reportTable.getBounds();
        if (tableBounds != null && tableBounds.contains(x,y)) {
            reportTable.setCursor(new Cursor(Cursor.HAND_CURSOR));
        } else {
            reportTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_reportTableMouseMoved

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "newOrderPanel");
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "reportTablePanel");
    }//GEN-LAST:event_ordersButtonActionPerformed

    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderButtonActionPerformed
        // grab current order
        Order order = orderHash.get(Integer.parseInt(orderIDText.getText()));
        
        // Display Table
        // grab table model
        DefaultTableModel rModel = (DefaultTableModel)reportTable.getModel();
        // set data
        String totPrice = new DecimalFormat("$#,###.00").format(order.getTotalPrice());
        Object[] orderData = {order.getOrderID(), order.getTrkNum(), order.getOrderComp(), order.getTotalItem(), totPrice, order.getOrderDate(), order.getStatus()};
        rModel.addRow(orderData);
     
        resetNewOrderGUI();

        // Swap back to report table viewpoint
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "reportTablePanel");
    }//GEN-LAST:event_confirmOrderButtonActionPerformed

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        String trackingNum = trackingNumText.getText();
        String orderCompany = orderCompanyText.getText();
        if (trackingNum.equals("") || orderCompany.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // create new order object
            Order newOrder = new Order (trackingNum, orderCompany);
            
            // Add into mySQL table
            try {
                Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                Statement statement = con.createStatement();
                
                // Insert data into order table
                String sqlInsert = 
                        "INSERT INTO Orders" +
                        "(orderID, trackingNum, orderDate, orderPrice, orderTotalItems, orderCompany, orderStatus)" +
                        "VALUES (" + newOrder.getOrderID() + ", '" + newOrder.getTrkNum() + "', '" + newOrder.getOrderDate() + "', " + 
                        newOrder.getTotalPrice() + ", " + newOrder.getTotalItem() + ", '" + newOrder.getOrderComp() + 
                        "', " + newOrder.getStatus() + ");";
               
                
                statement.executeUpdate(sqlInsert);
                statement.close();
                con.close();
                
                // using hashmap to grab the right object faster
                orderHash.put(newOrder.getOrderID(), newOrder);

                setNewItemGUI();
                orderIDText.setText(Integer.toString(newOrder.getOrderID()));
                itemIDText.setText(Integer.toString(newOrder.getItemID()));
                
            } catch (SQLException ex){
                System.err.println(ex);
                resetNewOrderGUI();
            }
        }
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        if (checkItemError()){
            // grab created order
            Order order = orderHash.get(Integer.parseInt(orderIDText.getText()));
            // add new item
            Item newItem = new Item (order, Integer.parseInt(itemQuantityText.getText()),Double.parseDouble(itemPriceText.getText()), itemNameText.getText(), itemDescText.getText());
            // update order
            order.addToTotalItems(newItem.getQuantity());
            order.addToTotalPrice(Math.round((newItem.getPrice() * newItem.getQuantity())*100.0)/100.0);

            // add to mysql database
            try {
                Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                Statement statement = con.createStatement();
                
                // Insert data into item Table
                String sqlInsertItem = 
                        "INSERT INTO Order_Items" +
                        "(orderID, itemID, itemName, itemPrice, itemQuantity, itemDescription, itemStatus)" +
                        "VALUES (" + order.getOrderID() + ", " + newItem.getID() + ", '" + newItem.getName() + "', " + 
                        newItem.getPrice() + ", " + newItem.getQuantity() + ", '" + newItem.getDesc() + "', " + newItem.getItemStatus() + ");";
               
                statement.addBatch(sqlInsertItem);
                
                // Update Object data
                String sqlUpdateObject = 
                        "UPDATE Orders " + 
                        "SET orderPrice = " + order.getTotalPrice() + ", orderTotalItems = " + order.getTotalItem() +
                        " WHERE orderID = " + order.getOrderID() + ";";
                
                statement.addBatch(sqlUpdateObject);
                statement.executeBatch();
                
                statement.close();
                con.close();
                
                // testing stuff delete after
                orderHash.put(order.getOrderID(), order);

                // set GUI
                resetNewItemGUI();
                confirmOrderButton.setEnabled (true);
                itemIDText.setText(Integer.toString(order.getItemID()));
                totalItemsText.setText(Integer.toString(order.getTotalItem()));
                totalPriceText.setText(new DecimalFormat("$#,###.00").format(order.getTotalPrice()));
                
            } catch (SQLException ex){
                System.err.println(ex);
                resetNewOrderGUI();
            }
        }
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void itemsTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseMoved
        final int x = evt.getX();
        final int y = evt.getY();
        
        final Rectangle tableBounds = itemsTable.getBounds();
        if (tableBounds != null && tableBounds.contains(x,y)) {
            itemsTable.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_itemsTableMouseMoved

    private void itemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseClicked
        Object itemObj = itemsTable.getValueAt (itemsTable.getSelectedRow(),0);
        int itemID = itemObj != null ? Integer.parseInt(itemObj.toString()) : -1;
        
        if (itemID >= 0){
            Item item = itemHash.get(itemID);
            itemTabIDText.setText(Integer.toString(item.getID()));
            itemTabNameText.setText(item.getName());
            itemTabQuantText.setText(Integer.toString(item.getQuantity()));
            itemTabPriceText.setText(new DecimalFormat("$#,###.00").format(item.getPrice()));
            itemDescDetailText.setText(item.getDesc());
        }
    }//GEN-LAST:event_itemsTableMouseClicked
    
    private void itemsTableValueChanged(TableModelEvent evt) {
        int row = evt.getFirstRow();
        int column = evt.getColumn();
        if (column == 4){
            TableModel model = (TableModel)evt.getSource();
            boolean checked = (boolean) model.getValueAt(row, column);
            Object itemObj = model.getValueAt(row, 0);
            Item item = itemHash.get(Integer.parseInt(itemObj.toString()));
            
            try {
                Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                Statement statement = con.createStatement();

                // Update Object data
                String sqlUpdateItem = 
                        "UPDATE Order_Items " + 
                        "SET itemStatus = " + checked +
                        " WHERE itemID = " + item.getID() + " AND orderID = " + item.getOrderID() + ";";
                statement.executeUpdate(sqlUpdateItem);
                
                item.setStatus(checked);
                statement.close();
                con.close();

            } catch (SQLException ex){
                System.err.println(ex);
            }
        }
    }
    
    private void updateItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemsButtonActionPerformed
        if (itemTabIDText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please select or create a new item first!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int itemID = Integer.parseInt(itemTabIDText.getText());
        if (checkUpdateError()){
            Item item = itemHash.get(itemID);
            // <editor-fold defaultstate="collapsed" desc="Update Existing Data">   
            if (item != null) {
                item.setName(itemTabNameText.getText());
                item.setQuantity(Integer.parseInt(itemTabQuantText.getText()));
                // Converting makes everything annoying to deal with.
                String compPrice = new DecimalFormat("$#,###.00").format(item.getPrice());
                if (!itemTabPriceText.getText().equals(compPrice)){
                    item.setPrice(Double.parseDouble(itemTabPriceText.getText()));
                }
                item.setDesc(itemDescDetailText.getText());


                int totalItem = 0;
                double totalPrice = 0.0;
                try {
                    int rows = itemsTable.getRowCount() - 1;
                    for (; rows >= 0; rows--){
                        Object itemObj = itemsTable.getValueAt(rows, 0);
                        // this is in case where the ItemID doesn't start with 0-n or skips etc
                        int tableItemID = Integer.parseInt(itemObj.toString());
                        Item ordItem = itemHash.get(tableItemID);
                        totalItem += ordItem.getQuantity();
                        double sum = ordItem.getQuantity() * ordItem.getPrice();
                        totalPrice += sum;
                    }
                } catch (Exception ex) {
                    System.err.println(ex);
                }

                try {
                    Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                    Statement statement = con.createStatement();

                    // Update Object data
                    String sqlUpdateItem = 
                            "UPDATE Order_Items " + 
                            "SET itemName = '" + item.getName() + "', itemPrice = " + item.getPrice() + ", itemQuantity = " +
                            item.getQuantity() + ", itemDescription = '" + item.getDesc() + "' " +
                            "WHERE itemID = " + item.getID() + " AND orderID = " + item.getOrderID() + ";";

                    statement.addBatch(sqlUpdateItem);

                    // Update Object data
                    String sqlUpdateOrder = 
                        "UPDATE Orders " + 
                        "SET orderPrice = " + totalPrice + ", orderTotalItems = " + totalItem +
                        " WHERE orderID = " + item.getOrderID() + ";";
                    statement.addBatch(sqlUpdateOrder);
                    statement.executeBatch();

                    statement.close();
                    con.close();

                } catch (SQLException ex){
                    System.err.println(ex);
                }

                setItemsTable(item.getOrderID());
                loadOrderData();
                // </editor-fold>
                
            } else { 
                // adding new item data into item object then putting it into hash
                String itemName = itemTabNameText.getText();
                double itemPrice = Double.parseDouble(itemTabPriceText.getText());
                int itemQuant = Integer.parseInt(itemTabQuantText.getText());
                String itemDesc = itemDescDetailText.getText();
                boolean itemStatus = false;
                
                item = new Item(curOrder, itemID, itemName, itemPrice, itemQuant, itemDesc, itemStatus);
                itemHash.put(itemID, item);
                
                int totalItem = 0;
                double totalPrice = 0.0;
                try {
                    int rows = itemsTable.getRowCount() - 1;
                    for (; rows >= 0; rows--){
                        Object itemObj = itemsTable.getValueAt(rows, 0);
                        // this is in case where the ItemID doesn't start with 0-n or skips etc
                        int tableItemID = Integer.parseInt(itemObj.toString());
                        // grab item object from hashmap based off the id from the table
                        Item ordItem = itemHash.get(tableItemID);
                        totalItem += ordItem.getQuantity();
                        double sum = ordItem.getQuantity() * ordItem.getPrice();
                        totalPrice += sum;
                    }
                    // add new item that was just created
                    totalItem += item.getQuantity();
                    double sum = item.getQuantity() * item.getPrice();
                    totalPrice += sum;
                } catch (Exception ex) {
                    System.err.println(ex);
                }
                
                try {
                    Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                    Statement statement = con.createStatement();

                    // Insert new item data into item Table
                    String sqlInsertItem = 
                        "INSERT INTO Order_Items" +
                        "(orderID, itemID, itemName, itemPrice, itemQuantity, itemDescription, itemStatus)" +
                        "VALUES (" + item.getOrderID() + ", " + item.getID() + ", '" + item.getName() + "', " + 
                        item.getPrice() + ", " + item.getQuantity() + ", '" + item.getDesc() + "', " + item.getItemStatus() + ");";

                    statement.addBatch(sqlInsertItem);

                    // Update Object data
                    String sqlUpdateOrder = 
                        "UPDATE Orders " + 
                        "SET orderPrice = " + totalPrice + ", orderTotalItems = " + totalItem +
                        " WHERE orderID = " + item.getOrderID() + ";";
                    statement.addBatch(sqlUpdateOrder);
                    statement.executeBatch();

                    statement.close();
                    con.close();

                } catch (SQLException ex){
                    System.err.println(ex);
                }
                
                setItemsTable(item.getOrderID());
                loadOrderData();
            }
        }
    }//GEN-LAST:event_updateItemsButtonActionPerformed

    private void newItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemsButtonActionPerformed
        DefaultTableModel iModel = (DefaultTableModel)itemsTable.getModel();
        
        int rowTotal = iModel.getRowCount();
        int itemIDMax;
        if (rowTotal == 0){
            itemIDMax = 0;
        } else {
            Object itemObj = iModel.getValueAt(rowTotal - 1, 0);
            itemIDMax = Integer.parseInt(itemObj.toString());
            itemIDMax++;
        }
        
        resetItemData();
        itemTabIDText.setText(Integer.toString(itemIDMax));
        updateItemsButton.setEnabled(true);
    }//GEN-LAST:event_newItemsButtonActionPerformed

    private void deleteItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemsButtonActionPerformed
        DefaultTableModel iModel = (DefaultTableModel)itemsTable.getModel();
        
        int rowTotal = iModel.getRowCount();
        if (rowTotal == 0){
            // Delete Order
            try {
                    Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                    Statement statement = con.createStatement();

                    // Delete order
                    String sqlDeleteOrder = 
                            "DELETE FROM Order WHERE orderID = " + curOrder + ";";
                    statement.executeQuery(sqlDeleteOrder);

                    statement.close();
                    con.close();

                } catch (SQLException ex){
                    System.err.println(ex);
                }
            
            loadOrderData();
            CardLayout card = (CardLayout)mainPanel.getLayout();
            card.show(mainPanel, "reportTablePanel");
            
        } else {
            Item item = itemHash.get(Integer.parseInt(itemTabIDText.getText()));
            if (item == null){
                JOptionPane.showMessageDialog(this, "Item doesn't exist yet!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for (int curRow = rowTotal - 1; curRow >= 0; curRow--){
                if (iModel.getValueAt(curRow, 0).equals(item.getID())){
                    iModel.removeRow(curRow);
                }
            }
            
            // Recalc total item/quant
            int totalItem = 0;
            double totalPrice = 0.0;
            try {
                int rows = itemsTable.getRowCount() - 1;
                for (; rows >= 0; rows--){
                    Object itemObj = itemsTable.getValueAt(rows, 0);
                    int tableItemID = Integer.parseInt(itemObj.toString());
                    Item ordItem = itemHash.get(tableItemID);
                    totalItem += ordItem.getQuantity();
                    double sum = ordItem.getQuantity() * ordItem.getPrice();
                    totalPrice += sum;
                }
            } catch (Exception ex) {
                System.err.println(ex);
            }
            
            try {
                    Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
                    Statement statement = con.createStatement();

                    // Delete based on itemID
                    String sqlDeleteItem = 
                            "DELETE FROM Order_Items WHERE orderID = " + item.getOrderID() + " AND itemID = " + item.getID() + ";";
                    statement.addBatch(sqlDeleteItem);
                    
                    // Update Object data
                    String sqlUpdateOrder = 
                        "UPDATE Orders " + 
                        "SET orderPrice = " + totalPrice + ", orderTotalItems = " + totalItem +
                        " WHERE orderID = " + item.getOrderID() + ";";
                    statement.addBatch(sqlUpdateOrder);
                    statement.executeBatch();

                    statement.close();
                    con.close();

                } catch (SQLException ex){
                    System.err.println(ex);
                }
            
            setItemsTable(item.getOrderID());
            loadOrderData();
            // delete object
            int tempID = item.getID();
            item = null;
            itemHash.put(tempID, item);
        }
    }//GEN-LAST:event_deleteItemsButtonActionPerformed

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
        // check if all item retrived
        DefaultTableModel iModel = (DefaultTableModel) itemsTable.getModel();
        int totalRows = iModel.getRowCount();
        boolean[] receivedArr = new boolean[totalRows];
        for (int i = totalRows - 1; i >= 0; i--){
            receivedArr[i] = (boolean) iModel.getValueAt(i, 4);
        }
        // check if all items are received
        for (boolean bool : receivedArr){
            if (!bool){
                JOptionPane.showMessageDialog(this, "Please make sure all items are received!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        try {
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
            Statement statement = con.createStatement();

            // Update Object data
            String sqlUpdateOrder =
            "UPDATE Orders " +
            "SET orderStatus = " + true +
            " WHERE orderID = " + curOrder + ";";
            statement.executeUpdate(sqlUpdateOrder);

            statement.close();
            con.close();

        } catch (SQLException ex){
            System.err.println(ex);
        }

        loadOrderData();
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "reportTablePanel");
    }//GEN-LAST:event_completeOrderButtonActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting">
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineShoppingSupport().setVisible(true);
            }
        });
        
        // Load mySQL driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    private void loadOrderData(){
         // grab table model
        DefaultTableModel rModel = (DefaultTableModel)reportTable.getModel();
        // remove previous data
        int previousRows = rModel.getRowCount();
        if (previousRows > 0){
            for (int i = previousRows - 1; i >= 0; i--){
                rModel.removeRow(i);
            }
        }
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        reportTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        reportTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        reportTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        reportTable.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        
        try {
            // getting connection
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
            
            // setting statement query
            Statement statement = con.createStatement();
            String sqlSelect = 
                    "SELECT * FROM Orders;";
            
            ResultSet rs = statement.executeQuery(sqlSelect);
            while (rs.next()){
                int orderID = rs.getInt("orderID");
                String trkNum = rs.getString("trackingNum");
                String orderComp = rs.getString("orderCompany");
                int totItem = rs.getInt("orderTotalItems");
                String totPrice = new DecimalFormat("$#,###.00").format(rs.getDouble("orderPrice"));
                String orderDate = rs.getString("orderDate");
                boolean orderStatus = rs.getBoolean("orderStatus");
                
                Object[] mySQLOrders = {orderID, trkNum, orderComp, totItem, totPrice, orderDate, orderStatus};
                rModel.addRow(mySQLOrders);
            }
            
            // closing connections
            statement.close();
            con.close();
        } catch (SQLException ex){
            System.err.println(ex);
        }
    }
    
    private void setItemsTable(int orderID){
        DefaultTableModel iModel = (DefaultTableModel)itemsTable.getModel();
        curOrder = orderID;
        
        // remove previous data
        int previousRows = iModel.getRowCount();
        if (previousRows > 0){
            for (int i = previousRows - 1; i >= 0; i--){
                iModel.removeRow(i);
            }
        }
        resetItemData();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        itemsTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        itemsTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        itemsTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        
        try {
            // getting connection
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
            
            // setting statement query
            Statement statement = con.createStatement();
            
            /* Getting maxItemAmount
            int maxItemAmount;
            String sqlItemAmount = 
                    "SELECT COUNT(*) FROM Order_Items WHERE orderID = " + orderID + ";";
            ResultSet itemAmountRS = statement.executeQuery(sqlItemAmount);
            if (itemAmountRS.next()){
                maxItemAmount = itemAmountRS.getInt("COUNT(*)");
                System.out.println(maxItemAmount);
            } 
            */
            
            // Getting order status
            boolean orderStatus;
            String sqlOrderStatus = 
                    "SELECT orderStatus FROM Orders WHERE orderID = " + orderID + ";";
            ResultSet itemAmountRS = statement.executeQuery(sqlOrderStatus);
            if (itemAmountRS.next()){
                orderStatus = itemAmountRS.getBoolean("orderStatus");
                if (orderStatus){
                    lockAllItemData();
                }
            } 
            
            // grabbing item data
            String sqlItemSelect = 
                    "SELECT * FROM Order_Items WHERE orderID = " + orderID + ";";
            
            ResultSet itemsRS = statement.executeQuery(sqlItemSelect);
            while (itemsRS.next()){
                
                int itemID = itemsRS.getInt("itemID");
                String itemName = itemsRS.getString("itemName");
                String itemPriceFormat = new DecimalFormat("$#,###.00").format(itemsRS.getDouble("itemPrice"));
                double itemPrice = itemsRS.getDouble("itemPrice");
                int itemQuant = itemsRS.getInt("itemQuantity");
                String itemDesc = itemsRS.getString(("itemDescription"));
                boolean itemStatus = itemsRS.getBoolean("itemStatus");
                
                Item item = new Item(orderID, itemID, itemName, itemPrice, itemQuant, itemDesc, itemStatus);
                itemHash.put(item.getID(), item);
                
                Object[] mySQLItems = {item.getID(), item.getName(), item.getQuantity(), itemPriceFormat, item.getItemStatus()};
                iModel.addRow(mySQLItems);
            }
            
            /*
            String sqlOrderSelect = 
                    "SELECT * FROM Orders WHERE orderID = " + orderID + ";";
            
            ResultSet orderRS = statement.executeQuery(sqlOrderSelect);
            if (orderRS.next()){
                itemOrderItemsText.setText(Integer.toString(orderRS.getInt("orderTotalItems")));
                itemOrderPriceText.setText(new DecimalFormat("$#,###.00").format(orderRS.getDouble("orderPrice")));
            }
            */
            
            // closing connections
            statement.close();
            con.close();
        } catch (SQLException ex){
            System.err.println(ex);
        }
    }
    
    private void setNewItemGUI (){
        trackingNumText.setEnabled (false);
        orderCompanyText.setEnabled (false);
        addOrderButton.setEnabled (false);
        addItemButton.setEnabled (true);
        itemNameText.setEnabled (true);
        itemQuantityText.setEnabled (true);
        itemPriceText.setEnabled (true);
        itemDescText.setEnabled(true);
    }
    
    private void resetNewItemGUI (){
        itemNameText.setText("");
        itemQuantityText.setText("");
        itemPriceText.setText("");
        itemDescText.setText("");
    }
    
    private void resetNewOrderGUI (){
        trackingNumText.setText("");
        trackingNumText.setEnabled(true);
        orderCompanyText.setText("");
        orderCompanyText.setEnabled(true);
        totalItemsText.setText("0");
        totalPriceText.setText("0");
        itemNameText.setEnabled(false);
        itemQuantityText.setEnabled(false);
        itemPriceText.setEnabled(false);
        itemIDText.setText("");
        itemDescText.setText("");
        addItemButton.setEnabled(false);
        addOrderButton.setEnabled(true);
        confirmOrderButton.setEnabled(false);
        resetNewItemGUI();
    }
    
    private void resetItemData (){
        itemTabIDText.setEnabled(false);
        itemTabIDText.setText("");
        itemTabNameText.setText("");
        itemTabQuantText.setText("");
        itemTabPriceText.setText("");
        itemDescDetailText.setText("");
        itemTabNameText.setEnabled(true);
        itemTabQuantText.setEnabled(true);
        itemTabPriceText.setEnabled(true);
        itemDescDetailText.setEnabled(true);
        updateItemsButton.setEnabled(true);
        newItemsButton.setEnabled(true);
        deleteItemsButton.setEnabled(true);
        completeOrderButton.setEnabled(true);
        if (canEdit[4] == false){
            canEdit[4] = true;
            DefaultTableModel iModel = (DefaultTableModel)itemsTable.getModel();
            iModel.fireTableStructureChanged();
        }
    }
    
    private void lockAllItemData () {
        itemTabNameText.setEnabled(false);
        itemTabQuantText.setEnabled(false);
        itemTabPriceText.setEnabled(false);
        itemDescDetailText.setEnabled(false);
        updateItemsButton.setEnabled(false);
        newItemsButton.setEnabled(false);
        deleteItemsButton.setEnabled(false);
        completeOrderButton.setEnabled(false);
        canEdit[4] = false;
        DefaultTableModel iModel = (DefaultTableModel)itemsTable.getModel();
        iModel.fireTableStructureChanged();
    }
    
    /* I don't wanna rewrite this
    private void updateOrderPrices(int orderID){
        int totalAmount = (int)getTValueTotal(itemsTable, 2);
        double totalPrice = getTValueTotal(itemsTable, 3);

        try {
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/OSSdb", "root", "Root!420");
            Statement statement = con.createStatement();

            // Update Object data
            String sqlUpdateOrder = 
                    "UPDATE Orders " + 
                    "SET orderPrice = " + totalPrice + ", orderTotalItems = " + totalAmount +
                    " WHERE orderID = " + orderID + ";";

            statement.executeUpdate(sqlUpdateOrder);

            statement.close();
            con.close();

        } catch (SQLException ex){
            System.err.println(ex);
            resetNewOrderGUI();
        }
    }
    */

    private boolean checkItemError(){
        try {
            int itemQuant = Integer.parseInt(itemQuantityText.getText());
            double itemPrice = Double.parseDouble(itemPriceText.getText());
            return true;
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this,"Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean checkUpdateError(){
        Item item = itemHash.get(Integer.parseInt(itemTabIDText.getText()));
        try {
            int itemQuant = Integer.parseInt(itemTabQuantText.getText());
            // if item exist based on itemID
            if (item != null){
                // if the string is the same as format, then ignore, else check if double
                String setPrice = new DecimalFormat("$#,###.00").format(item.getPrice());
                if (!itemTabPriceText.getText().equals(setPrice)){
                    double itemPrice = Double.parseDouble(itemTabPriceText.getText());
                }
            } else {
                double itemPrice = Double.parseDouble(itemTabPriceText.getText());
            }
            if (itemTabNameText.getText().equals("")){
                System.err.println("empty String");
                JOptionPane.showMessageDialog(this,"Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        }catch (Exception ex){
            JOptionPane.showMessageDialog(this,"Please enter all required fields with valid value!", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JButton confirmOrderButton;
    private javax.swing.JButton deleteItemsButton;
    private javax.swing.JScrollPane itemDescDetailScrollPane;
    private javax.swing.JTextArea itemDescDetailText;
    private javax.swing.JScrollPane itemDescScrollPane;
    private javax.swing.JTextArea itemDescText;
    private javax.swing.JTextField itemIDText;
    private javax.swing.JTextField itemNameText;
    private javax.swing.JTextField itemPriceText;
    private javax.swing.JTextField itemQuantityText;
    private javax.swing.JTextField itemTabIDText;
    private javax.swing.JTextField itemTabNameText;
    private javax.swing.JTextField itemTabPriceText;
    private javax.swing.JTextField itemTabQuantText;
    private javax.swing.JPanel itemsInfoPanel;
    private javax.swing.JSplitPane itemsInfoSplitPane;
    private javax.swing.JTable itemsTable;
    private javax.swing.JScrollPane itemsTableScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newItemsButton;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JPanel newOrderPanel;
    private javax.swing.JTextField orderCompanyText;
    private javax.swing.JTextField orderIDText;
    private javax.swing.JButton ordersButton;
    private javax.swing.JScrollPane reporTableScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JTextField totalItemsText;
    private javax.swing.JTextField totalPriceText;
    private javax.swing.JTextField trackingNumText;
    private javax.swing.JButton updateItemsButton;
    // End of variables declaration//GEN-END:variables
}
