package Source;

import java.awt.Toolkit;
import java.util.Arrays ;
import java.util.Random ;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
    int Steps = 0 ;
    boolean [] TF ;
    private long Rm ;
    long Array [] = new long [100] ;
    Random RMD = new Random() ;
    
    public Frame() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon4.png")));
        initComponents();
        Login_Panel.setVisible(true);
        jPanel1.setVisible(false);
        //intialAll();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        Button13 = new javax.swing.JButton();
        Button14 = new javax.swing.JButton();
        Button15 = new javax.swing.JButton();
        Button16 = new javax.swing.JButton();
        Button17 = new javax.swing.JButton();
        Button18 = new javax.swing.JButton();
        Button19 = new javax.swing.JButton();
        Button20 = new javax.swing.JButton();
        Button21 = new javax.swing.JButton();
        Button22 = new javax.swing.JButton();
        Button23 = new javax.swing.JButton();
        Button24 = new javax.swing.JButton();
        Button25 = new javax.swing.JButton();
        Button26 = new javax.swing.JButton();
        Button27 = new javax.swing.JButton();
        Button28 = new javax.swing.JButton();
        Button29 = new javax.swing.JButton();
        Button30 = new javax.swing.JButton();
        Button31 = new javax.swing.JButton();
        Button32 = new javax.swing.JButton();
        Button33 = new javax.swing.JButton();
        Button34 = new javax.swing.JButton();
        Button35 = new javax.swing.JButton();
        Button36 = new javax.swing.JButton();
        Button37 = new javax.swing.JButton();
        Button38 = new javax.swing.JButton();
        Button39 = new javax.swing.JButton();
        Button40 = new javax.swing.JButton();
        Button41 = new javax.swing.JButton();
        Button42 = new javax.swing.JButton();
        Button43 = new javax.swing.JButton();
        Button44 = new javax.swing.JButton();
        Button45 = new javax.swing.JButton();
        Button46 = new javax.swing.JButton();
        Button47 = new javax.swing.JButton();
        Button48 = new javax.swing.JButton();
        Button49 = new javax.swing.JButton();
        Button50 = new javax.swing.JButton();
        Button51 = new javax.swing.JButton();
        Button52 = new javax.swing.JButton();
        Button53 = new javax.swing.JButton();
        Button54 = new javax.swing.JButton();
        Button55 = new javax.swing.JButton();
        Button56 = new javax.swing.JButton();
        Button57 = new javax.swing.JButton();
        Button58 = new javax.swing.JButton();
        Button59 = new javax.swing.JButton();
        Button60 = new javax.swing.JButton();
        Button61 = new javax.swing.JButton();
        Button62 = new javax.swing.JButton();
        Button63 = new javax.swing.JButton();
        Button64 = new javax.swing.JButton();
        Button65 = new javax.swing.JButton();
        Button66 = new javax.swing.JButton();
        Button67 = new javax.swing.JButton();
        Button68 = new javax.swing.JButton();
        Button69 = new javax.swing.JButton();
        Button70 = new javax.swing.JButton();
        Button71 = new javax.swing.JButton();
        Button72 = new javax.swing.JButton();
        Button73 = new javax.swing.JButton();
        Button74 = new javax.swing.JButton();
        Button75 = new javax.swing.JButton();
        Button76 = new javax.swing.JButton();
        Button77 = new javax.swing.JButton();
        Button78 = new javax.swing.JButton();
        Button79 = new javax.swing.JButton();
        Button80 = new javax.swing.JButton();
        Button81 = new javax.swing.JButton();
        Button82 = new javax.swing.JButton();
        Button83 = new javax.swing.JButton();
        Button84 = new javax.swing.JButton();
        Button85 = new javax.swing.JButton();
        Button86 = new javax.swing.JButton();
        Button87 = new javax.swing.JButton();
        Button88 = new javax.swing.JButton();
        Button89 = new javax.swing.JButton();
        Button90 = new javax.swing.JButton();
        Button91 = new javax.swing.JButton();
        Button92 = new javax.swing.JButton();
        Button93 = new javax.swing.JButton();
        Button94 = new javax.swing.JButton();
        Button95 = new javax.swing.JButton();
        Button96 = new javax.swing.JButton();
        Button97 = new javax.swing.JButton();
        Button98 = new javax.swing.JButton();
        Button99 = new javax.swing.JButton();
        Button100 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Picture_Label = new javax.swing.JLabel();
        Login_Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guessing Number");

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Purisa", 2, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/ico2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1210, 20, 53, 37);

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 2, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Find This Number  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(24, 18, 364, 42);

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 224, 124));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("12456643");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(394, 13, 152, 51);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 129, 160));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("No.Steps :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(694, 18, 263, 42);

        jLabel6.setFont(new java.awt.Font("Purisa", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 251, 253));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(963, 22, 66, 42);

        Button1.setBackground(new java.awt.Color(122, 200, 207));
        Button1.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button1.setForeground(new java.awt.Color(1, 1, 1));
        Button1.setToolTipText("");
        Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        jPanel1.add(Button1);
        Button1.setBounds(77, 139, 100, 45);

        Button2.setBackground(new java.awt.Color(122, 200, 207));
        Button2.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button2.setForeground(new java.awt.Color(1, 1, 1));
        Button2.setToolTipText("");
        Button2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        jPanel1.add(Button2);
        Button2.setBounds(195, 139, 100, 45);

        Button3.setBackground(new java.awt.Color(122, 200, 207));
        Button3.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button3.setForeground(new java.awt.Color(1, 1, 1));
        Button3.setToolTipText("");
        Button3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        jPanel1.add(Button3);
        Button3.setBounds(313, 139, 100, 45);

        Button4.setBackground(new java.awt.Color(122, 200, 207));
        Button4.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button4.setForeground(new java.awt.Color(1, 1, 1));
        Button4.setToolTipText("");
        Button4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        jPanel1.add(Button4);
        Button4.setBounds(431, 139, 100, 45);

        Button5.setBackground(new java.awt.Color(122, 200, 207));
        Button5.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button5.setForeground(new java.awt.Color(1, 1, 1));
        Button5.setToolTipText("");
        Button5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        jPanel1.add(Button5);
        Button5.setBounds(549, 139, 100, 45);

        Button6.setBackground(new java.awt.Color(122, 200, 207));
        Button6.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button6.setForeground(new java.awt.Color(1, 1, 1));
        Button6.setToolTipText("");
        Button6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        jPanel1.add(Button6);
        Button6.setBounds(667, 139, 100, 45);

        Button7.setBackground(new java.awt.Color(122, 200, 207));
        Button7.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button7.setForeground(new java.awt.Color(1, 1, 1));
        Button7.setToolTipText("");
        Button7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        jPanel1.add(Button7);
        Button7.setBounds(785, 139, 100, 45);

        Button8.setBackground(new java.awt.Color(122, 200, 207));
        Button8.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button8.setForeground(new java.awt.Color(1, 1, 1));
        Button8.setToolTipText("");
        Button8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        jPanel1.add(Button8);
        Button8.setBounds(903, 139, 100, 45);

        Button9.setBackground(new java.awt.Color(122, 200, 207));
        Button9.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button9.setForeground(new java.awt.Color(1, 1, 1));
        Button9.setToolTipText("");
        Button9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        jPanel1.add(Button9);
        Button9.setBounds(1021, 139, 100, 45);

        Button10.setBackground(new java.awt.Color(122, 200, 207));
        Button10.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button10.setForeground(new java.awt.Color(1, 1, 1));
        Button10.setToolTipText("");
        Button10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });
        jPanel1.add(Button10);
        Button10.setBounds(1139, 139, 100, 45);

        Button11.setBackground(new java.awt.Color(122, 200, 207));
        Button11.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button11.setForeground(new java.awt.Color(1, 1, 1));
        Button11.setToolTipText("");
        Button11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });
        jPanel1.add(Button11);
        Button11.setBounds(77, 196, 100, 45);

        Button12.setBackground(new java.awt.Color(122, 200, 207));
        Button12.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button12.setForeground(new java.awt.Color(1, 1, 1));
        Button12.setToolTipText("");
        Button12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });
        jPanel1.add(Button12);
        Button12.setBounds(195, 196, 100, 45);

        Button13.setBackground(new java.awt.Color(122, 200, 207));
        Button13.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button13.setForeground(new java.awt.Color(1, 1, 1));
        Button13.setToolTipText("");
        Button13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });
        jPanel1.add(Button13);
        Button13.setBounds(313, 196, 100, 45);

        Button14.setBackground(new java.awt.Color(122, 200, 207));
        Button14.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button14.setForeground(new java.awt.Color(1, 1, 1));
        Button14.setToolTipText("");
        Button14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });
        jPanel1.add(Button14);
        Button14.setBounds(431, 196, 100, 45);

        Button15.setBackground(new java.awt.Color(122, 200, 207));
        Button15.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button15.setForeground(new java.awt.Color(1, 1, 1));
        Button15.setToolTipText("");
        Button15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });
        jPanel1.add(Button15);
        Button15.setBounds(549, 196, 100, 45);

        Button16.setBackground(new java.awt.Color(122, 200, 207));
        Button16.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button16.setForeground(new java.awt.Color(1, 1, 1));
        Button16.setToolTipText("");
        Button16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });
        jPanel1.add(Button16);
        Button16.setBounds(667, 196, 100, 45);

        Button17.setBackground(new java.awt.Color(122, 200, 207));
        Button17.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button17.setForeground(new java.awt.Color(1, 1, 1));
        Button17.setToolTipText("");
        Button17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });
        jPanel1.add(Button17);
        Button17.setBounds(785, 196, 100, 45);

        Button18.setBackground(new java.awt.Color(122, 200, 207));
        Button18.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button18.setForeground(new java.awt.Color(1, 1, 1));
        Button18.setToolTipText("");
        Button18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });
        jPanel1.add(Button18);
        Button18.setBounds(903, 196, 100, 45);

        Button19.setBackground(new java.awt.Color(122, 200, 207));
        Button19.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button19.setForeground(new java.awt.Color(1, 1, 1));
        Button19.setToolTipText("");
        Button19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });
        jPanel1.add(Button19);
        Button19.setBounds(1021, 196, 100, 45);

        Button20.setBackground(new java.awt.Color(122, 200, 207));
        Button20.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button20.setForeground(new java.awt.Color(1, 1, 1));
        Button20.setToolTipText("");
        Button20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });
        jPanel1.add(Button20);
        Button20.setBounds(1139, 196, 100, 45);

        Button21.setBackground(new java.awt.Color(122, 200, 207));
        Button21.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button21.setForeground(new java.awt.Color(1, 1, 1));
        Button21.setToolTipText("");
        Button21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button21ActionPerformed(evt);
            }
        });
        jPanel1.add(Button21);
        Button21.setBounds(77, 253, 100, 45);

        Button22.setBackground(new java.awt.Color(122, 200, 207));
        Button22.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button22.setForeground(new java.awt.Color(1, 1, 1));
        Button22.setToolTipText("");
        Button22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button22ActionPerformed(evt);
            }
        });
        jPanel1.add(Button22);
        Button22.setBounds(195, 253, 100, 45);

        Button23.setBackground(new java.awt.Color(122, 200, 207));
        Button23.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button23.setForeground(new java.awt.Color(1, 1, 1));
        Button23.setToolTipText("");
        Button23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button23ActionPerformed(evt);
            }
        });
        jPanel1.add(Button23);
        Button23.setBounds(313, 253, 100, 45);

        Button24.setBackground(new java.awt.Color(122, 200, 207));
        Button24.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button24.setForeground(new java.awt.Color(1, 1, 1));
        Button24.setToolTipText("");
        Button24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button24ActionPerformed(evt);
            }
        });
        jPanel1.add(Button24);
        Button24.setBounds(431, 253, 100, 45);

        Button25.setBackground(new java.awt.Color(122, 200, 207));
        Button25.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button25.setForeground(new java.awt.Color(1, 1, 1));
        Button25.setToolTipText("");
        Button25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button25ActionPerformed(evt);
            }
        });
        jPanel1.add(Button25);
        Button25.setBounds(549, 253, 100, 45);

        Button26.setBackground(new java.awt.Color(122, 200, 207));
        Button26.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button26.setForeground(new java.awt.Color(1, 1, 1));
        Button26.setToolTipText("");
        Button26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button26ActionPerformed(evt);
            }
        });
        jPanel1.add(Button26);
        Button26.setBounds(667, 253, 100, 45);

        Button27.setBackground(new java.awt.Color(122, 200, 207));
        Button27.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button27.setForeground(new java.awt.Color(1, 1, 1));
        Button27.setToolTipText("");
        Button27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button27ActionPerformed(evt);
            }
        });
        jPanel1.add(Button27);
        Button27.setBounds(785, 253, 100, 45);

        Button28.setBackground(new java.awt.Color(122, 200, 207));
        Button28.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button28.setForeground(new java.awt.Color(1, 1, 1));
        Button28.setToolTipText("");
        Button28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button28ActionPerformed(evt);
            }
        });
        jPanel1.add(Button28);
        Button28.setBounds(903, 253, 100, 45);

        Button29.setBackground(new java.awt.Color(122, 200, 207));
        Button29.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button29.setForeground(new java.awt.Color(1, 1, 1));
        Button29.setToolTipText("");
        Button29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button29ActionPerformed(evt);
            }
        });
        jPanel1.add(Button29);
        Button29.setBounds(1021, 253, 100, 45);

        Button30.setBackground(new java.awt.Color(122, 200, 207));
        Button30.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button30.setForeground(new java.awt.Color(1, 1, 1));
        Button30.setToolTipText("");
        Button30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button30ActionPerformed(evt);
            }
        });
        jPanel1.add(Button30);
        Button30.setBounds(1139, 253, 100, 45);

        Button31.setBackground(new java.awt.Color(122, 200, 207));
        Button31.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button31.setForeground(new java.awt.Color(1, 1, 1));
        Button31.setToolTipText("");
        Button31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button31ActionPerformed(evt);
            }
        });
        jPanel1.add(Button31);
        Button31.setBounds(77, 310, 100, 45);

        Button32.setBackground(new java.awt.Color(122, 200, 207));
        Button32.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button32.setForeground(new java.awt.Color(1, 1, 1));
        Button32.setToolTipText("");
        Button32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button32ActionPerformed(evt);
            }
        });
        jPanel1.add(Button32);
        Button32.setBounds(195, 310, 100, 45);

        Button33.setBackground(new java.awt.Color(122, 200, 207));
        Button33.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button33.setForeground(new java.awt.Color(1, 1, 1));
        Button33.setToolTipText("");
        Button33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button33ActionPerformed(evt);
            }
        });
        jPanel1.add(Button33);
        Button33.setBounds(313, 310, 100, 45);

        Button34.setBackground(new java.awt.Color(122, 200, 207));
        Button34.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button34.setForeground(new java.awt.Color(1, 1, 1));
        Button34.setToolTipText("");
        Button34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button34ActionPerformed(evt);
            }
        });
        jPanel1.add(Button34);
        Button34.setBounds(431, 310, 100, 45);

        Button35.setBackground(new java.awt.Color(122, 200, 207));
        Button35.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button35.setForeground(new java.awt.Color(1, 1, 1));
        Button35.setToolTipText("");
        Button35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button35ActionPerformed(evt);
            }
        });
        jPanel1.add(Button35);
        Button35.setBounds(549, 310, 100, 45);

        Button36.setBackground(new java.awt.Color(122, 200, 207));
        Button36.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button36.setForeground(new java.awt.Color(1, 1, 1));
        Button36.setToolTipText("");
        Button36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button36ActionPerformed(evt);
            }
        });
        jPanel1.add(Button36);
        Button36.setBounds(667, 310, 100, 45);

        Button37.setBackground(new java.awt.Color(122, 200, 207));
        Button37.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button37.setForeground(new java.awt.Color(1, 1, 1));
        Button37.setToolTipText("");
        Button37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button37ActionPerformed(evt);
            }
        });
        jPanel1.add(Button37);
        Button37.setBounds(785, 310, 100, 45);

        Button38.setBackground(new java.awt.Color(122, 200, 207));
        Button38.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button38.setForeground(new java.awt.Color(1, 1, 1));
        Button38.setToolTipText("");
        Button38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button38ActionPerformed(evt);
            }
        });
        jPanel1.add(Button38);
        Button38.setBounds(903, 310, 100, 45);

        Button39.setBackground(new java.awt.Color(122, 200, 207));
        Button39.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button39.setForeground(new java.awt.Color(1, 1, 1));
        Button39.setToolTipText("");
        Button39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button39ActionPerformed(evt);
            }
        });
        jPanel1.add(Button39);
        Button39.setBounds(1021, 310, 100, 45);

        Button40.setBackground(new java.awt.Color(122, 200, 207));
        Button40.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button40.setForeground(new java.awt.Color(1, 1, 1));
        Button40.setToolTipText("");
        Button40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button40ActionPerformed(evt);
            }
        });
        jPanel1.add(Button40);
        Button40.setBounds(1139, 310, 100, 45);

        Button41.setBackground(new java.awt.Color(122, 200, 207));
        Button41.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button41.setForeground(new java.awt.Color(1, 1, 1));
        Button41.setToolTipText("");
        Button41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button41ActionPerformed(evt);
            }
        });
        jPanel1.add(Button41);
        Button41.setBounds(77, 367, 100, 45);

        Button42.setBackground(new java.awt.Color(122, 200, 207));
        Button42.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button42.setForeground(new java.awt.Color(1, 1, 1));
        Button42.setToolTipText("");
        Button42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button42ActionPerformed(evt);
            }
        });
        jPanel1.add(Button42);
        Button42.setBounds(195, 367, 100, 45);

        Button43.setBackground(new java.awt.Color(122, 200, 207));
        Button43.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button43.setForeground(new java.awt.Color(1, 1, 1));
        Button43.setToolTipText("");
        Button43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button43ActionPerformed(evt);
            }
        });
        jPanel1.add(Button43);
        Button43.setBounds(313, 367, 100, 45);

        Button44.setBackground(new java.awt.Color(122, 200, 207));
        Button44.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button44.setForeground(new java.awt.Color(1, 1, 1));
        Button44.setToolTipText("");
        Button44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button44ActionPerformed(evt);
            }
        });
        jPanel1.add(Button44);
        Button44.setBounds(431, 367, 100, 45);

        Button45.setBackground(new java.awt.Color(122, 200, 207));
        Button45.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button45.setForeground(new java.awt.Color(1, 1, 1));
        Button45.setToolTipText("");
        Button45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button45ActionPerformed(evt);
            }
        });
        jPanel1.add(Button45);
        Button45.setBounds(549, 367, 100, 45);

        Button46.setBackground(new java.awt.Color(122, 200, 207));
        Button46.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button46.setForeground(new java.awt.Color(1, 1, 1));
        Button46.setToolTipText("");
        Button46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button46ActionPerformed(evt);
            }
        });
        jPanel1.add(Button46);
        Button46.setBounds(667, 367, 100, 45);

        Button47.setBackground(new java.awt.Color(122, 200, 207));
        Button47.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button47.setForeground(new java.awt.Color(1, 1, 1));
        Button47.setToolTipText("");
        Button47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button47ActionPerformed(evt);
            }
        });
        jPanel1.add(Button47);
        Button47.setBounds(785, 367, 100, 45);

        Button48.setBackground(new java.awt.Color(122, 200, 207));
        Button48.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button48.setForeground(new java.awt.Color(1, 1, 1));
        Button48.setToolTipText("");
        Button48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button48ActionPerformed(evt);
            }
        });
        jPanel1.add(Button48);
        Button48.setBounds(903, 367, 100, 45);

        Button49.setBackground(new java.awt.Color(122, 200, 207));
        Button49.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button49.setForeground(new java.awt.Color(1, 1, 1));
        Button49.setToolTipText("");
        Button49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button49ActionPerformed(evt);
            }
        });
        jPanel1.add(Button49);
        Button49.setBounds(1021, 367, 100, 45);

        Button50.setBackground(new java.awt.Color(122, 200, 207));
        Button50.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button50.setForeground(new java.awt.Color(1, 1, 1));
        Button50.setToolTipText("");
        Button50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button50ActionPerformed(evt);
            }
        });
        jPanel1.add(Button50);
        Button50.setBounds(1139, 367, 100, 45);

        Button51.setBackground(new java.awt.Color(122, 200, 207));
        Button51.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button51.setForeground(new java.awt.Color(1, 1, 1));
        Button51.setToolTipText("");
        Button51.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button51ActionPerformed(evt);
            }
        });
        jPanel1.add(Button51);
        Button51.setBounds(77, 424, 100, 45);

        Button52.setBackground(new java.awt.Color(122, 200, 207));
        Button52.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button52.setForeground(new java.awt.Color(1, 1, 1));
        Button52.setToolTipText("");
        Button52.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button52ActionPerformed(evt);
            }
        });
        jPanel1.add(Button52);
        Button52.setBounds(195, 424, 100, 45);

        Button53.setBackground(new java.awt.Color(122, 200, 207));
        Button53.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button53.setForeground(new java.awt.Color(1, 1, 1));
        Button53.setToolTipText("");
        Button53.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button53ActionPerformed(evt);
            }
        });
        jPanel1.add(Button53);
        Button53.setBounds(313, 424, 100, 45);

        Button54.setBackground(new java.awt.Color(122, 200, 207));
        Button54.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button54.setForeground(new java.awt.Color(1, 1, 1));
        Button54.setToolTipText("");
        Button54.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button54ActionPerformed(evt);
            }
        });
        jPanel1.add(Button54);
        Button54.setBounds(431, 424, 100, 45);

        Button55.setBackground(new java.awt.Color(122, 200, 207));
        Button55.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button55.setForeground(new java.awt.Color(1, 1, 1));
        Button55.setToolTipText("");
        Button55.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button55ActionPerformed(evt);
            }
        });
        jPanel1.add(Button55);
        Button55.setBounds(549, 424, 100, 45);

        Button56.setBackground(new java.awt.Color(122, 200, 207));
        Button56.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button56.setForeground(new java.awt.Color(1, 1, 1));
        Button56.setToolTipText("");
        Button56.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button56ActionPerformed(evt);
            }
        });
        jPanel1.add(Button56);
        Button56.setBounds(667, 424, 100, 45);

        Button57.setBackground(new java.awt.Color(122, 200, 207));
        Button57.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button57.setForeground(new java.awt.Color(1, 1, 1));
        Button57.setToolTipText("");
        Button57.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button57ActionPerformed(evt);
            }
        });
        jPanel1.add(Button57);
        Button57.setBounds(785, 424, 100, 45);

        Button58.setBackground(new java.awt.Color(122, 200, 207));
        Button58.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button58.setForeground(new java.awt.Color(1, 1, 1));
        Button58.setToolTipText("");
        Button58.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button58ActionPerformed(evt);
            }
        });
        jPanel1.add(Button58);
        Button58.setBounds(903, 424, 100, 45);

        Button59.setBackground(new java.awt.Color(122, 200, 207));
        Button59.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button59.setForeground(new java.awt.Color(1, 1, 1));
        Button59.setToolTipText("");
        Button59.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button59ActionPerformed(evt);
            }
        });
        jPanel1.add(Button59);
        Button59.setBounds(1021, 424, 100, 45);

        Button60.setBackground(new java.awt.Color(122, 200, 207));
        Button60.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button60.setForeground(new java.awt.Color(1, 1, 1));
        Button60.setToolTipText("");
        Button60.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button60ActionPerformed(evt);
            }
        });
        jPanel1.add(Button60);
        Button60.setBounds(1139, 424, 100, 45);

        Button61.setBackground(new java.awt.Color(122, 200, 207));
        Button61.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button61.setForeground(new java.awt.Color(1, 1, 1));
        Button61.setToolTipText("");
        Button61.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button61ActionPerformed(evt);
            }
        });
        jPanel1.add(Button61);
        Button61.setBounds(77, 481, 100, 45);

        Button62.setBackground(new java.awt.Color(122, 200, 207));
        Button62.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button62.setForeground(new java.awt.Color(1, 1, 1));
        Button62.setToolTipText("");
        Button62.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button62ActionPerformed(evt);
            }
        });
        jPanel1.add(Button62);
        Button62.setBounds(195, 481, 100, 45);

        Button63.setBackground(new java.awt.Color(122, 200, 207));
        Button63.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button63.setForeground(new java.awt.Color(1, 1, 1));
        Button63.setToolTipText("");
        Button63.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button63ActionPerformed(evt);
            }
        });
        jPanel1.add(Button63);
        Button63.setBounds(313, 481, 100, 45);

        Button64.setBackground(new java.awt.Color(122, 200, 207));
        Button64.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button64.setForeground(new java.awt.Color(1, 1, 1));
        Button64.setToolTipText("");
        Button64.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button64ActionPerformed(evt);
            }
        });
        jPanel1.add(Button64);
        Button64.setBounds(431, 481, 100, 45);

        Button65.setBackground(new java.awt.Color(122, 200, 207));
        Button65.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button65.setForeground(new java.awt.Color(1, 1, 1));
        Button65.setToolTipText("");
        Button65.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button65ActionPerformed(evt);
            }
        });
        jPanel1.add(Button65);
        Button65.setBounds(549, 481, 100, 45);

        Button66.setBackground(new java.awt.Color(122, 200, 207));
        Button66.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button66.setForeground(new java.awt.Color(1, 1, 1));
        Button66.setToolTipText("");
        Button66.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button66ActionPerformed(evt);
            }
        });
        jPanel1.add(Button66);
        Button66.setBounds(667, 481, 100, 45);

        Button67.setBackground(new java.awt.Color(122, 200, 207));
        Button67.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button67.setForeground(new java.awt.Color(1, 1, 1));
        Button67.setToolTipText("");
        Button67.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button67ActionPerformed(evt);
            }
        });
        jPanel1.add(Button67);
        Button67.setBounds(785, 481, 100, 45);

        Button68.setBackground(new java.awt.Color(122, 200, 207));
        Button68.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button68.setForeground(new java.awt.Color(1, 1, 1));
        Button68.setToolTipText("");
        Button68.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button68ActionPerformed(evt);
            }
        });
        jPanel1.add(Button68);
        Button68.setBounds(903, 481, 100, 45);

        Button69.setBackground(new java.awt.Color(122, 200, 207));
        Button69.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button69.setForeground(new java.awt.Color(1, 1, 1));
        Button69.setToolTipText("");
        Button69.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button69ActionPerformed(evt);
            }
        });
        jPanel1.add(Button69);
        Button69.setBounds(1021, 481, 100, 45);

        Button70.setBackground(new java.awt.Color(122, 200, 207));
        Button70.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button70.setForeground(new java.awt.Color(1, 1, 1));
        Button70.setToolTipText("");
        Button70.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button70ActionPerformed(evt);
            }
        });
        jPanel1.add(Button70);
        Button70.setBounds(1139, 481, 100, 45);

        Button71.setBackground(new java.awt.Color(122, 200, 207));
        Button71.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button71.setForeground(new java.awt.Color(1, 1, 1));
        Button71.setToolTipText("");
        Button71.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button71ActionPerformed(evt);
            }
        });
        jPanel1.add(Button71);
        Button71.setBounds(77, 538, 100, 45);

        Button72.setBackground(new java.awt.Color(122, 200, 207));
        Button72.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button72.setForeground(new java.awt.Color(1, 1, 1));
        Button72.setToolTipText("");
        Button72.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button72ActionPerformed(evt);
            }
        });
        jPanel1.add(Button72);
        Button72.setBounds(195, 538, 100, 45);

        Button73.setBackground(new java.awt.Color(122, 200, 207));
        Button73.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button73.setForeground(new java.awt.Color(1, 1, 1));
        Button73.setToolTipText("");
        Button73.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button73ActionPerformed(evt);
            }
        });
        jPanel1.add(Button73);
        Button73.setBounds(313, 538, 100, 45);

        Button74.setBackground(new java.awt.Color(122, 200, 207));
        Button74.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button74.setForeground(new java.awt.Color(1, 1, 1));
        Button74.setToolTipText("");
        Button74.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button74ActionPerformed(evt);
            }
        });
        jPanel1.add(Button74);
        Button74.setBounds(431, 538, 100, 45);

        Button75.setBackground(new java.awt.Color(122, 200, 207));
        Button75.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button75.setForeground(new java.awt.Color(1, 1, 1));
        Button75.setToolTipText("");
        Button75.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button75ActionPerformed(evt);
            }
        });
        jPanel1.add(Button75);
        Button75.setBounds(549, 538, 100, 45);

        Button76.setBackground(new java.awt.Color(122, 200, 207));
        Button76.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button76.setForeground(new java.awt.Color(1, 1, 1));
        Button76.setToolTipText("");
        Button76.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button76ActionPerformed(evt);
            }
        });
        jPanel1.add(Button76);
        Button76.setBounds(667, 538, 100, 45);

        Button77.setBackground(new java.awt.Color(122, 200, 207));
        Button77.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button77.setForeground(new java.awt.Color(1, 1, 1));
        Button77.setToolTipText("");
        Button77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button77ActionPerformed(evt);
            }
        });
        jPanel1.add(Button77);
        Button77.setBounds(785, 538, 100, 45);

        Button78.setBackground(new java.awt.Color(122, 200, 207));
        Button78.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button78.setForeground(new java.awt.Color(1, 1, 1));
        Button78.setToolTipText("");
        Button78.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button78ActionPerformed(evt);
            }
        });
        jPanel1.add(Button78);
        Button78.setBounds(903, 538, 100, 45);

        Button79.setBackground(new java.awt.Color(122, 200, 207));
        Button79.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button79.setForeground(new java.awt.Color(1, 1, 1));
        Button79.setToolTipText("");
        Button79.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button79ActionPerformed(evt);
            }
        });
        jPanel1.add(Button79);
        Button79.setBounds(1021, 538, 100, 45);

        Button80.setBackground(new java.awt.Color(122, 200, 207));
        Button80.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button80.setForeground(new java.awt.Color(1, 1, 1));
        Button80.setToolTipText("");
        Button80.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button80ActionPerformed(evt);
            }
        });
        jPanel1.add(Button80);
        Button80.setBounds(1139, 538, 100, 45);

        Button81.setBackground(new java.awt.Color(122, 200, 207));
        Button81.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button81.setForeground(new java.awt.Color(1, 1, 1));
        Button81.setToolTipText("");
        Button81.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button81ActionPerformed(evt);
            }
        });
        jPanel1.add(Button81);
        Button81.setBounds(77, 595, 100, 45);

        Button82.setBackground(new java.awt.Color(122, 200, 207));
        Button82.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button82.setForeground(new java.awt.Color(1, 1, 1));
        Button82.setToolTipText("");
        Button82.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button82ActionPerformed(evt);
            }
        });
        jPanel1.add(Button82);
        Button82.setBounds(195, 595, 100, 45);

        Button83.setBackground(new java.awt.Color(122, 200, 207));
        Button83.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button83.setForeground(new java.awt.Color(1, 1, 1));
        Button83.setToolTipText("");
        Button83.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button83ActionPerformed(evt);
            }
        });
        jPanel1.add(Button83);
        Button83.setBounds(313, 595, 100, 45);

        Button84.setBackground(new java.awt.Color(122, 200, 207));
        Button84.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button84.setForeground(new java.awt.Color(1, 1, 1));
        Button84.setToolTipText("");
        Button84.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button84ActionPerformed(evt);
            }
        });
        jPanel1.add(Button84);
        Button84.setBounds(431, 595, 100, 45);

        Button85.setBackground(new java.awt.Color(122, 200, 207));
        Button85.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button85.setForeground(new java.awt.Color(1, 1, 1));
        Button85.setToolTipText("");
        Button85.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button85ActionPerformed(evt);
            }
        });
        jPanel1.add(Button85);
        Button85.setBounds(549, 595, 100, 45);

        Button86.setBackground(new java.awt.Color(122, 200, 207));
        Button86.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button86.setForeground(new java.awt.Color(1, 1, 1));
        Button86.setToolTipText("");
        Button86.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button86ActionPerformed(evt);
            }
        });
        jPanel1.add(Button86);
        Button86.setBounds(667, 595, 100, 45);

        Button87.setBackground(new java.awt.Color(122, 200, 207));
        Button87.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button87.setForeground(new java.awt.Color(1, 1, 1));
        Button87.setToolTipText("");
        Button87.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button87ActionPerformed(evt);
            }
        });
        jPanel1.add(Button87);
        Button87.setBounds(785, 595, 100, 45);

        Button88.setBackground(new java.awt.Color(122, 200, 207));
        Button88.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button88.setForeground(new java.awt.Color(1, 1, 1));
        Button88.setToolTipText("");
        Button88.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button88ActionPerformed(evt);
            }
        });
        jPanel1.add(Button88);
        Button88.setBounds(903, 595, 100, 45);

        Button89.setBackground(new java.awt.Color(122, 200, 207));
        Button89.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button89.setForeground(new java.awt.Color(1, 1, 1));
        Button89.setToolTipText("");
        Button89.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button89ActionPerformed(evt);
            }
        });
        jPanel1.add(Button89);
        Button89.setBounds(1021, 595, 100, 45);

        Button90.setBackground(new java.awt.Color(122, 200, 207));
        Button90.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button90.setForeground(new java.awt.Color(1, 1, 1));
        Button90.setToolTipText("");
        Button90.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button90ActionPerformed(evt);
            }
        });
        jPanel1.add(Button90);
        Button90.setBounds(1139, 595, 100, 45);

        Button91.setBackground(new java.awt.Color(122, 200, 207));
        Button91.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button91.setForeground(new java.awt.Color(1, 1, 1));
        Button91.setToolTipText("");
        Button91.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button91ActionPerformed(evt);
            }
        });
        jPanel1.add(Button91);
        Button91.setBounds(77, 652, 100, 45);

        Button92.setBackground(new java.awt.Color(122, 200, 207));
        Button92.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button92.setForeground(new java.awt.Color(1, 1, 1));
        Button92.setToolTipText("");
        Button92.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button92ActionPerformed(evt);
            }
        });
        jPanel1.add(Button92);
        Button92.setBounds(195, 652, 100, 45);

        Button93.setBackground(new java.awt.Color(122, 200, 207));
        Button93.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button93.setForeground(new java.awt.Color(1, 1, 1));
        Button93.setToolTipText("");
        Button93.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button93ActionPerformed(evt);
            }
        });
        jPanel1.add(Button93);
        Button93.setBounds(313, 652, 100, 45);

        Button94.setBackground(new java.awt.Color(122, 200, 207));
        Button94.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button94.setForeground(new java.awt.Color(1, 1, 1));
        Button94.setToolTipText("");
        Button94.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button94ActionPerformed(evt);
            }
        });
        jPanel1.add(Button94);
        Button94.setBounds(431, 652, 100, 45);

        Button95.setBackground(new java.awt.Color(122, 200, 207));
        Button95.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button95.setForeground(new java.awt.Color(1, 1, 1));
        Button95.setToolTipText("");
        Button95.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button95ActionPerformed(evt);
            }
        });
        jPanel1.add(Button95);
        Button95.setBounds(549, 652, 100, 45);

        Button96.setBackground(new java.awt.Color(122, 200, 207));
        Button96.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button96.setForeground(new java.awt.Color(1, 1, 1));
        Button96.setToolTipText("");
        Button96.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button96ActionPerformed(evt);
            }
        });
        jPanel1.add(Button96);
        Button96.setBounds(667, 652, 100, 45);

        Button97.setBackground(new java.awt.Color(122, 200, 207));
        Button97.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button97.setForeground(new java.awt.Color(1, 1, 1));
        Button97.setToolTipText("");
        Button97.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button97ActionPerformed(evt);
            }
        });
        jPanel1.add(Button97);
        Button97.setBounds(785, 652, 100, 45);

        Button98.setBackground(new java.awt.Color(122, 200, 207));
        Button98.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button98.setForeground(new java.awt.Color(1, 1, 1));
        Button98.setToolTipText("");
        Button98.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button98ActionPerformed(evt);
            }
        });
        jPanel1.add(Button98);
        Button98.setBounds(903, 652, 100, 45);

        Button99.setBackground(new java.awt.Color(122, 200, 207));
        Button99.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button99.setForeground(new java.awt.Color(1, 1, 1));
        Button99.setToolTipText("");
        Button99.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button99ActionPerformed(evt);
            }
        });
        jPanel1.add(Button99);
        Button99.setBounds(1021, 652, 100, 45);

        Button100.setBackground(new java.awt.Color(122, 200, 207));
        Button100.setFont(new java.awt.Font("Ubuntu", 2, 21)); // NOI18N
        Button100.setForeground(new java.awt.Color(1, 1, 1));
        Button100.setToolTipText("");
        Button100.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button100ActionPerformed(evt);
            }
        });
        jPanel1.add(Button100);
        Button100.setBounds(1139, 652, 100, 45);

        jLabel8.setFont(new java.awt.Font("Purisa", 2, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/ico1.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1120, 20, 39, 37);

        jLabel7.setFont(new java.awt.Font("Purisa", 2, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/ico3.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1170, 20, 40, 30);

        Picture_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/31.jpg"))); // NOI18N
        Picture_Label.setToolTipText("");
        jPanel1.add(Picture_Label);
        Picture_Label.setBounds(0, 0, 1370, 780);

        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Welcome To Geussing Game");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(445, 100, 386, 66);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("UserName");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(453, 354, 162, 45);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PassWord");
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(453, 413, 162, 45);

        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(633, 356, 210, 45);

        jPasswordField1.setText("jPasswordField1");
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(633, 413, 210, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/31.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-1, 0, 1280, 780);

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1277, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 308, Short.MAX_VALUE)
                    .addComponent(Login_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 309, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 150, Short.MAX_VALUE)
                    .addComponent(Login_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 150, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        String Str = Long.toString(Array[0]) ;
        Button1.setText(Str);
        if(TF[0] == false){
            Steps++ ;
            TF[0] = true ; 
            jLabel6.setText(Long.toString(Steps));
            if(Rm == Array[0]){
                JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                intialAll() ;
            }
        }
    }//GEN-LAST:event_Button1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        String Str = Long.toString(Array[1]) ;
        Button2.setText(Str);
        if(TF[1] == false){
                Steps++ ;
                TF[1] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[1]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        String Str = Long.toString(Array[2]) ;
        Button3.setText(Str);
        if(TF[2] == false){
                Steps++ ;
                TF[2] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[2]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        String Str = Long.toString(Array[3]) ;
        Button4.setText(Str);
        if(TF[3] == false){
                Steps++ ;
                TF[3] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[3]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        String Str = Long.toString(Array[4]) ;
        Button5.setText(Str);
        if(TF[4] == false){
                Steps++ ;
                TF[4] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[4]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        String Str = Long.toString(Array[5]) ;
        Button6.setText(Str);
        if(TF[5] == false){
                Steps++ ;
                TF[5] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[5]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        String Str = Long.toString(Array[6]) ;
        Button7.setText(Str);
        if(TF[6] == false){
                Steps++ ;
                TF[6] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[6]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
       String Str = Long.toString(Array[7]) ;
        Button8.setText(Str);
        if(TF[7] == false){
                Steps++ ;
                TF[7] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[7]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        String Str = Long.toString(Array[8]) ;
        Button9.setText(Str);
        if(TF[8] == false){
                Steps++ ;
                TF[8] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[8]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        String Str = Long.toString(Array[9]) ;
        Button10.setText(Str);
        if(TF[9] == false){
                Steps++ ;
                TF[9] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[9]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        String Str = Long.toString(Array[10]) ;
        Button11.setText(Str);
        if(TF[10] == false){
                Steps++ ;
                TF[10] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[10]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        String Str = Long.toString(Array[11]) ;
        Button12.setText(Str);
        if(TF[11] == false){
                Steps++ ;
                TF[11] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[11]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
        String Str = Long.toString(Array[12]) ;
        Button13.setText(Str);
        if(TF[12] == false){
                Steps++ ;
                TF[12] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[12]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
        String Str = Long.toString(Array[13]) ;
        Button14.setText(Str);
        if(TF[13] == false){
                Steps++ ;
                TF[13] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[13]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
        String Str = Long.toString(Array[14]) ;
        Button15.setText(Str);
        if(TF[14] == false){
                Steps++ ;
                TF[14] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[14]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
        String Str = Long.toString(Array[15]) ;
        Button16.setText(Str);
        if(TF[15] == false){
                Steps++ ;
                TF[15] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[15]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button16ActionPerformed

    private void Button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button17ActionPerformed
        String Str = Long.toString(Array[16]) ;
        Button17.setText(Str);
        if(TF[16] == false){
                Steps++ ;
                TF[16] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[16]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button17ActionPerformed

    private void Button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button18ActionPerformed
        String Str = Long.toString(Array[17]) ;
        Button18.setText(Str);
        if(TF[17] == false){
                Steps++ ;
                TF[17] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[17]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button18ActionPerformed

    private void Button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button19ActionPerformed
        String Str = Long.toString(Array[18]) ;
        Button19.setText(Str);
        if(TF[18] == false){
                Steps++ ;
                TF[18] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[18]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button19ActionPerformed

    private void Button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button20ActionPerformed
        String Str = Long.toString(Array[19]) ;
        Button20.setText(Str);
        if(TF[19] == false){
                Steps++ ;
                TF[19] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[19]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button20ActionPerformed

    private void Button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button21ActionPerformed
       String Str = Long.toString(Array[20]) ;
        Button21.setText(Str);
        if(TF[20] == false){
                Steps++ ;
                TF[20] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[20]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button21ActionPerformed

    private void Button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button22ActionPerformed
       String Str = Long.toString(Array[21]) ;
        Button22.setText(Str);
        if(TF[21] == false){
                Steps++ ;
                TF[21] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[21]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button22ActionPerformed

    private void Button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button23ActionPerformed
        String Str = Long.toString(Array[22]) ;
        Button23.setText(Str);
        if(TF[22] == false){
                Steps++ ;
                TF[22] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[22]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button23ActionPerformed

    private void Button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button24ActionPerformed
        String Str = Long.toString(Array[23]) ;
        Button24.setText(Str);
        if(TF[23] == false){
                Steps++ ;
                TF[23] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[23]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button24ActionPerformed

    private void Button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button25ActionPerformed
        String Str = Long.toString(Array[24]) ;
        Button25.setText(Str);
        if(TF[24] == false){
                Steps++ ;
                TF[24] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[24]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button25ActionPerformed

    private void Button26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button26ActionPerformed
        String Str = Long.toString(Array[25]) ;
        Button26.setText(Str);
        if(TF[25] == false){
                Steps++ ;
                TF[25] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[25]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button26ActionPerformed

    private void Button27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button27ActionPerformed
        String Str = Long.toString(Array[26]) ;
        Button27.setText(Str);
        if(TF[26] == false){
                Steps++ ;
                TF[26] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[26]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button27ActionPerformed

    private void Button28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button28ActionPerformed
        String Str = Long.toString(Array[27]) ;
        Button28.setText(Str);
        if(TF[27] == false){
                Steps++ ;
                TF[27] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[27]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button28ActionPerformed

    private void Button29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button29ActionPerformed
        String Str = Long.toString(Array[28]) ;
        Button29.setText(Str);
        if(TF[28] == false){
                Steps++ ;
                TF[28] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[28]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }    }//GEN-LAST:event_Button29ActionPerformed

    private void Button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button30ActionPerformed
        String Str = Long.toString(Array[29]) ;
        Button30.setText(Str);
        if(TF[29] == false){
                Steps++ ;
                TF[29] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[29]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button30ActionPerformed

    private void Button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button31ActionPerformed
        String Str = Long.toString(Array[30]) ;
        Button31.setText(Str);
        if(TF[30] == false){
                Steps++ ;
                TF[30] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[30]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button31ActionPerformed

    private void Button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button32ActionPerformed
       String Str = Long.toString(Array[31]) ;
        Button32.setText(Str);
        if(TF[31] == false){
                Steps++ ;
                TF[31] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[31]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button32ActionPerformed

    private void Button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button33ActionPerformed
       String Str = Long.toString(Array[32]) ;
        Button33.setText(Str);
        if(TF[32] == false){
                Steps++ ;
                TF[32] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[32]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button33ActionPerformed

    private void Button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button34ActionPerformed
        String Str = Long.toString(Array[33]) ;
        Button34.setText(Str);
        if(TF[33] == false){
                Steps++ ;
                TF[33] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[33]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button34ActionPerformed

    private void Button35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button35ActionPerformed
        String Str = Long.toString(Array[34]) ;
        Button35.setText(Str);
        if(TF[34] == false){
                Steps++ ;
                TF[34] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[34]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button35ActionPerformed

    private void Button36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button36ActionPerformed
        String Str = Long.toString(Array[35]) ;
        Button36.setText(Str);
        if(TF[35] == false){
                Steps++ ;
                TF[35] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[35]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button36ActionPerformed

    private void Button37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button37ActionPerformed
        String Str = Long.toString(Array[36]) ;
        Button37.setText(Str);
        if(TF[36] == false){
                Steps++ ;
                TF[36] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[36]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button37ActionPerformed

    private void Button38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button38ActionPerformed
        String Str = Long.toString(Array[37]) ;
        Button38.setText(Str);
        if(TF[37] == false){
                Steps++ ;
                TF[37] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[37]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button38ActionPerformed

    private void Button39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button39ActionPerformed
        String Str = Long.toString(Array[38]) ;
        Button39.setText(Str);
        if(TF[38] == false){
                Steps++ ;
                TF[38] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[38]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button39ActionPerformed

    private void Button40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button40ActionPerformed
        String Str = Long.toString(Array[39]) ;
        Button40.setText(Str);
        if(TF[39] == false){
                Steps++ ;
                TF[39] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[39]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button40ActionPerformed

    private void Button41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button41ActionPerformed
        String Str = Long.toString(Array[40]) ;
        Button41.setText(Str);
        if(TF[40] == false){
                Steps++ ;
                TF[40] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[40]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button41ActionPerformed

    private void Button42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button42ActionPerformed
        String Str = Long.toString(Array[41]) ;
        Button42.setText(Str);
        if(TF[41] == false){
                Steps++ ;
                TF[41] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[41]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button42ActionPerformed

    private void Button43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button43ActionPerformed
        String Str = Long.toString(Array[42]) ;
        Button43.setText(Str);
        if(TF[42] == false){
                Steps++ ;
                TF[42] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[42]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button43ActionPerformed

    private void Button44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button44ActionPerformed
        String Str = Long.toString(Array[43]) ;
        Button44.setText(Str);
        if(TF[43] == false){
                Steps++ ;
                TF[43] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[43]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button44ActionPerformed

    private void Button45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button45ActionPerformed
        String Str = Long.toString(Array[44]) ;
        Button45.setText(Str);
        if(TF[44] == false){
                Steps++ ;
                TF[44] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[44]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button45ActionPerformed

    private void Button46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button46ActionPerformed
        String Str = Long.toString(Array[45]) ;
        Button46.setText(Str);
        if(TF[45] == false){
                Steps++ ;
                TF[45] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[45]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button46ActionPerformed

    private void Button47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button47ActionPerformed
        String Str = Long.toString(Array[46]) ;
        Button47.setText(Str);
        if(TF[46] == false){
                Steps++ ;
                TF[46] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[46]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button47ActionPerformed

    private void Button48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button48ActionPerformed
        String Str = Long.toString(Array[47]) ;
        Button48.setText(Str);
        if(TF[47] == false){
                Steps++ ;
                TF[47] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[47]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button48ActionPerformed

    private void Button49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button49ActionPerformed
        String Str = Long.toString(Array[48]) ;
        Button49.setText(Str);
        if(TF[48] == false){
                Steps++ ;
                TF[48] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[48]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button49ActionPerformed

    private void Button50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button50ActionPerformed
        String Str = Long.toString(Array[49]) ;
        Button50.setText(Str);
        if(TF[49] == false){
                Steps++ ;
                TF[49] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[49]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button50ActionPerformed

    private void Button51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button51ActionPerformed
        String Str = Long.toString(Array[50]) ;
        Button51.setText(Str);
        if(TF[50] == false){
                Steps++ ;
                TF[50] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[50]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button51ActionPerformed

    private void Button52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button52ActionPerformed
        String Str = Long.toString(Array[51]) ;
        Button52.setText(Str);
        if(TF[51] == false){
                Steps++ ;
                TF[51] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[51]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button52ActionPerformed

    private void Button53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button53ActionPerformed
        String Str = Long.toString(Array[52]) ;
        Button53.setText(Str);
        if(TF[52] == false){
                Steps++ ;
                TF[52] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[52]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button53ActionPerformed

    private void Button54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button54ActionPerformed
        String Str = Long.toString(Array[53]) ;
        Button54.setText(Str);
        if(TF[53] == false){
                Steps++ ;
                TF[53] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[53]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button54ActionPerformed

    private void Button55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button55ActionPerformed
        String Str = Long.toString(Array[54]) ;
        Button55.setText(Str);
        if(TF[54] == false){
                Steps++ ;
                TF[54] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[54]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button55ActionPerformed

    private void Button56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button56ActionPerformed
        String Str = Long.toString(Array[55]) ;
        Button56.setText(Str);
        if(TF[55] == false){
                Steps++ ;
                TF[55] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[55]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button56ActionPerformed

    private void Button57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button57ActionPerformed
        String Str = Long.toString(Array[56]) ;
        Button57.setText(Str);
        if(TF[56] == false){
                Steps++ ;
                TF[56] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[56]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button57ActionPerformed

    private void Button58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button58ActionPerformed
        String Str = Long.toString(Array[57]) ;
        Button58.setText(Str);
        if(TF[57] == false){
                Steps++ ;
                TF[57] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[57]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button58ActionPerformed

    private void Button59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button59ActionPerformed
        String Str = Long.toString(Array[58]) ;
        Button59.setText(Str);
        if(TF[58] == false){
                Steps++ ;
                TF[58] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[58]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button59ActionPerformed

    private void Button60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button60ActionPerformed
        String Str = Long.toString(Array[59]) ;
        Button60.setText(Str);
        if(TF[59] == false){
                Steps++ ;
                TF[59] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[59]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button60ActionPerformed

    private void Button61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button61ActionPerformed
        String Str = Long.toString(Array[60]) ;
        Button61.setText(Str);
        if(TF[60] == false){
                Steps++ ;
                TF[60] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[60]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button61ActionPerformed

    private void Button62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button62ActionPerformed
        String Str = Long.toString(Array[61]) ;
        Button62.setText(Str);
        if(TF[61] == false){
                Steps++ ;
                TF[61] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[61]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button62ActionPerformed

    private void Button63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button63ActionPerformed
        String Str = Long.toString(Array[62]) ;
        Button63.setText(Str);
        if(TF[62] == false){
                Steps++ ;
                TF[62] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[62]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button63ActionPerformed

    private void Button64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button64ActionPerformed
        String Str = Long.toString(Array[63]) ;
        Button64.setText(Str);
        if(TF[63] == false){
                Steps++ ;
                TF[63] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[63]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button64ActionPerformed

    private void Button65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button65ActionPerformed
        String Str = Long.toString(Array[64]) ;
        Button65.setText(Str);
        if(TF[64] == false){
                Steps++ ;
                TF[64] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[64]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button65ActionPerformed

    private void Button66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button66ActionPerformed
        String Str = Long.toString(Array[65]) ;
        Button66.setText(Str);
        if(TF[65] == false){
                Steps++ ;
                TF[65] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[65]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button66ActionPerformed

    private void Button67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button67ActionPerformed
        String Str = Long.toString(Array[66]) ;
        Button67.setText(Str);
        if(TF[66] == false){
                Steps++ ;
                TF[66] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[66]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button67ActionPerformed

    private void Button68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button68ActionPerformed
        String Str = Long.toString(Array[67]) ;
        Button68.setText(Str);
        if(TF[67] == false){
                Steps++ ;
                TF[67] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[67]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button68ActionPerformed

    private void Button69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button69ActionPerformed
        String Str = Long.toString(Array[68]) ;
        Button69.setText(Str);
        if(TF[68] == false){
                Steps++ ;
                TF[68] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[68]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button69ActionPerformed

    private void Button70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button70ActionPerformed
        String Str = Long.toString(Array[69]) ;
        Button70.setText(Str);
        if(TF[69] == false){
                Steps++ ;
                TF[69] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[69]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button70ActionPerformed

    private void Button71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button71ActionPerformed
        String Str = Long.toString(Array[70]) ;
        Button71.setText(Str);
        if(TF[70] == false){
                Steps++ ;
                TF[70] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[70]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button71ActionPerformed

    private void Button72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button72ActionPerformed
        String Str = Long.toString(Array[71]) ;
        Button72.setText(Str);
        if(TF[71] == false){
                Steps++ ;
                TF[71] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[71]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button72ActionPerformed

    private void Button73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button73ActionPerformed
        String Str = Long.toString(Array[72]) ;
        Button73.setText(Str);
        if(TF[72] == false){
                Steps++ ;
                TF[72] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[72]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button73ActionPerformed

    private void Button74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button74ActionPerformed
        String Str = Long.toString(Array[73]) ;
        Button74.setText(Str);
        if(TF[73] == false){
                Steps++ ;
                TF[73] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[73]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button74ActionPerformed

    private void Button75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button75ActionPerformed
        String Str = Long.toString(Array[74]) ;
        Button75.setText(Str);
        if(TF[74] == false){
                Steps++ ;
                TF[74] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[74]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button75ActionPerformed

    private void Button76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button76ActionPerformed
        String Str = Long.toString(Array[75]) ;
        Button76.setText(Str);
        if(TF[75] == false){
                Steps++ ;
                TF[75] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[75]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button76ActionPerformed

    private void Button77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button77ActionPerformed
        String Str = Long.toString(Array[76]) ;
        Button77.setText(Str);
        if(TF[76] == false){
                Steps++ ;
                TF[76] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[76]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button77ActionPerformed

    private void Button78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button78ActionPerformed
        String Str = Long.toString(Array[77]) ;
        Button78.setText(Str);
        if(TF[77] == false){
                Steps++ ;
                TF[77] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[77]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button78ActionPerformed

    private void Button79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button79ActionPerformed
        String Str = Long.toString(Array[78]) ;
        Button79.setText(Str);
        if(TF[78] == false){
                Steps++ ;
                TF[78] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[78]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button79ActionPerformed

    private void Button80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button80ActionPerformed
        String Str = Long.toString(Array[79]) ;
        Button80.setText(Str);
        if(TF[79] == false){
                Steps++ ;
                TF[79] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[79]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button80ActionPerformed

    private void Button81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button81ActionPerformed
        String Str = Long.toString(Array[80]) ;
        Button81.setText(Str);
        if(TF[80] == false){
                Steps++ ;
                TF[80] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[80]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button81ActionPerformed

    private void Button82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button82ActionPerformed
        String Str = Long.toString(Array[81]) ;
        Button82.setText(Str);
        if(TF[81] == false){
                Steps++ ;
                TF[81] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[81]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button82ActionPerformed

    private void Button83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button83ActionPerformed
        String Str = Long.toString(Array[82]) ;
        Button83.setText(Str);
        if(TF[82] == false){
                Steps++ ;
                TF[82] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[82]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button83ActionPerformed

    private void Button84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button84ActionPerformed
        String Str = Long.toString(Array[83]) ;
        Button84.setText(Str);
        if(TF[83] == false){
                Steps++ ;
                TF[83] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[83]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button84ActionPerformed

    private void Button85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button85ActionPerformed
        String Str = Long.toString(Array[84]) ;
        Button85.setText(Str);
        if(TF[84] == false){
                Steps++ ;
                TF[84] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[84]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button85ActionPerformed

    private void Button86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button86ActionPerformed
        String Str = Long.toString(Array[85]) ;
        Button86.setText(Str);
        if(TF[85] == false){
                Steps++ ;
                TF[85] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[85]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button86ActionPerformed

    private void Button87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button87ActionPerformed
        String Str = Long.toString(Array[86]) ;
        Button87.setText(Str);
        if(TF[86] == false){
                Steps++ ;
                TF[86] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[86]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button87ActionPerformed

    private void Button88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button88ActionPerformed
        String Str = Long.toString(Array[87]) ;
        Button88.setText(Str);
        if(TF[87] == false){
                Steps++ ;
                TF[87] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[87]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button88ActionPerformed

    private void Button89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button89ActionPerformed
        String Str = Long.toString(Array[88]) ;
        Button89.setText(Str);
        if(TF[88] == false){
                Steps++ ;
                TF[88] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[88]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button89ActionPerformed

    private void Button90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button90ActionPerformed
        String Str = Long.toString(Array[89]) ;
        Button90.setText(Str);
        if(TF[89] == false){
                Steps++ ;
                TF[89] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[89]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button90ActionPerformed

    private void Button91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button91ActionPerformed
        String Str = Long.toString(Array[90]) ;
        Button91.setText(Str);
        if(TF[90] == false){
                Steps++ ;
                TF[90] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[90]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button91ActionPerformed

    private void Button92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button92ActionPerformed
        String Str = Long.toString(Array[91]) ;
        Button92.setText(Str);
        if(TF[91] == false){
                Steps++ ;
                TF[91] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[91]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button92ActionPerformed

    private void Button93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button93ActionPerformed
        String Str = Long.toString(Array[92]) ;
        Button93.setText(Str);
        if(TF[92] == false){
                Steps++ ;
                TF[92] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[92]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button93ActionPerformed

    private void Button94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button94ActionPerformed
        String Str = Long.toString(Array[93]) ;
        Button94.setText(Str);
        if(TF[93] == false){
                Steps++ ;
                TF[93] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[93]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button94ActionPerformed

    private void Button95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button95ActionPerformed
        String Str = Long.toString(Array[94]) ;
        Button95.setText(Str);
        if(TF[94] == false){
                Steps++ ;
                TF[94] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[94]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button95ActionPerformed

    private void Button96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button96ActionPerformed
        String Str = Long.toString(Array[95]) ;
        Button96.setText(Str);
        if(TF[95] == false){
                Steps++ ;
                TF[95] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[95]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button96ActionPerformed

    private void Button97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button97ActionPerformed
        String Str = Long.toString(Array[96]) ;
        Button97.setText(Str);
        if(TF[96] == false){
                Steps++ ;
                TF[96] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[96]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button97ActionPerformed

    private void Button98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button98ActionPerformed
        String Str = Long.toString(Array[97]) ;
        Button98.setText(Str);
        if(TF[97] == false){
                Steps++ ;
                TF[97] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[97]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button98ActionPerformed

    private void Button99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button99ActionPerformed
        String Str = Long.toString(Array[98]) ;
        Button99.setText(Str);
        if(TF[98] == false){
                Steps++ ;
                TF[98] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[98]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button99ActionPerformed

    private void Button100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button100ActionPerformed
        String Str = Long.toString(Array[99]) ;
        Button100.setText(Str);
        if(TF[99] == false){
                Steps++ ;
                TF[99] = true ;
                jLabel6.setText(Long.toString(Steps));
                if(Rm == Array[99]){
                        JOptionPane.showMessageDialog(null, "Congratulations !!\nNo.Steps : " + Steps);
                        intialAll() ;
                }
        }
    }//GEN-LAST:event_Button100ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        intialAll();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setState(HIDE_ON_CLOSE);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button100;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button17;
    private javax.swing.JButton Button18;
    private javax.swing.JButton Button19;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button20;
    private javax.swing.JButton Button21;
    private javax.swing.JButton Button22;
    private javax.swing.JButton Button23;
    private javax.swing.JButton Button24;
    private javax.swing.JButton Button25;
    private javax.swing.JButton Button26;
    private javax.swing.JButton Button27;
    private javax.swing.JButton Button28;
    private javax.swing.JButton Button29;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button30;
    private javax.swing.JButton Button31;
    private javax.swing.JButton Button32;
    private javax.swing.JButton Button33;
    private javax.swing.JButton Button34;
    private javax.swing.JButton Button35;
    private javax.swing.JButton Button36;
    private javax.swing.JButton Button37;
    private javax.swing.JButton Button38;
    private javax.swing.JButton Button39;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button40;
    private javax.swing.JButton Button41;
    private javax.swing.JButton Button42;
    private javax.swing.JButton Button43;
    private javax.swing.JButton Button44;
    private javax.swing.JButton Button45;
    private javax.swing.JButton Button46;
    private javax.swing.JButton Button47;
    private javax.swing.JButton Button48;
    private javax.swing.JButton Button49;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button50;
    private javax.swing.JButton Button51;
    private javax.swing.JButton Button52;
    private javax.swing.JButton Button53;
    private javax.swing.JButton Button54;
    private javax.swing.JButton Button55;
    private javax.swing.JButton Button56;
    private javax.swing.JButton Button57;
    private javax.swing.JButton Button58;
    private javax.swing.JButton Button59;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button60;
    private javax.swing.JButton Button61;
    private javax.swing.JButton Button62;
    private javax.swing.JButton Button63;
    private javax.swing.JButton Button64;
    private javax.swing.JButton Button65;
    private javax.swing.JButton Button66;
    private javax.swing.JButton Button67;
    private javax.swing.JButton Button68;
    private javax.swing.JButton Button69;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button70;
    private javax.swing.JButton Button71;
    private javax.swing.JButton Button72;
    private javax.swing.JButton Button73;
    private javax.swing.JButton Button74;
    private javax.swing.JButton Button75;
    private javax.swing.JButton Button76;
    private javax.swing.JButton Button77;
    private javax.swing.JButton Button78;
    private javax.swing.JButton Button79;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button80;
    private javax.swing.JButton Button81;
    private javax.swing.JButton Button82;
    private javax.swing.JButton Button83;
    private javax.swing.JButton Button84;
    private javax.swing.JButton Button85;
    private javax.swing.JButton Button86;
    private javax.swing.JButton Button87;
    private javax.swing.JButton Button88;
    private javax.swing.JButton Button89;
    private javax.swing.JButton Button9;
    private javax.swing.JButton Button90;
    private javax.swing.JButton Button91;
    private javax.swing.JButton Button92;
    private javax.swing.JButton Button93;
    private javax.swing.JButton Button94;
    private javax.swing.JButton Button95;
    private javax.swing.JButton Button96;
    private javax.swing.JButton Button97;
    private javax.swing.JButton Button98;
    private javax.swing.JButton Button99;
    private javax.swing.JPanel Login_Panel;
    private javax.swing.JLabel Picture_Label;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    void intialAll(){
        Steps = 0 ;
        TF  = new boolean [100] ;
        jLabel6.setText(Integer.toString(Steps));
        for(int i = 0 ; i < 100 ; i++){
            Array[i] = RMD.nextLong() % 100000 ;
            while(Array[i] < 0) Array[i] = RMD.nextLong() % 100000 ;
        }
        Arrays.sort(Array);
        Rm = RMD.nextInt() % 100 ;
        while(Rm < 0) Rm = RMD.nextLong() % 100 ;
        Rm = Array[(int)Rm] ;
        jLabel4.setText(Long.toString(Rm));
        Button1.setText("") ;
        Button2.setText("") ;
        Button3.setText("") ;
        Button4.setText("") ;
        Button5.setText("") ;
        Button6.setText("") ;
        Button7.setText("") ;
        Button8.setText("") ;
        Button9.setText("") ;
        Button10.setText("") ;
        Button11.setText("") ;
        Button12.setText("") ;
        Button13.setText("") ;
        Button14.setText("") ;
        Button15.setText("") ;
        Button16.setText("") ;
        Button17.setText("") ;
        Button18.setText("") ;
        Button19.setText("") ;
        Button20.setText("") ;
        Button21.setText("") ;
        Button22.setText("") ;
        Button23.setText("") ;
        Button24.setText("") ;
        Button25.setText("") ;
        Button26.setText("") ;
        Button27.setText("") ;
        Button28.setText("") ;
        Button29.setText("") ;
        Button30.setText("") ;
        Button31.setText("") ;
        Button32.setText("") ;
        Button33.setText("") ;
        Button34.setText("") ;
        Button35.setText("") ;
        Button36.setText("") ;
        Button37.setText("") ;
        Button38.setText("") ;
        Button39.setText("") ;
        Button40.setText("") ;
        Button41.setText("") ;
        Button42.setText("") ;
        Button43.setText("") ;
        Button44.setText("") ;
        Button45.setText("") ;
        Button46.setText("") ;
        Button47.setText("") ;
        Button48.setText("") ;
        Button49.setText("") ;
        Button50.setText("") ;
        Button51.setText("") ;
        Button52.setText("") ;
        Button53.setText("") ;
        Button54.setText("") ;
        Button55.setText("") ;
        Button56.setText("") ;
        Button57.setText("") ;
        Button58.setText("") ;
        Button59.setText("") ;
        Button60.setText("") ;
        Button61.setText("") ;
        Button62.setText("") ;
        Button63.setText("") ;
        Button64.setText("") ;
        Button65.setText("") ;
        Button66.setText("") ;
        Button67.setText("") ;
        Button68.setText("") ;
        Button69.setText("") ;
        Button70.setText("") ;
        Button71.setText("") ;
        Button72.setText("") ;
        Button73.setText("") ;
        Button74.setText("") ;
        Button75.setText("") ;
        Button76.setText("") ;
        Button77.setText("") ;
        Button78.setText("") ;
        Button79.setText("") ;
        Button80.setText("") ;
        Button81.setText("") ;
        Button82.setText("") ;
        Button83.setText("") ;
        Button84.setText("") ;
        Button85.setText("") ;
        Button86.setText("") ;
        Button87.setText("") ;
        Button88.setText("") ;
        Button89.setText("") ;
        Button90.setText("") ;
        Button91.setText("") ;
        Button92.setText("") ;
        Button93.setText("") ;
        Button94.setText("") ;
        Button95.setText("") ;
        Button96.setText("") ;
        Button97.setText("") ;
        Button98.setText("") ;
        Button99.setText("") ;
        Button100.setText("") ;
    }
}
