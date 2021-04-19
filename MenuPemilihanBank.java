package w13_guiATM;

/**
 *
 * @author arrenbryan
 */
public class MenuPemilihanBank extends javax.swing.JFrame {

    private Account account;
    
    public MenuPemilihanBank(Account account) {
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
        LblPilihBank = new javax.swing.JLabel();
        LblBankBRI = new javax.swing.JLabel();
        LblBankLain = new javax.swing.JLabel();
        LblKodeBank = new javax.swing.JLabel();
        BtnBankBRI = new javax.swing.JButton();
        BtnBankLain = new javax.swing.JButton();
        BtnKodeBank = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automated Teller Machine (ATM BRI)");

        PnlBackground.setBackground(new java.awt.Color(0, 0, 255));

        PnlUtamaATM.setBackground(new java.awt.Color(0, 35, 225));
        PnlUtamaATM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblNamaBank.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblNamaBank.setForeground(java.awt.Color.white);
        LblNamaBank.setText("PT BANK RAKYAT INDONESIA");

        LblPilihBank.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPilihBank.setForeground(java.awt.Color.white);
        LblPilihBank.setText("PILIH BANK UNTUK TUJUAN TRANSFER");

        LblBankBRI.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblBankBRI.setForeground(java.awt.Color.white);
        LblBankBRI.setText("BANK BRI ==>");

        LblBankLain.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblBankLain.setForeground(java.awt.Color.white);
        LblBankLain.setText("BANK LAIN ==>");

        LblKodeBank.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeBank.setForeground(java.awt.Color.white);
        LblKodeBank.setText("<== KODE BANK ");

        javax.swing.GroupLayout PnlUtamaATMLayout = new javax.swing.GroupLayout(PnlUtamaATM);
        PnlUtamaATM.setLayout(PnlUtamaATMLayout);
        PnlUtamaATMLayout.setHorizontalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblKodeBank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(LblBankLain))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LblBankBRI)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblNamaBank)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblPilihBank)
                        .addGap(84, 84, 84))))
        );
        PnlUtamaATMLayout.setVerticalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblNamaBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblPilihBank, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblBankBRI)
                        .addGap(30, 30, 30)
                        .addComponent(LblBankLain))
                    .addComponent(LblKodeBank))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        BtnBankBRI.setForeground(java.awt.Color.lightGray);
        BtnBankBRI.setBorder(null);
        BtnBankBRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBankBRIActionPerformed(evt);
            }
        });

        BtnBankLain.setForeground(java.awt.Color.lightGray);
        BtnBankLain.setBorder(null);
        BtnBankLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBankLainActionPerformed(evt);
            }
        });

        BtnKodeBank.setForeground(java.awt.Color.lightGray);
        BtnKodeBank.setBorder(null);
        BtnKodeBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKodeBankActionPerformed(evt);
            }
        });

        PnlPadATM.setBackground(java.awt.Color.white);
        PnlPadATM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnPad1.setBackground(java.awt.Color.lightGray);
        BtnPad1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad1.setText("1");

        BtnPad2.setBackground(java.awt.Color.lightGray);
        BtnPad2.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad2.setText("2");

        BtnPad3.setBackground(java.awt.Color.lightGray);
        BtnPad3.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad3.setText("3");

        BtnPad4.setBackground(java.awt.Color.lightGray);
        BtnPad4.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad4.setText("4");
        BtnPad4.setToolTipText("");

        BtnPad5.setBackground(java.awt.Color.lightGray);
        BtnPad5.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad5.setText("5");
        BtnPad5.setToolTipText("");

        BtnPad7.setBackground(java.awt.Color.lightGray);
        BtnPad7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad7.setText("7");
        BtnPad7.setToolTipText("");

        BtnPad6.setBackground(java.awt.Color.lightGray);
        BtnPad6.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad6.setText("6");
        BtnPad6.setToolTipText("");

        BtnPad8.setBackground(java.awt.Color.lightGray);
        BtnPad8.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad8.setText("8");
        BtnPad8.setToolTipText("");

        BtnPad9.setBackground(java.awt.Color.lightGray);
        BtnPad9.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad9.setText("9");
        BtnPad9.setToolTipText("");

        BtnPad0.setBackground(java.awt.Color.lightGray);
        BtnPad0.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPad0.setText("0");
        BtnPad0.setToolTipText("");

        BtnPadClear.setBackground(java.awt.Color.lightGray);
        BtnPadClear.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        BtnPadClear.setText("Clear");
        BtnPadClear.setToolTipText("");

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

        javax.swing.GroupLayout PnlBackgroundLayout = new javax.swing.GroupLayout(PnlBackground);
        PnlBackground.setLayout(PnlBackgroundLayout);
        PnlBackgroundLayout.setHorizontalGroup(
            PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBackgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BtnKodeBank, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBankBRI, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBankLain, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(96, 96, 96)
                        .addComponent(BtnBankBRI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBankLain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBackgroundLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(BtnKodeBank, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(PnlPadATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnKodeBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKodeBankActionPerformed
        MenuKodeBank mn_kodeBank = new MenuKodeBank(account);
        mn_kodeBank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnKodeBankActionPerformed

    private void BtnBankBRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBankBRIActionPerformed
        MenuInputRekeningSama mn_rekeningSama = new MenuInputRekeningSama(account);
        mn_rekeningSama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBankBRIActionPerformed

    private void BtnBankLainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBankLainActionPerformed
        MenuInputRekeningBeda mn_rekeningBeda = new MenuInputRekeningBeda(account);
        mn_rekeningBeda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBankLainActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBankBRI;
    private javax.swing.JButton BtnBankLain;
    private javax.swing.JButton BtnKodeBank;
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
    private javax.swing.JLabel LblBankBRI;
    private javax.swing.JLabel LblBankLain;
    private javax.swing.JLabel LblKodeBank;
    private javax.swing.JLabel LblNamaBank;
    private javax.swing.JLabel LblPilihBank;
    private javax.swing.JPanel PnlBackground;
    private javax.swing.JPanel PnlPadATM;
    private javax.swing.JPanel PnlUtamaATM;
    // End of variables declaration//GEN-END:variables
}
