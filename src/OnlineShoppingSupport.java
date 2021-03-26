import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class OnlineShoppingSupport extends javax.swing.JFrame {

    private static int tempID = 0;
    private HashMap<Integer, Order> orderHash = new HashMap<Integer, Order>();
    public OnlineShoppingSupport() {
        initComponents();
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
        itemsInfoSplitPane = new javax.swing.JSplitPane();
        itemsTableScrollPane = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        newOrderButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Shopping Support");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPanel.setLayout(new java.awt.CardLayout());

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tracking #", "Total Items", "Total Price", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            reportTable.getColumnModel().getColumn(2).setPreferredWidth(25);
            reportTable.getColumnModel().getColumn(3).setResizable(false);
            reportTable.getColumnModel().getColumn(3).setPreferredWidth(25);
            reportTable.getColumnModel().getColumn(4).setResizable(false);
            reportTable.getColumnModel().getColumn(4).setPreferredWidth(25);
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

        javax.swing.GroupLayout newOrderPanelLayout = new javax.swing.GroupLayout(newOrderPanel);
        newOrderPanel.setLayout(newOrderPanelLayout);
        newOrderPanelLayout.setHorizontalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(totalItemsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(trackingNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))))
                    .addComponent(confirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addOrderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        newOrderPanelLayout.setVerticalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(itemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(trackingNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalItemsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(itemQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(confirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        mainPanel.add(newOrderPanel, "newOrderPanel");

        itemsInfoSplitPane.setDividerLocation(500);
        itemsInfoSplitPane.setDividerSize(0);
        itemsInfoSplitPane.setEnabled(false);

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quant", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        itemsTableScrollPane.setViewportView(itemsTable);
        if (itemsTable.getColumnModel().getColumnCount() > 0) {
            itemsTable.getColumnModel().getColumn(0).setResizable(false);
            itemsTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            itemsTable.getColumnModel().getColumn(1).setResizable(false);
            itemsTable.getColumnModel().getColumn(1).setPreferredWidth(5);
            itemsTable.getColumnModel().getColumn(2).setResizable(false);
            itemsTable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        itemsInfoSplitPane.setRightComponent(itemsTableScrollPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        itemsInfoSplitPane.setLeftComponent(jPanel1);

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
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        Object orderID = reportTable.getValueAt (reportTable.getSelectedRow(),0);
        
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "itemsTablePanel");
    }//GEN-LAST:event_reportTableMouseClicked

    private void reportTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseMoved
        final int x = evt.getX();
        final int y = evt.getY();
        
        final Rectangle tableBounds = reportTable.getBounds();
        if (tableBounds != null && tableBounds.contains(x,y)) {
            reportTable.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
        Object[] mySQLData = {order.getID(), order.getTrkNum(), order.getTotalItem(), order.getTotalPrice(), false};
        rModel.addRow(mySQLData);
        
        resetNewOrderGUI();

        // Swap back to report table viewpoint
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "reportTablePanel");
    }//GEN-LAST:event_confirmOrderButtonActionPerformed

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        String trackingNum = trackingNumText.getText();
        if (trackingNum.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter a tracking number!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // create new order object
            Order newOrder = new Order (trackingNum);
            orderHash.put(newOrder.getID(), newOrder);
            
            setNewItemGUI();
            orderIDText.setText(Integer.toString(newOrder.getID()));
            itemIDText.setText(Integer.toString(newOrder.getItemID()));
        }
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // grab created order
        Order order = orderHash.get(Integer.parseInt(orderIDText.getText()));
        // add new item
        Item newItem = new Item (order, Integer.parseInt(itemQuantityText.getText()),Double.parseDouble(itemPriceText.getText()),itemNameText.getText());
        // update order
        order.setTotalItems(newItem.getQuantity());
        order.setTotalPrice(Math.round((newItem.getPrice() * newItem.getQuantity())*100.0)/100.0);
        // update hash
        orderHash.put(order.getID(), order);
        
        // set GUI
        resetNewItemGUI();
        confirmOrderButton.setEnabled (true);
        itemIDText.setText(Integer.toString(order.getItemID()));
        totalItemsText.setText(Integer.toString(order.getTotalItem()));
        totalPriceText.setText(Double.toString(order.getTotalPrice()));
    }//GEN-LAST:event_addItemButtonActionPerformed

    
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
    }
    
    private void setNewItemGUI (){
        trackingNumText.setEnabled (false);
        addOrderButton.setEnabled (false);
        addItemButton.setEnabled (true);
        itemNameText.setEnabled (true);
        itemQuantityText.setEnabled (true);
        itemPriceText.setEnabled (true);
    }
    
    private void resetNewItemGUI (){
        itemNameText.setText("");
        itemQuantityText.setText("");
        itemPriceText.setText("");
    }
    
    private void resetNewOrderGUI (){
        trackingNumText.setText("");
        trackingNumText.setEnabled(true);
        totalItemsText.setText("0");
        totalPriceText.setText("0");
        itemNameText.setEnabled(false);
        itemQuantityText.setEnabled(false);
        itemPriceText.setEnabled(false);
        itemIDText.setText("");
        addItemButton.setEnabled(false);
        addOrderButton.setEnabled(true);
        resetNewItemGUI();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton confirmOrderButton;
    private javax.swing.JTextField itemIDText;
    private javax.swing.JTextField itemNameText;
    private javax.swing.JTextField itemPriceText;
    private javax.swing.JTextField itemQuantityText;
    private javax.swing.JSplitPane itemsInfoSplitPane;
    private javax.swing.JTable itemsTable;
    private javax.swing.JScrollPane itemsTableScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JPanel newOrderPanel;
    private javax.swing.JTextField orderIDText;
    private javax.swing.JButton ordersButton;
    private javax.swing.JScrollPane reporTableScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JTextField totalItemsText;
    private javax.swing.JTextField totalPriceText;
    private javax.swing.JTextField trackingNumText;
    // End of variables declaration//GEN-END:variables
}
