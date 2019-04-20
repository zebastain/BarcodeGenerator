package Frame;

import Data.BarcodeGenerator;
import Data.Helper;

/**
 *
 * @author Alejandro
 */
public class Frame extends javax.swing.JFrame {

    BarcodeGenerator bg = new BarcodeGenerator();

    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("EAN13 AND ISBN13 Codes Generator");
        bg.playMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        code = new javax.swing.JTextField();
        searchCode = new javax.swing.JButton();
        rbean = new javax.swing.JRadioButton();
        rbisbn = new javax.swing.JRadioButton();
        generateCode2 = new javax.swing.JButton();
        seeCode = new javax.swing.JLabel();
        Indication = new javax.swing.JLabel();
        Indication3 = new javax.swing.JLabel();
        Indication2 = new javax.swing.JLabel();
        information = new javax.swing.JButton();
        foreGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        code.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        code.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeKeyTyped(evt);
            }
        });
        background.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 210, -1));

        searchCode.setBackground(new java.awt.Color(255, 255, 255));
        searchCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchCode.setBorder(null);
        searchCode.setBorderPainted(false);
        searchCode.setContentAreaFilled(false);
        searchCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCodeActionPerformed(evt);
            }
        });
        background.add(searchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        rbean.setBackground(new java.awt.Color(191, 218, 239));
        rbean.setSelected(true);
        rbean.setText("EAN13");
        rbean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbeanActionPerformed(evt);
            }
        });
        background.add(rbean, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        rbisbn.setBackground(new java.awt.Color(191, 218, 239));
        rbisbn.setText("ISBN");
        rbisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbisbnActionPerformed(evt);
            }
        });
        background.add(rbisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        generateCode2.setBackground(new java.awt.Color(255, 255, 255));
        generateCode2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Barcode.png"))); // NOI18N
        generateCode2.setBorder(null);
        generateCode2.setBorderPainted(false);
        generateCode2.setContentAreaFilled(false);
        generateCode2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateCode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCode2ActionPerformed(evt);
            }
        });
        background.add(generateCode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        seeCode.setBackground(new java.awt.Color(255, 255, 255));
        seeCode.setFont(new java.awt.Font("EAN-13", 1, 12)); // NOI18N
        seeCode.setForeground(new java.awt.Color(255, 255, 255));
        background.add(seeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 320, 160));

        Indication.setBackground(new java.awt.Color(0, 0, 0));
        Indication.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Indication.setText("Código:");
        background.add(Indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        Indication3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Indication3.setText("Buscar código");
        background.add(Indication3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 20));

        Indication2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Indication2.setText("Generar código");
        background.add(Indication2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 20));

        information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Status-dialog-information-icon.png"))); // NOI18N
        information.setBorder(null);
        information.setBorderPainted(false);
        information.setContentAreaFilled(false);
        information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationActionPerformed(evt);
            }
        });
        background.add(information, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        foreGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RBackGround.jpg"))); // NOI18N
        foreGround.setText("jLabel1");
        background.add(foreGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 390));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationActionPerformed

        Helper.instructions();

    }//GEN-LAST:event_informationActionPerformed

    private void codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyTyped

        if(Helper.onlyNumber(evt.getKeyChar())){
         evt.consume();
        }
        
    }//GEN-LAST:event_codeKeyTyped

    private void searchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCodeActionPerformed
        String search =  code.getText().replace(" ","");
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.barcodelookup.com/"+search));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_searchCodeActionPerformed

    private void generateCode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCode2ActionPerformed
        if (rbisbn.isSelected()) {
            if (Helper.checkCode2(code.getText())) {
            seeCode.setIcon(bg.visualizeISBN(code.getText()));
        }
        }else if(rbean.isSelected()){
            if (Helper.checkCode(code.getText())) {
            seeCode.setIcon(bg.visualizeEAN13(code.getText()));
        }
        }
        
    }//GEN-LAST:event_generateCode2ActionPerformed

    private void rbisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbisbnActionPerformed
        rbean.setSelected(false);
        
    }//GEN-LAST:event_rbisbnActionPerformed

    private void rbeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbeanActionPerformed
        rbisbn.setSelected(false);
    }//GEN-LAST:event_rbeanActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Indication;
    private javax.swing.JLabel Indication2;
    private javax.swing.JLabel Indication3;
    private javax.swing.JPanel background;
    private javax.swing.JTextField code;
    private javax.swing.JLabel foreGround;
    private javax.swing.JButton generateCode2;
    private javax.swing.JButton information;
    private javax.swing.JRadioButton rbean;
    private javax.swing.JRadioButton rbisbn;
    private javax.swing.JButton searchCode;
    private javax.swing.JLabel seeCode;
    // End of variables declaration//GEN-END:variables
}
