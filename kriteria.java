package javaswingdev.form;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaswingdev.card.ModelCard;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Kriteria extends javax.swing.JPanel {

    public Form_Kriteria() {
        initComponents();
        init();
        loadKriteria();
        Kosong();

    }

    private void init() {

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtBobot = new javax.swing.JTextField();
        CombLabel = new javax.swing.JComboBox<>();
        Kosong = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Bobot", "Label"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jLabel2.setText("Nama");

        jLabel3.setText("Bobot");

        jLabel4.setText("Label");

        CombLabel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benefit ", "Cost" }));

        Kosong.setText("Clear");
        Kosong.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Kosong.setMaximumSize(new java.awt.Dimension(0, 0));
        Kosong.setMinimumSize(new java.awt.Dimension(0, 0));
        Kosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KosongActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CombLabel, 0, 333, Short.MAX_VALUE)
                            .addComponent(txtBobot)
                            .addComponent(jLabel2)
                            .addComponent(txtId))
                        .addGap(93, 93, 93)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(Kosong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(txtId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBobot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kosong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CombLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try { // hapus data
            String sql = "delete from kriteria where id_kriteria ='" + txtId.getText() + "'";
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Data akan dihapus?");
//        databaru = true;
            txtNama.setText("");
            txtBobot.setText("");
            CombLabel.setSelectedItem("");
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
                    || txtBobot.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            }
            String sql = "insert into kriteria(nama,bobot,label) values('" + txtNama.getText() + "','" + txtBobot.getText() + "','" + CombLabel.getSelectedItem() + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "berhasil simpan");
            loadKriteria();
        } catch (Exception exc) {
            System.err.println(exc.getMessage());
        }
    }                                         

    private void KosongActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Kosong();
    }                                      

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        txtId.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        txtNama.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        txtBobot.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        CombLabel.setSelectedItem(table.getValueAt(table.getSelectedRow(), 3).toString());

        btnEdit.setEnabled(true);
        btnTambah.setEnabled(false);
        btnHapus.setEnabled(true);
//        txtNama.setText(table.getValueAt(table.getSelectedRow(),1).toString());
    }                                  

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();

            String update = "UPDATE kriteria set "
                    + "nama='" + txtNama.getText() + "', "
                    + "bobot='" + txtBobot.getText() + "', "
                    + "label='" + CombLabel.getSelectedItem() + "' "
//                    + "jk='" + inputJK.getSelectedItem() + "', "
                    + "WHERE id_kriteria='" + txtId.getText() + "'";
            st.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "BERHASIL DI EDIT");
            loadKriteria();
        } catch (Exception e) {
//    e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
    }                                       

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> CombLabel;
    private javax.swing.JButton Kosong;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.table.Table table;
    private javax.swing.JTextField txtBobot;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    // End of variables declaration                   
 private void loadKriteria() {
        try {
            Object[][] data = null;
            Object[] header = {"ID", "KRITERIA", "BOBOT", "LABEL"};
            DefaultTableModel model = new DefaultTableModel(data, header);
            table.setModel(model);

            //load data from DB
            Connection koneksi = Koneksi.Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            String query = "SELECT * FROM kriteria";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id_kriteria");
//                txt_IdKreteria.setText();
                String nama = rs.getString("nama");

                String bobot = rs.getString("bobot");

                String label = rs.getString("label");
                Object[] d = {id, nama, bobot, label};
                model.addRow(d);
            }
        } catch (Exception e) {

        }
        Kosong();
//        loadKriteria();
    }

    public void Kosong() {
        txtNama.setText(null);
        txtBobot.setText(null);
        CombLabel.setSelectedItem(null);
    }
}
