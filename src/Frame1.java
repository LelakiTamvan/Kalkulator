/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mbrew
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        eNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eKelas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eAlamat = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Neou", 0, 18)); // NOI18N
        jLabel1.setText("Formulir");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 0, 130, 40);

        eNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNamaActionPerformed(evt);
            }
        });
        getContentPane().add(eNama);
        eNama.setBounds(120, 50, 170, 30);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 60, 50, 14);

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 110, 50, 14);
        getContentPane().add(eKelas);
        eKelas.setBounds(120, 100, 170, 30);

        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 160, 60, 14);
        getContentPane().add(eAlamat);
        eAlamat.setBounds(120, 150, 170, 30);

        btnOk.setText("Oke");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(190, 200, 51, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 240, 340, 140);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 420);

        setBounds(0, 0, 499, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
      String nama = eNama.getText();
      String kelas = eKelas.getText();
      String alamat = eAlamat.getText();
      
      TA.append("Nama Siswa: "+nama+"\n"+"Kelas: "+kelas+"\n"+"Alamat: "+alamat);
     
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void eNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNamaActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField eAlamat;
    private javax.swing.JTextField eKelas;
    private javax.swing.JTextField eNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
