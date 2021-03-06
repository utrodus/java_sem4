/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author utrodus
 */
public class KoinNu extends javax.swing.JFrame {

    /**
     * Creates new form KoinNu
     */
    CardLayout cardLayout;
    Statement pst;
    ResultSet rs;

    public KoinNu() {
        initComponents();
        this.setTitle("KOIN NU KOTA BLITAR");
        this.setLocationRelativeTo(null);
        cardLayout = (CardLayout) (cardpanel.getLayout());
//        JOptionPane.showMessageDialog(null, "Selamat Datang Di\n"
//                + "Koin Nu Kota Blitar");
        showTableTransaksi();
        showTableDashboard();
        getTotalTransaksi();
    }

    int totalTransaksi = 0;
    int totalTransaksiAwal = 0;
    int jumlahAwal = 0;
    int noIndex;

    public void resetField() {
        field_jumlah.setText("");
        field_kotakinfaq.setText("");
        field_tgl.setText("");
    }

    public void getTotalTransaksi() {
        int totalTransaksiBaru = 0;
        // Inisiasi Koneksi Database
        DBConnect dbconnect = new DBConnect();
        dbconnect.Connect();

        try {
            String sql = "SELECT jumlah FROM transaksi";
            pst = dbconnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            while (rs.next()) {
                totalTransaksiBaru += rs.getInt("jumlah");
            }
            System.out.println(totalTransaksiBaru);
            total.setText(String.valueOf(totalTransaksiBaru));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showTableDashboard() {

        // Inisiasi Koneksi Database
        DBConnect dbconnect = new DBConnect();
        dbconnect.Connect();

        try {
            String sql = "select * from transaksi";
            pst = dbconnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelDashboard.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void showTableTransaksi() {

        // Inisiasi Koneksi Database
        DBConnect dbconnect = new DBConnect();
        dbconnect.Connect();

        try {
            String sql = "select * from transaksi";
            pst = dbconnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            tabelTransaksi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void findByKecamatan(String kecamatan) {
        DBConnect dBConnect = new DBConnect();
        dBConnect.Connect();
        try {
            String sql = "SELECT * FROM transaksi WHERE kecamatan LIKE '" + kecamatan + "%'";
            pst = dBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelTransaksi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void findByJumlah(int jumlah) {
        DBConnect dBConnect = new DBConnect();
        dBConnect.Connect();
        try {
            String sql = "SELECT * FROM transaksi WHERE jumlah LIKE '" + jumlah + "%'";
            pst = dBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelTransaksi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void findByKotakInfaq(String kotakInfaq) {
        DBConnect dBConnect = new DBConnect();
        dBConnect.Connect();
        try {
            String sql = "SELECT * FROM transaksi WHERE kotakinfaq LIKE '" + kotakInfaq + "%'";
            pst = dBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelTransaksi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void findByTgl(String tgl) {
        DBConnect dBConnect = new DBConnect();
        dBConnect.Connect();
        try {
            String sql = "SELECT * FROM transaksi WHERE tgltransaksi LIKE '" + tgl + "%'";
            pst = dBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelTransaksi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
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

        sideBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addTransaksi = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        nama = new javax.swing.JLabel();
        createdBy = new javax.swing.JLabel();
        createdBy1 = new javax.swing.JLabel();
        cardpanel = new javax.swing.JPanel();
        panelcard1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDashboard = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        panelcard2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        field_jumlah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        field_kecamatan = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        field_kotakinfaq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        field_tgl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        ubah = new javax.swing.JButton();
        filter = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        resetFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 250, 249));

        sideBar.setBackground(new java.awt.Color(6, 150, 149));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pendataan Dana Infaq");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/assets/KOINNU.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lazisnu Kota Blitar");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(11, 134, 131));
        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        addTransaksi.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        addTransaksi.setForeground(new java.awt.Color(11, 134, 131));
        addTransaksi.setText("Data Transaksi");
        addTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransaksiActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        nama.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("Utrodus Said Al Baqi");

        createdBy.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        createdBy.setForeground(new java.awt.Color(255, 255, 255));
        createdBy.setText("Koin Nu Blitar Versi 1.0.0");

        createdBy1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        createdBy1.setForeground(new java.awt.Color(255, 255, 255));
        createdBy1.setText("Dibuat Oleh: ");

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jSeparator1)))
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(addTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createdBy)
                            .addComponent(createdBy1)
                            .addComponent(nama))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createdBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createdBy1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama)
                .addGap(33, 33, 33))
        );

        cardpanel.setLayout(new java.awt.CardLayout());

        panelcard1.setBackground(new java.awt.Color(247, 249, 251));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 190, 181));
        jLabel1.setText("Dashboard Koin Nu Kota Blitar");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/assets/kotakinfaq.png"))); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 13));

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Total Transaksi Saat Ini Sebesar :");

        total.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        total.setForeground(new java.awt.Color(0, 102, 102));
        total.setText("0");

        tabelDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kecamatan", "Jumlah Transaksi", "Nama Kotak Infaq", "Tanggal Transaksi", "Total Transaksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelDashboard);

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Data Detail Transaksi");

