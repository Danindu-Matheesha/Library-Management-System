/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.view;

import edu.ijse.controller.MemberController;
import edu.ijse.dto.BookDto;
import edu.ijse.dto.MemberDto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MemberView extends javax.swing.JFrame {
    private MemberController memberController;

    /**
     * Creates new form MemberView
     */
    public MemberView() throws Exception {
        initComponents();
        memberController = new MemberController();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPhoNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRegDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        txtPhoNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Member Name");

        txtRegDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Member Address");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Member Id");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Member DOB");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Member Phone No");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Register Date");

        txtDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Member");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMember);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 707, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
        deleteMember(); // TODO add your handling code here:
    }// GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
        updateMember(); // TODO add your handling code here:
    }// GEN-LAST:event_btnUpdateActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
        saveMember(); // TODO add your handling code here:
    }// GEN-LAST:event_btnSaveActionPerformed

    private void tblMemberMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblMemberMouseClicked
        searchMember(); // TODO add your handling code here:
    }// GEN-LAST:event_tblMemberMouseClicked

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    // /* Set the Nimbus look and feel */
    // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    // /* If Nimbus (introduced in Java SE 6) is not available, stay with the
    // default look and feel.
    // * For details see
    // http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    // */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    // javax.swing.UIManager.getInstalledLookAndFeels()) {
    // if ("Nimbus".equals(info.getName())) {
    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
    // break;
    // }
    // }
    // } catch (ClassNotFoundException ex) {
    // java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // }
    // //</editor-fold>
    //
    // /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // new MemberView().setVisible(true);
    // }
    // });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMember;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoNo;
    private javax.swing.JTextField txtRegDate;
    // End of variables declaration//GEN-END:variables

    private void saveMember() {
        //String resp;
        try {
            MemberDto dto = new MemberDto(txtId.getText(),txtName.getText(),txtAddress.getText(),Integer.parseInt(txtPhoNo.getText()),txtDOB.getText(), txtRegDate.getText());
            String resp = memberController.saveMember(dto);
            //System.out.println(resp);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error at save data");
        }

    }
    
    private void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoNo.setText("");
        txtDOB.setText("");
        txtRegDate.setText("");
    }
    
    private void loadTable() {
        try {
            String columns[] = { " Member Id", "Member Name", "Member Address", "Phone No", "DOB", "RegisterDate" };
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblMember.setModel(dtm);

            ArrayList<MemberDto> memberDtos = memberController.getAllMember();
            for (MemberDto dto : memberDtos) {
                Object[] rowDate = { dto.getMemberId(), dto.getName(), dto.getAddress(), dto.getPhoneNO(), dto.getDBO(),dto.getRegisterDate() };
                dtm.addRow(rowDate);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Loading Data to Member Table");
        }
    }

    private void searchMember() {
        try {
            String memberId = tblMember.getValueAt(tblMember.getSelectedRow(), 0).toString();
            MemberDto dto = memberController.searchMember(memberId);

            if (dto != null) {
                txtId.setText(dto.getMemberId());
                txtName.setText(dto.getName());
                txtAddress.setText(dto.getAddress());
                txtPhoNo.setText(Integer.toString(dto.getPhoneNO()));
                txtDOB.setText(dto.getDBO());
                txtRegDate.setText(dto.getRegisterDate());

            } else {
                JOptionPane.showMessageDialog(this, "Member Not Found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at loading Member");
        }
    }

    private void deleteMember() {
        try {
            String memberId = txtId.getText();
            String resp = memberController.deleteMember(memberId);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Member Delete");
        }
    }

    private void updateMember() {
        try {
            MemberDto memberDto = new MemberDto(txtId.getText(),txtName.getText(),txtAddress.getText(),Integer.parseInt(txtPhoNo.getText()),txtDOB.getText(), txtRegDate.getText());
            String resp = memberController.updateMember(memberDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at update Member");
        }
    }  
    
}
