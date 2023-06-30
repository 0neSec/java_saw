package javaswingdev.form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaswingdev.card.ModelCard;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Alternatif extends javax.swing.JPanel {

    public Form_Alternatif() {
        initComponents();
        init();
        loadKriteria();
    }

    private void init() {
//        table.fixTable(jScrollPane1);
   

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();
        btnEdit = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKualitas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIso = new javax.swing.JTextField();
        btnResset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtResolusi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Deskripsi", "Harga", "Kualitas", "Berat", "Iso", "Resolusi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnEdit.setBackground(new java.awt.Color(255, 255, 102));
        btnEdit.setText("Edit ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(0, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Alteratif");

        txtNama.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNama.setMaximumSize(new java.awt.Dimension(0, 0));
        txtNama.setMinimumSize(new java.awt.Dimension(0, 0));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga");

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel6.setText("Kualitas");

        txtKualitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKualitasActionPerformed(evt);
            }
        });

        jLabel7.setText("Berat");

        txtBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeratActionPerformed(evt);
            }
        });

        jLabel8.setText("Iso");

        txtIso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsoActionPerformed(evt);
            }
        });

        btnResset.setText("Resset");
        btnResset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRessetActionPerformed(evt);
            }
        });

        jLabel9.setText("Resolusi");
        jLabel9.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel9.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(232, 232, 232))
                                    .addComponent(txtKualitas)
                                    .addComponent(txtHarga)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(0, 219, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(txtBerat)
                                    .addComponent(jLabel8)
                                    .addComponent(txtIso)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResolusi, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                        .addGap(25, 25, 25)))
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnResset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtResolusi)
                                    .addComponent(txtKualitas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA KRITERIA ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         try { // hapus data
            String sql = "delete from alternatif where id ='" + txtId.getText() + "'";
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Data akan dihapus?");
//        databaru = true;
            txtNama.setText("");
//            txtDeskripsi.setText("");
            txtHarga.setText("");
            txtKualitas.setText("");
            txtBerat.setText("");
            txtIso.setText("");
            txtResolusi.setText("");
            loadKriteria();
        } catch (SQLException exc) {
            System.err.println(exc.getMessage());
        }
    }                                        

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            if (txtNama.getText().equals("")
                    ||txtHarga.getText().equals("")||
                    txtKualitas.getText().equals("")||
                    txtBerat.getText().equals("")||
                    txtIso.getText().equals("")||
                    txtResolusi.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            }
            String sql = "insert into alternatif(id,nama,harga,kualitas,berat,iso,resolusi) "
                    + "values('"+ txtId.getText() + "',"
                    + "'" + txtNama.getText() + "',"
                    + "'" + txtHarga.getText() + "',"
                    + "'" + txtKualitas.getText() + "',"
                    + "'" + txtBerat.getText() + "',"
                    + "'" + txtIso.getText() + "',"
                    + "'" + txtResolusi.getText() + "'"
                    +")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "berhasil simpan");
            loadKriteria();
        } catch (Exception exc) {
            System.err.println(exc.getMessage());
        }
        
    }                                         

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        txtId.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        txtNama.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        txtHarga.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        txtKualitas.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        txtBerat.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        txtIso.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        txtResolusi.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
        
        btnEdit.setEnabled(true);
        btnTambah.setEnabled(false);
        btnHapus.setEnabled(true);
    }                                  

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtKualitasActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtIsoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void txtBeratActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            String update = "UPDATE alternatif set "
                    + "nama='" + txtNama.getText()+ "', "
                    + "harga='" + txtHarga.getText() + "', "
                    + "kualitas='" + txtKualitas.getText() + "', "
                    + "berat='" + txtBerat.getText() + "', "
                    + "iso='" + txtIso.getText() + "', "
                    + "resolusi='" + txtResolusi.getText() + "'"
                    + "WHERE id='" + txtId.getText() + "'";
            st.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "BERHASIL DI EDIT");
            loadKriteria();
        } catch (Exception e) {
//    e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
    }                                       

    private void btnRessetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Kosong();
    }                                         

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnResset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.table.Table table;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIso;
    private javax.swing.JTextField txtKualitas;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtResolusi;
    // End of variables declaration                   
 private void loadKriteria() {
             try {
            Object[][] data = null;
            Object[] header = {"ID", "NAMA", "HARGA", "KUALITAS", "BERAT", "ISO", "RESOLUSI"};
            DefaultTableModel model = new DefaultTableModel(data, header);
            table.setModel(model);
            //load data from DB
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            String query = "SELECT * FROM alternatif";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
//                String des = rs.getString("deskripsi");
                String harga = rs.getString("harga");
                String kualitas = rs.getString("kualitas");
                String berat = rs.getString("berat");
                String iso = rs.getString("iso");
                String Resolusi = rs.getString("Resolusi");
//                String keawetan = rs.getString("keawetan");
                Object[] d = {id, nama, harga, kualitas, berat, iso, Resolusi};
                model.addRow(d);
            }
        } catch (Exception e) {
      }
    }
  public void Kosong() {
      txtId.setText(null);
        txtNama.setText(null);
        txtHarga.setText(null);
        txtKualitas.setText(null);
        txtBerat.setText(null);
        txtIso.setText(null);
        txtResolusi.setText(null);
    }
}


