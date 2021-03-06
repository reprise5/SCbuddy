package scbuddy;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 * @author Miss Prism (Reprise)
 */
public class SCform extends javax.swing.JFrame {

    public SCform() {
        initComponents();
        ardyProgress.setMinimum(0);
        ardyProgress.setMaximum(15);
        canifisProgress.setMinimum(0);
        canifisProgress.setMaximum(15);
        catherbyProgress.setMinimum(0);
        catherbyProgress.setMaximum(15);
        fallyProgress.setMinimum(0);
        fallyProgress.setMaximum(15);
        zeahProgress.setMinimum(0);
        zeahProgress.setMaximum(15);
        trollheimProgress.setMinimum(0);
        trollheimProgress.setMaximum(15); 
        
        //This load routine uses a hard-coded path to the init file on my HDD.
        load();
        setProgress();
        setColors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        ardySpinner = new javax.swing.JSpinner();
        ardyReset = new javax.swing.JButton();
        canifisReset = new javax.swing.JButton();
        catherbyReset = new javax.swing.JButton();
        fallyReset = new javax.swing.JButton();
        zeahReset = new javax.swing.JButton();
        trollheimReset = new javax.swing.JButton();
        canifisSpinner = new javax.swing.JSpinner();
        catherbySpinner = new javax.swing.JSpinner();
        fallySpinner = new javax.swing.JSpinner();
        zeahSpinner = new javax.swing.JSpinner();
        trollheimSpinner = new javax.swing.JSpinner();
        ardyLabel = new javax.swing.JLabel();
        canifisLabel = new javax.swing.JLabel();
        catherbyLabel = new javax.swing.JLabel();
        faladorLabel = new javax.swing.JLabel();
        zeahLabel = new javax.swing.JLabel();
        trollheimLabel = new javax.swing.JLabel();
        ardyProgress = new javax.swing.JProgressBar();
        canifisProgress = new javax.swing.JProgressBar();
        catherbyProgress = new javax.swing.JProgressBar();
        fallyProgress = new javax.swing.JProgressBar();
        zeahProgress = new javax.swing.JProgressBar();
        trollheimProgress = new javax.swing.JProgressBar();
        ardyDecr = new javax.swing.JButton();
        canifisDecr = new javax.swing.JButton();
        catherbyDecr = new javax.swing.JButton();
        fallyDecr = new javax.swing.JButton();
        zeahDecr = new javax.swing.JButton();
        trollheimDecr = new javax.swing.JButton();
        statusbar = new javax.swing.JLabel();
        ultraBox1 = new javax.swing.JCheckBox();
        ultraBox2 = new javax.swing.JCheckBox();
        ultraBox3 = new javax.swing.JCheckBox();
        ultraBox4 = new javax.swing.JCheckBox();
        ultraBox5 = new javax.swing.JCheckBox();
        ultraBox6 = new javax.swing.JCheckBox();
        jMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        actionsMenu = new javax.swing.JMenu();
        resetAllMenuItem = new javax.swing.JMenuItem();
        blankAllMenuItem = new javax.swing.JMenuItem();
        submitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OSRS Super Compost Buddy");
        setAlwaysOnTop(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(JFrame.class.getResource("/scbuddy/SCbuddy-ico.png")));

        ardySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        ardyReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        ardyReset.setText("REFILL");
        ardyReset.setToolTipText("");
        ardyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ardyResetActionPerformed(evt);
            }
        });

        canifisReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        canifisReset.setText("REFILL");
        canifisReset.setToolTipText("");
        canifisReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canifisResetActionPerformed(evt);
            }
        });

        catherbyReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        catherbyReset.setText("REFILL");
        catherbyReset.setToolTipText("");
        catherbyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catherbyResetActionPerformed(evt);
            }
        });

        fallyReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        fallyReset.setText("REFILL");
        fallyReset.setToolTipText("");
        fallyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fallyResetActionPerformed(evt);
            }
        });

        zeahReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        zeahReset.setText("REFILL");
        zeahReset.setToolTipText("");
        zeahReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeahResetActionPerformed(evt);
            }
        });

        trollheimReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        trollheimReset.setText("REFILL");
        trollheimReset.setToolTipText("");
        trollheimReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trollheimResetActionPerformed(evt);
            }
        });

        canifisSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        catherbySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        fallySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        zeahSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        trollheimSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        ardyLabel.setText("Ardougne");

        canifisLabel.setText("Canifis");

        catherbyLabel.setText("Catherby");

        faladorLabel.setText("Falador");
        faladorLabel.setToolTipText("");

        zeahLabel.setText("Zeah");
        zeahLabel.setToolTipText("");

        trollheimLabel.setText("Trollheim");
        trollheimLabel.setToolTipText("");

        ardyDecr.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        ardyDecr.setText("DECR.");
        ardyDecr.setToolTipText("");
        ardyDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ardyDecrActionPerformed(evt);
            }
        });

        canifisDecr.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        canifisDecr.setText("DECR.");
        canifisDecr.setToolTipText("");
        canifisDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canifisDecrActionPerformed(evt);
            }
        });

        catherbyDecr.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        catherbyDecr.setText("DECR.");
        catherbyDecr.setToolTipText("");
        catherbyDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catherbyDecrActionPerformed(evt);
            }
        });

        fallyDecr.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        fallyDecr.setText("DECR.");
        fallyDecr.setToolTipText("");
        fallyDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fallyDecrActionPerformed(evt);
            }
        });

        zeahDecr.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        zeahDecr.setText("DECR.");
        zeahDecr.setToolTipText("");
        zeahDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeahDecrActionPerformed(evt);
            }
        });

        trollheimDecr.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        trollheimDecr.setText("DECR.");
        trollheimDecr.setToolTipText("");
        trollheimDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trollheimDecrActionPerformed(evt);
            }
        });

        statusbar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusbar.setText("Welcome");

        ultraBox1.setText("Ultra");
        ultraBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultraBox1ActionPerformed(evt);
            }
        });

        ultraBox2.setText("Ultra");
        ultraBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultraBox2ActionPerformed(evt);
            }
        });

        ultraBox3.setText("Ultra");
        ultraBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultraBox3ActionPerformed(evt);
            }
        });

        ultraBox4.setText("Ultra");
        ultraBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultraBox4ActionPerformed(evt);
            }
        });

        ultraBox5.setText("Ultra");
        ultraBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultraBox5ActionPerformed(evt);
            }
        });

        ultraBox6.setText("Ultra");
        ultraBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultraBox6ActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Open Config");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Save Config");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        jMenuBar.add(fileMenu);

        actionsMenu.setText("Actions");

        resetAllMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        resetAllMenuItem.setText("Reset All");
        resetAllMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAllMenuItemActionPerformed(evt);
            }
        });
        actionsMenu.add(resetAllMenuItem);

        blankAllMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_MASK));
        blankAllMenuItem.setText("Set all 0");
        blankAllMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blankAllMenuItemActionPerformed(evt);
            }
        });
        actionsMenu.add(blankAllMenuItem);

        submitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        submitMenuItem.setText("SUBMIT");
        submitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitMenuItemActionPerformed(evt);
            }
        });
        actionsMenu.add(submitMenuItem);

        jMenuBar.add(actionsMenu);

        helpMenu.setText("Help");

        jMenuItem1.setText("How To");
        helpMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("About");
        helpMenu.add(jMenuItem2);

        jMenuBar.add(helpMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ardyLabel)
                    .addComponent(canifisLabel)
                    .addComponent(catherbyLabel)
                    .addComponent(faladorLabel)
                    .addComponent(zeahLabel)
                    .addComponent(trollheimLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(catherbyDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(catherbySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ardyDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ardySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(canifisDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(canifisSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fallyDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fallySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(zeahDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(trollheimDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trollheimSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ultraBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trollheimReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ultraBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ardyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ultraBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(canifisReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ultraBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(catherbyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canifisProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(catherbyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ardyProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(trollheimProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ultraBox4)
                            .addComponent(ultraBox5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fallyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zeahReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zeahProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(fallyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusbar, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ardySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ardyDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ardyLabel)
                        .addComponent(ultraBox1)
                        .addComponent(ardyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ardyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(canifisDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(canifisSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(canifisLabel)
                        .addComponent(ultraBox2)
                        .addComponent(canifisReset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(canifisProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(catherbyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(catherbySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(catherbyDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(catherbyLabel)
                        .addComponent(ultraBox3)
                        .addComponent(catherbyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ultraBox4)
                        .addComponent(fallySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fallyDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(faladorLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fallyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fallyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zeahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeahProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zeahDecr)
                        .addComponent(zeahLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(zeahReset)
                        .addComponent(ultraBox5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(trollheimProgress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trollheimReset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trollheimLabel)
                        .addComponent(trollheimDecr))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trollheimSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ultraBox6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusbar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Open a file to restore previous configuration / program state
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File openedFile = fileChooser.getSelectedFile();
            System.out.println("IN Selected file: " + openedFile.getAbsolutePath());         
            try {
                Scanner input = new Scanner(openedFile);
                while (input.hasNext()) {
                    ardy = input.nextInt();
                    canifis = input.nextInt();
                    catherby = input.nextInt();
                    fally = input.nextInt();
                    zeah = input.nextInt();
                    trollheim = input.nextInt();  
                    ultraBox1.setSelected(input.nextBoolean());
                    ultraBox2.setSelected(input.nextBoolean());
                    ultraBox3.setSelected(input.nextBoolean());
                    ultraBox4.setSelected(input.nextBoolean());
                    ultraBox5.setSelected(input.nextBoolean());
                    ultraBox5.setSelected(input.nextBoolean());
                }
                statusbar.setText("Successfully opened config file.");
            } 
            catch (FileNotFoundException e) {
                e.getMessage();
            }
            catch (InputMismatchException m) {
                System.out.println("OPEN: Input formatting error. Records 1-6 = int, records 7-12 = boolean.");
            }
            
            setColors();
            System.out.println("INPUT AS FOLLOWS: \n"
                + "ardy " + ardy
                + "\ncanifis " + canifis
                + "\ncatherby " + catherby
                + "\nfally " + fally
                + "\nzeah " + zeah
                + "\ntrollheim " + trollheim);
            
            ardySpinner.setValue(ardy);
            canifisSpinner.setValue(canifis);
            catherbySpinner.setValue(catherby);
            fallySpinner.setValue(fally);
            zeahSpinner.setValue(zeah);
            trollheimSpinner.setValue(trollheim);
            setProgress();
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    //update the values by pressing enter on the form after using spinners.
    private void submitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitMenuItemActionPerformed
        ardy = (int)ardySpinner.getValue();
        canifis = (int)canifisSpinner.getValue();
        catherby = (int)catherbySpinner.getValue();
        fally = (int)fallySpinner.getValue();
        zeah = (int)zeahSpinner.getValue();
        trollheim = (int)trollheimSpinner.getValue();
        setProgress();
        
        //Specific to me.  Because It's my program.
        save();
    }//GEN-LAST:event_submitMenuItemActionPerformed


    /*                        :: Reset/refill ::                
     * If a bin is 14 and lower, hitting refill buttons will refill it to 15.
     * if it is already 15, and refill is pressed, it will empty it to 0.
     */
    //set Ardy to 15.
    private void ardyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ardyResetActionPerformed
        ultraBox1.setSelected(false);
        
        if (ardy < 15 || ardy == 0){
            ardy = 15;
            ardySpinner.setValue(ardy);
            ardyProgress.setValue(ardy); 
            ardyLabel.setForeground(Color.white);
        }
        //the only condition left is if ardy == 15.  then empty it.
        else{ 
            ardy = 0;
            ardySpinner.setValue(ardy);
            ardyProgress.setValue(ardy); 
            ardyLabel.setForeground(Color.red);
        }
        
        //set focus to some other non-button component so when user hits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_ardyResetActionPerformed

    //set Canifis to 15.
    private void canifisResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canifisResetActionPerformed
        ultraBox2.setSelected(false);
        
        if (canifis < 15 || canifis == 0){
            canifis = 15;
            canifisSpinner.setValue(canifis);
            canifisProgress.setValue(canifis);
            canifisLabel.setForeground(Color.white);
        }
        else{ 
            canifis = 0;
            canifisSpinner.setValue(canifis);
            canifisProgress.setValue(canifis); 
            canifisLabel.setForeground(Color.red);
        }
        ardyLabel.requestFocus();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_canifisResetActionPerformed

    //set Catherby to 15.
    private void catherbyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catherbyResetActionPerformed
        ultraBox3.setSelected(false);
        
        if (catherby < 15 || catherby == 0){
            catherby = 15;
            catherbySpinner.setValue(catherby);
            catherbyProgress.setValue(catherby);
            catherbyLabel.setForeground(Color.white);
        }
        else{ 
            catherby = 0;
            catherbySpinner.setValue(catherby);
            catherbyProgress.setValue(catherby); 
            catherbyLabel.setForeground(Color.red);
        }
        ardyLabel.requestFocus();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_catherbyResetActionPerformed

    //set Falador to 15.
    private void fallyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fallyResetActionPerformed
        ultraBox4.setSelected(false);
        
        if (fally < 15 || fally == 0){
            fally = 15;
            fallySpinner.setValue(fally);
            fallyProgress.setValue(fally);
            faladorLabel.setForeground(Color.white);
        }
        else{ 
            fally = 0;
            fallySpinner.setValue(fally);
            fallyProgress.setValue(fally); 
            faladorLabel.setForeground(Color.red);
        }
        ardyLabel.requestFocus();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_fallyResetActionPerformed

    //set zeah/hosidius to 15.
    private void zeahResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeahResetActionPerformed
        ultraBox5.setSelected(false);
        
        if (zeah < 15 || zeah == 0){
            zeah = 15;
            zeahSpinner.setValue(zeah);
            zeahProgress.setValue(zeah);
            zeahLabel.setForeground(Color.white);
        }
        else{ 
            zeah = 0;
            zeahSpinner.setValue(zeah);
            zeahProgress.setValue(zeah); 
            zeahLabel.setForeground(Color.red);
        }
        ardyLabel.requestFocus();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_zeahResetActionPerformed

    //set trollheim to 15.
    private void trollheimResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trollheimResetActionPerformed
        ultraBox6.setSelected(false);
        
        if (trollheim < 15 || trollheim  == 0){
            trollheim  = 15;
            trollheimSpinner.setValue(trollheim );
            trollheimProgress.setValue(trollheim );
            trollheimLabel.setForeground(Color.white);
        }
        else{ 
            trollheim = 0;
            trollheimSpinner.setValue(trollheim);
            trollheimProgress.setValue(trollheim); 
            trollheimLabel.setForeground(Color.red);
        }
        ardyLabel.requestFocus();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_trollheimResetActionPerformed

    //set ALL to 15.
    private void resetAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAllMenuItemActionPerformed
        ardy = 15;
        canifis = 15;
        catherby = 15;
        fally = 15;
        zeah = 15;
        trollheim = 15;
        setProgress();
        
        ardyLabel.setForeground(Color.white);
        canifisLabel.setForeground(Color.white);
        catherbyLabel.setForeground(Color.white);
        faladorLabel.setForeground(Color.white);
        zeahLabel.setForeground(Color.white);
        trollheimLabel.setForeground(Color.white);
        
        ultraBox1.setSelected(false);
        ultraBox2.setSelected(false);
        ultraBox3.setSelected(false);
        ultraBox4.setSelected(false);
        ultraBox5.setSelected(false);
        ultraBox5.setSelected(false);
        ultraBox6.setSelected(false);
        
        statusbar.setText("Unsaved Changes");      
    }//GEN-LAST:event_resetAllMenuItemActionPerformed

    //Save program state to file
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        save();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    //Set everything to 0
    private void blankAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blankAllMenuItemActionPerformed
        ardy = 0;
        canifis = 0;
        catherby = 0;
        fally = 0;
        zeah = 0;
        trollheim = 0;
        setProgress(); 
        
        ardyLabel.setForeground(Color.red);
        canifisLabel.setForeground(Color.red);
        catherbyLabel.setForeground(Color.red);
        faladorLabel.setForeground(Color.red);
        zeahLabel.setForeground(Color.red);
        trollheimLabel.setForeground(Color.red);
        
        ultraBox1.setSelected(false);
        ultraBox2.setSelected(false);
        ultraBox3.setSelected(false);
        ultraBox4.setSelected(false);
        ultraBox5.setSelected(false);
        ultraBox5.setSelected(false);
        ultraBox6.setSelected(false);
        
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_blankAllMenuItemActionPerformed

    //Decrement the ardy spinner and update the bar at the same time.
    private void ardyDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ardyDecrActionPerformed
        if (ardy != 0) {
            ardy --;
            ardySpinner.setValue(ardy);
            ardyProgress.setValue(ardy);
        }
        //set focus to any component so when user hits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        setColors();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_ardyDecrActionPerformed
    
    //Decrement the canifis spinner and update the bar at the same time.
    private void canifisDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canifisDecrActionPerformed
        if (canifis != 0) {
            canifis --;
            canifisSpinner.setValue(canifis);
            canifisProgress.setValue(canifis);
        }   
        //set focus to any component so when user hits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        setColors();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_canifisDecrActionPerformed

     //Decrement the catherby spinner and update the bar at the same time.
    private void catherbyDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catherbyDecrActionPerformed
        if (catherby != 0) {
            catherby--;
            catherbySpinner.setValue(catherby);
            catherbyProgress.setValue(catherby);
        } 
        //set focus to any component so when user hits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        setColors();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_catherbyDecrActionPerformed
    
    //Decrement the fally spinner and update the bar at the same time.
    private void fallyDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fallyDecrActionPerformed
        if (fally != 0) {
            fally --;
            fallySpinner.setValue(fally);
            fallyProgress.setValue(fally);
        } 
        //set focus to any component so when use rhits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        setColors();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_fallyDecrActionPerformed

    //Decrement the zeah spinner and update the bar at the same time.
    private void zeahDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeahDecrActionPerformed
        if (zeah != 0) {
            zeah--;
            zeahSpinner.setValue(zeah);
            zeahProgress.setValue(zeah);
        } 
        //set focus to any component so when use rhits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        setColors();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_zeahDecrActionPerformed

     //Decrement the trollheim spinner and update the bar at the same time.
    private void trollheimDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trollheimDecrActionPerformed
        if (trollheim != 0) {
            trollheim --;
            trollheimSpinner.setValue(trollheim);
            trollheimProgress.setValue(trollheim);
        }    
        //set focus to any component so when user hits enter it will save file and not decrement again.
        ardyLabel.requestFocus();
        setColors();
        statusbar.setText("Unsaved Changes");
    }//GEN-LAST:event_trollheimDecrActionPerformed

    //Ardy Checkbox change
    private void ultraBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultraBox1ActionPerformed
        ardy = (int)ardySpinner.getValue();
        statusbar.setText("Unsaved Changes");
        if (ardy == 0 &&  ultraBox1.isSelected()){
            ultraBox1.setSelected(false);
        }
    }//GEN-LAST:event_ultraBox1ActionPerformed
    
    //Canifis Checkbox change
    private void ultraBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultraBox2ActionPerformed
        canifis = (int)canifisSpinner.getValue();
        statusbar.setText("Unsaved Changes");
        if (canifis == 0 &&  ultraBox2.isSelected()){
            ultraBox2.setSelected(false);
        }
    }//GEN-LAST:event_ultraBox2ActionPerformed

    //Catherby Checkbox change
    private void ultraBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultraBox3ActionPerformed
        catherby = (int)catherbySpinner.getValue();
        statusbar.setText("Unsaved Changes");
        if (catherby == 0 &&  ultraBox3.isSelected()){
            ultraBox3.setSelected(false);
        }
    }//GEN-LAST:event_ultraBox3ActionPerformed

    //Fallador Checkbox change
    private void ultraBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultraBox4ActionPerformed
        fally = (int)fallySpinner.getValue();
        statusbar.setText("Unsaved Changes");
        if (fally == 0 &&  ultraBox4.isSelected()){
            ultraBox4.setSelected(false);
        }
    }//GEN-LAST:event_ultraBox4ActionPerformed

    //Zeah Checkbox change
    private void ultraBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultraBox5ActionPerformed
        zeah = (int)zeahSpinner.getValue();
        statusbar.setText("Unsaved Changes");
        if (zeah == 0 &&  ultraBox5.isSelected()){
            ultraBox5.setSelected(false);
        }
    }//GEN-LAST:event_ultraBox5ActionPerformed

    //Trollheim Checkbox change
    private void ultraBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultraBox6ActionPerformed
        trollheim = (int)trollheimSpinner.getValue();
        statusbar.setText("Unsaved Changes");
        if (trollheim == 0 &&  ultraBox6.isSelected()){
            ultraBox6.setSelected(false);
        }
    }//GEN-LAST:event_ultraBox6ActionPerformed

    //update all progress bars based on whats in the int's.
    private void setProgress(){
        ardySpinner.setValue(ardy);
        ardyProgress.setValue(ardy);
        canifisSpinner.setValue(canifis);
        canifisProgress.setValue(canifis);
        catherbySpinner.setValue(catherby);
        catherbyProgress.setValue(catherby);
        fallySpinner.setValue(fally);
        fallyProgress.setValue(fally);
        zeahSpinner.setValue(zeah);
        zeahProgress.setValue(zeah);
        trollheimSpinner.setValue(trollheim);
        trollheimProgress.setValue(trollheim);
    }
    
    public void setColors(){
        //alert when compost bin getting low by changing labelText color
        /*            --  ARDY  --               */
        if (ardy <= 4 && ardy > 0){
            ardyLabel.setForeground(Color.orange);
        }
        else if (ardy == 0){
            ardyLabel.setForeground(Color.red);
        }
        else {
            ardyLabel.setForeground(Color.white);
        }
        /*            --CANIFIS--               */
        if (canifis <= 4 && canifis > 0){
            canifisLabel.setForeground(Color.orange);
        }
        else if (canifis == 0){
            canifisLabel.setForeground(Color.red);
        }
        else {
            canifisLabel.setForeground(Color.white);
        }
        /*            --CATHERBY--               */
        if (catherby <= 4 && catherby > 0){
            catherbyLabel.setForeground(Color.orange);
        }
        else if (catherby == 0){
            catherbyLabel.setForeground(Color.red);
        }
        else {
            catherbyLabel.setForeground(Color.white);
        }
        /*           --  FALLY  --               */
        if (fally <= 4 && fally > 0){
            faladorLabel.setForeground(Color.orange);
        }
        else if (fally == 0){
            faladorLabel.setForeground(Color.red);
        }
        else {
            faladorLabel.setForeground(Color.white);
        }         
        /*            --  ZEAH  --               */
        if (zeah <= 4 && zeah > 0){
            zeahLabel.setForeground(Color.orange);
        }
        else if (zeah == 0){
            zeahLabel.setForeground(Color.red);
        }
        else {
            zeahLabel.setForeground(Color.white);
        }
        /*           --TROLLHEIM--               */
        if (trollheim <= 4 && trollheim > 0){
            trollheimLabel.setForeground(Color.orange);
        }
        else if (trollheim == 0){
            trollheimLabel.setForeground(Color.red);
        }
        else {
            trollheimLabel.setForeground(Color.white);
        }
    }
    
    //Save state
    public void save(){
        File openedFile = new File("/home/reprise/Documents/scbuddy/scbuddy-config.txt");
        System.out.println("OUT Selected file: " + openedFile.getAbsolutePath());         
        //Print out to file
        try {
            PrintWriter out = new PrintWriter(openedFile);
                out.println( ardy + "\n" + canifis + "\n" + catherby + "\n" + fally + "\n" + zeah + "\n" + trollheim);
                out.println(ultraBox1.isSelected() + "\n" + ultraBox2.isSelected()  + "\n" + ultraBox3.isSelected() 
                   + "\n" + ultraBox4.isSelected() + "\n" + ultraBox5.isSelected()  + "\n" + ultraBox6.isSelected());
                out.close();

            statusbar.setText("Saved.");

        } 
        catch (FileNotFoundException e){
            e.getMessage();
            statusbar.setText("Error saving to config file.");
        }
    }
    //Load state
    public void load(){
        File openedFile = new File("/home/reprise/Documents/scbuddy/scbuddy-config.txt");
        System.out.println("IN Selected file: " + openedFile.getAbsolutePath());         
        try {
            Scanner input = new Scanner(openedFile);
            while (input.hasNext()) {
                ardy = input.nextInt();
                canifis = input.nextInt();
                catherby = input.nextInt();
                fally = input.nextInt();
                zeah = input.nextInt();
                trollheim = input.nextInt();
                ultraBox1.setSelected(input.nextBoolean());
                ultraBox2.setSelected(input.nextBoolean());
                ultraBox3.setSelected(input.nextBoolean());
                ultraBox4.setSelected(input.nextBoolean());
                ultraBox5.setSelected(input.nextBoolean());
                ultraBox6.setSelected(input.nextBoolean());
                
                statusbar.setText("Configuration file loaded successfully.");
                
            }
        } catch (FileNotFoundException e) {
            statusbar.setText("Can't open init file. Please manually open your config.");
            e.getMessage();
        }
        catch (InputMismatchException m) {
            System.out.println("INIT: Input formatting error. Records 1-6 = int, records 7-12 = boolean.");
            statusbar.setText("INIT: File format error.");
        }
        
        //put variables into components.
        ardySpinner.setValue(ardy);
        canifisSpinner.setValue(canifis);
        catherbySpinner.setValue(catherby);
        fallySpinner.setValue(fally);
        zeahSpinner.setValue(zeah);
        trollheimSpinner.setValue(trollheim);
        
        // [...] checkboxes already initialized.
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionsMenu;
    private javax.swing.JButton ardyDecr;
    private javax.swing.JLabel ardyLabel;
    private javax.swing.JProgressBar ardyProgress;
    private javax.swing.JButton ardyReset;
    private javax.swing.JSpinner ardySpinner;
    private javax.swing.JMenuItem blankAllMenuItem;
    private javax.swing.JButton canifisDecr;
    private javax.swing.JLabel canifisLabel;
    private javax.swing.JProgressBar canifisProgress;
    private javax.swing.JButton canifisReset;
    private javax.swing.JSpinner canifisSpinner;
    private javax.swing.JButton catherbyDecr;
    private javax.swing.JLabel catherbyLabel;
    private javax.swing.JProgressBar catherbyProgress;
    private javax.swing.JButton catherbyReset;
    private javax.swing.JSpinner catherbySpinner;
    private javax.swing.JLabel faladorLabel;
    private javax.swing.JButton fallyDecr;
    private javax.swing.JProgressBar fallyProgress;
    private javax.swing.JButton fallyReset;
    private javax.swing.JSpinner fallySpinner;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private java.awt.Label label1;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem resetAllMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel statusbar;
    private javax.swing.JMenuItem submitMenuItem;
    private javax.swing.JButton trollheimDecr;
    private javax.swing.JLabel trollheimLabel;
    private javax.swing.JProgressBar trollheimProgress;
    private javax.swing.JButton trollheimReset;
    private javax.swing.JSpinner trollheimSpinner;
    private javax.swing.JCheckBox ultraBox1;
    private javax.swing.JCheckBox ultraBox2;
    private javax.swing.JCheckBox ultraBox3;
    private javax.swing.JCheckBox ultraBox4;
    private javax.swing.JCheckBox ultraBox5;
    private javax.swing.JCheckBox ultraBox6;
    private javax.swing.JButton zeahDecr;
    private javax.swing.JLabel zeahLabel;
    private javax.swing.JProgressBar zeahProgress;
    private javax.swing.JButton zeahReset;
    private javax.swing.JSpinner zeahSpinner;
    // End of variables declaration//GEN-END:variables

    //GLOBALS:
    JFileChooser fileChooser = new JFileChooser();
    int result;
    int ardy, canifis, catherby, fally, zeah, trollheim;   
    //ArrayList<javax.swing.JCheckBox> ultras = new ArrayList();
    //ultras.add(ultraBox1);
}
