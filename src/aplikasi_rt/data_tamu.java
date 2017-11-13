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
 * @author Rohman Rhido
 */
public class data_tamu extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;

    String idGet = ""; //buat edit
    
    /**
     * Creates new form Data_Tamu
     */
    public data_tamu() throws SQLException {
        initComponents();
        //buat koneksi
        Aplikasi_rt DB = new Aplikasi_rt();
        DB.config();
        con = DB.con;
        stat = DB.stm;
    
        bikin_table();        
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(false);
        btnubah.setEnabled(false);
        btnbatal.setEnabled(false);
        tid.setEnabled(false);
        tnokk.setEnabled(false);
        tnik.setEnabled(false);
        tnama.setEnabled(false);
        talamat.setEnabled(false);
        trt.setEnabled(false);
        trw.setEnabled(false);
        tdesa.setEnabled(false);
        tkec.setEnabled(false);
        tkab.setEnabled(false);
        tpro.setEnabled(false);
        bpilih.setEnabled(false);
        tsemen.setEnabled(false);
        tart.setEnabled(false);
        tarw.setEnabled(false);
        tadesa.setEnabled(false);
        takec.setEnabled(false);
        takab.setEnabled(false);
        tapro.setEnabled(false);
        tprumah.setEnabled(false);
        tpnik.setEnabled(false);
        tpalamat.setEnabled(false);
        tprt.setEnabled(false);
        tprw.setEnabled(false);
        tpdesa.setEnabled(false);
        tpkec.setEnabled(false);
        tpkab.setEnabled(false);
        tppro.setEnabled(false);
    }

    private void kode_otomatis(String kd)
    {
       try {
            sql="select * from data_tamu order by id desc";
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
    
    public void tampil1(){
        btntambah.setEnabled(false);
        btnsimpan.setEnabled(true);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(false);
        btnubah.setEnabled(false);
        btnbatal.setEnabled(true);
        tid.setEnabled(false);
        tnokk.setEnabled(true);
        tnik.setEnabled(true);
        tnama.setEnabled(true);
        talamat.setEnabled(true);
        trt.setEnabled(true);
        trw.setEnabled(true);
        tdesa.setEnabled(true);
        tkec.setEnabled(true);
        tkab.setEnabled(true);
        tpro.setEnabled(true);
        bpilih.setEnabled(true);
        tsemen.setEnabled(true);
        tart.setEnabled(true);
        tarw.setEnabled(true);
        tadesa.setEnabled(true);
        takec.setEnabled(true);
        takab.setEnabled(true);
        tapro.setEnabled(true);
        tprumah.setEnabled(true);
        tpnik.setEnabled(true);
        tpalamat.setEnabled(true);
        tprt.setEnabled(true);
        tprw.setEnabled(true);
        tpdesa.setEnabled(true);
        tpkec.setEnabled(true);
        tpkab.setEnabled(true);
        tppro.setEnabled(true);
        
    }

    public void tampil2(){
        btntambah.setEnabled(false);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(false);
        btnubah.setEnabled(false);
        btnbatal.setEnabled(true);
        tid.setEnabled(false);
        tnokk.setEnabled(true);
        tnik.setEnabled(true);
        tnama.setEnabled(true);
        talamat.setEnabled(true);
        trt.setEnabled(true);
        trw.setEnabled(true);
        tdesa.setEnabled(true);
        tkec.setEnabled(true);
        tkab.setEnabled(true);
        tpro.setEnabled(true);
        bpilih.setEnabled(true);
        tsemen.setEnabled(true);
        tart.setEnabled(true);
        tarw.setEnabled(true);
        tadesa.setEnabled(true);
        takec.setEnabled(true);
        takab.setEnabled(true);
        tapro.setEnabled(true);
        tprumah.setEnabled(true);
        tpnik.setEnabled(true);
        tpalamat.setEnabled(true);
        tprt.setEnabled(true);
        tprw.setEnabled(true);
        tpdesa.setEnabled(true);
        tpkec.setEnabled(true);
        tpkab.setEnabled(true);
        tppro.setEnabled(true);
        
    }
    public void tampil3(){
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(false);
        btnubah.setEnabled(false);
        btnbatal.setEnabled(false);
        tid.setEnabled(false);
        tnokk.setEnabled(true);
        tnik.setEnabled(true);
        tnama.setEnabled(true);
        talamat.setEnabled(true);
        trt.setEnabled(true);
        trw.setEnabled(true);
        tdesa.setEnabled(true);
        tkec.setEnabled(true);
        tkab.setEnabled(true);
        tpro.setEnabled(true);
        bpilih.setEnabled(true);
        tsemen.setEnabled(true);
        tart.setEnabled(true);
        tarw.setEnabled(true);
        tadesa.setEnabled(true);
        takec.setEnabled(true);
        takab.setEnabled(true);
        tapro.setEnabled(true);
        tprumah.setEnabled(true);
        tpnik.setEnabled(true);
        tpalamat.setEnabled(true);
        tprt.setEnabled(true);
        tprw.setEnabled(true);
        tpdesa.setEnabled(true);
        tpkec.setEnabled(true);
        tpkab.setEnabled(true);
        tppro.setEnabled(true);
        
    }

    public void baru(){
        tid.setEnabled(false);
        tnokk.setText("");
        tnik.setText("");
        tnama.setText("");
        talamat.setText("");
        trt.setText("");
        trw.setText("");
        tdesa.setText("");
        tkec.setText("");
        tkab.setText("");
        tpro.setText("");
        bpilih.setSelectedIndex(0);
        tsemen.setText("");
        tart.setText("");
        tarw.setText("");
        tadesa.setText("");
        takec.setText("");
        takab.setText("");
        tapro.setText("");
        tprumah.setText("");
        tpnik.setText("");
        tpalamat.setText("");
        tprt.setText("");
        tprw.setText("");
        tpdesa.setText("");
        tpkec.setText("");
        tpkab.setText("");
        tppro.setText("");
        
    }

    public void ubah(){
        tid.setEnabled(false);
        tnokk.setEnabled(true);
        tnik.setEnabled(true);
        tnama.setEnabled(true);
        talamat.setEnabled(true);
        trt.setEnabled(true);
        trw.setEnabled(true);
        tdesa.setEnabled(true);
        tkec.setEnabled(true);
        tkab.setEnabled(true);
        tpro.setEnabled(true);
        bpilih.setEnabled(true);
        tsemen.setEnabled(true);
        tart.setEnabled(true);
        tarw.setEnabled(true);
        tadesa.setEnabled(true);
        takec.setEnabled(true);
        takab.setEnabled(true);
        tapro.setEnabled(true);
        tprumah.setEnabled(true);
        tpnik.setEnabled(true);
        tpalamat.setEnabled(true);
        tprt.setEnabled(true);
        tprw.setEnabled(true);
        tpdesa.setEnabled(true);
        tpkec.setEnabled(true);
        tpkab.setEnabled(true);
        tppro.setEnabled(true);
        
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
            sql = "select * from data_penduduk where id like '%"+ id +"%' or nama like '%"+ id +"%' or harga like '%"+ id +"%' order by id asc";
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tnik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tnokk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tsemen = new javax.swing.JTextField();
        trt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        trw = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tdesa = new javax.swing.JTextField();
        tkec = new javax.swing.JTextField();
        tkab = new javax.swing.JTextField();
        tpro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bpilih = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        takec = new javax.swing.JTextField();
        tadesa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tapro = new javax.swing.JTextField();
        takab = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tprumah = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tpnik = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tpalamat = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tpkec = new javax.swing.JTextField();
        tpdesa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tppro = new javax.swing.JTextField();
        tpkab = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tart = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tarw = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tprt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tprw = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        tid = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Permohonan Surat Keterangan Tinggal Sementara");

        jLabel3.setText("Nama Lengkap");

        jLabel4.setText("Nik");

        jLabel6.setText("No Kartu Keluarga");

        tnokk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnokkActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat");

        jLabel8.setText("Rt");

        jLabel9.setText("Rw");

        jLabel10.setText("Desa / Kel");

        jLabel11.setText("Kecamatan");

        jLabel12.setText("Kab / Kota");

        jLabel13.setText("Propinsi");

        jLabel2.setText("Alasan Tinggal Sementara");

        bpilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Bekerja/Mencari Keja", "Belajar/Pendidikan/ Wirasuasta", "Lain-lain" }));

        jLabel5.setText("Alamat Untuk Tinggal Sementara");

        jLabel14.setText("Desa / Kel");

        jLabel15.setText("Kecamatan");

        jLabel16.setText("Kab / Kota");

        jLabel17.setText("Propinsi");

        jLabel18.setText("Nama Pemilik Rumah");

        jLabel19.setText("Nik Pemilik Rumah");

        tpnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpnikActionPerformed(evt);
            }
        });

        jLabel20.setText("Alamat Pemilik Rumah");

        jLabel21.setText("Desa / Kel");

        jLabel22.setText("Kecamatan");

        jLabel23.setText("Kab / Kota");

        jLabel24.setText("Propinsi");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Nama Dan Nik Anggota Keluarga Yang Ikut Tinggal Sementara");

        jLabel26.setText("Rt");

        jLabel27.setText("Rw");

        jLabel28.setText("Rt");

        jLabel29.setText("Rw");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnubah.setText("Update");

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

        jLabel30.setText("Cari");

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(48, 48, 48)
                                    .addComponent(bpilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tsemen, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tdesa, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tkec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tkab, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(tpro)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tnokk)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(28, 28, 28)
                                                .addComponent(trt, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addGap(28, 28, 28)
                                                .addComponent(trw, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(151, 151, 151))
                                            .addComponent(tnik, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tnama)
                                            .addComponent(talamat)
                                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel21))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tpdesa, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tpkec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tpkab)
                                            .addComponent(tppro)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(tprumah))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(30, 30, 30)
                                        .addComponent(tpnik, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tprt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tprw, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tpalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btntambah)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnbatal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnsimpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnhapus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnedit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnubah)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tcari))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tadesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(takec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(takab, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tapro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tart, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel27)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tarw, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tnokk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(trt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(tdesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(tkec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tkab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tsemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(tart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(tadesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(takec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(takab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tapro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntambah)
                            .addComponent(btnbatal)
                            .addComponent(btnsimpan)
                            .addComponent(btnhapus)
                            .addComponent(btnedit)
                            .addComponent(btnubah)
                            .addComponent(jLabel30)
                            .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(tprumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(tpnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tpalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tprw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(tprt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(tpdesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpkab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(tpkec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(tppro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnokkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnokkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnokkActionPerformed

    private void tpnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpnikActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int baris = table1.rowAtPoint(evt.getPoint());
        String nama =table1.getValueAt(baris, 0).toString();
        String alamat =table1.getValueAt(baris, 1).toString();
        tid.setEnabled(false);
        tnama.setText(nama);
        talamat.setText(alamat);
        btntambah.setEnabled(false);
        btnbatal.setEnabled(false);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(true);
        btnubah.setEnabled(true);
                                   
    }//GEN-LAST:event_table1MouseClicked

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        tampil1();
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        baru();
        tampil3();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void tcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyPressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //System.out.println("enter");
            load_table(tcari.getText());
        }
    }//GEN-LAST:event_tcariKeyPressed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        ubah();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
            sql = "INSERT INTO data_tamu (id, dtnama, dtnik, dtnokk, dtalamat, dtrt, dtrw, dtdesa, dtkel, dtkeb, dtpro, dtalasan,, dtsalamat, dtsrt, dtsrw, dtsdesa,, dtskec, dtskab,, dtspro,, dtsnik, dtpnama, dtpnik, dtpalamat, dtprt, dtprw, dtpdesa, dtpkec, dtpkab, dtppro ) values "
                    + "('"+tid.getText()+"', '"+tnama.getText()+"', '"+tnik.getText()+"', '"+tnokk.getText()+"', '"+talamat.getText()+"', '"+trt.getText()+"', '"+trw.getText()+"', '"+tdesa.getText()+"', '"+tkec.getText()+"', '"+tkab.getText()+"','"+tpro.getText()+"','"+bpilih.getSelectedItem()+"','"+tsemen.getText()+"','"+tart.getText()+"', '"+tarw.getText()+"', '"+tadesa.getText()+"', '"+takec.getText()+"', '"+takab.getText()+"', '"+tapro.getText()+"', '"+tprumah.getText()+"', '"+tpnik.getText()+"', '"+tpalamat.getText()+"', '"+tprt.getText()+"', '"+tprw.getText()+"', '"+tpdesa.getText()+"', '"+tpkec.getText()+"', '"+tpkab.getText()+"', '"+tppro.getText()+"' )";
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Sukses simpan data baru.");
            baru();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(data_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new data_tamu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(data_tamu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bpilih;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tadesa;
    private javax.swing.JTextField takab;
    private javax.swing.JTextField takec;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tapro;
    private javax.swing.JTextField tart;
    private javax.swing.JTextField tarw;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tdesa;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tkab;
    private javax.swing.JTextField tkec;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnik;
    private javax.swing.JTextField tnokk;
    private javax.swing.JTextField tpalamat;
    private javax.swing.JTextField tpdesa;
    private javax.swing.JTextField tpkab;
    private javax.swing.JTextField tpkec;
    private javax.swing.JTextField tpnik;
    private javax.swing.JTextField tppro;
    private javax.swing.JTextField tpro;
    private javax.swing.JTextField tprt;
    private javax.swing.JTextField tprumah;
    private javax.swing.JTextField tprw;
    private javax.swing.JTextField trt;
    private javax.swing.JTextField trw;
    private javax.swing.JTextField tsemen;
    // End of variables declaration//GEN-END:variables
}
