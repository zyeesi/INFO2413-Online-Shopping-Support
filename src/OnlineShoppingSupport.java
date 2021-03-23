import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class OnlineShoppingSupport extends javax.swing.JFrame {

    private static int tempID = 0;
    
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
        addOrderButton = new javax.swing.JButton();
        newOrderButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Shopping Support");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
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
            reportTable.getColumnModel().getColumn(1).setResizable(false);
            reportTable.getColumnModel().getColumn(2).setResizable(false);
            reportTable.getColumnModel().getColumn(3).setResizable(false);
            reportTable.getColumnModel().getColumn(4).setResizable(false);
        }

        mainPanel.add(reporTableScrollPane, "reportTablePanel");

        jLabel1.setText("Order ID:");

        jLabel2.setText("Tracking #:");

        jLabel3.setText("Total Items:");

        jLabel4.setText("Total Price ($):");

        orderIDText.setText(Integer.toString(tempID));
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

        addOrderButton.setText("Add Order");
        addOrderButton.setMaximumSize(new java.awt.Dimension(87, 22));
        addOrderButton.setMinimumSize(new java.awt.Dimension(87, 22));
        addOrderButton.setPreferredSize(new java.awt.Dimension(87, 22));
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

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
                            .addComponent(totalItemsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trackingNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        newOrderPanelLayout.setVerticalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
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
                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        mainPanel.add(newOrderPanel, "newOrderPanel");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newOrderButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        // click on each order will bring to Order form, currently a popup as a placeholder
        Object orderID = reportTable.getValueAt (reportTable.getSelectedRow(),0);
        // the 1 at the end is the inforamtion icon
        JOptionPane.showMessageDialog(this, (Object)("Open order number: " + orderID), "Placeholder", JOptionPane.INFORMATION_MESSAGE);
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

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        DefaultTableModel rModel = (DefaultTableModel)reportTable.getModel();
        Object[] mySQLData = {tempID, trackingNumText.getText(), Integer.parseInt(totalItemsText.getText()), Double.parseDouble(totalPriceText.getText()), false};
        rModel.addRow(mySQLData);
        orderIDText.setText(Integer.toString(++tempID));
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "reportTablePanel");
    }//GEN-LAST:event_addOrderButtonActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
