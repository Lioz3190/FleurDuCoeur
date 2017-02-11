/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleurducoeur;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 *
 * @author Lioz-MBPR
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
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

        container = new javax.swing.JPanel();
        enTetePanel = new javax.swing.JPanel();
        buttunAccueil = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        pageAccueil1 = new fleurducoeur.PageAccueil();
        pageFleurs1 = new fleurducoeur.PageFleurs();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FleurDuCoeur");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        container.setLayout(new java.awt.BorderLayout());

        enTetePanel.setMinimumSize(new java.awt.Dimension(100, 60));
        enTetePanel.setPreferredSize(new java.awt.Dimension(388, 60));

        buttunAccueil.setBackground(new java.awt.Color(255, 255, 255));
        buttunAccueil.setIcon(new javax.swing.ImageIcon("/Users/daviddang/Documents/ENAC/Automata/FleurDuCoeur/images/logo.png")); // NOI18N
        buttunAccueil.setText("FleurDuCoeur");
        buttunAccueil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttunAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttunAccueilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout enTetePanelLayout = new javax.swing.GroupLayout(enTetePanel);
        enTetePanel.setLayout(enTetePanelLayout);
        enTetePanelLayout.setHorizontalGroup(
            enTetePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enTetePanelLayout.createSequentialGroup()
                .addComponent(buttunAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1738, Short.MAX_VALUE))
        );
        enTetePanelLayout.setVerticalGroup(
            enTetePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enTetePanelLayout.createSequentialGroup()
                .addComponent(buttunAccueil)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        container.add(enTetePanel, java.awt.BorderLayout.PAGE_START);

        tabs.setForeground(new java.awt.Color(102, 102, 102));
        tabs.addTab("Accueil", pageAccueil1);

        javax.swing.GroupLayout pageFleurs1Layout = new javax.swing.GroupLayout(pageFleurs1);
        pageFleurs1.setLayout(pageFleurs1Layout);
        pageFleurs1Layout.setHorizontalGroup(
            pageFleurs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1908, Short.MAX_VALUE)
        );
        pageFleurs1Layout.setVerticalGroup(
            pageFleurs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );

        tabs.addTab("Fleurs", pageFleurs1);

        container.add(tabs, java.awt.BorderLayout.CENTER);
        tabs.getAccessibleContext().setAccessibleName("Accueil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttunAccueilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttunAccueilMousePressed
        /*BorderLayout layout = (BorderLayout)container.getLayout();
        Container container1 = this.getContentPane();
        container1.removeAll();
        container1.setLayout(layout);
        container1.add(enTetePanel);
        container1.add(new PageAccueil());
        container1.repaint();
        this.setVisible(true);*/
        tabs.setSelectedIndex(0);
        System.out.println("test");
    }//GEN-LAST:event_buttunAccueilMousePressed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAccueil;
    private javax.swing.JButton buttunAccueil;
    private javax.swing.JPanel container;
    private javax.swing.JPanel enTetePanel;
    private java.awt.Panel enTetePanel1;
    private fleurducoeur.PageAccueil pageAccueil1;
    private fleurducoeur.PageFleurs pageFleurs1;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
