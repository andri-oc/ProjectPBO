package form;

public class formUtama extends javax.swing.JFrame {

    public formUtama() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDaftar = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnDataBerobat = new javax.swing.JButton();
        btnDataObat = new javax.swing.JButton();
        btnDataPelayan = new javax.swing.JButton();
        btnDataPenyakit = new javax.swing.JButton();
        btnDataRegistrasi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        btnData.setText("Data");
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });

        btnDataBerobat.setText("Data Berobat");
        btnDataBerobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBerobatActionPerformed(evt);
            }
        });

        btnDataObat.setText("Data Obat");
        btnDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataObatActionPerformed(evt);
            }
        });

        btnDataPelayan.setText("Data Pelayan");
        btnDataPelayan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPelayanActionPerformed(evt);
            }
        });

        btnDataPenyakit.setText("Data Penyakit");
        btnDataPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPenyakitActionPerformed(evt);
            }
        });

        btnDataRegistrasi.setText("Data Registrasi");
        btnDataRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataRegistrasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDataPenyakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataBerobat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataPelayan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataRegistrasi, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(118, 118, 118))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDaftar, btnData, btnDataBerobat, btnDataObat, btnDataPelayan, btnDataPenyakit, btnDataRegistrasi});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(btnDaftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataBerobat)
                .addGap(12, 12, 12)
                .addComponent(btnDataObat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataPelayan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataPenyakit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDataRegistrasi)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // form daftar  
        new formDaftar().setVisible(true);


    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        // form data:
        new formData().setVisible(true);
    }//GEN-LAST:event_btnDataActionPerformed

    private void btnDataBerobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBerobatActionPerformed
        // form data berobat
        new formDataBerobat().setVisible(true);

    }//GEN-LAST:event_btnDataBerobatActionPerformed

    private void btnDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataObatActionPerformed
        // Data Obat
        new formDataObat().setVisible(true);

    }//GEN-LAST:event_btnDataObatActionPerformed

    private void btnDataPelayanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPelayanActionPerformed
        //Data Pelayan
        new formDataPelayan().setVisible(true);

    }//GEN-LAST:event_btnDataPelayanActionPerformed

    private void btnDataPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPenyakitActionPerformed
        //Data Penyakit
        new formDataPenyakit().setVisible(true);

    }//GEN-LAST:event_btnDataPenyakitActionPerformed

    private void btnDataRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataRegistrasiActionPerformed
        //Data registrasi
        new formDataRegistrasi().setVisible(true);

    }//GEN-LAST:event_btnDataRegistrasiActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnDataBerobat;
    private javax.swing.JButton btnDataObat;
    private javax.swing.JButton btnDataPelayan;
    private javax.swing.JButton btnDataPenyakit;
    private javax.swing.JButton btnDataRegistrasi;
    // End of variables declaration//GEN-END:variables
}