        total1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        total1.setForeground(new java.awt.Color(0, 102, 102));
        total1.setText("Rp.");

        javax.swing.GroupLayout panelcard1Layout = new javax.swing.GroupLayout(panelcard1);
        panelcard1.setLayout(panelcard1Layout);
        panelcard1Layout.setHorizontalGroup(
            panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcard1Layout.createSequentialGroup()
                .addGroup(panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelcard1Layout.createSequentialGroup()
                        .addGroup(panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelcard1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(panelcard1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(panelcard1Layout.createSequentialGroup()
                                        .addComponent(total1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(total))))
                            .addGroup(panelcard1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelcard1Layout.setVerticalGroup(
            panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcard1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total1)
                    .addComponent(total))
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        cardpanel.add(panelcard1, "panelcard1");

        panelcard2.setBackground(new java.awt.Color(247, 249, 251));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(61, 190, 181));
        jLabel4.setText("Tambah Data Transaksi Koin Nu Kota Blitar");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/assets/calculator.png"))); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 13));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Kecamatan");

        field_kecamatan.setBackground(new java.awt.Color(255, 255, 255));
        field_kecamatan.setForeground(new java.awt.Color(0, 153, 153));
        field_kecamatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kepanjenkidul", "Sananwetan", "Sukorejo" }));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Jumlah Transaksi");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Nama Kotak Infaq");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Tgl Transaksi (*tgl-bln-tahun)");

        simpan.setBackground(new java.awt.Color(22, 160, 133));
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Simpan Data");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        cari.setBackground(new java.awt.Color(0, 102, 204));
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/assets/search.png"))); // NOI18N
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/assets/delete.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kecamatan", "Jumlah Transaksi", "Nama Kotak Infaq", "Tanggal Transaksi", "Total Transaksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelTransaksi);

        ubah.setBackground(new java.awt.Color(230, 126, 34));
        ubah.setForeground(new java.awt.Color(255, 255, 255));
        ubah.setText("Ubah Data");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        filter.setBackground(new java.awt.Color(255, 255, 255));
        filter.setForeground(new java.awt.Color(0, 153, 153));
        filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kecamatan", "Jumlah Transaksi", "No Kotak Infaq", "Tgl Transaksi" }));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Filter Berdasarkan");

        resetFilter.setText("Reset Filter");
        resetFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelcard2Layout = new javax.swing.GroupLayout(panelcard2);
        panelcard2.setLayout(panelcard2Layout);
        panelcard2Layout.setHorizontalGroup(
            panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcard2Layout.createSequentialGroup()
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcard2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(panelcard2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelcard2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelcard2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
            .addGroup(panelcard2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcard2Layout.createSequentialGroup()
                            .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(simpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(field_jumlah))
                            .addGap(40, 40, 40))
                        .addGroup(panelcard2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(143, 143, 143)))
                    .addGroup(panelcard2Layout.createSequentialGroup()
                        .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(field_kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(field_kotakinfaq, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_tgl)
                    .addComponent(jLabel13)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelcard2Layout.setVerticalGroup(
            panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcard2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(field_kotakinfaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcard2Layout.createSequentialGroup()
                        .addGroup(panelcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filter)
                            .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(resetFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        cardpanel.add(panelcard2, "panelcard2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cardpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cardLayout.show(cardpanel, "panelcard1");
        getTotalTransaksi();
        showTableDashboard();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransaksiActionPerformed
        // TODO add your handling code here:
        cardLayout.show(cardpanel, "panelcard2");
        resetField();
    }//GEN-LAST:event_addTransaksiActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        Insert in = new Insert();
        String fieldKecamatan = String.valueOf(field_kecamatan.getSelectedItem());
        String fieldJumlah = field_jumlah.getText();
        String fieldTgl = field_tgl.getText();
        String fieldKotakInfaq = field_kotakinfaq.getText();

        // Cek Apakah Field masih ada yang kosong    
        if (!fieldJumlah.isEmpty() && !fieldTgl.isEmpty() && !fieldKotakInfaq.isEmpty()) {
            int jumlahTransaksi = Integer.parseInt(fieldJumlah);
            totalTransaksi += jumlahTransaksi;
            in.addData(fieldKecamatan, jumlahTransaksi, fieldKotakInfaq, fieldTgl, totalTransaksi);
            resetField();
            showTableTransaksi();
            getTotalTransaksi();
        } else {
            JOptionPane.showMessageDialog(null, "Form Masih Ada Yang Kosong!",
                    "Mohon Maaf !", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_simpanActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        switch (filter.getSelectedIndex()) {
            case 0:
                findByKecamatan(String.valueOf(field_kecamatan.getSelectedItem()));
                break;
            case 1:
                findByJumlah(Integer.valueOf(field_jumlah.getText()));
                break;
            case 2:
                findByKotakInfaq(field_kotakinfaq.getText());
                break;
            case 3:
                findByTgl(field_tgl.getText());
                break;

            default:
                break;
        }
    }//GEN-LAST:event_cariActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        Update up = new Update();
        String fieldKecamatan = String.valueOf(field_kecamatan.getSelectedItem());
        String fieldJumlah = field_jumlah.getText();
        String fieldTgl = field_tgl.getText();
        String fieldKotakInfaq = field_kotakinfaq.getText();

        // Cek Apakah Field masih ada yang kosong    
        if (!fieldJumlah.isEmpty() && !fieldTgl.isEmpty() && !fieldKotakInfaq.isEmpty()) {

            int jumlahTransaksi = Integer.parseInt(fieldJumlah);

            if (jumlahAwal == jumlahTransaksi) {
                totalTransaksi = totalTransaksiAwal;
            } else {
                if (jumlahTransaksi < jumlahAwal) {
                    totalTransaksi = totalTransaksi - jumlahAwal + jumlahTransaksi;

                } else if (jumlahTransaksi > jumlahAwal) {
                    totalTransaksi = totalTransaksi + jumlahTransaksi - jumlahAwal;

                }
            }

            up.updateAllData(noIndex, fieldKecamatan, jumlahTransaksi, fieldTgl, fieldKotakInfaq, totalTransaksi);
            resetField();
            showTableTransaksi();
            getTotalTransaksi();
        } else {
            JOptionPane.showMessageDialog(null, "Form Masih Ada Yang Kosong!",
                    "Mohon Maaf !", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ubahActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        Delete del = new Delete();
        Update up = new Update();

        int ubahtotalTransaksi = totalTransaksiAwal - jumlahAwal;
        up.updateTotal(noIndex, ubahtotalTransaksi);
        del.delete(noIndex);
        resetField();
        showTableTransaksi();
        getTotalTransaksi();
    }//GEN-LAST:event_deleteActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        // TODO add your handling code here:
        DBConnect dBConnect = new DBConnect();
        dBConnect.Connect();

        DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
        int selectRowIndex = tabelTransaksi.getSelectedRow();
        int id = (int) dtm.getValueAt(selectRowIndex, 0);
        try {
            String sql = "select * from transaksi where No like " + id;
            pst = dBConnect.con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {
                noIndex = rs.getInt("No");
                jumlahAwal = rs.getInt("jumlah");
                totalTransaksiAwal = rs.getInt("totalTransaksi");
                field_jumlah.setText(String.valueOf(rs.getInt("jumlah")));
                field_kotakinfaq.setText(rs.getString("kotakinfaq"));
                field_tgl.setText(rs.getString("tgltransaksi"));
                String kecamatan = rs.getString("kecamatan");
                if (kecamatan.equals("Kepanjenkidul")) {
                    field_kecamatan.setSelectedIndex(0);
                } else if (kecamatan.equals("Sananwetan")) {
                    field_kecamatan.setSelectedIndex(1);
                } else if (kecamatan.equals("Suklorejo")) {
                    field_kecamatan.setSelectedIndex(2);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void resetFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFilterActionPerformed
        // TODO add your handling code here:
        showTableTransaksi();
    }//GEN-LAST:event_resetFilterActionPerformed

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
            java.util.logging.Logger.getLogger(KoinNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KoinNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KoinNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KoinNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KoinNu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTransaksi;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JButton cari;
    private javax.swing.JLabel createdBy;
    private javax.swing.JLabel createdBy1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField field_jumlah;
    private javax.swing.JComboBox<String> field_kecamatan;
    private javax.swing.JTextField field_kotakinfaq;
    private javax.swing.JTextField field_tgl;
    private javax.swing.JComboBox<String> filter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nama;
    private javax.swing.JPanel panelcard1;
    private javax.swing.JPanel panelcard2;
    private javax.swing.JButton resetFilter;
    private javax.swing.JPanel sideBar;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelDashboard;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
