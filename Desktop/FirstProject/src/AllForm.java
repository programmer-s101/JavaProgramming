
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
public class AllForm extends javax.swing.JFrame {
    double zakaatCalculated=0;
    double goldZakaat=0;
    double silverZakaat=0;
    double cashZakaat=0;
    /**
     * Creates new form AllForm
     */
    public AllForm() {
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
        tola = new javax.swing.JRadioButton();
        gram = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        goldRate = new javax.swing.JTextField();
        quantityGold = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        silverRate = new javax.swing.JTextField();
        quantitySilver = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cashField = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        totalZakaat = new javax.swing.JLabel();
        errorRateGold = new javax.swing.JLabel();
        errorQuantityGold = new javax.swing.JLabel();
        errorRateSilver = new javax.swing.JLabel();
        errorQuantitySilver = new javax.swing.JLabel();
        errorCash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EASY ZAKAAT CALCULATOR");
        setBackground(new java.awt.Color(102, 204, 255));
        setBounds(new java.awt.Rectangle(100, 10, 20, 12));
        setLocation(new java.awt.Point(300, 100));
        setPreferredSize(new java.awt.Dimension(660, 500));
        setSize(new java.awt.Dimension(20, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("                      ZAKAAT CALCULATOR            ");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 1, true), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 153), new java.awt.Color(255, 102, 204))));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("    Please Select Your Prefrence To Calculate Gold & Silver in Tola or Gram");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51))));

        buttonGroup1.add(tola);
        tola.setText("T O L A");

        buttonGroup1.add(gram);
        gram.setText("G R A M");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText(" Enter Gold Rate");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.darkGray)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText(" Enter Quantity Of Gold");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.pink));

        goldRate.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        goldRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                goldRateKeyReleased(evt);
            }
        });

        quantityGold.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        quantityGold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityGoldKeyReleased(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText(" Enter Silver Rate");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.darkGray)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText(" Enter Quantity Of Silver");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.pink));

        silverRate.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        silverRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                silverRateKeyReleased(evt);
            }
        });

        quantitySilver.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        quantitySilver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantitySilverKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText(" Enter Cash Amount");
        jLabel12.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.darkGray)));

        cashField.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        cashField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashFieldKeyReleased(evt);
            }
        });

        calculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calculate.setText("C A L C U L A T E");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        totalZakaat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        totalZakaat.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.darkGray)));

        errorRateGold.setForeground(new java.awt.Color(255, 0, 51));

        errorQuantityGold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorQuantityGold.setForeground(new java.awt.Color(255, 0, 51));

        errorRateSilver.setForeground(new java.awt.Color(255, 0, 51));

        errorQuantitySilver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorQuantitySilver.setForeground(new java.awt.Color(255, 0, 51));

        errorCash.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addGap(12, 12, 12)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(silverRate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorRateSilver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantitySilver, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorQuantitySilver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cashField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalZakaat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityGold, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(goldRate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorQuantityGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorRateGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tola, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(gram, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tola)
                    .addComponent(gram))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorRateGold, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(goldRate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityGold, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(errorQuantityGold, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(silverRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorRateSilver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitySilver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(errorQuantitySilver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorCash, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cashField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalZakaat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goldRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goldRateKeyReleased
        // TODO add your handling code here:
        errorRateGold.setText("");

    }//GEN-LAST:event_goldRateKeyReleased

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void silverRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_silverRateKeyReleased
        // TODO add your handling code here:
        errorRateSilver.setText("");
    }//GEN-LAST:event_silverRateKeyReleased

    private void quantitySilverKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantitySilverKeyReleased
        // TODO add your handling code here:
        errorQuantitySilver.setText("");
    }//GEN-LAST:event_quantitySilverKeyReleased

    private void cashFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashFieldKeyReleased
        // TODO add your handling code here:
        errorCash.setText("");
    }//GEN-LAST:event_cashFieldKeyReleased

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        gold();
        silver();
        cash();
        zakaatCalculated=cash()+gold()+silver();
        totalZakaat.setText("Total Zakaat is "+zakaatCalculated);
        
        
    }//GEN-LAST:event_calculateActionPerformed

    private void quantityGoldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityGoldKeyReleased
        // TODO add your handling code here:
        errorQuantityGold.setText("");
    }//GEN-LAST:event_quantityGoldKeyReleased

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
            java.util.logging.Logger.getLogger(AllForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField cashField;
    private javax.swing.JLabel errorCash;
    private javax.swing.JLabel errorQuantityGold;
    private javax.swing.JLabel errorQuantitySilver;
    private javax.swing.JLabel errorRateGold;
    private javax.swing.JLabel errorRateSilver;
    private javax.swing.JTextField goldRate;
    private javax.swing.JRadioButton gram;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField quantityGold;
    private javax.swing.JTextField quantitySilver;
    private javax.swing.JTextField silverRate;
    private javax.swing.JRadioButton tola;
    private javax.swing.JLabel totalZakaat;
    // End of variables declaration//GEN-END:variables

    private double gold()
    {
        double a=0;
        float b=0;
       
        String first= goldRate.getText();
        String second=quantityGold.getText();
        
        if(first.trim().isEmpty() && second.trim().isEmpty()) 
        {
            errorRateGold.setText("*Required Gold Rate");
            errorQuantityGold.setText("*Required Quantity");
        }
        else if(first.trim().isEmpty())
        {
            errorRateGold.setText("*Required Gold Rate");
        }
        else if(second.trim().isEmpty())
        {
            errorQuantityGold.setText("*Required Quantity");
        }
        else
        {
            a=Double.parseDouble(goldRate.getText());
            b=Float.parseFloat(quantityGold.getText());
               
            if(tola.isSelected())
            {
                if(b>7.5)
                {
                    goldZakaat=(a*b*2.5)/100;
                }
                else
                {
                    goldZakaat=0;
                    JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 7.5 Tola Of Gold");
                }
            }
            else if(gram.isSelected())
            {
                if(b>85)
                {
                    goldZakaat=(a*b*2.5)/100;
                }
                else
                {
                   goldZakaat=0;
                   JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 85 Gram Of Gold");
                }
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Select The Preference First");
             }       
        }
        return goldZakaat;
       }

    private double silver()
    {
        double a=0;
        float b=0;
        
        String first= silverRate.getText();
        String second=quantitySilver.getText();
        
        if(first.trim().isEmpty() && second.trim().isEmpty()) 
        {
            errorRateSilver.setText("*Required Silver Rate");
            errorQuantitySilver.setText("*Required Quantity");
        }
        else if(first.trim().isEmpty())
        {
            errorRateSilver.setText("*Required Silver Rate");
        }
        else if(second.trim().isEmpty())
        {
            errorQuantitySilver.setText("*Required Quantity");
        }
        else
        {
            a=Double.parseDouble(silverRate.getText());
            b=Float.parseFloat(quantitySilver.getText());

            if(tola.isSelected())
            {
                if(b>=52.5)
                {
                    silverZakaat=(a*b*2.5)/100;
                }
                else
                {
                    silverZakaat=0;
                    JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 52.5 Tola Of Silver");
                }
            }
            else if(gram.isSelected())
            {
                if(b>=595)
                {
                    silverZakaat=(a*b*2.5)/100;
                }
                else
                {
                    silverZakaat=0;
                    JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 595 Gram Of Silver");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Select The Preference First");
            }
        }
        return silverZakaat;
    }

     
         

    private double cash()
    {
        String field=cashField.getText();
        
        if(field.trim().isEmpty())
        {
            errorCash.setText("*Required Amount");
        }           
        else
        {
            double a=Double.parseDouble(cashField.getText());
                    
            if(a<100000)
            {
                 JOptionPane.showMessageDialog(null,"Not Eligible For Zakaat Below 100,000 Rs.");
            }        
            else
            {
                cashZakaat=(a*2.5)/100;
            }
        }
        return cashZakaat;
    }
}
