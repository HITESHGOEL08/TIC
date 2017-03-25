
import java.awt.Color;

/**
 *
 * @author Hitesh Goel
 */
public class WE extends javax.swing.JFrame {
    
    private static final long serialVersionUID = 1L;
    
    public WE() {
        initComponents();
    }
    
    private String whoseturn = "X";
    
    private void determineturn() {
        
        if (whoseturn.equalsIgnoreCase("X")) {
            whoseturn = "O";
        } else {
            whoseturn = "X";
        }
    }
    
    private void Xwins() {
        System.out.println("PLAYER 1 WON");
        this.setVisible(false);
        
        new Xwins().setVisible(true);
    }
    
    private void Owins() {
        System.out.println("PLAYER 2 WON");
        dispose();
        this.setVisible(false);
        new Owins().setVisible(true);
        
    }
    
    private void draw() {
        String one = first.getText();
        String two = second.getText();
        String three = third.getText();
        String four = fourth.getText();
        String five = fivth.getText();
        String six = sixth.getText();
        String seven = seventh.getText();
        String eight = eightth.getText();
        String nine = nineth.getText();
        
        if (!"".equals(one) && !"".equals(two)
                && !"".equals(three) && !"".equals(four)
                && !"".equals(five) && !"".equals(six)
                && !"".equals(seven) && !"".equals(eight)
                && !"".equals(nine)) {
            this.setVisible(false);
            new winner().setVisible(true);
            
        }
        
    }
    
