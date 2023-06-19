package views;

import models.ModelPedido;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Comandas extends javax.swing.JFrame {

    ModelPedido modelPedidos = new ModelPedido();
    /**
     * Creates new form Comandas
     */
    public Comandas() {
        
        initComponents();
        tblPedidos.setModel(modelPedidos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnNovoPedido1 = new javax.swing.JButton();
        btnLimparPedidos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPedidos.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 15)); // NOI18N
        tblPedidos.setModel(modelPedidos);
        tblPedidos.setShowGrid(true);
        jScrollPane1.setViewportView(tblPedidos);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setHeaderValue("Mesa");
            tblPedidos.getColumnModel().getColumn(1).setHeaderValue("Atendente");
            tblPedidos.getColumnModel().getColumn(2).setHeaderValue("Entrada");
            tblPedidos.getColumnModel().getColumn(3).setHeaderValue("Principal");
            tblPedidos.getColumnModel().getColumn(4).setHeaderValue("Sobremesa");
            tblPedidos.getColumnModel().getColumn(5).setHeaderValue("Bebida");
            tblPedidos.getColumnModel().getColumn(6).setHeaderValue("Valor Total");
            tblPedidos.getColumnModel().getColumn(7).setHeaderValue("Situação");
        }

        btnNovoPedido1.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 18)); // NOI18N
        btnNovoPedido1.setForeground(new java.awt.Color(51, 51, 51));
        btnNovoPedido1.setText("Novo pedido");
        btnNovoPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedido1ActionPerformed(evt);
            }
        });

        btnLimparPedidos.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 18)); // NOI18N
        btnLimparPedidos.setForeground(new java.awt.Color(51, 51, 51));
        btnLimparPedidos.setText("Limpar");

        btnVoltar.setText("<");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimparPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovoPedido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnNovoPedido1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedido1ActionPerformed
        novoPedido p = new novoPedido();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_btnNovoPedido1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        painelInicial p = new painelInicial();
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
            java.util.logging.Logger.getLogger(Comandas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comandas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comandas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comandas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comandas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimparPedidos;
    private javax.swing.JButton btnNovoPedido1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables

    void setVisable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}