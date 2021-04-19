package w13_guiATM;

/**
 *
 * @author arrenbryan
 */
public class MenuUtama extends javax.swing.JFrame {

    private Account account;

    public MenuUtama(Account account) {
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
        LblPilihTransaksi = new javax.swing.JLabel();
        LblPilihCancel = new javax.swing.JLabel();
        LblPenarikan = new javax.swing.JLabel();
        LblTransfer = new javax.swing.JLabel();
        LblInfoSaldo = new javax.swing.JLabel();
        LblHistory = new javax.swing.JLabel();
        BtnPenarikan = new javax.swing.JButton();
        BtnTransfer = new javax.swing.JButton();
        BtnInfoSaldo = new javax.swing.JButton();
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
        BtnHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automated Teller Machine (ATM BRI)");

        PnlBackground.setBackground(new java.awt.Color(0, 0, 255));

        PnlUtamaATM.setBackground(new java.awt.Color(0, 35, 225));
        PnlUtamaATM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblPilihTransaksi.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPilihTransaksi.setForeground(java.awt.Color.white);
        LblPilihTransaksi.setText("SILAKAN PILIH");

        LblPilihCancel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPilihCancel.setForeground(java.awt.Color.white);
        LblPilihCancel.setText("TRANSAKSI YANG DIINGINKAN");

        LblPenarikan.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPenarikan.setForeground(java.awt.Color.white);
        LblPenarikan.setText("PENARIKAN TUNAI ==>");

        LblTransfer.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblTransfer.setForeground(java.awt.Color.white);
        LblTransfer.setText("TRANSFER ==>");

        LblInfoSaldo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblInfoSaldo.setForeground(java.awt.Color.white);
        LblInfoSaldo.setText("<== INFORMASI SALDO");

        LblHistory.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblHistory.setForeground(java.awt.Color.white);
        LblHistory.setText("<== HISTORY TRANSAKSI");

        javax.swing.GroupLayout PnlUtamaATMLayout = new javax.swing.GroupLayout(PnlUtamaATM);
        PnlUtamaATM.setLayout(PnlUtamaATMLayout);
        PnlUtamaATMLayout.setHorizontalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblInfoSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTransfer))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LblPenarikan)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblPilihCancel)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblPilihTransaksi)
                        .addGap(177, 177, 177))))
            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblHistory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlUtamaATMLayout.setVerticalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblPilihTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblPilihCancel)
                .addGap(18, 18, 18)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblPenarikan)
                        .addGap(30, 30, 30)
                        .addComponent(LblTransfer))
                    .addComponent(LblInfoSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(LblHistory)
                .addGap(30, 30, 30))
        );

        BtnPenarikan.setForeground(java.awt.Color.lightGray);
        BtnPenarikan.setBorder(null);
        BtnPenarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPenarikanActionPerformed(evt);
            }
        });

        BtnTransfer.setForeground(java.awt.Color.lightGray);
        BtnTransfer.setBorder(null);
        BtnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransferActionPerformed(evt);
            }
        });

        BtnInfoSaldo.setForeground(java.awt.Color.lightGray);
        BtnInfoSaldo.setBorder(null);
        BtnInfoSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoSaldoActionPerformed(evt);
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

        BtnHistory.setForeground(java.awt.Color.lightGray);
        BtnHistory.setBorder(null);
        BtnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlBackgroundLayout = new javax.swing.GroupLayout(PnlBackground);
        PnlBackground.setLayout(PnlBackgroundLayout);
        PnlBackgroundLayout.setHorizontalGroup(
            PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBackgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnInfoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPenarikan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(BtnPenarikan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBackgroundLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(BtnInfoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(BtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(PnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInfoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoSaldoActionPerformed
        MenuInformasiSaldo mn_informasiSaldo = new MenuInformasiSaldo(account);
        mn_informasiSaldo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInfoSaldoActionPerformed

    private void BtnPenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPenarikanActionPerformed
        MenuPenarikanTunai mn_penarikanTunai = new MenuPenarikanTunai(account);
        mn_penarikanTunai.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnPenarikanActionPerformed

    private void BtnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransferActionPerformed
        MenuPemilihanBank mn_pemilihanBank = new MenuPemilihanBank(account);
        mn_pemilihanBank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnTransferActionPerformed

    private void BtnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistoryActionPerformed
        MenuHistoryTransaksi mn_historyTransaksi = new MenuHistoryTransaksi(account);
        mn_historyTransaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnHistoryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHistory;
    private javax.swing.JButton BtnInfoSaldo;
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
    private javax.swing.JButton BtnPenarikan;
    private javax.swing.JButton BtnTransfer;
    private javax.swing.JLabel LblHistory;
    private javax.swing.JLabel LblInfoSaldo;
    private javax.swing.JLabel LblPenarikan;
    private javax.swing.JLabel LblPilihCancel;
    private javax.swing.JLabel LblPilihTransaksi;
    private javax.swing.JLabel LblTransfer;
    private javax.swing.JPanel PnlBackground;
    private javax.swing.JPanel PnlPadATM;
    private javax.swing.JPanel PnlUtamaATM;
    // End of variables declaration//GEN-END:variables
}
