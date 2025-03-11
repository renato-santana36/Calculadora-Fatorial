
package telas;

public class TelaFatorialApp extends javax.swing.JFrame {

    public TelaFatorialApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        lblCalculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel1.setText("! =");

        lblResultado.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 153, 255));
        lblResultado.setText("000");
        lblResultado.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cálculo de Fatorial");

        jSpinner1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        lblCalculo.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblCalculo.setForeground(new java.awt.Color(255, 0, 0));
        lblCalculo.setText(" ");
        lblCalculo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int spinValor = (int)jSpinner1.getValue();
        int fatorial = 1;
        String coletarValor1 = "";
        String coletarValor2 = "";
        
        while(spinValor != 0 || spinValor > 0) {  
            fatorial = fatorial * spinValor;
            spinValor--;
            
            coletarValor1 = Integer.toString(spinValor+1) + " x ";
            coletarValor2 = coletarValor2 + coletarValor1;
            
            System.out.print(coletarValor1);
            lblCalculo.setText(coletarValor2);

        }
        
        System.out.println("\n\nfatorial: " + fatorial);
        lblResultado.setText(Integer.toString(fatorial));
    }//GEN-LAST:event_jSpinner1StateChanged

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
            java.util.logging.Logger.getLogger(TelaFatorialApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFatorialApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFatorialApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFatorialApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFatorialApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblCalculo;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
