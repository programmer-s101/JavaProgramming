
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohd sufeyan
 */
public class SilverForm extends javax.swing.JFrame {
            double z=0;


    /**
     * Creates new form SilverForm
     */
    public SilverForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 216, 216));
        setBounds(new java.awt.Rectangle(100, 10, 20, 12));
        setLocation(new java.awt.Point(300, 100));
        setPreferredSize(new java.awt.Dimension(660, 500));
        setSize(new java.awt.Dimension(20, 40));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("              ZAKAAT CALCULATOR OF SILVER            ");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 1, true), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 153), new java.awt.Color(255, 102, 204))));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(2, 1, 640, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("    Please Select Your Prefrence");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51))));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(207, 100, 230, 40);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("G R A M");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(320, 150, 90, 30);

        jButton5.setText("C A L C U L A T E");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(187, 329, 113, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.darkGray)));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(321, 329, 210, 30);

        jButton3.setText("H O M E");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(271, 415, 80, 30);

        jPanel1.setBackground(new java.awt.Color(0, 178, 157));
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 200, 130, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 240, 130, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("T O L A");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(240, 150, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText(" Enter Silver Rate");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.darkGray)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 190, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText(" Enter Quantity Of Silver");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.pink));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 240, 170, 30);

        jTextField5.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(300, 190, 184, 30);

        jTextField6.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(300, 240, 184, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        jLabel1.setText("");
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        jLabel3.setText("");
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        double a=0;
        float b=0;

        String first= jTextField5.getText();
        String second=jTextField6.getText();
        
        if(first.trim().isEmpty() && second.trim().isEmpty())
        {
            jLabel1.setText("*Required Silver Rate");
            jLabel3.setText("*Required Quantity");
        }
        else if(first.trim().isEmpty())
        {
            jLabel1.setText("*Required Silver Rate");
        }
        else if(second.trim().isEmpty())
        {          
            jLabel3.setText("*Required Quantity");
        }
        else
        {
            a=Float.parseFloat(jTextField5.getText());
            b=Float.parseFloat(jTextField6.getText());

            if(jRadioButton1.isSelected())
            {
                if(b>=52.5)
                {
                    z=(a*b*2.5)/100;
                }
                else
                {
                    z=0;
                    JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 52.5 Tola Of Silver");
                }
            }
            else if(jRadioButton2.isSelected())
            {
                if(b>=595)
                {
                    z=(a*b*2.5)/100;
                }
                else
                {
                    z=0;
                    JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 595 Gram Of Silver");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Select The Preference First");
            }
            jLabel10.setText("Silver Zakaat is "+z);
        }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SilverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SilverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SilverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SilverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SilverForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    
}
