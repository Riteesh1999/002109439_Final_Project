/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import UI.CustomersJFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author riteesh
 */
public class TicketsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicketsJFrame
     */
    public TicketsJFrame() {
        initComponents();
        GetPassenger();
        PsNationality.setEditable(false);
        PsName.setEditable(false);
        PsPass.setEditable(false);
        Gender.setEnabled(false); 
        DisplayBookings();
        GetFlights();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        PsPass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PsNationality = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBookings = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        PsName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        PsId = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Cost = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        FLCode = new javax.swing.JComboBox<>();
        Gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PsPass.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 136, 193));
        jLabel10.setText("Passport Number");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(18, 140, 201));
        jLabel14.setText("Nationality");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 139, 199));
        jLabel6.setText("Flight Available");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(24, 150, 213));
        jLabel11.setText("Flight Bookings");

        PsNationality.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(25, 138, 195));
        jLabel12.setText("Cost");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 142, 206));
        jLabel7.setText("Passenger ID");

        btnReset.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        TblBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblBookings);

        btnBook.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        btnBook.setText("Book");
        btnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(20, 155, 223));

        jLabel13.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel13.setText("Quickr Airlines");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PsName.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        PsId.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        PsId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 138, 198));
        jLabel9.setText("Passenger Name");

        Cost.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(22, 139, 198));
        jLabel15.setText("Flight Code");

        FLCode.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N

        Gender.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(28, 145, 204));
        jLabel8.setText("Gender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PsId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(PsName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnBook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                                .addComponent(btnReset)
                                .addGap(170, 170, 170)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(FLCode, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(PsPass, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(PsNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(476, 476, 476))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PsNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FLCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PsPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(4, 4, 4)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnReset)
                                .addComponent(btnBook))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    private void GetFlights()
    {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
            st = cn.createStatement();
            String Query = "select * from tblPassengers";
            rs = st.executeQuery(Query);
            while(rs.next())
            {
                String FCode = rs.getString("FlightCode");
                FLCode.addItem(FCode);
                
            }
        }catch(Exception e){
            
        }
        
    }
    
    private void GetPassenger()
    {
         try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
            st = cn.createStatement();
            String Query = "select * from tblPass";
            rs = st.executeQuery(Query);
            while(rs.next())
            {
                String PId = String.valueOf(rs.getInt("PId"));
                PsId.addItem(PId);
                PsName.setText(rs.getString("PName"));
                PsNationality.setText(rs.getString("PNat"));
                PsPass.setText(rs.getString("PPass"));
                Gender.addItem(rs.getString("PGen"));
                
            }
        }catch(Exception e){
            
        }
    }
    private void GetPassengerInfo()
    {
        String Query = "select * from tblPass where PId ="+PsId.getSelectedItem().toString();
        Statement st;
        ResultSet rs;
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
            st = cn.createStatement();
            rs = st.executeQuery(Query);
            if(rs.next()){
                PsName.setText(rs.getString("PName"));
                PsNationality.setText(rs.getString("PNat"));
                PsPass.setText(rs.getString("PPass"));
//                PsGen.getSelectedItem(rs.getString("PGen"));

                
            }
        }catch(Exception e){
            
        }
    }
    private void DisplayBookings()
    {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
            st = cn.createStatement();
            rs = st.executeQuery("Select * from tblBookings");
            TblBookings.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            
        }
    }
    int TicketId = 0;
    
    private void CountBookings()
    {
        try{
            st1 = cn.createStatement();
            rs1 = st1.executeQuery("Select Max(TicketId) from tblBookings");
            rs1.next();
            TicketId = rs1.getInt(1)+1;
            
        }catch (Exception e){
            
        }
    }
    private void Clear()
    {
        FLCode.setSelectedIndex(-1);
        PsName.setText("");
        PsPass.setText("");
        PsNationality.setText("");
        Cost.setText("");
    }
    private void btnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseClicked
         if(PsName.getText().isEmpty() || PsId.getSelectedIndex() == -1 || Cost.getText().isEmpty() || PsNationality.getText().isEmpty() || PsPass.getText().isEmpty() || FLCode.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this , "Missing Information");
            
        } else {
            try {
                CountBookings ();
                
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
                PreparedStatement Add = cn.prepareStatement("insert into tblBookings values(?,?,?,?,?,?,?)");
                Add.setInt(1, TicketId);
                Add.setString(2, PsName.getText());
                Add.setString(3, FLCode.getSelectedItem().toString());
                Add.setString(4, Gender.getSelectedItem().toString());
                Add.setString(5, PsPass.getText());
                Add.setString(6, Cost.getText());
                Add.setString(7, PsNationality.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Booking Completed");
                cn.close();
                DisplayBookings();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
    }//GEN-LAST:event_btnBookMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        new MainJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void PsIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsIdActionPerformed
        GetPassengerInfo();
    }//GEN-LAST:event_PsIdActionPerformed

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        FLCode.setSelectedIndex(-1);
//        PsId.setSelectedIndex(-1);
        PsName.setText("");
        PsPass.setText("");
        PsNationality.setText("");
        Cost.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cost;
    private javax.swing.JComboBox<String> FLCode;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JComboBox<String> PsId;
    private javax.swing.JTextField PsName;
    private javax.swing.JTextField PsNationality;
    private javax.swing.JTextField PsPass;
    private javax.swing.JTable TblBookings;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
