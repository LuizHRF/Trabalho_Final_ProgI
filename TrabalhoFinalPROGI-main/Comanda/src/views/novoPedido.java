package views;

import entities.Pedido;
import javax.swing.DefaultComboBoxModel;
import models.ModelPedido;
import models.ModelProduto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class novoPedido extends javax.swing.JFrame {
    
    public static DefaultComboBoxModel modelEntrada = new DefaultComboBoxModel();
    public static DefaultComboBoxModel modelPrincipal = new DefaultComboBoxModel();
    public static DefaultComboBoxModel modelSobremesa = new DefaultComboBoxModel();
    public static DefaultComboBoxModel modelBebida = new DefaultComboBoxModel();
    /**
     * Creates new form novoPedido
     */
    public novoPedido() {
        initComponents();
        cbEntrada.setModel(modelEntrada);
        cbPrincipal.setModel(modelPrincipal);
        cbSobremesa.setModel(modelSobremesa);
        cbBebida.setModel(modelBebida);
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
        spMesa = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        edtAtendente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbPrincipal = new javax.swing.JComboBox<>();
        cbEntrada = new javax.swing.JComboBox<>();
        cbBebida = new javax.swing.JComboBox<>();
        cbSobremesa = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Mesa");
        jLabel1.setToolTipText("");

        edtAtendente.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        edtAtendente.setForeground(new java.awt.Color(51, 51, 51));
        edtAtendente.setToolTipText("");
        edtAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAtendenteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Atendente");
        jLabel2.setToolTipText("");

        btnSalvar.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 51, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Sobremesa");
        jLabel4.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Bebida");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Principal");
        jLabel8.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Entrada");
        jLabel3.setToolTipText("");

        cbPrincipal.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        cbPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        cbPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPrincipal.setSelectedItem(modelPrincipal);
        cbPrincipal.setToolTipText("");
        cbPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrincipalActionPerformed(evt);
            }
        });

        cbEntrada.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        cbEntrada.setForeground(new java.awt.Color(51, 51, 51));
        cbEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEntrada.setSelectedItem(modelEntrada);
        cbEntrada.setToolTipText("");
        cbEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEntradaActionPerformed(evt);
            }
        });

        cbBebida.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        cbBebida.setForeground(new java.awt.Color(51, 51, 51));
        cbBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBebida.setSelectedItem(modelBebida);
        cbBebida.setToolTipText("");
        cbBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBebidaActionPerformed(evt);
            }
        });

        cbSobremesa.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 14)); // NOI18N
        cbSobremesa.setForeground(new java.awt.Color(51, 51, 51));
        cbSobremesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSobremesa.setSelectedItem(modelSobremesa);
        cbSobremesa.setToolTipText("");
        cbSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSobremesaActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Jamrul", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(51, 51, 51));
        btnVoltar.setText("<");
        btnVoltar.setPreferredSize(new java.awt.Dimension(35, 35));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEntrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtAtendente, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                            .addComponent(cbPrincipal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSobremesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAtendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtAtendenteActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        double valor = ModelProduto.getValor((String)cbEntrada.getSelectedItem()) + ModelProduto.getValor((String)cbPrincipal.getSelectedItem()) + ModelProduto.getValor((String)cbSobremesa.getSelectedItem()) + ModelProduto.getValor((String)cbBebida.getSelectedItem()) ;
        
        Pedido p = new Pedido(
                edtAtendente.getText(),
                Integer.parseInt(spMesa.getValue().toString()),
                (String)cbEntrada.getSelectedItem(),
                (String)cbPrincipal.getSelectedItem(),
                (String)cbSobremesa.getSelectedItem(),
                (String)cbBebida.getSelectedItem(),
                false,
                valor
        );
        ModelPedido.getPedidos().add(p);
        this.btnVoltarActionPerformed(evt);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrincipalActionPerformed

    }//GEN-LAST:event_cbPrincipalActionPerformed

    private void cbEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEntradaActionPerformed

    private void cbBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBebidaActionPerformed

    private void cbSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSobremesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSobremesaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Comandas p = new Comandas();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbBebida;
    private javax.swing.JComboBox<String> cbEntrada;
    private javax.swing.JComboBox<String> cbPrincipal;
    private javax.swing.JComboBox<String> cbSobremesa;
    private javax.swing.JTextField edtAtendente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spMesa;
    // End of variables declaration//GEN-END:variables
}
