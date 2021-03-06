package w13_guiATM;

/**
 *
 * @author arrenbryan
 */
public class MenuKodeBank extends javax.swing.JFrame {

    private Account account;
    
    public MenuKodeBank(Account account) {
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
        LblLanjutkan = new javax.swing.JLabel();
        LblKodeMandiri = new javax.swing.JLabel();
        LblKodeBNI = new javax.swing.JLabel();
        LblKodeBTN = new javax.swing.JLabel();
        LblKodeBCA = new javax.swing.JLabel();
        LblKodeBII = new javax.swing.JLabel();
        LblKodeBukopin = new javax.swing.JLabel();
        LblKodeCitibank = new javax.swing.JLabel();
        LblKodeDKI = new javax.swing.JLabel();
        LblKodeMEGA = new javax.swing.JLabel();
        BtnLanjutkan = new javax.swing.JButton();
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

        LblPilihTransaksi.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPilihTransaksi.setForeground(java.awt.Color.white);
        LblPilihTransaksi.setText("KODE BANK");

        LblPilihCancel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblPilihCancel.setForeground(java.awt.Color.white);
        LblPilihCancel.setText("TUJUAN TRANSFER");

        LblLanjutkan.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblLanjutkan.setForeground(java.awt.Color.white);
        LblLanjutkan.setText("LANJUTKAN ==>");

        LblKodeMandiri.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeMandiri.setForeground(java.awt.Color.white);
        LblKodeMandiri.setText("008 MANDIRI");

        LblKodeBNI.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeBNI.setForeground(java.awt.Color.white);
        LblKodeBNI.setText("009 BNI");

        LblKodeBTN.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeBTN.setForeground(java.awt.Color.white);
        LblKodeBTN.setText("200 BTN");

        LblKodeBCA.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeBCA.setForeground(java.awt.Color.white);
        LblKodeBCA.setText("014 BCA");

        LblKodeBII.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeBII.setForeground(java.awt.Color.white);
        LblKodeBII.setText("016 BII");

        LblKodeBukopin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeBukopin.setForeground(java.awt.Color.white);
        LblKodeBukopin.setText("441 BUKOPIN");

        LblKodeCitibank.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeCitibank.setForeground(java.awt.Color.white);
        LblKodeCitibank.setText("031 CITIBANK");

        LblKodeDKI.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeDKI.setForeground(java.awt.Color.white);
        LblKodeDKI.setText("111 DKI");

        LblKodeMEGA.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LblKodeMEGA.setForeground(java.awt.Color.white);
        LblKodeMEGA.setText("426 MEGA");

        javax.swing.GroupLayout PnlUtamaATMLayout = new javax.swing.GroupLayout(PnlUtamaATM);
        PnlUtamaATM.setLayout(PnlUtamaATMLayout);
        PnlUtamaATMLayout.setHorizontalGroup(
            PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                        .addComponent(LblKodeCitibank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblLanjutkan)
                        .addGap(15, 15, 15))
                    .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                        .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblKodeBukopin)
                            .addComponent(LblKodeBII)
                            .addComponent(LblKodeBCA)
                            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblKodeMandiri)
                                    .addComponent(LblKodeBNI)
                                    .addComponent(LblKodeBTN))
                                .addGap(50, 50, 50)
                                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblKodeMEGA)
                                    .addComponent(LblKodeDKI)
                                    .addComponent(LblPilihCancel))))
                        .addContainerGap(170, Short.MAX_VALUE))))
            .addGroup(PnlUtamaATMLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(LblPilihTransaksi)
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
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblKodeMandiri)
                    .addComponent(LblKodeDKI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblKodeBNI)
                    .addComponent(LblKodeMEGA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblKodeBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblKodeBCA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblKodeBII)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblKodeBukopin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlUtamaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblLanjutkan)
                    .addComponent(LblKodeCitibank))
                .addGap(41, 41, 41))
        );

        BtnLanjutkan.setForeground(java.awt.Color.lightGray);
        BtnLanjutkan.setBorder(null);
        BtnLanjutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLanjutkanActionPerformed(evt);
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
                .addGap(74, 74, 74)
                .addComponent(PnlUtamaATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLanjutkan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(BtnLanjutkan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void BtnLanjutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLanjutkanActionPerformed
        MenuPemilihanBank mn_pemilihanBank = new MenuPemilihanBank(account);
        mn_pemilihanBank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLanjutkanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLanjutkan;
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
    private javax.swing.JLabel LblKodeBCA;
    private javax.swing.JLabel LblKodeBII;
    private javax.swing.JLabel LblKodeBNI;
    private javax.swing.JLabel LblKodeBTN;
    private javax.swing.JLabel LblKodeBukopin;
    private javax.swing.JLabel LblKodeCitibank;
    private javax.swing.JLabel LblKodeDKI;
    private javax.swing.JLabel LblKodeMEGA;
    private javax.swing.JLabel LblKodeMandiri;
    private javax.swing.JLabel LblLanjutkan;
    private javax.swing.JLabel LblPilihCancel;
    private javax.swing.JLabel LblPilihTransaksi;
    private javax.swing.JPanel PnlBackground;
    private javax.swing.JPanel PnlPadATM;
    private javax.swing.JPanel PnlUtamaATM;
    // End of variables declaration//GEN-END:variables
}
