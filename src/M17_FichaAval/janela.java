package M17_FichaAval;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe janela, para criar a janela de interface.
 * @version 0.1.1, 9.fev.2017
 * @author  Aléxio e David
 * GITHUB: https://github.com/Alexio-CCcomputadores/M17bFichaAval.git
 */
public class janela extends javax.swing.JFrame {

    /**
     * Cria a janela
     * 
     */
    public janela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCalc = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        campoX1 = new javax.swing.JTextField();
        labelX1 = new javax.swing.JLabel();
        campoY1 = new javax.swing.JTextField();
        labelY1 = new javax.swing.JLabel();
        campoX2 = new javax.swing.JTextField();
        labelX2 = new javax.swing.JLabel();
        campoY2 = new javax.swing.JTextField();
        labelY2 = new javax.swing.JLabel();
        campoOUTPUT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoCalc.setText("Calcular");
        botaoCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        campoX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoX1ActionPerformed(evt);
            }
        });

        labelX1.setText("X1:");

        campoY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoY1ActionPerformed(evt);
            }
        });

        labelY1.setText("Y1:");

        campoX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoX2ActionPerformed(evt);
            }
        });

        labelX2.setText("X2:");

        campoY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoY2ActionPerformed(evt);
            }
        });

        labelY2.setText("Y2:");

        campoOUTPUT.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelX2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoX2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelX1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoX1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelY1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoY1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelY2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoY2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(campoOUTPUT)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelX1)
                    .addComponent(campoY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelY1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelX2)
                    .addComponent(campoY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelY2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCalc)
                    .addComponent(botaoLimpar))
                .addGap(18, 18, 18)
                .addComponent(campoOUTPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoX1ActionPerformed
    }//GEN-LAST:event_campoX1ActionPerformed

    private void campoY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoY1ActionPerformed
    }//GEN-LAST:event_campoY1ActionPerformed

    private void campoX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoX2ActionPerformed
    }//GEN-LAST:event_campoX2ActionPerformed

    private void campoY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoY2ActionPerformed
    }//GEN-LAST:event_campoY2ActionPerformed
    /**
     * 
     * @param evt (Botao "Limpar") - Ao clicar no botão todos os campos de input e output
     * são limpos.
     */
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoX1.setText("");
        campoX2.setText("");
        campoY1.setText("");
        campoY2.setText("");
        campoOUTPUT.setText("");
        
    }//GEN-LAST:event_botaoLimparActionPerformed
    /**
     * 
     * @param evt  (Botao "Calcular") - Ao clicar no botão efetua o calculo entre
     * as duas cordenadas (X1eY1 - X2eY2)
     * 
     */
    private void botaoCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcActionPerformed
        /** variável "ficheiro" do tipo "FileWriter" para criar o ficheiro de output*/
        FileWriter ficheiro;
        /** variável "texto" do tipo "String" para mostrar o resultado*/        
        String texto;
        try{
        /** instanciar o ponto p1 */    
        Ponto2D p1 = new Ponto2D(Integer.parseInt(campoX1.getText()),Integer.parseInt(campoY1.getText())); 
        /** instanciar o ponto p2 */ 
        Ponto2D p2 = new Ponto2D(Integer.parseInt(campoX2.getText()),Integer.parseInt(campoY2.getText()));               
        
        
        ficheiro = new FileWriter("OUTPUT.txt", true);
        texto = p2.distancia(p1) + "";
        campoOUTPUT.setText(texto);
        ficheiro.write(texto +"\n");
        ficheiro.close();
        }catch(NumberFormatException e){
            campoOUTPUT.setText("ERRO - Campo(s) Inválido(s)");
        }
            catch(IOException e){
            campoOUTPUT.setText("ERRO na criação do ficheiro");
        }
        
    }//GEN-LAST:event_botaoCalcActionPerformed

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
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() { 
            public void run() {
                new janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalc;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoOUTPUT;
    private javax.swing.JTextField campoX1;
    private javax.swing.JTextField campoX2;
    private javax.swing.JTextField campoY1;
    private javax.swing.JTextField campoY2;
    private javax.swing.JLabel labelX1;
    private javax.swing.JLabel labelX2;
    private javax.swing.JLabel labelY1;
    private javax.swing.JLabel labelY2;
    // End of variables declaration//GEN-END:variables
}
