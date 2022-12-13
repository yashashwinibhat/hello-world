package ui.HealthClubManagerRole;

import model.SystemAdmin;

public class HealthClubManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public HealthClubManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
       setBackground(new java.awt.Color(255, 204, 204));
        viewTask.setBackground(new java.awt.Color(244, 120, 140));
        viewTask.setOpaque(true);
        orgBtn.setBackground(new java.awt.Color(244, 120, 140));
        orgBtn.setOpaque(true);
        orgAdminBtn.setBackground(new java.awt.Color(244, 120, 140));
        orgAdminBtn.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        viewTask = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        orgAdminBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("HEALTH CLUB MANAGER PANEL ");

        viewTask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewTask.setText("VIEW TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        orgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANIZATION");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        orgAdminBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANISATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orgAdminBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(orgAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
                 callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
         callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
