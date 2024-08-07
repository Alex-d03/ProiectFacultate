package pc_shop;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;


public class PCJFrame extends javax.swing.JFrame {
    public PCJFrame() {
        initComponents();
        jTextField1.setEnabled(false);
        jPasswordField1.setEnabled(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jTable1.setVisible(false);
        jComboBox2.setVisible(false);
        jLabel4.setVisible(false);
        jComboBox3.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
        jTextField13.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jLabel6.setVisible(false);
        jTextField14.setVisible(false);
        jButton5.setVisible(false);
        jTable2.setVisible(false);
        jTextField15.setVisible(false);
        jLabel7.setVisible(false);
        jButton6.setVisible(false);
        jLabel8.setVisible(false);
        jTextField16.setVisible(false);
        jTextField17.setVisible(false);
        jTextField18.setVisible(false);
        jTextField19.setVisible(false);
        jTextField20.setVisible(false);
        jTextField21.setVisible(false);
        jTextField22.setVisible(false);
        jButton7.setVisible(false);
        jLabel9.setVisible(false);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.gray);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Autentificare User ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Specified", "Administrator", "User", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Username");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("Password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Welcome.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("-");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Select Table View ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Specified", "Monitor", "Placa de Baza", "Placa Video", "Card de Memorie", "Solid State Drive", "Procesor", "Sursa" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Manager");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Specified", "Add", "Update", "Delete" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("ID");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Nume");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Pret");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Col4");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Col5");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Col6");
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Col7");
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Col8");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Col9");
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Col10");
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Col11");
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Col12");
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Search");

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Term");
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Filter by");

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Search");
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15KeyReleased(evt);
            }
        });

        jButton6.setText("Ok");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Configuration");

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Monitor");
        jTextField16.setAutoscrolls(false);
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Placa de Baza");
        jTextField17.setAutoscrolls(false);
        jTextField17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField17FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField17FocusLost(evt);
            }
        });

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Placa Video");
        jTextField18.setAutoscrolls(false);
        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField18FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField18FocusLost(evt);
            }
        });

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("Card de Memorie");
        jTextField19.setAutoscrolls(false);
        jTextField19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField19FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField19FocusLost(evt);
            }
        });

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Solid State Drive");
        jTextField20.setAutoscrolls(false);
        jTextField20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField20FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField20FocusLost(evt);
            }
        });

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("Procesor");
        jTextField21.setAutoscrolls(false);
        jTextField21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField21FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField21FocusLost(evt);
            }
        });

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("Sursa");
        jTextField22.setAutoscrolls(false);
        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField22FocusLost(evt);
            }
        });

        jButton7.setText("Check");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField14))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTextField22)
                            .addComponent(jTextField21)
                            .addComponent(jTextField20)
                            .addComponent(jTextField19)
                            .addComponent(jTextField18)
                            .addComponent(jTextField16)
                            .addComponent(jTextField17))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(jTextField6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(jTextField11)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(jTextField7)
                                            .addComponent(jTextField9))))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel9))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Administrator")){
           jTextField1.setEnabled(true);
           jPasswordField1.setEnabled(true);
           
        }
        else if(jComboBox1.getSelectedItem().equals("User")){
           jTextField1.setEnabled(true);
           jPasswordField1.setEnabled(true);
        }
        else{
            jTextField1.setEnabled(false);
            jPasswordField1.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Username")){
            jTextField1.setText("");
            jTextField1.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().equals("")){
            jTextField1.setText("Username");
            jTextField1.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
            
                if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT username,passcode FROM userlog WHERE iduserlog='"+'1'+"';");
                    while(result.next()){
                        String username=result.getString("username");
                        String password=result.getString("passcode");
                        if(jTextField1.getText().toLowerCase()!=null && jPasswordField1.getText()!=null){
                            if(jTextField1.getText().toLowerCase().equals(username)&&jPasswordField1.getText().equals(password)){
                                System.out.println("Successful");
                                jTextField1.setText("");
                                jPasswordField1.setText("");
                                jLabel2.setVisible(true);
                                jLabel3.setText(username.toUpperCase());
                                jLabel3.setVisible(true);
                                jComboBox2.setVisible(true);
                                jLabel4.setVisible(true);
                                
                                
                                
                                
                               
                                
                            } 
                        }else if(jTextField1.getText().isEmpty()&&jPasswordField1.getText().isEmpty()){
                            return;
                        }
                    }
                }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT username,passcode FROM userlog WHERE iduserlog='"+'2'+"';");
                    while(result.next()){
                        String username=result.getString("username");
                        String password=result.getString("passcode");
                        if(jTextField1.getText().toLowerCase()!=null && jPasswordField1.getText()!=null){
                            if(jTextField1.getText().toLowerCase().equals(username)&&jPasswordField1.getText().equals(password)){
                                System.out.println("Successful");
                                jTextField1.setText("");
                                jPasswordField1.setText("");
                                jLabel3.setVisible(true);
                                jLabel2.setVisible(true);
                                jLabel3.setText(username.toUpperCase());
                                jLabel4.setVisible(true);
                                jComboBox2.setVisible(true);
                             
                            } 
                            
                        }else if(jTextField1.getText().isEmpty()&&jPasswordField1.getText().isEmpty()){
                            return;
                        }
                        
                    }
                }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if(jPasswordField1.getText().equals("Password")){
            jPasswordField1.setText("");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
         if(jPasswordField1.getText().equals("")){
            jPasswordField1.setText("Password");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
            jComboBox3.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jTextField14.setVisible(false);
            jButton5.setVisible(false);
            jTable2.setVisible(false);
            jTextField15.setVisible(false);
            jLabel7.setVisible(false);
            jButton6.setVisible(false);
            jLabel5.setVisible(false);
            jComboBox3.setVisible(false);
            
            
                if(jComboBox2.getSelectedItem().equals("Monitor")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                    }
                    
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM monitor");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idmonitor");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("tehnologie");
                    table.addColumn("putere consumata");
                    table.addColumn("diagonala");
                    table.addColumn("tip rezolutie");
                    table.addColumn("rezolutie optima");
                    table.addColumn("aspect");
                    table.addColumn("timp de raspuns");
                    table.addColumn("refresh rate");
                    table.addColumn("iluminare fundal");
                
                
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11),result.getString(12)});
                    }
                
                
                
                }else if(jComboBox2.getSelectedItem().equals("Placa de Baza")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                    }
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM placa_de_baza");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idmotherboard");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("socket");
                    table.addColumn("memorie");
                    table.addColumn("capacitate");
                    table.addColumn("frecventa");
                    table.addColumn("suport dualchannel");
                    table.addColumn("audio integrat");
                    table.addColumn("lan integrat");
                    table.addColumn("format");
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11)});
                      
                    }
                
                
                }else if(jComboBox2.getSelectedItem().equals("Placa Video")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                    }
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM placa_video");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idvideocard");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("slot");
                    table.addColumn("tip");
                    table.addColumn("frecventa");
                    table.addColumn("capacitate");
                    table.addColumn("bus");
                    table.addColumn("chipset video");
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9)});
                      
                    }
               
            
                }else if(jComboBox2.getSelectedItem().equals("Card de Memorie")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                    }
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM card_de_memorie");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idmemorie");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("tip");
                    table.addColumn("capacitate");
                    table.addColumn("frecventa");
                    table.addColumn("suport dualchannel");
                    table.addColumn("voltaj");
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                    }
               
            
                }else if(jComboBox2.getSelectedItem().equals("Solid State Drive")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                    }
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM solid_state_drive");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idssd");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("capacitate");
                    table.addColumn("tip");
                    table.addColumn("transfer citire");
                    table.addColumn("transfer scriere");
                    table.addColumn("interfata");
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                    }
               
                
                
                }else if(jComboBox2.getSelectedItem().equals("Procesor")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                    }
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM procesor");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idprocesor");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("socket");
                    table.addColumn("cache");
                    table.addColumn("frecventa");
                    table.addColumn("nuclee");
                    table.addColumn("threads");
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                    }
                
                
                }else if(jComboBox2.getSelectedItem().equals("Sursa")){
                    jTable1.setVisible(true);
                    jLabel6.setVisible(true);
                    jTextField14.setVisible(true);
                    jButton5.setVisible(true);
                    jTable2.setVisible(true);
                    jTextField15.setVisible(true);
                    jLabel7.setVisible(true);
                    jButton6.setVisible(true);
                    if(jComboBox1.getSelectedItem().toString().equals("Administrator")){
                        jLabel5.setVisible(true);
                        jComboBox3.setVisible(true);
                                
                    }else if(jComboBox1.getSelectedItem().toString().equals("User")){
                        jLabel8.setVisible(true);
                        jTextField16.setVisible(true);
                        jTextField17.setVisible(true);
                        jTextField18.setVisible(true);
                        jTextField19.setVisible(true);
                        jTextField20.setVisible(true);
                        jTextField21.setVisible(true);
                        jTextField22.setVisible(true);
                        jButton7.setVisible(true);
                        jLabel9.setVisible(true);
                        
                        
                        
                    }
                    Statement state=con.createStatement();
                    ResultSet result=state.executeQuery("SELECT * FROM sursa");
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    table.addColumn("idsursa");
                    table.addColumn("nume");
                    table.addColumn("pret");
                    table.addColumn("putere");
                    table.addColumn("alimentare");
                    table.addColumn("conectori");
                    table.addColumn("format");
                    while(result.next()){
                        table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7)});
                      
                    }
                }
                if(jComboBox2.getSelectedItem().equals("Not Specified")){
                    jTable1.setVisible(false);
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                    jTextField12.setVisible(false);
                    jTextField13.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                    table.setRowCount(0);
                    table.setColumnCount(0);
                    jComboBox3.setVisible(false);
                    jLabel5.setVisible(false);
                    jButton4.setVisible(false);
                    jLabel6.setVisible(false);
                    jTextField14.setVisible(false);
                    jButton5.setVisible(false);
                    jTable2.setVisible(false);
                    jTextField15.setVisible(false);
                    jLabel7.setVisible(false);
                    jButton6.setVisible(false);
                    jComboBox3.setVisible(false);
                    jLabel5.setVisible(false);
                    jTextField16.setVisible(false);
                    jTextField17.setVisible(false);
                    jTextField18.setVisible(false);
                    jTextField19.setVisible(false);
                    jTextField20.setVisible(false);
                    jTextField21.setVisible(false);
                    jTextField22.setVisible(false);
                    jButton7.setVisible(false);
                    jLabel9.setVisible(false);
                    jLabel8.setVisible(false);
                }
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if(jTextField2.getText().equals("ID")){
            jTextField2.setText("");
            jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(jTextField2.getText().equals("")){
            jTextField2.setText("Username");
            jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if(jTextField3.getText().equals("Nume")){
            jTextField3.setText("");
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().equals("")){
            jTextField3.setText("Nume");
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        if(jTextField4.getText().equals("Pret")){
            jTextField4.setText("");
            jTextField4.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if(jTextField4.getText().equals("")){
            jTextField4.setText("Pret");
            jTextField4.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        if(jTextField5.getText().equals("Col4")){
            jTextField5.setText("");
            jTextField5.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        if(jTextField5.getText().equals("")){
            jTextField5.setText("Col4");
            jTextField5.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        if(jTextField6.getText().equals("Col5")){
            jTextField6.setText("");
            jTextField6.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        if(jTextField6.getText().equals("")){
            jTextField6.setText("Col5");
            jTextField6.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        if(jTextField7.getText().equals("Col6")){
            jTextField7.setText("");
            jTextField7.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        if(jTextField7.getText().equals("")){
            jTextField7.setText("Col6");
            jTextField7.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        if(jTextField8.getText().equals("Col7")){
            jTextField8.setText("");
            jTextField8.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        if(jTextField8.getText().equals("")){
            jTextField8.setText("Col7");
            jTextField8.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        if(jTextField9.getText().equals("Col8")){
            jTextField9.setText("");
            jTextField9.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        if(jTextField9.getText().equals("")){
            jTextField9.setText("Col8");
            jTextField9.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        if(jTextField10.getText().equals("Col9")){
            jTextField10.setText("");
            jTextField10.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        if(jTextField10.getText().equals("")){
            jTextField10.setText("Col9");
            jTextField10.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        if(jTextField11.getText().equals("Col10")){
            jTextField11.setText("");
            jTextField11.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        if(jTextField11.getText().equals("")){
            jTextField11.setText("Col10");
            jTextField11.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        if(jTextField12.getText().equals("Col11")){
            jTextField12.setText("");
            jTextField12.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField12FocusGained

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
        if(jTextField12.getText().equals("")){
            jTextField12.setText("Col11");
            jTextField12.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        if(jTextField13.getText().equals("Col12")){
            jTextField13.setText("");
            jTextField13.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        if(jTextField13.getText().equals("")){
            jTextField13.setText("Col12");
            jTextField13.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField13FocusLost

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                    if(jComboBox3.getSelectedItem().toString().equals("Add")){
                        jTextField2.setVisible(true);
                        jTextField3.setVisible(true);
                        jTextField4.setVisible(true);
                        jTextField5.setVisible(true);
                        jTextField6.setVisible(true);
                        jTextField7.setVisible(true);
                        jTextField8.setVisible(true);
                        jTextField9.setVisible(true);
                        jTextField10.setVisible(true);
                        jTextField11.setVisible(true);
                        jTextField12.setVisible(true);
                        jTextField13.setVisible(true);
                        jButton2.setVisible(true);   
                        jButton3.setVisible(false);
                        jButton4.setVisible(false);
                    }
                    else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                        jTextField2.setVisible(true);
                        jTextField3.setVisible(true);
                        jTextField4.setVisible(true);
                        jTextField5.setVisible(true);
                        jTextField6.setVisible(true);
                        jTextField7.setVisible(true);
                        jTextField8.setVisible(true);
                        jTextField9.setVisible(true);
                        jTextField10.setVisible(true);
                        jTextField11.setVisible(true);
                        jTextField12.setVisible(true);
                        jTextField13.setVisible(true);
                        jButton3.setVisible(true);
                        jButton2.setVisible(false);
                        jButton4.setVisible(false);
                    }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                        jTextField2.setVisible(true);
                        jTextField3.setVisible(false);
                        jTextField4.setVisible(false);
                        jTextField5.setVisible(false);
                        jTextField6.setVisible(false);
                        jTextField7.setVisible(false);
                        jTextField8.setVisible(false);
                        jTextField9.setVisible(false);
                        jTextField10.setVisible(false);
                        jTextField11.setVisible(false);
                        jTextField12.setVisible(false);
                        jTextField13.setVisible(false);
                        jButton2.setVisible(false);
                        jButton3.setVisible(false);
                        jButton4.setVisible(true);
                    }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                        jTextField2.setVisible(false);
                        jTextField3.setVisible(false);
                        jTextField4.setVisible(false);
                        jTextField5.setVisible(false);
                        jTextField6.setVisible(false);
                        jTextField7.setVisible(false);
                        jTextField8.setVisible(false);
                        jTextField9.setVisible(false);
                        jTextField10.setVisible(false);
                        jTextField11.setVisible(false);
                        jTextField12.setVisible(false);
                        jTextField13.setVisible(false);
                        jButton2.setVisible(false);
                        jButton3.setVisible(false);
                        jButton4.setVisible(false);
                    }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jComboBox3.getSelectedItem().toString().equals("Add")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jTextField10.setVisible(true);
                    jTextField11.setVisible(true);
                    jTextField12.setVisible(true);
                    jButton2.setVisible(true);   
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jTextField10.setVisible(true);
                    jTextField11.setVisible(true);
                    jTextField12.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                    jTextField12.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(true);
                }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                    jTextField12.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jComboBox3.getSelectedItem().toString().equals("Add")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jTextField10.setVisible(true);
                    jButton2.setVisible(true);   
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jTextField10.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(true);
                }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jComboBox3.getSelectedItem().toString().equals("Add")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jButton2.setVisible(true);   
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(true);
                }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jComboBox3.getSelectedItem().toString().equals("Add")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jButton2.setVisible(true);   
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(true);
                }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jComboBox3.getSelectedItem().toString().equals("Add")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jButton2.setVisible(true);   
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(true);
                }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jComboBox3.getSelectedItem().toString().equals("Add")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jButton2.setVisible(true);   
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Update")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(false);
                    jButton4.setVisible(false);
                }else if(jComboBox3.getSelectedItem().toString().equals("Delete")){
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(true);
                }else if(jComboBox3.getSelectedItem().toString().equals("Not Specified")){
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO monitor (idmonitor,nume,pret,tehnologie,putere_consumata,diagonala,tip_rezolutie,rezolutie_optima,aspect_imagine,timp_de_raspuns,refresh_rate,iluminare_fundal) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setString(7,jTextField8.getText());
                    state.setString(8,jTextField9.getText());
                    state.setString(9,jTextField10.getText());
                    state.setString(10,jTextField11.getText());
                    state.setString(11,jTextField12.getText());
                    state.setString(12,jTextField13.getText());
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO placa_de_baza (idplaca_de_baza,nume,pret,socket,memorie,capacitate,frecventa,suport_dualchannel,audio_integrat,lan_integrat,format) VALUES (?,?,?,?,?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setString(7,jTextField8.getText());
                    state.setString(8,jTextField9.getText());
                    state.setString(9,jTextField10.getText());
                    state.setString(10,jTextField11.getText());
                    state.setString(11,jTextField12.getText());
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO placa_video (idplaca_video,nume,pret,slot,tip,frecventa,capacitate,bus,chipset_video) VALUES (?,?,?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setString(7,jTextField8.getText());
                    state.setString(8,jTextField9.getText());
                    state.setString(9,jTextField10.getText());
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO card_de_memorie (idMr,nume,pret,tip,capacitate,frecventa,suport_dualchannel,voltaj) VALUES (?,?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setString(7,jTextField8.getText());
                    state.setString(8,jTextField9.getText());
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO solid_state_drive (idsolid_state_drive,nume,pret,capacitate,tip,transfer_citire,transfer_scriere,interfata) VALUES (?,?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setString(7,jTextField8.getText());
                    state.setString(8,jTextField9.getText());
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO procesor (idPr,nume,pret,socket,cache,frecventa,nuclee,threads) VALUES (?,?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setInt(7,Integer.parseInt(jTextField8.getText()));
                    state.setInt(8,Integer.parseInt(jTextField9.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("INSERT INTO sursa (idsrc,nume,pret,putere,alimentare,conectori,format) VALUES (?,?,?,?,?,?,?);");
                    state.setInt(1,Integer.parseInt(jTextField2.getText()));
                    state.setString(2,jTextField3.getText());
                    state.setInt(3, Integer.parseInt(jTextField4.getText()));
                    state.setString(4,jTextField5.getText());
                    state.setString(5,jTextField6.getText());
                    state.setString(6,jTextField7.getText());
                    state.setString(7,jTextField8.getText());
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE monitor SET nume=?,pret=?,tehnologie=?,putere_consumata=?,diagonala=?,tip_rezolutie=?,rezolutie_optima=?,aspect_imagine=?,timp_de_raspuns=?,refresh_rate=?,iluminare_fundal=? WHERE idmonitor=?");
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setString(6,jTextField8.getText());
                    state.setString(7,jTextField9.getText());
                    state.setString(8,jTextField10.getText());
                    state.setString(9,jTextField11.getText());
                    state.setString(10,jTextField12.getText());
                    state.setString(11,jTextField13.getText());
                    state.setInt(12, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE placa_de_baza SET nume=?,pret=?,socket=?,memorie=?,capacitate=?,frecventa=?,suport_dualchannel=?,audio_integrat=?,lan_integrat=?,format=? WHERE idplaca_de_baza=?");
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setString(6,jTextField8.getText());
                    state.setString(7,jTextField9.getText());
                    state.setString(8,jTextField10.getText());
                    state.setString(9,jTextField11.getText());
                    state.setString(10,jTextField12.getText());
                    state.setInt(11,Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE placa_video SET nume=?,pret=?,slot=?,tip=?,frecventa=?,capacitate=?,bus=?,chipset_video=? WHERE idplaca_video=?");
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setString(6,jTextField8.getText());
                    state.setString(7,jTextField9.getText());
                    state.setString(9,jTextField10.getText());
                    state.setInt(9,Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE card_de_memorie SET nume=?,pret=?,tip=?,capacitate=?,frecventa=?,suport_dualchannel=?,voltaj=? where idMr=?"); 
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setString(6,jTextField8.getText());
                    state.setString(7,jTextField9.getText());
                    state.setInt(8,Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE solid_state_drive SET nume=?,pret=?,capacitate=?,tip=?,transfer_citire=?,transfer_scriere=?,interfata=? where idsolid_state_drive=?");
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setString(6,jTextField8.getText());
                    state.setString(7,jTextField9.getText());
                    state.setInt(8,Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE procesor SET nume=?,pret=?,socket=?,cache=?,frecventa=?,nuclee=?,threads=? WHERE idPr=?");
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setInt(6,Integer.parseInt(jTextField8.getText()));
                    state.setInt(7,Integer.parseInt(jTextField9.getText()));
                    state.setInt(8,Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("UPDATE sursa SET nume=?,pret=?,putere=?,alimentare=?,conectori=?,format=? WHERE idsrc=?");
                    state.setString(1,jTextField3.getText());
                    state.setInt(2, Integer.parseInt(jTextField4.getText()));
                    state.setString(3,jTextField5.getText());
                    state.setString(4,jTextField6.getText());
                    state.setString(5,jTextField7.getText());
                    state.setString(6,jTextField8.getText());
                    state.setInt(7,Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM monitor WHERE idmonitor=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM placa_de_baza WHERE idplaca_de_baza=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM placa_video WHERE idplaca_video=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM card_de_memorie WHERE idMr=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM solid_state_drive WHERE idsolid_state_drive=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM procesor WHERE idPr=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                if(jTextField2.getText()!=null&&jTextField3.getText()!=null&&jTextField4.getText()!=null&&jTextField5.getText()!=null&&jTextField6.getText()!=null&&jTextField7.getText()!=null&&jTextField8.getText()!=null&&jTextField9.getText()!=null&&jTextField10.getText()!=null&&jTextField11.getText()!=null&&jTextField12.getText()!=null&&jTextField13.getText()!=null){
                    PreparedStatement state=con.prepareStatement("DELETE FROM sursa WHERE idsrc=?");
                    state.setInt(1, Integer.parseInt(jTextField2.getText()));
                    state.executeUpdate();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField16.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
            jTextField9.setText(model.getValueAt(row, 7).toString());
            jTextField10.setText(model.getValueAt(row, 8).toString());
            jTextField11.setText(model.getValueAt(row, 9).toString());
            jTextField12.setText(model.getValueAt(row, 10).toString());
            jTextField13.setText(model.getValueAt(row, 11).toString());
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField17.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
            jTextField9.setText(model.getValueAt(row, 7).toString());
            jTextField10.setText(model.getValueAt(row, 8).toString());
            jTextField11.setText(model.getValueAt(row, 9).toString());
            jTextField12.setText(model.getValueAt(row, 10).toString());
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField18.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
            jTextField9.setText(model.getValueAt(row, 7).toString());
            jTextField10.setText(model.getValueAt(row, 8).toString());
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField19.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
            jTextField9.setText(model.getValueAt(row, 7).toString());
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField20.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
            jTextField9.setText(model.getValueAt(row, 7).toString());
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField21.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
            jTextField9.setText(model.getValueAt(row, 7).toString());
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
            int row=jTable1.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            jTextField2.setText(model.getValueAt(row, 0).toString());
            jTextField3.setText(model.getValueAt(row, 1).toString());
            jTextField22.setText(model.getValueAt(row, 1).toString());
            jTextField4.setText(model.getValueAt(row, 2).toString());
            jTextField5.setText(model.getValueAt(row, 3).toString());
            jTextField6.setText(model.getValueAt(row, 4).toString());
            jTextField7.setText(model.getValueAt(row, 5).toString());
            jTextField8.setText(model.getValueAt(row, 6).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        if(jTextField14.getText().equals("Term")){
            jTextField14.setText("");
            jTextField14.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        if(jTextField14.getText().equals("")){
            jTextField14.setText("Term");
            jTextField14.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField14FocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from monitor where idmonitor=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idmonitor");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("tehnologie");
                table.addColumn("putere consumata");
                table.addColumn("diagonala");
                table.addColumn("tip rezolutie");
                table.addColumn("rezolutie optima");
                table.addColumn("aspect");
                table.addColumn("timp de raspuns");
                table.addColumn("refresh rate");
                table.addColumn("iluminare fundal");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11),result.getString(12)});
                    
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from placa_de_baza where idplaca_de_baza=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idmotherboard");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("socket");
                table.addColumn("memorie");
                table.addColumn("capacitate");
                table.addColumn("frecventa");
                table.addColumn("suport dualchannel");
                table.addColumn("audio integrat");
                table.addColumn("lan integrat");
                table.addColumn("format");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11)});      
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from placa_video where idplaca_video=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idvideocard");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("slot");
                table.addColumn("tip");
                table.addColumn("frecventa");
                table.addColumn("capacitate");
                table.addColumn("bus");
                table.addColumn("chipset video");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9)});
                      
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from card_de_memorie where idMr=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idmemorie");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("tip");
                table.addColumn("capacitate");
                table.addColumn("frecventa");
                table.addColumn("suport dualchannel");
                table.addColumn("voltaj");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from solid_state_drive where idsolid_state_drive=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idssd");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("capacitate");
                table.addColumn("tip");
                table.addColumn("transfer citire");
                table.addColumn("transfer scriere");
                table.addColumn("interfata");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from procesor where idPr=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idprocesor");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("socket");
                table.addColumn("cache");
                table.addColumn("frecventa");
                table.addColumn("nuclee");
                table.addColumn("threads");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                }
                
                
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                String sql="select * from sursa where idsrc=?";
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1,Integer.parseInt(jTextField14.getText()));
                ResultSet result=state.executeQuery();
                DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idsursa");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("putere");
                table.addColumn("alimentare");
                table.addColumn("conectori");
                table.addColumn("format");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7)});
                      
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        if(jTextField15.getText().equals("Search")){
            jTextField15.setText("");
            jTextField15.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        if(jTextField15.getText().equals("")){
            jTextField15.setText("Search");
            jTextField15.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased

    }//GEN-LAST:event_jTextField15KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Monitor")){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                
                DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                model.setColumnCount(0);
                model.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM monitor WHERE idmonitor='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR tehnologie='"+jTextField15.getText()+"' OR putere_consumata='"+jTextField15.getText()+"' OR diagonala='"+jTextField15.getText()+"' OR tip_rezolutie='"+jTextField15.getText()+"' OR rezolutie_optima='"+jTextField15.getText()+"' OR aspect_imagine='"+jTextField15.getText()+"' OR timp_de_raspuns='"+jTextField15.getText()+"' OR refresh_rate='"+jTextField15.getText()+"' OR iluminare_fundal='"+jTextField15.getText()+"';");
                model.addColumn("idmonitor");
                model.addColumn("nume");
                model.addColumn("pret");
                model.addColumn("tehnologie");
                model.addColumn("putere consumata");
                model.addColumn("diagonala");
                model.addColumn("tip rezolutie");
                model.addColumn("rezolutie optima");
                model.addColumn("aspect");
                model.addColumn("timp de raspuns");
                model.addColumn("refresh rate");
                model.addColumn("iluminare fundal");
                while(result.next()){
                    model.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11),result.getString(12)});    
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa de Baza")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setColumnCount(0);
                table.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM placa_de_baza WHERE idplaca_de_baza='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR socket='"+jTextField15.getText()+"' OR memorie='"+jTextField15.getText()+"' OR capacitate='"+jTextField15.getText()+"' OR frecventa='"+jTextField15.getText()+"' OR suport_dualchannel='"+jTextField15.getText()+"' OR audio_integrat='"+jTextField15.getText()+"' OR lan_integrat='"+jTextField15.getText()+"' OR format='"+jTextField15.getText()+"';");
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idmotherboard");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("socket");
                table.addColumn("memorie");
                table.addColumn("capacitate");
                table.addColumn("frecventa");
                table.addColumn("suport dualchannel");
                table.addColumn("audio integrat");
                table.addColumn("lan integrat");
                table.addColumn("format");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11)});      
                }
               
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Placa Video")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setColumnCount(0);
                table.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM placa_video WHERE idplaca_video='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR slot='"+jTextField15.getText()+"' OR tip='"+jTextField15.getText()+"' OR frecventa='"+jTextField15.getText()+"' OR capacitate='"+jTextField15.getText()+"' OR bus='"+jTextField15.getText()+"' OR chipset_video='"+jTextField15.getText()+"';");
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idvideocard");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("slot");
                table.addColumn("tip");
                table.addColumn("frecventa");
                table.addColumn("capacitate");
                table.addColumn("bus");
                table.addColumn("chipset video");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9)});
                      
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Card de Memorie")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setColumnCount(0);
                table.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM card_de_memorie WHERE idMr='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR tip='"+jTextField15.getText()+"' OR capacitate='"+jTextField15.getText()+"' OR frecventa='"+jTextField15.getText()+"' OR suport_dualchannel='"+jTextField15.getText()+"' OR voltaj='"+jTextField15.getText()+"';");
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idmemorie");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("tip");
                table.addColumn("capacitate");
                table.addColumn("frecventa");
                table.addColumn("suport dualchannel");
                table.addColumn("voltaj");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Solid State Drive")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setColumnCount(0);
                table.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM solid_state_drive WHERE idsolid_state_drive='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR capacitate='"+jTextField15.getText()+"' OR tip='"+jTextField15.getText()+"' OR transfer_citire='"+jTextField15.getText()+"' OR transfer_scriere='"+jTextField15.getText()+"' OR interfata='"+jTextField15.getText()+"';");
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idssd");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("capacitate");
                table.addColumn("tip");
                table.addColumn("transfer citire");
                table.addColumn("transfer scriere");
                table.addColumn("interfata");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Procesor")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setColumnCount(0);
                table.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM procesor WHERE idPr='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR socket='"+jTextField15.getText()+"' OR cache='"+jTextField15.getText()+"' OR frecventa='"+jTextField15.getText()+"' OR nuclee='"+jTextField15.getText()+"' OR threads='"+jTextField15.getText()+"';");
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idprocesor");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("socket");
                table.addColumn("cache");
                table.addColumn("frecventa");
                table.addColumn("nuclee");
                table.addColumn("threads");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                      
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Sursa")){
             try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setColumnCount(0);
                table.setRowCount(0);
                Statement state=con.createStatement();
                ResultSet result=state.executeQuery("SELECT * FROM sursa WHERE idsrc='"+jTextField15.getText()+"' OR nume='"+jTextField15.getText()+"' OR pret='"+jTextField15.getText()+"' OR putere='"+jTextField15.getText()+"' OR alimentare='"+jTextField15.getText()+"' OR conectori='"+jTextField15.getText()+"' OR format='"+jTextField15.getText()+"';");
                table.setRowCount(0);
                table.setColumnCount(0);
                table.addColumn("idsursa");
                table.addColumn("nume");
                table.addColumn("pret");
                table.addColumn("putere");
                table.addColumn("alimentare");
                table.addColumn("conectori");
                table.addColumn("format");
                while(result.next()){
                    table.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7)});
                      
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }else if(jComboBox2.getSelectedItem().toString().equals("Not Specified")){
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        if(jTextField16.getText().equals("Monitor")){
            jTextField16.setText("");
            jTextField16.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        if(jTextField16.getText().equals("")){
            jTextField16.setText("Monitor");
            jTextField16.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField16FocusLost

    private void jTextField17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField17FocusGained
        if(jTextField17.getText().equals("Placa de Baza")){
            jTextField17.setText("");
            jTextField17.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField17FocusGained

    private void jTextField17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField17FocusLost
        if(jTextField17.getText().equals("")){
            jTextField17.setText("Placa de Baza");
            jTextField17.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField17FocusLost

    private void jTextField18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusGained
        if(jTextField18.getText().equals("Placa Video")){
            jTextField18.setText("");
            jTextField18.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField18FocusGained

    private void jTextField18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusLost
        if(jTextField18.getText().equals("")){
            jTextField18.setText("Placa Video");
            jTextField18.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField18FocusLost

    private void jTextField19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField19FocusGained
        if(jTextField19.getText().equals("Card de Memorie")){
            jTextField19.setText("");
            jTextField19.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField19FocusGained

    private void jTextField19FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField19FocusLost
        if(jTextField19.getText().equals("")){
            jTextField19.setText("Card de Memorie");
            jTextField19.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField19FocusLost

    private void jTextField20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField20FocusGained
        if(jTextField20.getText().equals("Solid State Drive")){
            jTextField20.setText("");
            jTextField20.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField20FocusGained

    private void jTextField20FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField20FocusLost
        if(jTextField20.getText().equals("")){
            jTextField20.setText("Solid State Driver");
            jTextField20.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField20FocusLost

    private void jTextField21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField21FocusGained
        if(jTextField21.getText().equals("Procesor")){
            jTextField21.setText("");
            jTextField21.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField21FocusGained

    private void jTextField21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField21FocusLost
        if(jTextField21.getText().equals("")){
            jTextField21.setText("Procesor");
            jTextField21.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField21FocusLost

    private void jTextField22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusGained
        if(jTextField22.getText().equals("Sursa")){
            jTextField22.setText("");
            jTextField22.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField22FocusGained

    private void jTextField22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusLost
        if(jTextField22.getText().equals("")){
            jTextField22.setText("Sursa");
            jTextField22.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField22FocusLost

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_database","root","1324Ceviatafrumoasa1!");
                PreparedStatement state=con.prepareStatement("SELECT memorie FROM placa_de_baza WHERE nume='"+jTextField17.getText()+"'");
                ResultSet result=state.executeQuery();
                String res=null;
                
                
                while(result.next()){
                   res=result.getString("memorie");
                   System.out.println(res);
                   
                   
                }
                
                if(res!=null){
                    if(res.equals("DDR4")){
                        jLabel9.setVisible(true);
                        jLabel9.setText("Compatible");
                    }else if(res.equals("DDR5")){
                        jLabel9.setVisible(true);
                        jLabel9.setText("Incompatible");
                    }else{
                        jLabel9.setVisible(true);
                        jLabel9.setText("Unknown");
                    }
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            
        
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
