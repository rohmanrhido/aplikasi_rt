/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_rt;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My-PC
 */
public class penduduk extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;

    String idGet = ""; //buat edit
    /**
     * Creates new form penduduk
     */
    public penduduk() throws SQLException{
        initComponents();
        
        Aplikasi_rt DB = new Aplikasi_rt();
        DB.config();
        con = DB.con;
        stat = DB.stm;

        kode_otomatis("0");
        bikin_table();        
        btambah.setEnabled(true);
        bbatal.setEnabled(false);
        bsimpan.setEnabled(false);
        bhapus.setEnabled(false);
        bedit.setEnabled(false);
        bupdate.setEnabled(false);
        tno.setEnabled(false);
        tid.setEnabled(false);
        tnik.setEnabled(false);
        tnama.setEnabled(false);
        tasal.setEnabled(false);
        ttempat.setEnabled(false);
        ttanggal.setEnabled(false);
        pilih_kel.setEnabled(false);
        pilih_agama.setEnabled(false);
        pilih_status.setEnabled(false);
        pilih_ke.setEnabled(false);
    }
    
    public void ubah(){
        //txtid.setEnabled(true);
        tid.setEnabled(false);
        tno.setEnabled(true);
        tnama.setEnabled(true);
        tnik.setEnabled(true);
        tasal.setEnabled(true);
        ttempat.setEnabled(true);
        ttanggal.setEnabled(true);
        pilih_kel.setEnabled(true);
        pilih_agama.setEnabled(true);
        pilih_status.setEnabled(true);
        pilih_ke.setEnabled(true);
    }
    
    public void bikin_table(){
        table1.removeAll();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nokk");
        model.addColumn("nama");
        model.addColumn("nik");
        model.addColumn("alamat");
        model.addColumn("kelamain");
        model.addColumn("tempat");
        model.addColumn("tanggal");
        model.addColumn("agama");
        model.addColumn("status");
        model.addColumn("kewarganegaraan");
        
        try {
        
        Aplikasi_rt DB = new Aplikasi_rt();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
            String sql = "select * from penduduk";        
        ResultSet rs = stat.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                });
            }
            table1.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: "+ e.getMessage());
        }
    }
    
    private void kode_otomatis(String kd)
    {
       try {
            sql="select * from penduduk order by id desc";
            rs=stat.executeQuery(sql);
            if (rs.next()) {
                String nofak = rs.getString("id").substring(1);
                String AN = "" + (Integer.parseInt(nofak) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "00";}
                else if(AN.length()==2)
                {Nol = "0";}
                else if(AN.length()==3)
                {Nol = "";}

               tid.setText(kd + Nol + AN);
            } else {
               tid.setText(kd + "001");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
    }
    
    public void load_table(String id){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nokk");
        model.addColumn("nama");
        model.addColumn("nik");
        model.addColumn("alamat");
        model.addColumn("kelamain");
        model.addColumn("tempat");
        model.addColumn("tanggal");
        model.addColumn("agama");
        model.addColumn("status");
        model.addColumn("kewarganegaraan");
        
        try {
            //query buat baca semua table
            sql = "select * from penduduk where id like '%"+ id +"%' or nama like '%"+ id +"%' or harga like '%"+ id +"%' order by id asc";
            rs = stat.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                });
            }
            table1.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: "+ e.getMessage()); //e.getMessage()
            //System.out.println(sql);
        }
        
    }
    
    public void baru(){
        tid.setEnabled(false);
        tno.setText("");
        tnik.setText("");
        tnama.setText("");
        tasal.setText("");
        ttempat.setText("");
        ttanggal.setText("");
        pilih_kel.setSelectedIndex(0);
        pilih_agama.setSelectedIndex(0);
        pilih_status.setSelectedIndex(0);
        pilih_ke.setSelectedIndex(0);

    }
    
    public void tampil1(){
        btambah.setEnabled(false);
        bsimpan.setEnabled(true);
        bhapus.setEnabled(false);
        bedit.setEnabled(false);
        bupdate.setEnabled(false);
        bbatal.setEnabled(true);
        tno.setEnabled(true);
        tid.setEnabled(false);
        tnik.setEnabled(true);
        tnama.setEnabled(true);
        tasal.setEnabled(true);
        ttempat.setEnabled(true);
        ttanggal.setEnabled(true);
        pilih_kel.setEnabled(true);
        pilih_agama.setEnabled(true);
        pilih_status.setEnabled(true);
        pilih_ke.setEnabled(true);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilih_status = new javax.swing.JComboBox<>();
        pilih_ke = new javax.swing.JComboBox<>();
        tno = new javax.swing.JTextField();
        btambah = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        tnama = new javax.swing.JTextField();
        tnik = new javax.swing.JTextField();
        ttempat = new javax.swing.JTextField();
        tasal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ttanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bbatal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bedit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bupdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tcar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pilih_kel = new javax.swing.JComboBox<>();
        pilih_agama = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pilih_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Single", "Menikah", "Janda", "Duda" }));

        pilih_ke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilh---", "WNI", "WNA" }));

        btambah.setText("Tambah");
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");

        jLabel2.setText("No KK");

        jLabel3.setText("Nama");

        jLabel4.setText("Nik");

        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel5.setText("Tempat Lahir");

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel6.setText("Alamat Asal");

        jLabel7.setText("Jenis Kelamin");

        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        jLabel8.setText("Kewarganegaraan");

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        jLabel9.setText("Status Perkawinan");

        tcar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcarKeyPressed(evt);
            }
        });

        jLabel10.setText("Agama");

        jLabel11.setText("Tanggal Lahir");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Penduduk");

        jLabel12.setText("Cari");

        pilih_kel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Laki-laki", "Perempuan" }));

        pilih_agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PIlih--", "Islam", "Kristen", "Hindu", "Bundda" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tcar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(337, 337, 337))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tid, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGap(8, 8, 8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(btambah))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tno, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pilih_kel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tnama, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tnik, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tasal))
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel5))
                                                    .addGap(41, 41, 41)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pilih_agama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pilih_status, 0, 77, Short.MAX_VALUE)
                                                        .addComponent(ttanggal)
                                                        .addComponent(ttempat)
                                                        .addComponent(pilih_ke, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bbatal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bsimpan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bhapus)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bedit)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bupdate))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(168, 168, 168)
                                    .addComponent(jLabel1)))
                            .addGap(18, 18, 18))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(ttempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(ttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(pilih_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(pilih_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(pilih_ke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(tasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pilih_kel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btambah)
                    .addComponent(bsimpan)
                    .addComponent(bbatal)
                    .addComponent(bhapus)
                    .addComponent(bedit)
                    .addComponent(bupdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        // TODO add your handling code here:
        tampil1();
        kode_otomatis("0");
    }//GEN-LAST:event_btambahActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        try {
            sql = "INSERT INTO penduduk (id, nokk, nama, nik, alamat, kelamin, tempat, tanggal, agama, status, kewarganegaraan ) values "
            + "('"+tid.getText()+"', '"+tno.getText()+"',  '"+tnama.getText()+"','"+tnik.getText()+"', '"+tasal.getText()+"', '"+pilih_kel.getSelectedItem()+"', '"+ttempat.getText()+"', '"+ttanggal.getText()+"', '"+pilih_agama.getSelectedItem()+"', '"+pilih_status.getSelectedItem()+"', '"+pilih_ke.getSelectedItem()+"')";
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Sukses simpan data baru.");
            baru();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        baru();
    }//GEN-LAST:event_bbatalActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int baris = table1.rowAtPoint(evt.getPoint());
        String nama =table1.getValueAt(baris, 0).toString();
        String alamat =table1.getValueAt(baris, 1).toString();
        tid.setEnabled(false);
        tno.setText(nama);
        tnama.setText(alamat);
        tnik.setText(nama);
        tasal.setText(alamat);
        btambah.setEnabled(false);
        bbatal.setEnabled(false);
        bsimpan.setEnabled(false);
        bhapus.setEnabled(false);
        bedit.setEnabled(true);
        bupdate.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        ubah();
    }//GEN-LAST:event_beditActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        // TODO add your handling code here:
        try {
            sql = "UPDATE penduduk set id = '"+tid.getText()+"',nokk = '"+tno.getText()+"', nama = '"+tnama.getText()+"', nik = '"+tnik.getText()+"', alamat = '"+tasal.getText()+"', kelamin = '"+pilih_kel.getSelectedItem()+"', tempat = '"+ttempat.getText()+"', tanggal = '"+ttanggal.getText()+"', agama = '"+pilih_agama.getSelectedItem()+"', status = '"+pilih_status.getSelectedItem()+"', kewarganegaraan = '"+pilih_ke.getSelectedItem()+"' where id = '"+ idGet +"'";
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Sukses mengubah data.");
            baru();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bupdateActionPerformed

    private void tcarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcarKeyPressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //System.out.println("enter");
            load_table(tcar.getText());
        }
    }//GEN-LAST:event_tcarKeyPressed

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
            java.util.logging.Logger.getLogger(penduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new penduduk().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(penduduk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btambah;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pilih_agama;
    private javax.swing.JComboBox<String> pilih_ke;
    private javax.swing.JComboBox<String> pilih_kel;
    private javax.swing.JComboBox<String> pilih_status;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tasal;
    private javax.swing.JTextField tcar;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnik;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField ttanggal;
    private javax.swing.JTextField ttempat;
    // End of variables declaration//GEN-END:variables
}
