package multiperceptron;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Training extends javax.swing.JFrame {
   int n=0;
   Object  inputS[]=new Object[63];
   Object inputT[]=new Object[7];
   int S[][]=new int[63][26];
   int T[][]=new int[7][26];
   int X[][]=new int[63][26];
   double bias_baru[]=new double [7];
   double bias_lama[]=new double[7];
   double w_baru[][]=new double[63][7];
   double w_lama[][]=new double[63][7];
   double y[]=new double[7];
   double y_in[]=new double[7];
   boolean stop=false;
   double Theta, Alpha;
   String Huruf[]=new String[10];
   int p;
    public Training() {
        setTitle("Training");
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width)/2,
               ( screenSize.height - frameSize.height)/2);
        
    }
    public Training(double[][] w, int[][]t, double[] b, String[] huruf, int m, int[][] s1){
        setTitle("Training");
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width)/2,
               ( screenSize.height - frameSize.height)/2);
        T=t;
        w_lama=w;
        bias_baru=b;
        Huruf=huruf;
        n=m;
        S=s1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        tr63 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tr1 = new javax.swing.JToggleButton();
        tr2 = new javax.swing.JToggleButton();
        tr3 = new javax.swing.JToggleButton();
        tr4 = new javax.swing.JToggleButton();
        tr5 = new javax.swing.JToggleButton();
        tr6 = new javax.swing.JToggleButton();
        tr7 = new javax.swing.JToggleButton();
        tr8 = new javax.swing.JToggleButton();
        tr9 = new javax.swing.JToggleButton();
        tr10 = new javax.swing.JToggleButton();
        tr11 = new javax.swing.JToggleButton();
        tr12 = new javax.swing.JToggleButton();
        tr13 = new javax.swing.JToggleButton();
        tr14 = new javax.swing.JToggleButton();
        tr15 = new javax.swing.JToggleButton();
        tr16 = new javax.swing.JToggleButton();
        tr17 = new javax.swing.JToggleButton();
        tr18 = new javax.swing.JToggleButton();
        tr19 = new javax.swing.JToggleButton();
        tr20 = new javax.swing.JToggleButton();
        tr21 = new javax.swing.JToggleButton();
        tr22 = new javax.swing.JToggleButton();
        tr23 = new javax.swing.JToggleButton();
        tr24 = new javax.swing.JToggleButton();
        tr25 = new javax.swing.JToggleButton();
        tr26 = new javax.swing.JToggleButton();
        tr27 = new javax.swing.JToggleButton();
        tr28 = new javax.swing.JToggleButton();
        tr29 = new javax.swing.JToggleButton();
        tr30 = new javax.swing.JToggleButton();
        tr31 = new javax.swing.JToggleButton();
        tr32 = new javax.swing.JToggleButton();
        tr33 = new javax.swing.JToggleButton();
        tr34 = new javax.swing.JToggleButton();
        tr35 = new javax.swing.JToggleButton();
        tr36 = new javax.swing.JToggleButton();
        tr37 = new javax.swing.JToggleButton();
        tr38 = new javax.swing.JToggleButton();
        tr39 = new javax.swing.JToggleButton();
        tr40 = new javax.swing.JToggleButton();
        tr41 = new javax.swing.JToggleButton();
        tr42 = new javax.swing.JToggleButton();
        tr43 = new javax.swing.JToggleButton();
        tr44 = new javax.swing.JToggleButton();
        tr45 = new javax.swing.JToggleButton();
        tr46 = new javax.swing.JToggleButton();
        tr47 = new javax.swing.JToggleButton();
        tr48 = new javax.swing.JToggleButton();
        tr49 = new javax.swing.JToggleButton();
        tr50 = new javax.swing.JToggleButton();
        tr51 = new javax.swing.JToggleButton();
        tr52 = new javax.swing.JToggleButton();
        tr53 = new javax.swing.JToggleButton();
        tr54 = new javax.swing.JToggleButton();
        tr55 = new javax.swing.JToggleButton();
        tr56 = new javax.swing.JToggleButton();
        tr57 = new javax.swing.JToggleButton();
        tr58 = new javax.swing.JToggleButton();
        tr59 = new javax.swing.JToggleButton();
        tr60 = new javax.swing.JToggleButton();
        tr61 = new javax.swing.JToggleButton();
        tr62 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t7 = new javax.swing.JToggleButton();
        t1 = new javax.swing.JToggleButton();
        t2 = new javax.swing.JToggleButton();
        t3 = new javax.swing.JToggleButton();
        t4 = new javax.swing.JToggleButton();
        t5 = new javax.swing.JToggleButton();
        t6 = new javax.swing.JToggleButton();
        tr_huruf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tr_thetha = new javax.swing.JTextField();
        tr_rate = new javax.swing.JTextField();
        tr_training = new javax.swing.JButton();
        tr_save = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tr_clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Training - Pengenalan Huruf");
        setBackground(new java.awt.Color(0, 0, 153));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tr63.setBackground(java.awt.Color.green);
        tr63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr63.setText("-1");
        tr63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr63ActionPerformed(evt);
            }
        });
        jPanel1.add(tr63, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pola Huruf");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        tr1.setBackground(java.awt.Color.green);
        tr1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr1.setText("-1");
        tr1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr1ActionPerformed(evt);
            }
        });
        jPanel1.add(tr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 30));

        tr2.setBackground(java.awt.Color.green);
        tr2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr2.setText("-1");
        tr2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr2ActionPerformed(evt);
            }
        });
        jPanel1.add(tr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        tr3.setBackground(java.awt.Color.green);
        tr3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr3.setText("-1");
        tr3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr3ActionPerformed(evt);
            }
        });
        jPanel1.add(tr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 30));

        tr4.setBackground(java.awt.Color.green);
        tr4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr4.setText("-1");
        tr4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr4ActionPerformed(evt);
            }
        });
        jPanel1.add(tr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, 30));

        tr5.setBackground(java.awt.Color.green);
        tr5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr5.setText("-1");
        tr5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr5ActionPerformed(evt);
            }
        });
        jPanel1.add(tr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, 30));

        tr6.setBackground(java.awt.Color.green);
        tr6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr6.setText("-1");
        tr6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr6ActionPerformed(evt);
            }
        });
        jPanel1.add(tr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 30, 30));

        tr7.setBackground(java.awt.Color.green);
        tr7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr7.setText("-1");
        tr7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr7ActionPerformed(evt);
            }
        });
        jPanel1.add(tr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        tr8.setBackground(java.awt.Color.green);
        tr8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr8.setText("-1");
        tr8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr8ActionPerformed(evt);
            }
        });
        jPanel1.add(tr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        tr9.setBackground(java.awt.Color.green);
        tr9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr9.setText("-1");
        tr9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr9ActionPerformed(evt);
            }
        });
        jPanel1.add(tr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 30, 30));

        tr10.setBackground(java.awt.Color.green);
        tr10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr10.setText("-1");
        tr10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr10ActionPerformed(evt);
            }
        });
        jPanel1.add(tr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 30, 30));

        tr11.setBackground(java.awt.Color.green);
        tr11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr11.setText("-1");
        tr11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr11ActionPerformed(evt);
            }
        });
        jPanel1.add(tr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 30));

        tr12.setBackground(java.awt.Color.green);
        tr12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr12.setText("-1");
        tr12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr12ActionPerformed(evt);
            }
        });
        jPanel1.add(tr12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 30, 30));

        tr13.setBackground(java.awt.Color.green);
        tr13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr13.setText("-1");
        tr13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr13ActionPerformed(evt);
            }
        });
        jPanel1.add(tr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 30, 30));

        tr14.setBackground(java.awt.Color.green);
        tr14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr14.setText("-1");
        tr14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr14ActionPerformed(evt);
            }
        });
        jPanel1.add(tr14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        tr15.setBackground(java.awt.Color.green);
        tr15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr15.setText("-1");
        tr15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr15ActionPerformed(evt);
            }
        });
        jPanel1.add(tr15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 30));

        tr16.setBackground(java.awt.Color.green);
        tr16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr16.setText("-1");
        tr16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr16ActionPerformed(evt);
            }
        });
        jPanel1.add(tr16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        tr17.setBackground(java.awt.Color.green);
        tr17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr17.setText("-1");
        tr17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr17ActionPerformed(evt);
            }
        });
        jPanel1.add(tr17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        tr18.setBackground(java.awt.Color.green);
        tr18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr18.setText("-1");
        tr18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr18ActionPerformed(evt);
            }
        });
        jPanel1.add(tr18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, 30));

        tr19.setBackground(java.awt.Color.green);
        tr19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr19.setText("-1");
        tr19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr19ActionPerformed(evt);
            }
        });
        jPanel1.add(tr19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 30));

        tr20.setBackground(java.awt.Color.green);
        tr20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr20.setText("-1");
        tr20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr20ActionPerformed(evt);
            }
        });
        jPanel1.add(tr20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        tr21.setBackground(java.awt.Color.green);
        tr21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr21.setText("-1");
        tr21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr21ActionPerformed(evt);
            }
        });
        jPanel1.add(tr21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        tr22.setBackground(java.awt.Color.green);
        tr22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr22.setText("-1");
        tr22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr22ActionPerformed(evt);
            }
        });
        jPanel1.add(tr22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        tr23.setBackground(java.awt.Color.green);
        tr23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr23.setText("-1");
        tr23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr23ActionPerformed(evt);
            }
        });
        jPanel1.add(tr23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 30, 30));

        tr24.setBackground(java.awt.Color.green);
        tr24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr24.setText("-1");
        tr24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr24ActionPerformed(evt);
            }
        });
        jPanel1.add(tr24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 30, 30));

        tr25.setBackground(java.awt.Color.green);
        tr25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr25.setText("-1");
        tr25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr25ActionPerformed(evt);
            }
        });
        jPanel1.add(tr25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 30, 30));

        tr26.setBackground(java.awt.Color.green);
        tr26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr26.setText("-1");
        tr26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr26ActionPerformed(evt);
            }
        });
        jPanel1.add(tr26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        tr27.setBackground(java.awt.Color.green);
        tr27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr27.setText("-1");
        tr27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr27ActionPerformed(evt);
            }
        });
        jPanel1.add(tr27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 30, 30));

        tr28.setBackground(java.awt.Color.green);
        tr28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr28.setText("-1");
        tr28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr28ActionPerformed(evt);
            }
        });
        jPanel1.add(tr28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 30));

        tr29.setBackground(java.awt.Color.green);
        tr29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr29.setText("-1");
        tr29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr29ActionPerformed(evt);
            }
        });
        jPanel1.add(tr29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 30, 30));

        tr30.setBackground(java.awt.Color.green);
        tr30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr30.setText("-1");
        tr30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr30ActionPerformed(evt);
            }
        });
        jPanel1.add(tr30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 30));

        tr31.setBackground(java.awt.Color.green);
        tr31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr31.setText("-1");
        tr31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr31ActionPerformed(evt);
            }
        });
        jPanel1.add(tr31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, 30));

        tr32.setBackground(java.awt.Color.green);
        tr32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr32.setText("-1");
        tr32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr32ActionPerformed(evt);
            }
        });
        jPanel1.add(tr32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 30, 30));

        tr33.setBackground(java.awt.Color.green);
        tr33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr33.setText("-1");
        tr33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr33ActionPerformed(evt);
            }
        });
        jPanel1.add(tr33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        tr34.setBackground(java.awt.Color.green);
        tr34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr34.setText("-1");
        tr34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr34ActionPerformed(evt);
            }
        });
        jPanel1.add(tr34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 30, 30));

        tr35.setBackground(java.awt.Color.green);
        tr35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr35.setText("-1");
        tr35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr35ActionPerformed(evt);
            }
        });
        jPanel1.add(tr35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 30));

        tr36.setBackground(java.awt.Color.green);
        tr36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr36.setText("-1");
        tr36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr36ActionPerformed(evt);
            }
        });
        jPanel1.add(tr36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        tr37.setBackground(java.awt.Color.green);
        tr37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr37.setText("-1");
        tr37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr37ActionPerformed(evt);
            }
        });
        jPanel1.add(tr37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 30));

        tr38.setBackground(java.awt.Color.green);
        tr38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr38.setText("-1");
        tr38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr38ActionPerformed(evt);
            }
        });
        jPanel1.add(tr38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 30, 30));

        tr39.setBackground(java.awt.Color.green);
        tr39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr39.setText("-1");
        tr39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr39ActionPerformed(evt);
            }
        });
        jPanel1.add(tr39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 30, 30));

        tr40.setBackground(java.awt.Color.green);
        tr40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr40.setText("-1");
        tr40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr40ActionPerformed(evt);
            }
        });
        jPanel1.add(tr40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 30));

        tr41.setBackground(java.awt.Color.green);
        tr41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr41.setText("-1");
        tr41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr41ActionPerformed(evt);
            }
        });
        jPanel1.add(tr41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 30, 30));

        tr42.setBackground(java.awt.Color.green);
        tr42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr42.setText("-1");
        tr42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr42ActionPerformed(evt);
            }
        });
        jPanel1.add(tr42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        tr43.setBackground(java.awt.Color.green);
        tr43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr43.setText("-1");
        tr43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr43ActionPerformed(evt);
            }
        });
        jPanel1.add(tr43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 30, 30));

        tr44.setBackground(java.awt.Color.green);
        tr44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr44.setText("-1");
        tr44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr44ActionPerformed(evt);
            }
        });
        jPanel1.add(tr44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30, 30));

        tr45.setBackground(java.awt.Color.green);
        tr45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr45.setText("-1");
        tr45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr45ActionPerformed(evt);
            }
        });
        jPanel1.add(tr45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 30));

        tr46.setBackground(java.awt.Color.green);
        tr46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr46.setText("-1");
        tr46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr46ActionPerformed(evt);
            }
        });
        jPanel1.add(tr46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, 30));

        tr47.setBackground(java.awt.Color.green);
        tr47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr47.setText("-1");
        tr47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr47ActionPerformed(evt);
            }
        });
        jPanel1.add(tr47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 30, 30));

        tr48.setBackground(java.awt.Color.green);
        tr48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr48.setText("-1");
        tr48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr48ActionPerformed(evt);
            }
        });
        jPanel1.add(tr48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, 30));

        tr49.setBackground(java.awt.Color.green);
        tr49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr49.setText("-1");
        tr49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr49ActionPerformed(evt);
            }
        });
        jPanel1.add(tr49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 30, 30));

        tr50.setBackground(java.awt.Color.green);
        tr50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr50.setText("-1");
        tr50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr50ActionPerformed(evt);
            }
        });
        jPanel1.add(tr50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 30, 30));

        tr51.setBackground(java.awt.Color.green);
        tr51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr51.setText("-1");
        tr51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr51ActionPerformed(evt);
            }
        });
        jPanel1.add(tr51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30, 30));

        tr52.setBackground(java.awt.Color.green);
        tr52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr52.setText("-1");
        tr52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr52ActionPerformed(evt);
            }
        });
        jPanel1.add(tr52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 30, 30));

        tr53.setBackground(java.awt.Color.green);
        tr53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr53.setText("-1");
        tr53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr53ActionPerformed(evt);
            }
        });
        jPanel1.add(tr53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 30, 30));

        tr54.setBackground(java.awt.Color.green);
        tr54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr54.setText("-1");
        tr54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr54ActionPerformed(evt);
            }
        });
        jPanel1.add(tr54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, 30));

        tr55.setBackground(java.awt.Color.green);
        tr55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr55.setText("-1");
        tr55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr55ActionPerformed(evt);
            }
        });
        jPanel1.add(tr55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, 30));

        tr56.setBackground(java.awt.Color.green);
        tr56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr56.setText("-1");
        tr56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr56ActionPerformed(evt);
            }
        });
        jPanel1.add(tr56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 30, 30));

        tr57.setBackground(java.awt.Color.green);
        tr57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr57.setText("-1");
        tr57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr57ActionPerformed(evt);
            }
        });
        jPanel1.add(tr57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 30, 30));

        tr58.setBackground(java.awt.Color.green);
        tr58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr58.setText("-1");
        tr58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr58ActionPerformed(evt);
            }
        });
        jPanel1.add(tr58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 30, 30));

        tr59.setBackground(java.awt.Color.green);
        tr59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr59.setText("-1");
        tr59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr59ActionPerformed(evt);
            }
        });
        jPanel1.add(tr59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 30, 30));

        tr60.setBackground(java.awt.Color.green);
        tr60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr60.setText("-1");
        tr60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr60ActionPerformed(evt);
            }
        });
        jPanel1.add(tr60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 30, 30));

        tr61.setBackground(java.awt.Color.green);
        tr61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr61.setText("-1");
        tr61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr61ActionPerformed(evt);
            }
        });
        jPanel1.add(tr61, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, 30));

        tr62.setBackground(java.awt.Color.green);
        tr62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr62.setText("-1");
        tr62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr62ActionPerformed(evt);
            }
        });
        jPanel1.add(tr62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Huruf");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        t7.setBackground(java.awt.Color.green);
        t7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t7.setText("-1");
        t7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel2.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 30, 30));

        t1.setBackground(java.awt.Color.green);
        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setText("-1");
        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 30));

        t2.setBackground(java.awt.Color.green);
        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2.setText("-1");
        t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 30, 30));

        t3.setBackground(java.awt.Color.green);
        t3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3.setText("-1");
        t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 30, 30));

        t4.setBackground(java.awt.Color.green);
        t4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t4.setText("-1");
        t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, 30));

        t5.setBackground(java.awt.Color.green);
        t5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t5.setText("-1");
        t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 30, 30));

        t6.setBackground(java.awt.Color.green);
        t6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t6.setText("-1");
        t6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 30, 30));

        tr_huruf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tr_huruf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_huruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_hurufActionPerformed(evt);
            }
        });
        jPanel2.add(tr_huruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Huruf :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*Masukkan huruf yang sesuai");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Theta :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Alpha :");

        tr_thetha.setBackground(new java.awt.Color(204, 255, 255));
        tr_thetha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_thetha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_thetha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_thetha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_thethaActionPerformed(evt);
            }
        });

        tr_rate.setBackground(new java.awt.Color(204, 255, 255));
        tr_rate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_rate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_rate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_rateActionPerformed(evt);
            }
        });

        tr_training.setBackground(new java.awt.Color(255, 255, 0));
        tr_training.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr_training.setText("TRAINING");
        tr_training.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_trainingMouseClicked(evt);
            }
        });
        tr_training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_trainingActionPerformed(evt);
            }
        });

        tr_save.setBackground(new java.awt.Color(255, 0, 255));
        tr_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_save.setText("SIMPAN");
        tr_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_saveMouseClicked(evt);
            }
        });
        tr_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_saveActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.blue);
        jLabel6.setText("PROGRAM PENGENALAN HURUF");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.blue);
        jLabel7.setText("TRAINING MODE");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiperceptron/Gambar/lambang-its-png-v1.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Institut Teknologi Sepuluh Nopember Surabaya");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tr_clear.setBackground(new java.awt.Color(255, 255, 0));
        tr_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr_clear.setText("REFRESH");
        tr_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_clearMouseClicked(evt);
            }
        });
        tr_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_clearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel10.setText("Riko Wijayanto & Ayu Ni'matul F.");

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 102));

        jMenu2.setBackground(new java.awt.Color(255, 0, 153));
        jMenu2.setText("Training");
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 0, 153));
        jMenu3.setText("Testing");
        jMenu3.setActionCommand("Testing\nPetunjuk\n");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tr_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tr_thetha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(tr_save, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tr_training, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tr_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tr_thetha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tr_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(tr_save, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tr_training, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tr_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        if (t7.isSelected()) {
            t7.setBackground(Color.WHITE);
            t7.setText("1");
        } else {
            t7.setBackground(Color.GREEN);
            t7.setText("-1");
            
        }
    }//GEN-LAST:event_t7ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       if (t1.isSelected()) {
            t1.setBackground(Color.WHITE);
            t1.setText("1");
        } else {
            t1.setBackground(Color.GREEN);
            t1.setText("-1");
            
        }
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
      if (t2.isSelected()) {
            t2.setBackground(Color.WHITE);
            t2.setText("1");
        } else {
            t2.setBackground(Color.GREEN);
            t2.setText("-1");
            
        }
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
       if (t3.isSelected()) {
            t3.setBackground(Color.WHITE);
            t3.setText("1");
        } else {
            t3.setBackground(Color.GREEN);
            t3.setText("-1");
            
        }
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        if (t4.isSelected()) {
            t4.setBackground(Color.WHITE);
            t4.setText("1");
        } else {
            t4.setBackground(Color.GREEN);
            t4.setText("-1");
            
        }
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        if (t5.isSelected()) {
            t5.setBackground(Color.WHITE);
            t5.setText("1");
        } else {
            t5.setBackground(Color.GREEN);
            t5.setText("-1");
            
        }
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        if (t6.isSelected()) {
            t6.setBackground(Color.WHITE);
            t6.setText("1");
        } else {
            t6.setBackground(Color.GREEN);
            t6.setText("-1");
            
        }
    }//GEN-LAST:event_t6ActionPerformed

    private void tr_hurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_hurufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_hurufActionPerformed

    private void tr_thethaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_thethaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_thethaActionPerformed

    private void tr_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_rateActionPerformed

    private void tr_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_clearActionPerformed
        
        tr1.setSelected(false);
        tr1.setBackground(Color.GREEN);
        tr2.setSelected(false);
        tr2.setBackground(Color.GREEN);
        tr3.setSelected(false);
        tr3.setBackground(Color.GREEN);
        tr4.setSelected(false);
        tr4.setBackground(Color.GREEN);
        tr5.setSelected(false);
        tr5.setBackground(Color.GREEN);
        tr6.setSelected(false);
        tr6.setBackground(Color.GREEN);
        tr7.setSelected(false);
        tr7.setBackground(Color.GREEN);
        tr8.setSelected(false);
        tr8.setBackground(Color.GREEN);
        tr9.setSelected(false);
        tr9.setBackground(Color.GREEN);
        tr10.setSelected(false);
        tr10.setBackground(Color.GREEN);
        tr11.setSelected(false);
        tr11.setBackground(Color.GREEN);
        tr12.setSelected(false);
        tr12.setBackground(Color.GREEN);
        tr13.setSelected(false);
        tr13.setBackground(Color.GREEN);
        tr14.setSelected(false);
        tr14.setBackground(Color.GREEN);
        tr15.setSelected(false);
        tr15.setBackground(Color.GREEN);
        tr16.setSelected(false);
        tr16.setBackground(Color.GREEN);
        tr17.setSelected(false);
        tr17.setBackground(Color.GREEN);
        tr18.setSelected(false);
        tr18.setBackground(Color.GREEN);
        tr19.setSelected(false);
        tr19.setBackground(Color.GREEN);
        tr20.setSelected(false);
        tr20.setBackground(Color.GREEN);
        tr21.setSelected(false);
        tr21.setBackground(Color.GREEN);
        tr22.setSelected(false);
        tr22.setBackground(Color.GREEN);
        tr23.setSelected(false);
        tr23.setBackground(Color.GREEN);
        tr24.setSelected(false);
        tr24.setBackground(Color.GREEN);
        tr25.setSelected(false);
        tr25.setBackground(Color.GREEN);
        tr26.setSelected(false);
        tr26.setBackground(Color.GREEN);
        tr27.setSelected(false);
        tr27.setBackground(Color.GREEN);
        tr28.setSelected(false);
        tr28.setBackground(Color.GREEN);
        tr29.setSelected(false);
        tr29.setBackground(Color.GREEN);
        tr30.setSelected(false);
        tr30.setBackground(Color.GREEN);
        tr31.setSelected(false);
        tr31.setBackground(Color.GREEN);
        tr32.setSelected(false);
        tr32.setBackground(Color.GREEN);
        tr33.setSelected(false);
        tr33.setBackground(Color.GREEN);
        tr34.setSelected(false);
        tr34.setBackground(Color.GREEN);
        tr35.setSelected(false);
        tr35.setBackground(Color.GREEN);
        tr36.setSelected(false);
        tr36.setBackground(Color.GREEN);
        tr37.setSelected(false);
        tr37.setBackground(Color.GREEN);
        tr38.setSelected(false);
        tr38.setBackground(Color.GREEN);
        tr39.setSelected(false);
        tr39.setBackground(Color.GREEN);
        tr40.setSelected(false);
        tr40.setBackground(Color.GREEN);
        tr41.setSelected(false);
        tr41.setBackground(Color.GREEN);
        tr42.setSelected(false);
        tr42.setBackground(Color.GREEN);
        tr43.setSelected(false);
        tr43.setBackground(Color.GREEN);
        tr44.setSelected(false);
        tr44.setBackground(Color.GREEN);
        tr45.setSelected(false);
        tr45.setBackground(Color.GREEN);
        tr46.setSelected(false);
        tr46.setBackground(Color.GREEN);
        tr47.setSelected(false);
        tr47.setBackground(Color.GREEN);
        tr48.setSelected(false);
        tr48.setBackground(Color.GREEN);
        tr49.setSelected(false);
        tr49.setBackground(Color.GREEN);
        tr50.setSelected(false);
        tr50.setBackground(Color.GREEN);
        tr51.setSelected(false);
        tr51.setBackground(Color.GREEN);
        tr52.setSelected(false);
        tr52.setBackground(Color.GREEN);
        tr53.setSelected(false);
        tr53.setBackground(Color.GREEN);
        tr54.setSelected(false);
        tr54.setBackground(Color.GREEN);
        tr55.setSelected(false);
        tr55.setBackground(Color.GREEN);
        tr56.setSelected(false);
        tr56.setBackground(Color.GREEN);
        tr57.setSelected(false);
        tr57.setBackground(Color.GREEN);
        tr58.setSelected(false);
        tr58.setBackground(Color.GREEN);
        tr59.setSelected(false);
        tr59.setBackground(Color.GREEN);
        tr60.setSelected(false);
        tr60.setBackground(Color.GREEN);
        tr61.setSelected(false);
        tr61.setBackground(Color.GREEN);
        tr62.setSelected(false);
        tr62.setBackground(Color.GREEN);
        tr63.setSelected(false);
        tr63.setBackground(Color.GREEN);
        
        
        t1.setSelected(false);
        t1.setBackground(Color.GREEN);
        t2.setSelected(false);
        t2.setBackground(Color.GREEN);
        t3.setSelected(false);
        t3.setBackground(Color.GREEN);
        t4.setSelected(false);
        t4.setBackground(Color.GREEN);
        t5.setSelected(false);
        t5.setBackground(Color.GREEN);
        t6.setSelected(false);
        t6.setBackground(Color.GREEN);
        t7.setSelected(false);
        t7.setBackground(Color.GREEN);
        
        tr1.setText("-1");
        tr2.setText("-1");
        tr3.setText("-1");
        tr4.setText("-1");
        tr5.setText("-1");
        tr6.setText("-1");
        tr7.setText("-1");
        tr8.setText("-1");
        tr9.setText("-1");
        tr10.setText("-1");
        tr11.setText("-1");
        tr12.setText("-1");
        tr13.setText("-1");
        tr14.setText("-1");
        tr15.setText("-1");
        tr16.setText("-1");
        tr17.setText("-1");
        tr18.setText("-1");
        tr19.setText("-1");
        tr20.setText("-1");
        tr21.setText("-1");
        tr22.setText("-1");
        tr23.setText("-1");
        tr24.setText("-1");
        tr25.setText("-1");
        tr26.setText("-1");
        tr27.setText("-1");
        tr28.setText("-1");
        tr29.setText("-1");
        tr30.setText("-1");
        tr31.setText("-1");
        tr32.setText("-1");
        tr33.setText("-1");
        tr34.setText("-1");
        tr35.setText("-1");
        tr36.setText("-1");
        tr37.setText("-1");
        tr38.setText("-1");
        tr39.setText("-1");
        tr40.setText("-1");
        tr41.setText("-1");
        tr42.setText("-1");
        tr43.setText("-1");
        tr44.setText("-1");
        tr45.setText("-1");
        tr46.setText("-1");
        tr47.setText("-1");
        tr48.setText("-1");
        tr49.setText("-1");
        tr50.setText("-1");
        tr51.setText("-1");
        tr52.setText("-1");
        tr53.setText("-1");
        tr54.setText("-1");
        tr55.setText("-1");
        tr56.setText("-1");
        tr57.setText("-1");
        tr58.setText("-1");
        tr59.setText("-1");
        tr60.setText("-1");
        tr61.setText("-1");
        tr61.setText("-1");
        tr61.setText("-1");
        
        t1.setText("-1");
        t2.setText("-1");
        t3.setText("-1");
        t4.setText("-1");
        t5.setText("-1");
        t6.setText("-1");
        t7.setText("-1");
        
        tr_thetha.setText("");
        tr_rate.setText("");
        tr_huruf.setText("");
        
        tr_thetha.enable(true);
        tr_rate.enable(true);
        tr_huruf.enable(true);
        
        JOptionPane.showMessageDialog(null, "Refresh sukses");
    }//GEN-LAST:event_tr_clearActionPerformed

    private void tr_trainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_trainingActionPerformed
    if(tr_save.isSelected()){
        tr_save.enable(false);   
        for(int i=0; i<7; i++){
            bias_baru[i]=0;
            for(int j=0; j<63; j++){
              w_baru[j][i]=0;
            }
        }
          for(int i=0;  i<7; i++){
          bias_lama[i]=0;
          for(int j=0; j<63; j++){
              w_lama[j][i]=0;
          }
      } 
        
      Theta=Double.parseDouble(tr_thetha.getText());
      Alpha=Double.parseDouble(tr_rate.getText());
      
    while(stop==false){
        for(int k=0; k<p; k++){
                for(int i=0; i<63; i++){
                X[i][k]=S[i][k];
      } 
        }
        
        
        for(int k=0; k<p; k++){
      for(int i=0; i<7; i++){
          y_in[i]=bias_baru[i];
          for(int j=0; j<63; j++){
              y_in[i]=y_in[i]+(X[j][k]*w_baru[j][i]);
          }
      }

      for(int i=0; i<7; i++){
          if(y_in[i]>Theta)
                    y[i]=1;
                else if (y_in[i]<-Theta)
                    y[i]=-1;
                else
                    y[i]=0;
      }

      
      for(int i=0;i<7; i++){
          if(T[i][k]!= y[i]){
            bias_baru[i]=bias_baru[i]+(T[i][k]*Alpha);  
            for(int j=0; j<63; j++){
                w_baru[j][i]=w_baru[j][i]+(T[i][k]*X[j][k]*Alpha);
            }
          }
      else {
                  bias_lama[i]=bias_baru[i];
                  for(int j=0; j<63; j++){
                      w_lama[j][i]=w_baru[j][i];
                      
                  }
              }
          }
      
    }
      
      stop=true;
      for(int i=0; i<7; i++){
          if(bias_lama[i]!=bias_baru[i]){
              stop=false;
          }
          for(int j=0; j<63; j++){
              if(w_lama[j][i]!= w_baru[j][i]){
                  stop=false;
              }
          }
      }
       
      
    
    }
    JOptionPane.showMessageDialog(null, "Training huruf berhasil dilaksanakan");
    stop=false;    
    }
    else{
       JOptionPane.showMessageDialog(null, "Simpan Data Terlebih Dahulu"); 
    }    
    }//GEN-LAST:event_tr_trainingActionPerformed


    private void tr_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_saveActionPerformed
        if ( tr_huruf.getText().equals("") || tr_thetha.getText().equals("") || tr_rate.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kolom isian tidak boleh kosong ");
        } else { 
            tr_save.setSelected(true);
            Theta=Double.parseDouble(tr_thetha.getText());
            Alpha=Double.parseDouble(tr_rate.getText());
                if (Theta < 0 || Theta > 1 ) {
                        JOptionPane.showMessageDialog(null, "Nilai Thetha tidak boleh kosong dan harus 0 <= thetha <= 1");
                        
                    } 
                else if ( Alpha < 0 || Alpha > 1 ) {
                        JOptionPane.showMessageDialog(null, "Nilai Alfa tidak boleh kosong dan harus 0 <= Alfa <= 1 ");
                    }
            
                else {
           
            tr_huruf.enable(false);
            tr_thetha.enable(false);
            tr_thetha.enable(false);
        
        inputS[0]=tr1.getSelectedObjects();
        inputS[1]=tr2.getSelectedObjects();
        inputS[2]=tr3.getSelectedObjects();
        inputS[3]=tr4.getSelectedObjects();
        inputS[4]=tr5.getSelectedObjects();
        inputS[5]=tr6.getSelectedObjects();
        inputS[6]=tr7.getSelectedObjects();
        inputS[7]=tr8.getSelectedObjects();
        inputS[8]=tr9.getSelectedObjects();
        inputS[9]=tr10.getSelectedObjects();
        inputS[10]=tr11.getSelectedObjects();
        inputS[11]=tr12.getSelectedObjects();
        inputS[12]=tr13.getSelectedObjects();
        inputS[13]=tr14.getSelectedObjects();
        inputS[14]=tr15.getSelectedObjects();
        inputS[15]=tr16.getSelectedObjects();
        inputS[16]=tr17.getSelectedObjects();
        inputS[17]=tr18.getSelectedObjects();
        inputS[18]=tr19.getSelectedObjects();
        inputS[19]=tr20.getSelectedObjects();
        inputS[20]=tr21.getSelectedObjects();
        inputS[21]=tr22.getSelectedObjects();
        inputS[22]=tr23.getSelectedObjects();
        inputS[23]=tr24.getSelectedObjects();
        inputS[24]=tr25.getSelectedObjects();
        inputS[25]=tr26.getSelectedObjects();       
        inputS[26]=tr27.getSelectedObjects();
        inputS[27]=tr28.getSelectedObjects();
        inputS[28]=tr29.getSelectedObjects();
        inputS[29]=tr30.getSelectedObjects();
        inputS[30]=tr31.getSelectedObjects();
        inputS[31]=tr32.getSelectedObjects();
        inputS[32]=tr33.getSelectedObjects();
        inputS[33]=tr34.getSelectedObjects();
        inputS[34]=tr35.getSelectedObjects();
        inputS[35]=tr36.getSelectedObjects();
        inputS[36]=tr37.getSelectedObjects();
        inputS[37]=tr38.getSelectedObjects();
        inputS[38]=tr39.getSelectedObjects();
        inputS[39]=tr40.getSelectedObjects();
        inputS[40]=tr41.getSelectedObjects();
        inputS[41]=tr42.getSelectedObjects();
        inputS[42]=tr43.getSelectedObjects();
        inputS[43]=tr44.getSelectedObjects();
        inputS[44]=tr45.getSelectedObjects();
        inputS[45]=tr46.getSelectedObjects();
        inputS[46]=tr47.getSelectedObjects();
        inputS[47]=tr48.getSelectedObjects();
        inputS[48]=tr49.getSelectedObjects();
        inputS[49]=tr50.getSelectedObjects();
        inputS[50]=tr51.getSelectedObjects();
        inputS[51]=tr52.getSelectedObjects();
        inputS[52]=tr53.getSelectedObjects();
        inputS[53]=tr54.getSelectedObjects();
        inputS[54]=tr55.getSelectedObjects();
        inputS[55]=tr56.getSelectedObjects();
        inputS[56]=tr57.getSelectedObjects();
        inputS[57]=tr58.getSelectedObjects();
        inputS[58]=tr59.getSelectedObjects();
        inputS[59]=tr60.getSelectedObjects();
        inputS[60]=tr61.getSelectedObjects();
        inputS[61]=tr62.getSelectedObjects();
        inputS[62]=tr63.getSelectedObjects();
        
        //Menginisiasi S
        for(int i=0;i<63; i++){
            if(inputS[i]== null)
                S[i][n] =-1;
            else
                S[i][n] = 1;
        }
        
        inputT[0]=t1.getSelectedObjects();
        inputT[1]=t2.getSelectedObjects();
        inputT[2]=t3.getSelectedObjects();
        inputT[3]=t4.getSelectedObjects();
        inputT[4]=t5.getSelectedObjects();
        inputT[5]=t6.getSelectedObjects();
        inputT[6]=t7.getSelectedObjects();
        
        for(int j=0; j<7; j++){
            if(inputT[j]== null)
                T[j][n]= -1;
            else
                T[j][n]=1;
        }
        
        //Mengambil inputan huruf
        Huruf[n]=tr_huruf.getText();
        
        n=n+1;
        p=n;
        
        JOptionPane.showMessageDialog(null, "Huruf disimpan dalam database");
        }
    }//GEN-LAST:event_tr_saveActionPerformed
    }
    
    private void tr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr1ActionPerformed
       
        if (tr1.isSelected()) {
            tr1.setBackground(Color.WHITE);
            tr1.setText("1");
        } else {
            tr1.setBackground(Color.GREEN);
            tr1.setText("-1");
            
        }
    }//GEN-LAST:event_tr1ActionPerformed

    private void tr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr2ActionPerformed
        if (tr2.isSelected()) {
            tr2.setBackground(Color.WHITE);
            tr2.setText("1");
        } else {
            tr2.setBackground(Color.GREEN);
            tr2.setText("-1");
            
        }
    }//GEN-LAST:event_tr2ActionPerformed

    private void tr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr3ActionPerformed
        if (tr3.isSelected()) {
            tr3.setBackground(Color.WHITE);
            tr3.setText("1");
        } else {
            tr3.setBackground(Color.GREEN);
            tr3.setText("-1");
            
        }
    }//GEN-LAST:event_tr3ActionPerformed

    private void tr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr4ActionPerformed
        if (tr4.isSelected()) {
            tr4.setBackground(Color.WHITE);
            tr4.setText("1");
        } else {
            tr4.setBackground(Color.GREEN);
            tr4.setText("-1");
            
        }
    }//GEN-LAST:event_tr4ActionPerformed

    private void tr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr5ActionPerformed
       if (tr5.isSelected()) {
            tr5.setBackground(Color.WHITE);
            tr5.setText("1");
        } else {
            tr5.setBackground(Color.GREEN);
            tr5.setText("-1");
            
        }
    }//GEN-LAST:event_tr5ActionPerformed

    private void tr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr6ActionPerformed
        if (tr6.isSelected()) {
            tr6.setBackground(Color.WHITE);
            tr6.setText("1");
        } else {
            tr6.setBackground(Color.GREEN);
            tr6.setText("-1");
            
        }
    }//GEN-LAST:event_tr6ActionPerformed

    private void tr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr7ActionPerformed
        if (tr7.isSelected()) {
            tr7.setBackground(Color.WHITE);
            tr7.setText("1");
        } else {
            tr7.setBackground(Color.GREEN);
            tr7.setText("-1");
            
        }
    }//GEN-LAST:event_tr7ActionPerformed

    private void tr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr8ActionPerformed
        if (tr8.isSelected()) {
            tr8.setBackground(Color.WHITE);
            tr8.setText("1");
        } else {
            tr8.setBackground(Color.GREEN);
            tr8.setText("-1");
            
        }
    }//GEN-LAST:event_tr8ActionPerformed

    private void tr30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr30ActionPerformed
        if (tr30.isSelected()) {
            tr30.setBackground(Color.WHITE);
            tr30.setText("1");
        } else {
            tr30.setBackground(Color.GREEN);
            tr30.setText("-1");
            
        }
    }//GEN-LAST:event_tr30ActionPerformed

    private void tr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr9ActionPerformed
        if (tr9.isSelected()) {
            tr9.setBackground(Color.WHITE);
            tr9.setText("1");
        } else {
            tr9.setBackground(Color.GREEN);
            tr9.setText("-1");
            
        }
    }//GEN-LAST:event_tr9ActionPerformed

    private void tr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr11ActionPerformed
        if (tr11.isSelected()) {
            tr11.setBackground(Color.WHITE);
            tr11.setText("1");
        } else {
            tr11.setBackground(Color.GREEN);
            tr11.setText("-1");
            
        }
    }//GEN-LAST:event_tr11ActionPerformed

    private void tr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr10ActionPerformed
        if (tr10.isSelected()) {
            tr10.setBackground(Color.WHITE);
            tr10.setText("1");
        } else {
            tr10.setBackground(Color.GREEN);
            tr10.setText("-1");
            
        }
    }//GEN-LAST:event_tr10ActionPerformed

    private void tr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr12ActionPerformed
        if (tr12.isSelected()) {
            tr12.setBackground(Color.WHITE);
            tr12.setText("1");
        } else {
            tr12.setBackground(Color.GREEN);
            tr12.setText("-1");
            
        }
    }//GEN-LAST:event_tr12ActionPerformed

    private void tr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr13ActionPerformed
        if (tr13.isSelected()) {
            tr13.setBackground(Color.WHITE);
            tr13.setText("1");
        } else {
            tr13.setBackground(Color.GREEN);
            tr13.setText("-1");
            
        }
    }//GEN-LAST:event_tr13ActionPerformed

    private void tr14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr14ActionPerformed
        if (tr14.isSelected()) {
            tr14.setBackground(Color.WHITE);
            tr14.setText("1");
        } else {
            tr14.setBackground(Color.GREEN);
            tr14.setText("-1");
            
        }
    }//GEN-LAST:event_tr14ActionPerformed

    private void tr15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr15ActionPerformed
        if (tr15.isSelected()) {
            tr15.setBackground(Color.WHITE);
            tr15.setText("1");
        } else {
            tr15.setBackground(Color.GREEN);
            tr15.setText("-1");
            
        }
    }//GEN-LAST:event_tr15ActionPerformed

    private void tr16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr16ActionPerformed
       if (tr16.isSelected()) {
            tr16.setBackground(Color.WHITE);
            tr16.setText("1");
        } else {
            tr16.setBackground(Color.GREEN);
            tr16.setText("-1");
            
        }
    }//GEN-LAST:event_tr16ActionPerformed

    private void tr17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr17ActionPerformed
        if (tr17.isSelected()) {
            tr17.setBackground(Color.WHITE);
            tr17.setText("1");
        } else {
            tr17.setBackground(Color.GREEN);
            tr17.setText("-1");
            
        }
    }//GEN-LAST:event_tr17ActionPerformed

    private void tr18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr18ActionPerformed
        if (tr18.isSelected()) {
            tr18.setBackground(Color.WHITE);
            tr18.setText("1");
        } else {
            tr18.setBackground(Color.GREEN);
            tr18.setText("-1");
            
        }
    }//GEN-LAST:event_tr18ActionPerformed

    private void tr19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr19ActionPerformed
       if (tr19.isSelected()) {
            tr19.setBackground(Color.WHITE);
            tr19.setText("1");
        } else {
            tr19.setBackground(Color.GREEN);
            tr19.setText("-1");
            
        }
    }//GEN-LAST:event_tr19ActionPerformed

    private void tr20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr20ActionPerformed
        if (tr20.isSelected()) {
            tr20.setBackground(Color.WHITE);
            tr20.setText("1");
        } else {
            tr20.setBackground(Color.GREEN);
            tr20.setText("-1");
            
        }
    }//GEN-LAST:event_tr20ActionPerformed

    private void tr21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr21ActionPerformed
        if (tr21.isSelected()) {
            tr21.setBackground(Color.WHITE);
            tr21.setText("1");
        } else {
            tr21.setBackground(Color.GREEN);
            tr21.setText("-1");
            
        }
    }//GEN-LAST:event_tr21ActionPerformed

    private void tr22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr22ActionPerformed
        if (tr22.isSelected()) {
            tr22.setBackground(Color.WHITE);
            tr22.setText("1");
        } else {
            tr22.setBackground(Color.GREEN);
            tr22.setText("-1");
            
        }
    }//GEN-LAST:event_tr22ActionPerformed

    private void tr23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr23ActionPerformed
       if (tr23.isSelected()) {
            tr23.setBackground(Color.WHITE);
            tr23.setText("1");
        } else {
            tr23.setBackground(Color.GREEN);
            tr23.setText("-1");
            
        }
    }//GEN-LAST:event_tr23ActionPerformed

    private void tr24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr24ActionPerformed
        if (tr24.isSelected()) {
            tr24.setBackground(Color.WHITE);
            tr24.setText("1");
        } else {
            tr24.setBackground(Color.GREEN);
            tr24.setText("-1");
            
        }
    }//GEN-LAST:event_tr24ActionPerformed

    private void tr25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr25ActionPerformed
       if (tr25.isSelected()) {
            tr25.setBackground(Color.WHITE);
            tr25.setText("1");
        } else {
            tr25.setBackground(Color.GREEN);
            tr25.setText("-1");
            
        }
    }//GEN-LAST:event_tr25ActionPerformed

    private void tr26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr26ActionPerformed
        if (tr26.isSelected()) {
            tr26.setBackground(Color.WHITE);
            tr26.setText("1");
        } else {
            tr26.setBackground(Color.GREEN);
            tr26.setText("-1");
            
        }
    }//GEN-LAST:event_tr26ActionPerformed

    private void tr27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr27ActionPerformed
        if (tr27.isSelected()) {
            tr27.setBackground(Color.WHITE);
            tr27.setText("1");
        } else {
            tr27.setBackground(Color.GREEN);
            tr27.setText("-1");
            
        }
    }//GEN-LAST:event_tr27ActionPerformed

    private void tr28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr28ActionPerformed
        if (tr28.isSelected()) {
            tr28.setBackground(Color.WHITE);
            tr28.setText("1");
        } else {
            tr28.setBackground(Color.GREEN);
            tr28.setText("-1");
            
        }
    }//GEN-LAST:event_tr28ActionPerformed

    private void tr29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr29ActionPerformed
        if (tr29.isSelected()) {
            tr29.setBackground(Color.WHITE);
            tr29.setText("1");
        } else {
            tr29.setBackground(Color.GREEN);
            tr29.setText("-1");
            
        }
    }//GEN-LAST:event_tr29ActionPerformed

    private void tr31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr31ActionPerformed
        if (tr31.isSelected()) {
            tr31.setBackground(Color.WHITE);
            tr31.setText("1");
        } else {
            tr31.setBackground(Color.GREEN);
            tr31.setText("-1");
            
        }
    }//GEN-LAST:event_tr31ActionPerformed

    private void tr32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr32ActionPerformed
        if (tr32.isSelected()) {
            tr32.setBackground(Color.WHITE);
            tr32.setText("1");
        } else {
            tr32.setBackground(Color.GREEN);
            tr32.setText("-1");
            
        }
    }//GEN-LAST:event_tr32ActionPerformed

    private void tr33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr33ActionPerformed
        if (tr33.isSelected()) {
            tr33.setBackground(Color.WHITE);
            tr33.setText("1");
        } else {
            tr33.setBackground(Color.GREEN);
            tr33.setText("-1");
            
        }
    }//GEN-LAST:event_tr33ActionPerformed

    private void tr34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr34ActionPerformed
        if (tr34.isSelected()) {
            tr34.setBackground(Color.WHITE);
            tr34.setText("1");
        } else {
            tr34.setBackground(Color.GREEN);
            tr34.setText("-1");
            
        }
    }//GEN-LAST:event_tr34ActionPerformed

    private void tr35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr35ActionPerformed
        if (tr35.isSelected()) {
            tr35.setBackground(Color.WHITE);
            tr35.setText("1");
        } else {
            tr35.setBackground(Color.GREEN);
            tr35.setText("-1");
            
        }
    }//GEN-LAST:event_tr35ActionPerformed

    private void tr36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr36ActionPerformed
        if (tr36.isSelected()) {
            tr36.setBackground(Color.WHITE);
            tr36.setText("1");
        } else {
            tr36.setBackground(Color.GREEN);
            tr36.setText("-1");
            
        }
    }//GEN-LAST:event_tr36ActionPerformed

    private void tr37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr37ActionPerformed
        if (tr37.isSelected()) {
            tr37.setBackground(Color.WHITE);
            tr37.setText("1");
        } else {
            tr37.setBackground(Color.GREEN);
            tr37.setText("-1");
            
        }
    }//GEN-LAST:event_tr37ActionPerformed

    private void tr38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr38ActionPerformed
        if (tr38.isSelected()) {
            tr38.setBackground(Color.WHITE);
            tr38.setText("1");
        } else {
            tr38.setBackground(Color.GREEN);
            tr38.setText("-1");
            
        }
    }//GEN-LAST:event_tr38ActionPerformed

    private void tr39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr39ActionPerformed
        if (tr39.isSelected()) {
            tr39.setBackground(Color.WHITE);
            tr39.setText("1");
        } else {
            tr39.setBackground(Color.GREEN);
            tr39.setText("-1");
            
        }
    }//GEN-LAST:event_tr39ActionPerformed

    private void tr40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr40ActionPerformed
        if (tr40.isSelected()) {
            tr40.setBackground(Color.WHITE);
            tr40.setText("1");
        } else {
            tr40.setBackground(Color.GREEN);
            tr40.setText("-1");
            
        }
    }//GEN-LAST:event_tr40ActionPerformed

    private void tr41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr41ActionPerformed
       if (tr41.isSelected()) {
            tr41.setBackground(Color.WHITE);
            tr41.setText("1");
        } else {
            tr41.setBackground(Color.GREEN);
            tr41.setText("-1");
            
        }
    }//GEN-LAST:event_tr41ActionPerformed

    private void tr42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr42ActionPerformed
        if (tr42.isSelected()) {
            tr42.setBackground(Color.WHITE);
            tr42.setText("1");
        } else {
            tr42.setBackground(Color.GREEN);
            tr42.setText("-1");
            
        }
    }//GEN-LAST:event_tr42ActionPerformed

    private void tr43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr43ActionPerformed
        if (tr43.isSelected()) {
            tr43.setBackground(Color.WHITE);
            tr43.setText("1");
        } else {
            tr43.setBackground(Color.GREEN);
            tr43.setText("-1");
            
        }
    }//GEN-LAST:event_tr43ActionPerformed

    private void tr44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr44ActionPerformed
        if (tr44.isSelected()) {
            tr44.setBackground(Color.WHITE);
            tr44.setText("1");
        } else {
            tr44.setBackground(Color.GREEN);
            tr44.setText("-1");
            
        }
    }//GEN-LAST:event_tr44ActionPerformed

    private void tr45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr45ActionPerformed
        if (tr45.isSelected()) {
            tr45.setBackground(Color.WHITE);
            tr45.setText("1");
        } else {
            tr45.setBackground(Color.GREEN);
            tr45.setText("-1");
            
        }
    }//GEN-LAST:event_tr45ActionPerformed

    private void tr46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr46ActionPerformed
        if (tr46.isSelected()) {
            tr46.setBackground(Color.WHITE);
            tr46.setText("1");
        } else {
            tr46.setBackground(Color.GREEN);
            tr46.setText("-1");
            
        }
    }//GEN-LAST:event_tr46ActionPerformed

    private void tr47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr47ActionPerformed
        if (tr47.isSelected()) {
            tr47.setBackground(Color.WHITE);
            tr47.setText("1");
        } else {
            tr47.setBackground(Color.GREEN);
            tr47.setText("-1");
            
        }
    }//GEN-LAST:event_tr47ActionPerformed

    private void tr48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr48ActionPerformed
       if (tr48.isSelected()) {
            tr48.setBackground(Color.WHITE);
            tr48.setText("1");
        } else {
            tr48.setBackground(Color.GREEN);
            tr48.setText("-1");
            
        }
    }//GEN-LAST:event_tr48ActionPerformed

    private void tr49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr49ActionPerformed
        if (tr49.isSelected()) {
            tr49.setBackground(Color.WHITE);
            tr49.setText("1");
        } else {
            tr49.setBackground(Color.GREEN);
            tr49.setText("-1");
            
        }
    }//GEN-LAST:event_tr49ActionPerformed

    private void tr50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr50ActionPerformed
        if (tr50.isSelected()) {
            tr50.setBackground(Color.WHITE);
            tr50.setText("1");
        } else {
            tr50.setBackground(Color.GREEN);
            tr50.setText("-1");
            
        }
    }//GEN-LAST:event_tr50ActionPerformed

    private void tr51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr51ActionPerformed
        if (tr51.isSelected()) {
            tr51.setBackground(Color.WHITE);
            tr51.setText("1");
        } else {
            tr51.setBackground(Color.GREEN);
            tr51.setText("-1");
            
        }
    }//GEN-LAST:event_tr51ActionPerformed

    private void tr52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr52ActionPerformed
        if (tr52.isSelected()) {
            tr52.setBackground(Color.WHITE);
            tr52.setText("1");
        } else {
            tr52.setBackground(Color.GREEN);
            tr52.setText("-1");
            
        }
    }//GEN-LAST:event_tr52ActionPerformed

    private void tr53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr53ActionPerformed
        if (tr53.isSelected()) {
            tr53.setBackground(Color.WHITE);
            tr53.setText("1");
        } else {
            tr53.setBackground(Color.GREEN);
            tr53.setText("-1");
            
        }
    }//GEN-LAST:event_tr53ActionPerformed

    private void tr54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr54ActionPerformed
       if (tr54.isSelected()) {
            tr54.setBackground(Color.WHITE);
            tr54.setText("1");
        } else {
            tr54.setBackground(Color.GREEN);
            tr54.setText("-1");
            
        }
    }//GEN-LAST:event_tr54ActionPerformed

    private void tr55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr55ActionPerformed
       if (tr55.isSelected()) {
            tr55.setBackground(Color.WHITE);
            tr55.setText("1");
        } else {
            tr55.setBackground(Color.GREEN);
            tr55.setText("-1");
            
        }
    }//GEN-LAST:event_tr55ActionPerformed

    private void tr56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr56ActionPerformed
        if (tr56.isSelected()) {
            tr56.setBackground(Color.WHITE);
            tr56.setText("1");
        } else {
            tr56.setBackground(Color.GREEN);
            tr56.setText("-1");
            
        }
    }//GEN-LAST:event_tr56ActionPerformed

    private void tr57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr57ActionPerformed
        if (tr57.isSelected()) {
            tr57.setBackground(Color.WHITE);
            tr57.setText("1");
        } else {
            tr57.setBackground(Color.GREEN);
            tr57.setText("-1");
            
        }
    }//GEN-LAST:event_tr57ActionPerformed

    private void tr58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr58ActionPerformed
        if (tr58.isSelected()) {
            tr58.setBackground(Color.WHITE);
            tr58.setText("1");
        } else {
            tr58.setBackground(Color.GREEN);
            tr58.setText("-1");
            
        }
    }//GEN-LAST:event_tr58ActionPerformed

    private void tr59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr59ActionPerformed
        if (tr59.isSelected()) {
            tr59.setBackground(Color.WHITE);
            tr59.setText("1");
        } else {
            tr59.setBackground(Color.GREEN);
            tr59.setText("-1");
            
        }
    }//GEN-LAST:event_tr59ActionPerformed

    private void tr60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr60ActionPerformed
        if (tr60.isSelected()) {
            tr60.setBackground(Color.WHITE);
            tr60.setText("1");
        } else {
            tr60.setBackground(Color.GREEN);
            tr60.setText("-1");
            
        }
    }//GEN-LAST:event_tr60ActionPerformed

    private void tr61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr61ActionPerformed
        if (tr61.isSelected()) {
            tr61.setBackground(Color.WHITE);
            tr61.setText("1");
        } else {
            tr61.setBackground(Color.GREEN);
            tr61.setText("-1");
            
        }
    }//GEN-LAST:event_tr61ActionPerformed

    private void tr62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr62ActionPerformed
        if (tr62.isSelected()) {
            tr62.setBackground(Color.WHITE);
            tr62.setText("1");
        } else {
            tr62.setBackground(Color.GREEN);
            tr62.setText("-1");
            
        }
    }//GEN-LAST:event_tr62ActionPerformed

    private void tr63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr63ActionPerformed
        if (tr63.isSelected()) {
            tr63.setBackground(Color.WHITE);
            tr63.setText("1");
        } else {
            tr63.setBackground(Color.GREEN);
            tr63.setText("-1");
            
        }
    }//GEN-LAST:event_tr63ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Testing testing = new Testing(bias_baru, w_baru, Huruf, T, p, S, Theta);
        testing.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void tr_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_clearMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void tr_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_saveMouseClicked
       
    }//GEN-LAST:event_tr_saveMouseClicked

    private void tr_trainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_trainingMouseClicked
             
    }//GEN-LAST:event_tr_trainingMouseClicked

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
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton t1;
    private javax.swing.JToggleButton t2;
    private javax.swing.JToggleButton t3;
    private javax.swing.JToggleButton t4;
    private javax.swing.JToggleButton t5;
    private javax.swing.JToggleButton t6;
    private javax.swing.JToggleButton t7;
    private javax.swing.JToggleButton tr1;
    private javax.swing.JToggleButton tr10;
    private javax.swing.JToggleButton tr11;
    private javax.swing.JToggleButton tr12;
    private javax.swing.JToggleButton tr13;
    private javax.swing.JToggleButton tr14;
    private javax.swing.JToggleButton tr15;
    private javax.swing.JToggleButton tr16;
    private javax.swing.JToggleButton tr17;
    private javax.swing.JToggleButton tr18;
    private javax.swing.JToggleButton tr19;
    private javax.swing.JToggleButton tr2;
    private javax.swing.JToggleButton tr20;
    private javax.swing.JToggleButton tr21;
    private javax.swing.JToggleButton tr22;
    private javax.swing.JToggleButton tr23;
    private javax.swing.JToggleButton tr24;
    private javax.swing.JToggleButton tr25;
    private javax.swing.JToggleButton tr26;
    private javax.swing.JToggleButton tr27;
    private javax.swing.JToggleButton tr28;
    private javax.swing.JToggleButton tr29;
    private javax.swing.JToggleButton tr3;
    private javax.swing.JToggleButton tr30;
    private javax.swing.JToggleButton tr31;
    private javax.swing.JToggleButton tr32;
    private javax.swing.JToggleButton tr33;
    private javax.swing.JToggleButton tr34;
    private javax.swing.JToggleButton tr35;
    private javax.swing.JToggleButton tr36;
    private javax.swing.JToggleButton tr37;
    private javax.swing.JToggleButton tr38;
    private javax.swing.JToggleButton tr39;
    private javax.swing.JToggleButton tr4;
    private javax.swing.JToggleButton tr40;
    private javax.swing.JToggleButton tr41;
    private javax.swing.JToggleButton tr42;
    private javax.swing.JToggleButton tr43;
    private javax.swing.JToggleButton tr44;
    private javax.swing.JToggleButton tr45;
    private javax.swing.JToggleButton tr46;
    private javax.swing.JToggleButton tr47;
    private javax.swing.JToggleButton tr48;
    private javax.swing.JToggleButton tr49;
    private javax.swing.JToggleButton tr5;
    private javax.swing.JToggleButton tr50;
    private javax.swing.JToggleButton tr51;
    private javax.swing.JToggleButton tr52;
    private javax.swing.JToggleButton tr53;
    private javax.swing.JToggleButton tr54;
    private javax.swing.JToggleButton tr55;
    private javax.swing.JToggleButton tr56;
    private javax.swing.JToggleButton tr57;
    private javax.swing.JToggleButton tr58;
    private javax.swing.JToggleButton tr59;
    private javax.swing.JToggleButton tr6;
    private javax.swing.JToggleButton tr60;
    private javax.swing.JToggleButton tr61;
    private javax.swing.JToggleButton tr62;
    private javax.swing.JToggleButton tr63;
    private javax.swing.JToggleButton tr7;
    private javax.swing.JToggleButton tr8;
    private javax.swing.JToggleButton tr9;
    private javax.swing.JButton tr_clear;
    private javax.swing.JTextField tr_huruf;
    private javax.swing.JTextField tr_rate;
    private javax.swing.JButton tr_save;
    private javax.swing.JTextField tr_thetha;
    private javax.swing.JButton tr_training;
    // End of variables declaration//GEN-END:variables
}
