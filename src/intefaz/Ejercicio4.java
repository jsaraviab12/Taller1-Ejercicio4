/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Ejercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio4
     */
    public Ejercicio4() {
        initComponents();
        txtCuotaf.setEditable(false);
        txtCuotai.setEditable(false);
        txtValor.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        txtCuotai = new javax.swing.JTextField();
        txtCuotaf = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ST Gothic Hv", 2, 24)); // NOI18N
        jLabel1.setText("Inmobilaria Saravia's Houses");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 360, 30));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Metros Cuadrados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel3.setText("Cuota inicial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel4.setText("Cuotas mensuales");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtMetros.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetrosActionPerformed(evt);
            }
        });
        txtMetros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMetrosKeyTyped(evt);
            }
        });
        jPanel1.add(txtMetros, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 110, -1));

        txtCuotai.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        txtCuotai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuotaiKeyTyped(evt);
            }
        });
        jPanel1.add(txtCuotai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, -1));

        txtCuotaf.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        txtCuotaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuotafActionPerformed(evt);
            }
        });
        txtCuotaf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuotafKeyTyped(evt);
            }
        });
        jPanel1.add(txtCuotaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, -1));

        cmdCalcular.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 102, 0));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, 30));

        cmdBorrar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(102, 0, 0));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel5.setText("Valor total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, -1));

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

    private void txtMetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetrosActionPerformed

    private void txtCuotafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuotafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuotafActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String res1, res2,res3;
        double n1,precio=0,por,cui=0,cuo=0;
        if (txtMetros.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(this,"Digite la cantidad de metros cuadrados","Error", JOptionPane.ERROR_MESSAGE);
            txtMetros.requestFocusInWindow(); 
        }else {
            try {
           n1 = Double.parseDouble(txtMetros.getText()); 
           precio=(n1*80000);
           por=(precio*35)/100;
           cui=precio-por;
           cuo=(precio-cui)/12;
         }catch (Exception e){
               JOptionPane.showMessageDialog(this,"Ingrese numero validos","Erro", JOptionPane.ERROR_MESSAGE);
            txtMetros.requestFocusInWindow();
         }
         res1 = String.valueOf(precio);
         res2 = String.valueOf(cui);
         res3 = String.valueOf(Math.round(cuo));
         txtValor.setText(res1);
         txtCuotai.setText(res2);
         txtCuotaf.setText(res3);
         
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtCuotaf.setText("");
        txtCuotai.setText("");
        txtMetros.setText("");
        txtValor.setText("");
        txtMetros.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtMetrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMetrosKeyTyped
       char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtMetrosKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtCuotaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotaiKeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtCuotaiKeyTyped

    private void txtCuotafKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotafKeyTyped
         char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtCuotafKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCuotaf;
    private javax.swing.JTextField txtCuotai;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
