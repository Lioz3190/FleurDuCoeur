/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleurducoeur;


import java.awt.GridLayout;

/**
 *
 * @author Lioz-MBPR
 */
public class PageFleurs extends javax.swing.JPanel {


   
    /**
     * Creates new form PageFleurs
     */
    public PageFleurs() {
        initComponents();
        fleurs.add(new ArticlePanel(new Fleur("Amour", 15.60, "Rose", "Rouge", "./images/fleur.jpg",4)));
        fleurs.add(new ArticlePanel(new Fleur("Amour", 15.60, "Rose", "Rouge", "./images/fleur.jpg",4)));
        fleurs.add(new ArticlePanel(new Fleur("Amour", 15.60, "Rose", "Rouge", "./images/fleur.jpg",4)));
        fleurs.add(new ArticlePanel(new Fleur("Amour", 15.60, "Rose", "Rouge", "./images/fleur.jpg",4)));
        fleurs.add(new ArticlePanel(new Fleur("Amour", 15.60, "Rose", "Rouge", "./images/fleur.jpg",4)));
        fleurs.add(new ArticlePanel(new Fleur("Amour", 15.60, "Rose", "Rouge", "./images/fleur.jpg",4)));
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorGroup = new javax.swing.ButtonGroup();
        priceGroup = new javax.swing.ButtonGroup();
        varietyGroup = new javax.swing.ButtonGroup();
        filter = new javax.swing.JPanel();
        whiteBtn = new javax.swing.JRadioButton();
        redBtn = new javax.swing.JRadioButton();
        pinkBtn = new javax.swing.JRadioButton();
        yellowBtn = new javax.swing.JRadioButton();
        purpleBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lowBtn = new javax.swing.JRadioButton();
        middleLowBtn = new javax.swing.JRadioButton();
        middleHighBtn = new javax.swing.JRadioButton();
        highBtn = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        roseBtn = new javax.swing.JRadioButton();
        lavandeBtn = new javax.swing.JRadioButton();
        amaryllisBtn = new javax.swing.JRadioButton();
        muguetBtn = new javax.swing.JRadioButton();
        magueriteBtn = new javax.swing.JRadioButton();
        fleurs = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        filter.setBackground(new java.awt.Color(254, 254, 254));
        filter.setPreferredSize(new java.awt.Dimension(175, 382));

        colorGroup.add(whiteBtn);
        whiteBtn.setText("Blanc");
        whiteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteBtnMouseClicked(evt);
            }
        });

        colorGroup.add(redBtn);
        redBtn.setText("Rouge");
        redBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redBtnMouseClicked(evt);
            }
        });

        colorGroup.add(pinkBtn);
        pinkBtn.setText("Rose");
        pinkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinkBtnMouseClicked(evt);
            }
        });

        colorGroup.add(yellowBtn);
        yellowBtn.setText("Jaune");
        yellowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yellowBtnMouseClicked(evt);
            }
        });

        colorGroup.add(purpleBtn);
        purpleBtn.setText("Violet");
        purpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purpleBtnMouseClicked(evt);
            }
        });

        jLabel1.setText("Couleur");

        jLabel2.setText("Prix");

        priceGroup.add(lowBtn);
        lowBtn.setText("<30€");
        lowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowBtnMouseClicked(evt);
            }
        });

        priceGroup.add(middleLowBtn);
        middleLowBtn.setText("30-40€");
        middleLowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                middleLowBtnMouseClicked(evt);
            }
        });

        priceGroup.add(middleHighBtn);
        middleHighBtn.setText("40-50€");
        middleHighBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                middleHighBtnMouseClicked(evt);
            }
        });

        priceGroup.add(highBtn);
        highBtn.setText(">50€");
        highBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                highBtnMouseClicked(evt);
            }
        });

        jLabel3.setText("Variété");

        varietyGroup.add(roseBtn);
        roseBtn.setText("Rose");
        roseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roseBtnMouseClicked(evt);
            }
        });

        varietyGroup.add(lavandeBtn);
        lavandeBtn.setText("Lavande");
        lavandeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lavandeBtnMouseClicked(evt);
            }
        });

        varietyGroup.add(amaryllisBtn);
        amaryllisBtn.setText("Amaryllis");
        amaryllisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amaryllisBtnMouseClicked(evt);
            }
        });

        varietyGroup.add(muguetBtn);
        muguetBtn.setText("Muguet");
        muguetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muguetBtnMouseClicked(evt);
            }
        });

        varietyGroup.add(magueriteBtn);
        magueriteBtn.setText("Maguerite");
        magueriteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                magueriteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout filterLayout = new javax.swing.GroupLayout(filter);
        filter.setLayout(filterLayout);
        filterLayout.setHorizontalGroup(
            filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filterLayout.createSequentialGroup()
                        .addComponent(lowBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleLowBtn))
                    .addComponent(jLabel1)
                    .addGroup(filterLayout.createSequentialGroup()
                        .addComponent(whiteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purpleBtn))
                    .addComponent(redBtn)
                    .addComponent(jLabel2)
                    .addGroup(filterLayout.createSequentialGroup()
                        .addComponent(pinkBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yellowBtn))
                    .addComponent(jLabel3)
                    .addGroup(filterLayout.createSequentialGroup()
                        .addComponent(roseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amaryllisBtn))
                    .addGroup(filterLayout.createSequentialGroup()
                        .addComponent(middleHighBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highBtn))
                    .addGroup(filterLayout.createSequentialGroup()
                        .addComponent(muguetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavandeBtn))
                    .addComponent(magueriteBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filterLayout.setVerticalGroup(
            filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whiteBtn)
                    .addComponent(purpleBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinkBtn)
                    .addComponent(yellowBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowBtn)
                    .addComponent(middleLowBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleHighBtn)
                    .addComponent(highBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roseBtn)
                    .addComponent(amaryllisBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muguetBtn)
                    .addComponent(lavandeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(magueriteBtn)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(filter, java.awt.BorderLayout.LINE_START);

        fleurs.setLayout(new java.awt.GridLayout(3, 3));
        add(fleurs, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void whiteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteBtnMouseClicked

    private void purpleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purpleBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_purpleBtnMouseClicked

    private void pinkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinkBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pinkBtnMouseClicked

    private void yellowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_yellowBtnMouseClicked

    private void redBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_redBtnMouseClicked

    private void lowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lowBtnMouseClicked

    private void middleLowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_middleLowBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_middleLowBtnMouseClicked

    private void middleHighBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_middleHighBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_middleHighBtnMouseClicked

    private void highBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_highBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_highBtnMouseClicked

    private void roseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roseBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roseBtnMouseClicked

    private void amaryllisBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amaryllisBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_amaryllisBtnMouseClicked

    private void muguetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muguetBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_muguetBtnMouseClicked

    private void lavandeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lavandeBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lavandeBtnMouseClicked

    private void magueriteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magueriteBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_magueriteBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amaryllisBtn;
    private javax.swing.ButtonGroup colorGroup;
    private javax.swing.JPanel filter;
    private javax.swing.JPanel fleurs;
    private javax.swing.JRadioButton highBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton lavandeBtn;
    private javax.swing.JRadioButton lowBtn;
    private javax.swing.JRadioButton magueriteBtn;
    private javax.swing.JRadioButton middleHighBtn;
    private javax.swing.JRadioButton middleLowBtn;
    private javax.swing.JRadioButton muguetBtn;
    private javax.swing.JRadioButton pinkBtn;
    private javax.swing.ButtonGroup priceGroup;
    private javax.swing.JRadioButton purpleBtn;
    private javax.swing.JRadioButton redBtn;
    private javax.swing.JRadioButton roseBtn;
    private javax.swing.ButtonGroup varietyGroup;
    private javax.swing.JRadioButton whiteBtn;
    private javax.swing.JRadioButton yellowBtn;
    // End of variables declaration//GEN-END:variables
}
