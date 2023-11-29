import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class main extends javax.swing.JFrame {
  
    /**
     * Creates new form main
     */
    public main() {
   
      
        initComponents();
        Connect();
        Fetch();
        
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
   
    
    
   private void Fetch() {
    try {
        pst = con.prepareStatement("SELECT * FROM students_tbl");
        rs = pst.executeQuery();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0); // Clear existing rows
        
        while (rs.next()) {
            String fname = rs.getString("fname");
            String sid = rs.getString("sid");
            String course = rs.getString("course");
            String section = rs.getString("section");
            String year = rs.getString("year");

            // Create a new row array to hold the data for each row
            Object[] row = { fname, sid, course, section, year };
            
            // Add the row to the table model
            df.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/CC104","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblupdate = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtsection = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 20, -1, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(246, 220, 174));
        jTable1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NAME", "STUDENT I.D", "COURSE", "SECTION", "YEAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 1010, 930));

        lblupdate.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        lblupdate.setForeground(new java.awt.Color(255, 255, 255));
        lblupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupdate.setText("UPDATE");
        lblupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblupdateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblupdateMousePressed(evt);
            }
        });
        jPanel1.add(lblupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 690, 220, 80));

        add.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 220, 80));

        delete.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 690, 220, 80));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FULL NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 280, 70));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STUDENT ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COURSE       :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SECTION      :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("YEAR           :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        txtfname.setBackground(new java.awt.Color(245, 154, 61));
        txtfname.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        txtfname.setForeground(new java.awt.Color(255, 255, 255));
        txtfname.setBorder(null);
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 390, 60));

        txtid.setBackground(new java.awt.Color(245, 154, 61));
        txtid.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setBorder(null);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 390, 60));

        txtcourse.setBackground(new java.awt.Color(245, 154, 61));
        txtcourse.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        txtcourse.setForeground(new java.awt.Color(255, 255, 255));
        txtcourse.setBorder(null);
        jPanel1.add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 390, 60));

        txtsection.setBackground(new java.awt.Color(245, 154, 61));
        txtsection.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        txtsection.setForeground(new java.awt.Color(255, 255, 255));
        txtsection.setBorder(null);
        txtsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsectionActionPerformed(evt);
            }
        });
        jPanel1.add(txtsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 390, 60));

        txtyear.setBackground(new java.awt.Color(245, 154, 61));
        txtyear.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        txtyear.setForeground(new java.awt.Color(255, 255, 255));
        txtyear.setBorder(null);
        txtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearActionPerformed(evt);
            }
        });
        jPanel1.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 390, 60));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG/LOGIN (2).jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        try {
            String full_name = txtfname.getText();
            String student_id = txtid.getText();
            String course = txtcourse.getText();
            String section = txtsection.getText();
            String year = txtyear.getText();
            
            pst = con.prepareStatement("INSERT INTO students_tbl (fname,sid,course,section,year)VALUES(?,?,?,?,?)");
            pst.setString(1, full_name);
            pst.setString(2, student_id);
            pst.setString(3, course);
            pst.setString(4, section);
            pst.setString(5, year);
            
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Student successfully added!");
                txtfname.setText("");
                txtid.setText("");
                txtcourse.setText("");
                txtsection.setText("");
                txtyear.setText(""); 
                Fetch();
               
            }else{
                JOptionPane.showMessageDialog(this, "Failed to add student, please try again!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_addMouseClicked

    private void lblupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblupdateMouseClicked
       
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    if (1 == jTable1.getSelectedRowCount()) {
        String fname = txtfname.getText();
        String sid = txtid.getText(); // Assuming this field holds the student ID
        String course = txtcourse.getText();
        String section = txtsection.getText();
        String year = txtyear.getText();
       
        
        int selectedRow = jTable1.getSelectedRow();
        tblModel.setValueAt(fname, selectedRow, 0);
        tblModel.setValueAt(sid, selectedRow, 1);
        tblModel.setValueAt(course, selectedRow, 2);
        tblModel.setValueAt(section, selectedRow, 3);
        tblModel.setValueAt(year, selectedRow, 4);

        try {
            
            pst = con.prepareStatement("UPDATE students_tbl SET sid=?, course=?, section=?, year=? WHERE fname=?");
            pst.setString(1, sid);
              pst.setString(2, course);
            pst.setString(3, section);
            pst.setString(4, year);
            pst.setString(5, fname);
           
            
            
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student updated successfully!");
                 txtfname.setText("");
            txtid.setText("");
            txtcourse.setText("");
            txtsection.setText("");
            txtyear.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Update failed!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        
    }//GEN-LAST:event_lblupdateMouseClicked

    private void lblupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblupdateMousePressed
       
    }//GEN-LAST:event_lblupdateMousePressed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsectionActionPerformed

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        
        String tblfname = tbModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblid = tbModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblcourse = tbModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblsection = tbModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblyear = tbModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
        
        txtfname.setText(tblfname);
        txtid.setText(tblid);
        txtcourse.setText(tblcourse);
        txtsection.setText(tblsection);
        txtyear.setText(tblyear);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
         try {
        DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String idToDelete = tbModel.getValueAt(selectedRow, 1).toString(); // Assuming ID is in the second column

            pst = con.prepareStatement("DELETE FROM students_tbl WHERE sid = ?");
            pst.setString(1, idToDelete);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student record successfully deleted!");
                 txtfname.setText("");
                txtid.setText("");
                txtcourse.setText("");
                txtsection.setText("");
                txtyear.setText("");
                
                // Refresh data in the table after deletion
                Fetch();
            } else {
                JOptionPane.showMessageDialog(this, "Delete operation failed!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Delete operation failed! Check logs for details.");
    }
        
    }//GEN-LAST:event_deleteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblupdate;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtsection;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
