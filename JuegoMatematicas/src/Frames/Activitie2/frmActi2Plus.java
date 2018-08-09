/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Activitie2;

import Activitie2.GamePlus;
import Auxiliar.Images;
import Auxiliar.Logica;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author tady
 */
public class frmActi2Plus extends javax.swing.JFrame {

    private GamePlus game=new GamePlus();
    private int[] numbers;
    private int numOperation=0;
    ArrayList<JButton> balls=new ArrayList<JButton>();
    private boolean endGame;
    
    private Images images=new Images();
    /**
     * Creates new form frmActi2
     */
    public frmActi2Plus() {
        initComponents();
        
        numbers = game.getnumRnd();
        
        initializeComponents();
        
        //CENTRAR EL FORMULARIO
        this.setLocationRelativeTo(null);
        
        initilizeBtns();
        
        game.nextOperation(lblOperations);
    }
    
    public void initializeComponents(){
        Images img=new Images();
        //img.setLbl(lblFondoMemory,"fondomemory2");
        
        showBtns(btnReturn,"return");
        /*
        showBtns(btnActivities,"activities");
        showBtns(btnGames,"games");
        showBtns(btnMovies,"movies");*/
        
    }
    
    public void showBtns(JButton btn,String name){
        Images img=new Images();
        img.setBtn(btn, name); //para transparencia btns=Opaque=ContentAreaFilled=(false)
    }
    
    private void initilizeBtns(){
        balls.add(btn1);
        balls.add(btn2);
        balls.add(btn3);
        balls.add(btn5);
        balls.add(btn6);
        balls.add(btn7);
        balls.add(btn8);
        balls.add(btn9);
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
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        btn9 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        lblOperations = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 40, 40));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 350, 40, 40));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 40, 40));
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 310, 40, 40));
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 40, 40));
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 40, 40));
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 40, 40));
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 40, 40));
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 40, 40));

        btn9.setBorder(null);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 60, 50));

        btn1.setBorder(null);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 50));

        btn2.setBorder(null);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 60, 50));

        btn3.setBorder(null);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 50, 50));

        btn4.setBorder(null);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 50, 50));

        btn6.setBorder(null);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 60, 50));

        btn5.setBorder(null);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 50, 50));

        btn8.setBorder(null);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 50, 50));

        btn7.setBorder(null);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 50));
        jPanel1.add(lblOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 200, 100));

        btnReturn.setBorder(null);
        btnReturn.setContentAreaFilled(false);
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acti2.png"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        game.compare("4",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        game.compare("7",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        game.compare("10",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        game.compare("5",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        game.compare("2",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        game.compare("3",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        game.compare("6",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        game.compare("9",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        game.compare("8",lblOperations);
        endGame=game.endGame(balls);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        frmIntroAct2 objfrm=new frmIntroAct2();
        this.dispose();
        objfrm.show();
        objfrm.nextLevel(endGame);
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(frmActi2Plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmActi2Plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmActi2Plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmActi2Plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmActi2Plus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblOperations;
    // End of variables declaration//GEN-END:variables
}