    private void winner() {
        String one = first.getText();
        String two = second.getText();
        String three = third.getText();
        String four = fourth.getText();
        String five = fivth.getText();
        String six = sixth.getText();
        String seven = seventh.getText();
        String eight = eightth.getText();
        String nine = nineth.getText();
        //winnig code

        // if X wins
        if ("X".equals(three) && "X".equals(two) && "X".equals(one)) {
            Xwins();
            
        }
        if ("X".equals(four) && "X".equals(five) && "X".equals(six)) {
            
            Xwins();
            
        }
        if ("X".equals(seven) && "X".equals(eight) && "X".equals(nine)) {
            
            Xwins();
            
        }
        if ("X".equals(one) && "X".equals(four) && "X".equals(seven)) {
            
            Xwins();
            
        }
        if ("X".equals(two) && "X".equals(five) && "X".equals(eight)) {
            
            Xwins();
            
        }
        if ("X".equals(three) && "X".equals(six) && "X".equals(nine)) {
            
            Xwins();
        }
        if ("X".equals(one) && "X".equals(five) && "X".equals(nine)) {
            
            Xwins();
        }
        if ("X".equals(seven) && "X".equals(five) && "X".equals(three)) {
            
            Xwins();
        }

        //if O wins
        if ("O".equals(one) && "O".equals(two) && "O".equals(three)) {
            
            Owins();
        }
        if ("O".equals(four) && "O".equals(five) && "O".equals(six)) {
            
            Owins();
        }
        if ("O".equals(seven) && "O".equals(eight) && "O".equals(nine)) {
            
            Owins();
        }
        if ("O".equals(one) && "O".equals(four) && "O".equals(seven)) {
            
            Owins();
        }
        if ("O".equals(two) && "O".equals(five) && "O".equals(eight)) {
            
            Owins();
        }
        if ("O".equals(three) && "O".equals(six) && "O".equals(nine)) {
            
            Owins();
        }
        if ("O".equals(one) && "O".equals(five) && "O".equals(nine)) {
            
            Owins();
        }
        if ("O".equals(three) && "O".equals(seven) && "O".equals(five)) {
            
            Owins();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        second = new javax.swing.JToggleButton();
        eightth = new javax.swing.JToggleButton();
        third = new javax.swing.JToggleButton();
        sixth = new javax.swing.JToggleButton();
        nineth = new javax.swing.JToggleButton();
        fivth = new javax.swing.JToggleButton();
        first = new javax.swing.JToggleButton();
        fourth = new javax.swing.JToggleButton();
        seventh = new javax.swing.JToggleButton();
        HEADING = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setBackground(new java.awt.Color(58, 159, 184));

        jLabel2.setText("   WINNER   :-->");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setBackground(new java.awt.Color(7, 153, 157));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(78, 87, 118));

        second.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(second);
        second.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        second.setForeground(new java.awt.Color(209, 71, 147));
        second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondActionPerformed(evt);
            }
        });

        eightth.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(eightth);
        eightth.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        eightth.setForeground(new java.awt.Color(209, 71, 147));
        eightth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightthActionPerformed(evt);
            }
        });

        third.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(third);
        third.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        third.setForeground(new java.awt.Color(209, 71, 147));
        third.setToolTipText("");
        third.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdActionPerformed(evt);
            }
        });

        sixth.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(sixth);
        sixth.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        sixth.setForeground(new java.awt.Color(209, 71, 147));
        sixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixthActionPerformed(evt);
            }
        });

        nineth.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(nineth);
        nineth.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nineth.setForeground(new java.awt.Color(209, 71, 147));
        nineth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninethActionPerformed(evt);
            }
        });

        fivth.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(fivth);
        fivth.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        fivth.setForeground(new java.awt.Color(209, 71, 147));
        fivth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivthActionPerformed(evt);
            }
        });

        first.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(first);
        first.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        first.setForeground(new java.awt.Color(209, 71, 147));
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        fourth.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(fourth);
        fourth.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        fourth.setForeground(new java.awt.Color(209, 71, 147));
        fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthActionPerformed(evt);
            }
        });

        seventh.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(seventh);
        seventh.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        seventh.setForeground(new java.awt.Color(209, 71, 147));
        seventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seventhActionPerformed(evt);
            }
        });

        HEADING.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        HEADING.setText("              TIC TAC TOE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fivth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sixth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seventh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(HEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(HEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fivth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seventh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        first.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            first.setBackground(Color.BLACK);
            first.setForeground(Color.RED);
        } else {
            first.setBackground(Color.WHITE);
            first.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();

    }//GEN-LAST:event_firstActionPerformed

    private void secondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondActionPerformed
        second.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            second.setBackground(Color.BLACK);
            second.setForeground(Color.RED);
        } else {
            second.setBackground(Color.WHITE);
            second.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_secondActionPerformed

    private void thirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdActionPerformed
        third.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            third.setBackground(Color.BLACK);
            third.setForeground(Color.RED);
        } else {
            third.setBackground(Color.WHITE);
            third.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_thirdActionPerformed

    private void fourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthActionPerformed
        fourth.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            fourth.setBackground(Color.BLACK);
            fourth.setForeground(Color.RED);
        } else {
            fourth.setBackground(Color.WHITE);
            fourth.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_fourthActionPerformed

    private void fivthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivthActionPerformed
        fivth.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            fivth.setBackground(Color.BLACK);
            fivth.setForeground(Color.RED);
        } else {
            fivth.setBackground(Color.WHITE);
            fivth.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_fivthActionPerformed

    private void sixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixthActionPerformed
        sixth.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            sixth.setBackground(Color.BLACK);
            sixth.setForeground(Color.RED);
        } else {
            sixth.setBackground(Color.WHITE);
            sixth.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_sixthActionPerformed

    private void seventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seventhActionPerformed
        seventh.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            seventh.setBackground(Color.BLACK);
            seventh.setForeground(Color.RED);
        } else {
            seventh.setBackground(Color.WHITE);
            seventh.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_seventhActionPerformed

    private void eightthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightthActionPerformed
        eightth.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            eightth.setBackground(Color.BLACK);
            eightth.setForeground(Color.RED);
        } else {
            eightth.setBackground(Color.WHITE);
            eightth.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_eightthActionPerformed

    private void ninethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninethActionPerformed
        nineth.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            nineth.setBackground(Color.BLACK);
            nineth.setForeground(Color.RED);
        } else {
            nineth.setBackground(Color.WHITE);
            nineth.setForeground(Color.blue);
        }
        
        determineturn();
        winner();
        draw();
    }//GEN-LAST:event_ninethActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HEADING;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton eightth;
    private javax.swing.JToggleButton first;
    private javax.swing.JToggleButton fivth;
    private javax.swing.JToggleButton fourth;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton nineth;
    private javax.swing.JToggleButton second;
    private javax.swing.JToggleButton seventh;
    private javax.swing.JToggleButton sixth;
    private javax.swing.JToggleButton third;
    // End of variables declaration//GEN-END:variables

}
