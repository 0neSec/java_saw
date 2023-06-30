package javaswingdev.form;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.card.ModelCard;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Normalisasi extends javax.swing.JPanel {

       DefaultTableModel tblNormalisasi;
       DefaultTableModel tblHasil;
    public Form_Normalisasi(){
        initComponents();
        init();
        tblNormalisasi();

    }

    private void init() {
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNormalisasi = new javax.swing.JTable();
        btnNormalisasi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelHasil = new javax.swing.JTable();
        btnHasil = new javax.swing.JButton();
        btnKesimpulan = new javax.swing.JButton();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        tableNormalisasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(tableNormalisasi);

        btnNormalisasi.setText("Normalisasi");
        btnNormalisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalisasiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA KRITERIA ");

        tabelHasil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelHasil);

        btnHasil.setText("Hasil");
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });

        btnKesimpulan.setText("Kesimpulan");
        btnKesimpulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKesimpulanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNormalisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnKesimpulan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnNormalisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHasil, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnKesimpulan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void btnNormalisasiActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        normalisasi();
    }                                              

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        cariperingkat();
    }                                        

    private void btnKesimpulanActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        kesimpulan kesimpulan_ = new kesimpulan();
        kesimpulan_.setVisible(true);
    }                                             

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnKesimpulan;
    private javax.swing.JButton btnNormalisasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javax.swing.JTable tabelHasil;
    private javax.swing.JTable tableNormalisasi;
    // End of variables declaration                   
    public  void tblNormalisasi(){
       tblNormalisasi = new DefaultTableModel();
       tblNormalisasi.addColumn("Id");
       tblNormalisasi.addColumn("nama");
       tblNormalisasi.addColumn("Harga");
       tblNormalisasi.addColumn("Kualitas");
       tblNormalisasi.addColumn("Berat");      
       tblNormalisasi.addColumn("iso");
       tblNormalisasi.addColumn("resolusi");
       tableNormalisasi.setModel(tblNormalisasi);
    }
    public void tabelmodelHasil(){
        try {
            tblHasil = new DefaultTableModel();
            tblHasil.addColumn("Nama");
            tblHasil.addColumn("Hasil");
            
            tabelHasil.setModel(tblHasil);
            Connection c = Koneksi.Koneksi.konekKeDB();
        Statement st = c.createStatement();
        String ambilData = "SELECT * FROM tbl_hasil ORDER BY hasil desc";
        ResultSet res = st.executeQuery(ambilData);
             while (res.next()){
                tblHasil.addRow(new Object[]{res.getString(1),res.getString(2)}); 
                     }
        } catch (SQLException ex) {
            Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     
    public void normalisasi() {
    LinkedList<Float> max = new LinkedList<Float>();
    LinkedList<Float> MIN = new LinkedList<Float>();
    
    try {
        Connection c = Koneksi.Koneksi.konekKeDB();
        Statement st = c.createStatement();
        
        String ambilData = "SELECT MIN(harga), MAX(kualitas), MIN(berat), MAX(iso), MAX(resolusi) FROM alternatif";
        ResultSet res = st.executeQuery(ambilData);
        while (res.next()) {
            max.add(res.getFloat(1));
            max.add(res.getFloat(2));
            max.add(res.getFloat(3));
            max.add(res.getFloat(4));
            max.add(res.getFloat(5));
        }
        
        String ambilData2 = "SELECT * FROM alternatif";
        ResultSet res2 = st.executeQuery(ambilData2);
        tblNormalisasi();
        while (res2.next()) {
            tblNormalisasi.addRow(new Object[]{
                res2.getString(1),
                res2.getString(2),
                (max.get(0)/res2.getFloat(3)  ),
                (res2.getFloat(4) / max.get(1)),
                (max.get(2)/res2.getFloat(5)),
                (res2.getFloat(6) / max.get(3)),
                (res2.getFloat(7) / max.get(4))});
        }
    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(this, ex);
 ex.printStackTrace();
    }
}

         public void cariperingkat(){
        try{
            LinkedList mm = new LinkedList();
            Connection c = Koneksi.Koneksi.konekKeDB();
            Statement st = c.createStatement();
             String ambilData ="SELECT * FROM tbl_bobot";
             ResultSet res3 = st.executeQuery(ambilData);
            tabelmodelHasil();

            while (res3.next()){
                 mm.add(res3.getString(1));
                 mm.add(res3.getString(2));
                 mm.add(res3.getString(3));
                 mm.add(res3.getString(4));
                 mm.add(res3.getString(5));
            }
            for (int t = 0; t < tableNormalisasi.getRowCount(); t++) {
                String sql = "DELETE FROM tbl_hasil WHERE nama = nama";
                st.executeUpdate(sql);
            }
            for (int x = 0; x < tableNormalisasi.getRowCount(); x++){
                double r1;
                double r2;
                double r3;
                double r4;
                double r5;
                double w;
                
                r1 = (Float.valueOf(tableNormalisasi.getValueAt(x,2).toString())*Float.valueOf(mm.get(0).toString()));
                r2=(Float.valueOf(tableNormalisasi.getValueAt(x, 3).toString())*Float.valueOf(mm.get(1).toString()));
                r3=(Float.valueOf(tableNormalisasi.getValueAt(x, 4).toString())*Float.valueOf(mm.get(2).toString()));
                r4=(Float.valueOf(tableNormalisasi.getValueAt(x, 5).toString())*Float.valueOf(mm.get(3).toString()));
                r5=(Float.valueOf(tableNormalisasi.getValueAt(x, 6).toString())*Float.valueOf(mm.get(4).toString()));
                w = r1+r2+r3+r4+r5;
                
                String sql = "insert into tbl_hasil (nama,hasil) values"+"(  '"+tableNormalisasi.getValueAt(x, 1).toString()+"' , "+" '"+w+"' )";
                st.executeUpdate(sql);
            }
            tblNormalisasi();
        } catch (SQLException ex){
//            JOptionPane.showMessageDialog(this, ex);
 ex.printStackTrace();
        }
    }
}
