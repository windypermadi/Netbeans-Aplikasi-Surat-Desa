/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.surat.desa;

import aplikasi.surat.desa.datapenduduk.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDY PERMADI
 */
public class FormatSuratTidakMampu extends javax.swing.JFrame {
    private DefaultTableModel DftTblModel_data;
    private String SQL; 


    /**
     * Creates new form NewJFrame
     */
    public FormatSuratTidakMampu() {
        initComponents();
        this.TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTempat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtAgama = new javax.swing.JComboBox<>();
        txtStatusPerkawinan = new javax.swing.JComboBox<>();
        txtJenisKelamin = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeperluan = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Identitas NIK");
        jLabel5.setAlignmentY(0.0F);

        jLabel6.setText("Nama");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel7.setText("Tempat Lahir");

        txtTempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempatActionPerformed(evt);
            }
        });

        jLabel19.setText("Keperluan Surat");

        jLabel8.setText("Jenis Kelamin");

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTable);

        jLabel12.setText("Tanggal Lahir");

        txtAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Islam", "Hindu", "Budha", "Kristen", "Katolik", "Lainnya" }));

        txtStatusPerkawinan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "belum kawin", "kawin", "cerai hidup", "cerai mati" }));

        txtJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "laki-laki", "perempuan" }));
        txtJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisKelaminActionPerformed(evt);
            }
        });

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pembuatan Surat Keterangan Tidak Mampu");

        jLabel2.setText("NIK");

        jLabel9.setText("Agama");

        btnExport.setText("Export Surat");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        jLabel10.setText("Status Perkawinan");

        jLabel11.setText("Alamat");

        txtNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNikActionPerformed(evt);
            }
        });
        txtNik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNikKeyReleased(evt);
            }
        });

        txtKeperluan.setColumns(20);
        txtKeperluan.setRows(5);
        jScrollPane1.setViewportView(txtKeperluan);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(407, 407, 407))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExport))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel8))
                                            .addGap(47, 47, 47)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtTempat, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                .addComponent(txtJenisKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel11)))
                                        .addComponent(jLabel19))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAgama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStatusPerkawinan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(jScrollPane1))))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatusPerkawinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExport)
                            .addComponent(jButton4)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempatActionPerformed

    private void tbTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableMouseClicked
        // TODO add your handling code here:
        int baris = tbTable.rowAtPoint(evt.getPoint());
        String nama = tbTable.getValueAt(baris, 1).toString();
        txtNama.setText(nama);
        String tempat = tbTable.getValueAt(baris,2).toString();
        txtTempat.setText(tempat);
        String tanggal = tbTable.getValueAt(baris,3).toString();
        txtTanggal.setText(tanggal);
        String jr = tbTable.getValueAt(baris, 4).toString();
        txtJenisKelamin.setSelectedItem(jr);
        String agama = tbTable.getValueAt(baris, 5).toString();
        txtAgama.setSelectedItem(agama);
        String status = tbTable.getValueAt(baris, 6).toString();
        txtStatusPerkawinan.setSelectedItem(status);
        String alamat = tbTable.getValueAt(baris,7).toString();
        txtAlamat.setText(alamat);
    }//GEN-LAST:event_tbTableMouseClicked

    private void txtJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisKelaminActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void txtNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNikActionPerformed

    private void txtNikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNikKeyReleased
        // TODO add your handling code here:
        String key = txtNik.getText();
        System.out.println(key);
        if(key!=""){
            cariData(key);
        }else{
            TampilData();
        }
    }//GEN-LAST:event_txtNikKeyReleased

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnExportActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FrameSuratTidakMampu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormatSuratTidakMampu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatSuratTidakMampu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatSuratTidakMampu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatSuratTidakMampu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatSuratTidakMampu().setVisible(true);
            }
        });
    }

    private void kosong(){
        txtNama.setText(null);
        txtTempat.setText(null);
        txtTanggal.setText(null);
        txtJenisKelamin.setSelectedItem(this);
        txtAgama.setSelectedItem(this);
        txtStatusPerkawinan.setSelectedItem(this);
        txtAlamat.setText(null);  
        txtKeperluan.setText(null);
    }

private void cariData(String key){
        DftTblModel_data = new DefaultTableModel();
        DftTblModel_data.addColumn("ID SURAT");
        DftTblModel_data.addColumn("NIK");
        DftTblModel_data.addColumn("NAMA");
        DftTblModel_data.addColumn("TEMPAT LAHIR");
        DftTblModel_data.addColumn("TANGGAL LAHIR");
        DftTblModel_data.addColumn("JENIS KELAMIN");
        DftTblModel_data.addColumn("AGAMA");
        DftTblModel_data.addColumn("STATUS PERKAWINAN");
        DftTblModel_data.addColumn("ALAMAT");
        DftTblModel_data.addColumn("KETERANGAN");
        tbTable.setModel(DftTblModel_data);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "SELECT * FROM data_penduduk a JOIN surat_tidak_mampu b"
 + "ON b.fk_penduduk=a.nik_ktp WHERE a.nik_ktp LIKE '%"+key+"%'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_data.addRow(new Object[]{
                    res.getString("idsurat"),
                    res.getString("nik_ktp"),
                    res.getString("nama"),
                    res.getString("tempat_lahir"),
                    res.getString("tgl_lahir"),
                    res.getString("jenis_kelamin"),
                    res.getString("agama"),
                    res.getString("status_kawin"),
                    res.getString("alamat"),
                    res.getString("keterangan")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void TampilData() {
        DftTblModel_data = new DefaultTableModel();
        DftTblModel_data.addColumn("ID SURAT");
        DftTblModel_data.addColumn("NIK");
        DftTblModel_data.addColumn("NAMA");
        DftTblModel_data.addColumn("TEMPAT LAHIR");
        DftTblModel_data.addColumn("TANGGAL LAHIR");
        DftTblModel_data.addColumn("JENIS KELAMIN");
        DftTblModel_data.addColumn("AGAMA");
        DftTblModel_data.addColumn("STATUS PERKAWINAN");
        DftTblModel_data.addColumn("ALAMAT");
        DftTblModel_data.addColumn("KETERANGAN");
        tbTable.setModel(DftTblModel_data);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "SELECT * FROM surat_tidak_mampu";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_data.addRow(new Object[]{
                    res.getString("idsurat"),
                    res.getString("nik_ktp"),
                    res.getString("nama"),
                    res.getString("tempat_lahir"),
                    res.getString("tgl_lahir"),
                    res.getString("jenis_kelamin"),
                    res.getString("agama"),
                    res.getString("status_kawin"),
                    res.getString("alamat"),
                    res.getString("keterangan")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbTable;
    private javax.swing.JComboBox<String> txtAgama;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JComboBox<String> txtJenisKelamin;
    private javax.swing.JTextArea txtKeperluan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JComboBox<String> txtStatusPerkawinan;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTempat;
    // End of variables declaration//GEN-END:variables
}
