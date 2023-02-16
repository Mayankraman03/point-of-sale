
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;


public class admin_home extends javax.swing.JFrame {

    /**
     * Creates new form admin_home
     */
    public admin_home() {
        initComponents();
        
        getContentPane().setBackground(Color.BLACK);
//        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Admin Home");
        setSize(500,500);
        welcome.setText("Welcome"+" "+global.admin_name );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JLabel();
        changebt = new javax.swing.JButton();
        addbt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        welcome.setBackground(new java.awt.Color(0, 0, 0));
        welcome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("WELCOME");
        getContentPane().add(welcome);
        welcome.setBounds(100, 20, 300, 40);

        changebt.setText("Change Password");
        changebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changebtActionPerformed(evt);
            }
        });
        getContentPane().add(changebt);
        changebt.setBounds(170, 100, 170, 40);

        addbt.setText("Manage Category");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(170, 160, 170, 40);

        jButton1.setText("Manage Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 220, 170, 40);

        jButton2.setText("Generate New Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 280, 170, 40);

        jButton3.setText("Get Billing History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 340, 170, 40);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(170, 400, 170, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changebtActionPerformed
//        dispose();
        admin_change_password obj=new admin_change_password();
        obj.setVisible(true);
    }//GEN-LAST:event_changebtActionPerformed

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
        // TODO add your handling code here:
//        dispose();
        manage_category obj =new manage_category();
        obj.setVisible(true);
    }//GEN-LAST:event_addbtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        dispose();
        manage_product obj=new manage_product();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        dispose();
        generate_new_bill obj=new generate_new_bill();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        billing_history obj = new billing_history();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        global.admin_name="";
        dispose();
        admin_login obj = new admin_login();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JButton changebt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton logout;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}