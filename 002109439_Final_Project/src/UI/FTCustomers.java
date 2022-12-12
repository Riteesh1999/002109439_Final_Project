/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author riteesh
 */
public class FTCustomers extends javax.swing.JFrame {

    /**
     * Creates new form PassengersJFrame
     */
    public FTCustomers() {
        initComponents();
        DisplayPassengers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PsPhone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        NCountry = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPassengers = new javax.swing.JTable();
        PsName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        PsAddress = new javax.swing.JTextField();
        PsNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 128, 183));
        jLabel10.setText("Passport Number");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(16, 135, 195));
        jLabel14.setText("Phone");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(16, 135, 195));
        jLabel11.setText("Manage Passenger");

        PsPhone.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(20, 135, 192));
        jLabel12.setText("Address");

        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(25, 136, 192));

        jLabel15.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel15.setText("Quickr Airlines");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        NCountry.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        NCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "USA", "England", "China", "Russia", "Switzerland" }));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 140, 199));
        jLabel6.setText("List of Passengers");

        Gender.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Genderquee", "Polygender", "Genderflui" }));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 122, 177));
        jLabel7.setText("Nationality");

        TblPassengers.setModel(new javax.swing.table.DefaultTableModel(
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
        TblPassengers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPassengersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblPassengers);

        PsName.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 130, 188));
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 134, 192));
        jLabel9.setText("Passenger Name");

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        PsAddress.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        PsNumber.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnDelete)
                                .addGap(144, 144, 144)
                                .addComponent(btnBack))
                            .addComponent(jLabel6))
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PsName))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(NCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(PsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(63, 63, 63))
                                    .addComponent(PsAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PsAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnDelete))
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    
    private void DisplayPassengers()
    {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
            st = cn.createStatement();
            rs = st.executeQuery("Select * from tblPass");
            TblPassengers.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            
        }
    }
    int PassId = 0;
    
    private void CountPassengers()
    {
        try{
            st1 = cn.createStatement();
            rs1 = st1.executeQuery("Select Max(PId) from tblPass");
            rs1.next();
            PassId = rs1.getInt(1)+1;
            
        }catch (Exception e){
            
        }
    }
    
    private void Clear()
    {
        PsName.setText("");
        PsNumber.setText("");
        PsAddress.setText("");
        PsPhone.setText("");
    }
    int Key = 0;
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if(PsName.getText().isEmpty() || PsNumber.getText().isEmpty() || PsAddress.getText().isEmpty() || PsPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this , "Missing Information");

        } else {
            try {
                CountPassengers ();

                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
                PreparedStatement Add = cn.prepareStatement("insert into tblPass values(?,?,?,?,?,?,?)");
                Add.setInt(1, PassId);
                Add.setString(2, PsName.getText());
                Add.setString(3, NCountry.getSelectedItem().toString());
                Add.setString(4, Gender.getSelectedItem().toString());
                Add.setString(5, PsNumber.getText());
                Add.setString(6, PsAddress.getText());
                Add.setString(7, PsPhone.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Added");
                cn.close();
                DisplayPassengers();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
        }

    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        new FlightsMainJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void TblPassengersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPassengersMouseClicked
        DefaultTableModel model = (DefaultTableModel)TblPassengers.getModel();
        int MyIndex = TblPassengers.getSelectedRow();
        //Key = Integer.valueOf(model.getValueAt(MyIndex, 0) toString());
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0) .toString());
        PsName.setText(model.getValueAt(MyIndex, 1).toString());
        NCountry.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        Gender.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        PsNumber.setText(model.getValueAt(MyIndex, 4).toString());
        PsAddress.setText(model.getValueAt(MyIndex, 5).toString());
        PsPhone.setText(model.getValueAt(MyIndex, 6).toString());
    }//GEN-LAST:event_TblPassengersMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if(Key == 0){
            JOptionPane.showMessageDialog(this, "select a Passenger");
        }else{
            try{
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
                String Query = "Delete from tblPass where PId ="+Key;
                Statement del = cn.createStatement();
                del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Passenger deleted successfully");
                DisplayPassengers();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, 0);
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(Key == 0){
            JOptionPane.showMessageDialog(this, "select a Passenger");
        }else{
            try{
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines" , "root" , "");
                String Query = "Delete from tblPass where PId ="+Key;
                Statement del = cn.createStatement();
                del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Passenger deleted successfully");
                DisplayPassengers();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, 0);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    
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
            java.util.logging.Logger.getLogger(FTCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JComboBox<String> NCountry;
    private javax.swing.JTextField PsAddress;
    private javax.swing.JTextField PsName;
    private javax.swing.JTextField PsNumber;
    private javax.swing.JTextField PsPhone;
    private javax.swing.JTable TblPassengers;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}