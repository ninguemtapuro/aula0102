/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import javax.swing.JOptionPane;

/**
 *
 * @author DEV_2ano_2024
 */
public class Conversor extends javax.swing.JFrame {

    /**
     * Creates new form Conversor
     */
    public Conversor() {
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
        pnlConversor = new javax.swing.JPanel();
        lblTemperatura = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        bntConverter = new javax.swing.JButton();
        bntLimpar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        pnlOpções = new javax.swing.JPanel();
        rbtCelcos = new javax.swing.JRadioButton();
        rbtFar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTemperatura.setText("Temperatura °C:");

        bntConverter.setText("Conversor");
        bntConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConverterActionPerformed(evt);
            }
        });

        bntLimpar.setText("Limpar");
        bntLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparActionPerformed(evt);
            }
        });

        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setText("RESULTADO");

        javax.swing.GroupLayout pnlConversorLayout = new javax.swing.GroupLayout(pnlConversor);
        pnlConversor.setLayout(pnlConversorLayout);
        pnlConversorLayout.setHorizontalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntConverter)
                    .addComponent(lblTemperatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConversorLayout.createSequentialGroup()
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConversorLayout.createSequentialGroup()
                        .addComponent(bntLimpar)
                        .addGap(47, 47, 47))))
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lblResultado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlConversorLayout.setVerticalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperatura)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addGap(50, 50, 50)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntConverter)
                    .addComponent(bntLimpar))
                .addGap(62, 62, 62))
        );

        pnlOpções.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        buttonGroup1.add(rbtCelcos);
        rbtCelcos.setText("°C --> °F");
        rbtCelcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCelcosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtFar);
        rbtFar.setSelected(true);
        rbtFar.setText("°F --> °C");
        rbtFar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpçõesLayout = new javax.swing.GroupLayout(pnlOpções);
        pnlOpções.setLayout(pnlOpçõesLayout);
        pnlOpçõesLayout.setHorizontalGroup(
            pnlOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtFar)
                    .addComponent(rbtCelcos))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlOpçõesLayout.setVerticalGroup(
            pnlOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpçõesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rbtCelcos)
                .addGap(41, 41, 41)
                .addComponent(rbtFar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlOpções, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnlConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlOpções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtCelcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCelcosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCelcosActionPerformed

    private void rbtFarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFarActionPerformed

    private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed
        // TODO add your handling code here:
         txtNum1.setText(null);
        lblResultado.setText(null);
        txtNum1.requestFocus();
    }//GEN-LAST:event_bntLimparActionPerformed

    private void bntConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConverterActionPerformed
        // TODO add your handling code here:
         //Declaração de variaveis
        double c, f;
        //Entradas
        
        try{
            if(rbtCelcos.isSelected()){
                //Entrada
                c = Integer.parseInt(txtNum1.getText());
            
             //Processamento
            
               
                f = c * 9 / 5 + 32;
            
            
       
            //Saida
            lblResultado.setText(String.valueOf(f));
            
             }else{
                 f = Integer.parseInt(txtNum1.getText());
                c = ( f - 32) * 5 / 9;
                lblResultado.setText(String.valueOf(c));
            }
        
           
         }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null , "Erro:" + e.getMessage(), "Presta atenção, mano!!" , JOptionPane.ERROR_MESSAGE);                    
        
         }
        
    }//GEN-LAST:event_bntConverterActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntConverter;
    private javax.swing.JButton bntLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JPanel pnlConversor;
    private javax.swing.JPanel pnlOpções;
    private javax.swing.JRadioButton rbtCelcos;
    private javax.swing.JRadioButton rbtFar;
    private javax.swing.JTextField txtNum1;
    // End of variables declaration//GEN-END:variables
}
