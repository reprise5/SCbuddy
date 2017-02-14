package scbuddy;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Miss Prism
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
        
//        //THIS IS SPECIFIC TO MEEEEEEEEEEEEEEEEEEEEEEEEE-===========================
//        File openedFile = new File("/home/reprise/Documents/scbuddy/scbuddy-config.txt");
//        System.out.println("IN Selected file: " + openedFile.getAbsolutePath());         
//        try {
//            Scanner input = new Scanner(openedFile);
//            while (input.hasNext()) {
//                ardy = input.nextInt();
//                canifis = input.nextInt();
//                catherby = input.nextInt();
//                fally = input.nextInt();
//                zeah = input.nextInt();
//                trollheim = input.nextInt();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("INPUT AS FOLLOWS: \n"
//            + "ardy " + ardy
//            + "\ncanifis " + canifis
//            + "\ncatherby " + catherby
//            + "\nfally " + fally
//            + "\nzeah " + zeah
//            + "\ntrollheim " + trollheim);
//
//        ardySpinner.setValue(ardy);
//        canifisSpinner.setValue(canifis);
//        catherbySpinner.setValue(catherby);
//        fallySpinner.setValue(fally);
//        zeahSpinner.setValue(zeah);
//        trollheimSpinner.setValue(trollheim);
//        setProgress();
//        //-===================================================================
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OSRS Super Compost Buddy");

        ardySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        ardySpinner.addMouseListener(new java.awt.event.MouseAdapter() {
        });

        ardyReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        ardyReset.setText("refill");
        ardyReset.setToolTipText("");
        ardyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ardyResetActionPerformed(evt);
            }
        });

        canifisReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        canifisReset.setText("refill");
        canifisReset.setToolTipText("");
        canifisReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canifisResetActionPerformed(evt);
            }
        });

        catherbyReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        catherbyReset.setText("refill");
        catherbyReset.setToolTipText("");
        catherbyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catherbyResetActionPerformed(evt);
            }
        });

        fallyReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        fallyReset.setText("refill");
        fallyReset.setToolTipText("");
        fallyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fallyResetActionPerformed(evt);
            }
        });

        zeahReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        zeahReset.setText("refill");
        zeahReset.setToolTipText("");
        zeahReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeahResetActionPerformed(evt);
            }
        });

        trollheimReset.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        trollheimReset.setText("refill");
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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ardyLabel)
                    .addComponent(canifisLabel)
                    .addComponent(catherbyLabel)
                    .addComponent(faladorLabel)
                    .addComponent(zeahLabel)
                    .addComponent(trollheimLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canifisSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canifisReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(catherbySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fallySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zeahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trollheimSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catherbyReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fallyReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zeahReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trollheimReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ardySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ardyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ardyProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(canifisProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catherbyProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fallyProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zeahProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trollheimProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ardySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ardyReset, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(ardyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ardyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(canifisReset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                        .addComponent(canifisSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(canifisLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canifisProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(catherbyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                        .addComponent(catherbySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(catherbyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(catherbyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fallyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                        .addComponent(fallySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(faladorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fallyProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zeahReset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                        .addComponent(zeahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zeahLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zeahProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trollheimReset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                            .addComponent(trollheimSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trollheimLabel))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trollheimProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
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
       
//        //Specific to me.  Because It's my program.  
//        File openedFile = new File("/home/reprise/Documents/scbuddy/scbuddy-config.txt");
//         System.out.println("OUT Selected file: " + openedFile.getAbsolutePath());         
//         try {
//            PrintWriter out = new PrintWriter(openedFile);
//            out.println(ardy);
//            out.println(canifis);
//            out.println(catherby);
//            out.println(fally);
//            out.println(zeah);
//            out.println(trollheim);
//            out.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_submitMenuItemActionPerformed

    //set ardy to 15.
    private void ardyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ardyResetActionPerformed
        ardy = 15;
        ardySpinner.setValue(ardy);
        ardyProgress.setValue(ardy);
    }//GEN-LAST:event_ardyResetActionPerformed

    //set canifis to 15.
    private void canifisResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canifisResetActionPerformed
        canifis = 15;
        canifisSpinner.setValue(canifis);
        canifisProgress.setValue(canifis);
    }//GEN-LAST:event_canifisResetActionPerformed

    //ser cqtherby to 15.
    private void catherbyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catherbyResetActionPerformed
        catherby = 15;
        catherbySpinner.setValue(catherby);
        catherbyProgress.setValue(catherby);
    }//GEN-LAST:event_catherbyResetActionPerformed

    //set Fally to 15.
    private void fallyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fallyResetActionPerformed
        fally = 15;
        fallySpinner.setValue(fally);
        fallyProgress.setValue(fally);
    }//GEN-LAST:event_fallyResetActionPerformed

    //dry zeah/hosidius to 15.
    private void zeahResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeahResetActionPerformed
        zeah = 15;
        zeahSpinner.setValue(zeah);
        zeahProgress.setValue(zeah);
    }//GEN-LAST:event_zeahResetActionPerformed

    //set trollheim to 15.
    private void trollheimResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trollheimResetActionPerformed
        trollheim = 15;
        trollheimSpinner.setValue(trollheim);
        trollheimProgress.setValue(trollheim);
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
    }//GEN-LAST:event_resetAllMenuItemActionPerformed

    //Save program state to file
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File openedFile = fileChooser.getSelectedFile();
            System.out.println("OUT Selected file: " + openedFile.getAbsolutePath());          
            try {
                PrintWriter out = new PrintWriter(openedFile);
                    out.println(ardy);
                    out.println(canifis);
                    out.println(catherby);
                    out.println(fally);
                    out.println(zeah);
                    out.println(trollheim);
                    out.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    //empty all.
    private void blankAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blankAllMenuItemActionPerformed
        ardy = 0;
        canifis = 0;
        catherby = 0;
        fally = 0;
        zeah = 0;
        trollheim = 0;
        setProgress();   
    }//GEN-LAST:event_blankAllMenuItemActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionsMenu;
    private javax.swing.JLabel ardyLabel;
    private javax.swing.JProgressBar ardyProgress;
    private javax.swing.JButton ardyReset;
    private javax.swing.JSpinner ardySpinner;
    private javax.swing.JMenuItem blankAllMenuItem;
    private javax.swing.JLabel canifisLabel;
    private javax.swing.JProgressBar canifisProgress;
    private javax.swing.JButton canifisReset;
    private javax.swing.JSpinner canifisSpinner;
    private javax.swing.JLabel catherbyLabel;
    private javax.swing.JProgressBar catherbyProgress;
    private javax.swing.JButton catherbyReset;
    private javax.swing.JSpinner catherbySpinner;
    private javax.swing.JLabel faladorLabel;
    private javax.swing.JProgressBar fallyProgress;
    private javax.swing.JButton fallyReset;
    private javax.swing.JSpinner fallySpinner;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem resetAllMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem submitMenuItem;
    private javax.swing.JLabel trollheimLabel;
    private javax.swing.JProgressBar trollheimProgress;
    private javax.swing.JButton trollheimReset;
    private javax.swing.JSpinner trollheimSpinner;
    private javax.swing.JLabel zeahLabel;
    private javax.swing.JProgressBar zeahProgress;
    private javax.swing.JButton zeahReset;
    private javax.swing.JSpinner zeahSpinner;
    // End of variables declaration//GEN-END:variables

    //GLOBALS:
    JFileChooser fileChooser = new JFileChooser();
    int result;
    int ardy, canifis, catherby, fally, zeah, trollheim;
}
