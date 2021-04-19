package w13_guiATM;

/**
 *
 * @author arrenbryan
 */
public class MenuLoginPIN extends javax.swing.JFrame implements IATMPad, IConfig {

    private Account account;

    public MenuLoginPIN(Account account) {
        this.account = account;
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

        PnlBackground = new javax.swing.JPanel();
        PnlUtamaATM = new javax.swing.JPanel();
        LblNamaBank = new javax.swing.JLabel();
        LblMasukkanPIN = new javax.swing.JLabel();
        LblEnter = new javax.swing.JLabel();
        LblPilihEnter = new javax.swing.JLabel();
        TxtFieldPIN = new javax.swing.JTextField();
        LblMemasukkanPIN = new javax.swing.JLabel();
        PnlPadATM = new javax.swing.JPanel();
        BtnPad1 = new javax.swing.JButton();
        BtnPad2 = new javax.swing.JButton();
        BtnPad3 = new javax.swing.JButton();
        BtnPad4 = new javax.swing.JButton();
        BtnPad5 = new javax.swing.JButton();
        BtnPad7 = new javax.swing.JButton();
        BtnPad6 = new javax.swing.JButton();
        BtnPad8 = new javax.swing.JButton();
        BtnPad9 = new javax.swing.JButton();
        BtnPad0 = new javax.swing.JButton();
        BtnPadClear = new javax.swing.JButton();
        BtnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automated Teller Machine (ATM BRI)");

        PnlBackground.setBackground(new java.awt.Color(0, 0, 255));

        PnlUtamaATM.setBackground(new java.awt.Color(0, 35, 225));
        PnlUtamaATM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblNamaBank.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblNamaBank.setForeground(java.awt.Color.white);
        LblNamaBank.setText("PT BANK RAKYAT INDONESIA");

        LblMasukkanPIN.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblMasukkanPIN.setForeground(java.awt.Color.white);
        LblMasukkanPIN.setText("MASUKKAN PIN (6 DIGIT)");

        LblEnter.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblEnter.setForeground(java.awt.Color.white);
        LblEnter.setText("ENTER ==>");

        LblPilihEnter.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPilihEnter.setForeground(java.awt.Color.white);
        LblPilihEnter.setText("PILIH <ENTER> JIKA SELESAI");

        TxtFieldPIN.setEditable(false);
        TxtFieldPIN.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TxtFieldPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LblMemasukkanPIN.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblMemasukkanPIN.setForeground(java.awt.Color.white);
        LblMemasukkanPIN.setText("MEMASUKKAN PIN");

        javax.swing.GroupLayout PnlUtamaATMLayout = new javax.swing.GroupLayout(PnlUtamaATM);
        PnlUtamaATM.setLayout(PnlUtamaATMLayout);
        PnlUtamaATMLayout.setHorizontalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblEnter)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(TxtFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblPilihEnter)
                            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                                .addComponent(LblMemasukkanPIN)
                                .addGap(33, 33, 33)))
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(LblMasukkanPIN))
                            .addComponent(LblNamaBank))
                        .addGap(127, 127, 127))))
        );
        PnlUtamaATMLayout.setVerticalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblNamaBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblMasukkanPIN)
                .addGap(18, 18, 18)
                .addComponent(TxtFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblPilihEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblMemasukkanPIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(LblEnter)
                .addGap(38, 38, 38))
        );

        PnlPadATM.setBackground(java.awt.Color.white);
        PnlPadATM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnPad1.setBackground(java.awt.Color.lightGray);
        BtnPad1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad1.setText("1");
        BtnPad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad1ActionPerformed(evt);
            }
        });

        BtnPad2.setBackground(java.awt.Color.lightGray);
        BtnPad2.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad2.setText("2");
        BtnPad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad2ActionPerformed(evt);
            }
        });

        BtnPad3.setBackground(java.awt.Color.lightGray);
        BtnPad3.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad3.setText("3");
        BtnPad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad3ActionPerformed(evt);
            }
        });

        BtnPad4.setBackground(java.awt.Color.lightGray);
        BtnPad4.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad4.setText("4");
        BtnPad4.setToolTipText("");
        BtnPad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad4ActionPerformed(evt);
            }
        });

        BtnPad5.setBackground(java.awt.Color.lightGray);
        BtnPad5.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad5.setText("5");
        BtnPad5.setToolTipText("");
        BtnPad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad5ActionPerformed(evt);
            }
        });

        BtnPad7.setBackground(java.awt.Color.lightGray);
        BtnPad7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad7.setText("7");
        BtnPad7.setToolTipText("");
        BtnPad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad7ActionPerformed(evt);
            }
        });

        BtnPad6.setBackground(java.awt.Color.lightGray);
        BtnPad6.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad6.setText("6");
        BtnPad6.setToolTipText("");
        BtnPad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad6ActionPerformed(evt);
            }
        });

        BtnPad8.setBackground(java.awt.Color.lightGray);
        BtnPad8.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad8.setText("8");
        BtnPad8.setToolTipText("");
        BtnPad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad8ActionPerformed(evt);
            }
        });

        BtnPad9.setBackground(java.awt.Color.lightGray);
        BtnPad9.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad9.setText("9");
        BtnPad9.setToolTipText("");
        BtnPad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad9ActionPerformed(evt);
            }
        });

        BtnPad0.setBackground(java.awt.Color.lightGray);
        BtnPad0.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad0.setText("0");
        BtnPad0.setToolTipText("");
        BtnPad0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPad0ActionPerformed(evt);
            }
        });

        BtnPadClear.setBackground(java.awt.Color.lightGray);
        BtnPadClear.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPadClear.setText("Clear");
        BtnPadClear.setToolTipText("");
        BtnPadClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPadClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlPadATMLayout = new javax.swing.GroupLayout(PnlPadATM);
        PnlPadATM.setLayout(PnlPadATMLayout);
        PnlPadATMLayout.setHorizontalGroup(
            PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPadATMLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PnlPadATMLayout.createSequentialGroup()
                            .addComponent(BtnPad7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnPad8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnPad9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnlPadATMLayout.createSequentialGroup()
                            .addComponent(BtnPad4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnPad5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnPad6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnlPadATMLayout.createSequentialGroup()
                            .addComponent(BtnPad1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnPad2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnPad3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlPadATMLayout.createSequentialGroup()
                        .addComponent(BtnPad0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnPadClear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PnlPadATMLayout.setVerticalGroup(
            PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPadATMLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPad1)
                    .addComponent(BtnPad2)
                    .addComponent(BtnPad3))
                .addGap(18, 18, 18)
                .addGroup(PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPad4)
                    .addComponent(BtnPad5)
                    .addComponent(BtnPad6))
                .addGap(18, 18, 18)
                .addGroup(PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPad7)
                    .addComponent(BtnPad8)
                    .addComponent(BtnPad9))
                .addGap(18, 18, 18)
                .addGroup(PnlPadATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPad0)
                    .addComponent(BtnPadClear))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        BtnEnter.setForeground(java.awt.Color.lightGray);
        BtnEnter.setBorder(null);
        BtnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlBackgroundLayout = new javax.swing.GroupLayout(PnlBackground);
        PnlBackground.setLayout(PnlBackgroundLayout);
        PnlBackgroundLayout.setHorizontalGroup(
            PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBackgroundLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlPadATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        PnlBackgroundLayout.setVerticalGroup(
            PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBackgroundLayout.createSequentialGroup()
                .addGroup(PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBackgroundLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(BtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(PnlPadATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad1ActionPerformed
        message("1");
    }//GEN-LAST:event_BtnPad1ActionPerformed

    private void BtnPad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad2ActionPerformed
        message("2");
    }//GEN-LAST:event_BtnPad2ActionPerformed

    private void BtnPad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad3ActionPerformed
        message("3");
    }//GEN-LAST:event_BtnPad3ActionPerformed

    private void BtnPad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad4ActionPerformed
        message("4");
    }//GEN-LAST:event_BtnPad4ActionPerformed

    private void BtnPad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad5ActionPerformed
        message("5");
    }//GEN-LAST:event_BtnPad5ActionPerformed

    private void BtnPad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad6ActionPerformed
        message("6");
    }//GEN-LAST:event_BtnPad6ActionPerformed

    private void BtnPad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad7ActionPerformed
        message("7");
    }//GEN-LAST:event_BtnPad7ActionPerformed

    private void BtnPad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad8ActionPerformed
        message("8");
    }//GEN-LAST:event_BtnPad8ActionPerformed

    private void BtnPad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad9ActionPerformed
        message("9");
    }//GEN-LAST:event_BtnPad9ActionPerformed

    private void BtnPad0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPad0ActionPerformed
        message("0");
    }//GEN-LAST:event_BtnPad0ActionPerformed

    private void BtnPadClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPadClearActionPerformed
        clearText();
    }//GEN-LAST:event_BtnPadClearActionPerformed

    private void BtnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnterActionPerformed
        Account[] accountList = IJsonParse.deserializeAccount();
        int i;

        for (i = 0; i <= accountList.length - 1; i++) {
            if (account.getAccountNumber().equals(accountList[i].getAccountNumber())) {
                if (account.getAccountPin().equals(accountList[i].getAccountPin())) {
                    account.setAccountBalance(accountList[i].getAccountBalance());
                    account.setAccountName(accountList[i].getAccountName());
                    MenuUtama mn_utama = new MenuUtama(account);
                    mn_utama.setVisible(true);
                    this.dispose();
                }
                break;
            }
        }
        
        // PIN salah, aplikasi akan segera exit!
        if (!account.getAccountPin().equals(accountList[i].getAccountPin())) {
            System.err.println("PIN yang anda masukkan salah!");
            this.dispose();
        }
    }//GEN-LAST:event_BtnEnterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnter;
    private javax.swing.JButton BtnPad0;
    private javax.swing.JButton BtnPad1;
    private javax.swing.JButton BtnPad2;
    private javax.swing.JButton BtnPad3;
    private javax.swing.JButton BtnPad4;
    private javax.swing.JButton BtnPad5;
    private javax.swing.JButton BtnPad6;
    private javax.swing.JButton BtnPad7;
    private javax.swing.JButton BtnPad8;
    private javax.swing.JButton BtnPad9;
    private javax.swing.JButton BtnPadClear;
    private javax.swing.JLabel LblEnter;
    private javax.swing.JLabel LblMasukkanPIN;
    private javax.swing.JLabel LblMemasukkanPIN;
    private javax.swing.JLabel LblNamaBank;
    private javax.swing.JLabel LblPilihEnter;
    private javax.swing.JPanel PnlBackground;
    private javax.swing.JPanel PnlPadATM;
    private javax.swing.JPanel PnlUtamaATM;
    private javax.swing.JTextField TxtFieldPIN;
    // End of variables declaration//GEN-END:variables

    @Override
    public void message(String angka) {
        if (TxtFieldPIN.getText().length() != LIMITPIN) {
            account.appendAccountPin(angka);
            TxtFieldPIN.setText(account.getAccountPin());
        }
    }

    @Override
    public void clearText() {
        account.setAccountPin("");
        TxtFieldPIN.setText(account.getAccountPin());
    }
}
