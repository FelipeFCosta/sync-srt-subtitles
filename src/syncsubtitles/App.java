package syncsubtitles;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class App extends javax.swing.JFrame {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final JFileChooser openFileChooser;
    private int totalMinutes;
    private File file;

    /**
     * Creates new form NewJFrame
     */
    public App() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        setLocationRelativeTo(null);
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        setVisible(true);
        okButton.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        shiftSpinner = new javax.swing.JSpinner();
        syncLabel = new javax.swing.JLabel();
        pathText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        startingPointSpinner = new javax.swing.JSpinner();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        titleLabel.setText("Sync SRT Subtitles");

        shiftSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, -3600.0d, 3600.0d, 0.1d));
        shiftSpinner.setEnabled(false);
        shiftSpinner.setFocusTraversalPolicyProvider(true);
        shiftSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(shiftSpinner, "0.000 s"));
        shiftSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shiftSpinnerStateChanged(evt);
            }
        });
        shiftSpinner.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                shiftSpinnerMouseWheelMoved(evt);
            }
        });

        syncLabel.setText("Subtitle shift: ");
        syncLabel.setEnabled(false);

        pathText.setText(System.getProperty("user.dir"));
        pathText.setMaximumSize(new java.awt.Dimension(20, 201));
        pathText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pathTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pathTextFocusLost(evt);
            }
        });
        pathText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Select file");

        browseButton.setText("Browse...");
        browseButton.setFocusPainted(false);
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        stateLabel.setText("delay or speed up");
        stateLabel.setVisible(false);

        warningLabel.setForeground(new java.awt.Color(220, 0, 0));
        warningLabel.setText(" ");

        startLabel.setText("Starting point:");
        startLabel.setEnabled(false);

        startingPointSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        startingPointSpinner.setEnabled(false);
        startingPointSpinner.setFocusTraversalPolicyProvider(true);
        startingPointSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(startingPointSpinner, "0.0 min"));
        startingPointSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startingPointSpinnerStateChanged(evt);
            }
        });
        startingPointSpinner.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                startingPointSpinnerMouseWheelMoved(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        okButton.setText("OK");
        okButton.setFocusPainted(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        applyButton.setText("Apply");
        applyButton.setEnabled(false);
        applyButton.setFocusPainted(false);
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(syncLabel)
                    .addComponent(startLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(shiftSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startingPointSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton))
                    .addComponent(jLabel1)
                    .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titleLabel)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startingPointSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shiftSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel)
                    .addComponent(syncLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton)
                    .addComponent(applyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jPanel1.requestFocus();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        applyButton.setEnabled(false);
        new Thread(() -> {
            okButton.setEnabled(false);
            warningLabel.setForeground(new Color(0, 0, 40));
            warningLabel.setText("applying shift...");
            System.out.println((double) shiftSpinner.getValue());
            SrtSubtitles.sync(file,(double) shiftSpinner.getValue(), (double) startingPointSpinner.getValue());
            warningLabel.setForeground(new Color(0, 120, 0));
            warningLabel.setText("shift applied!");
            okButton.setEnabled(true);
            shiftSpinner.setValue(0.0);
        }).start();
    }//GEN-LAST:event_applyButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (!shiftSpinner.isEnabled()) {
            warningLabel.setForeground(new Color(220, 0, 0));
            warningLabel.setText("select a valid file");
            return;
        }
        if (applyButton.isEnabled()) {
            new Thread(() -> {
                applyButton.setEnabled(false);
                warningLabel.setForeground(new Color(0, 0, 40));
                warningLabel.setText("applying shift...");
                SrtSubtitles.sync(file, (double) shiftSpinner.getValue(), (double) startingPointSpinner.getValue());
                dispose();
            }).start();
        } else {
            // if applyButton is not enabled, then the shift has been applied already
            dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void startingPointSpinnerMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_startingPointSpinnerMouseWheelMoved
        if (startingPointSpinner.isEnabled()) {
            startingPointSpinner.setValue((double) startingPointSpinner.getValue() - (double) evt.getWheelRotation());
        }
    }//GEN-LAST:event_startingPointSpinnerMouseWheelMoved

    private void startingPointSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_startingPointSpinnerStateChanged
        if ((double) startingPointSpinner.getValue() > totalMinutes)
            startingPointSpinner.setValue((double) totalMinutes);

        if ((double) startingPointSpinner.getValue() < 0) 
            startingPointSpinner.setValue(0.0);
    }//GEN-LAST:event_startingPointSpinnerStateChanged

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        warningLabel.setText("");
        openFileChooser.setFileFilter(new FileNameExtensionFilter("SubRip Subtitle Files [.srt]", "srt"));
        openFileChooser.showOpenDialog(this);
        if (openFileChooser.getSelectedFile()!= null) {
            pathText.setText(openFileChooser.getSelectedFile().getAbsolutePath());
        }
        fileValidation();
    }//GEN-LAST:event_browseButtonActionPerformed

    private void pathTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextActionPerformed
        fileValidation();
    }//GEN-LAST:event_pathTextActionPerformed

    private void pathTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pathTextFocusLost
        if (!pathText.getText().equals(System.getProperty("user.dir"))) {
            fileValidation();
        }
    }//GEN-LAST:event_pathTextFocusLost

    private void pathTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pathTextFocusGained
        pathText.selectAll();
    }//GEN-LAST:event_pathTextFocusGained

    private void shiftSpinnerMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_shiftSpinnerMouseWheelMoved
        if (shiftSpinner.isEnabled()) {
            shiftSpinner.setValue((double) shiftSpinner.getValue() - (double) evt.getWheelRotation() / 10);
        }
        applyButton.setEnabled(true);
        spinnerState();
    }//GEN-LAST:event_shiftSpinnerMouseWheelMoved

    private void shiftSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shiftSpinnerStateChanged
        if ((double) shiftSpinner.getValue() > 3600) shiftSpinner.setValue(3600.0);
        if ((double) shiftSpinner.getValue() < -3600) shiftSpinner.setValue(-3600.0);
        applyButton.setEnabled(true);
        spinnerState();
    }//GEN-LAST:event_shiftSpinnerStateChanged

    private void fileValidation() {
        try {
            this.file = new File(pathText.getText().replaceAll("\\\\", "/"));
            this.totalMinutes = SrtSubtitles.getTotalMinutes(file);
            shiftSpinner.setEnabled(true);
            startingPointSpinner.setEnabled(true);
            startLabel.setEnabled(true);
            syncLabel.setEnabled(true);
            warningLabel.setText("");
        } catch (IOException | NullPointerException ex) {
            warningLabel.setForeground(new Color(220, 0, 0));
            warningLabel.setText("select a valid file");
            applyButton.setEnabled(false);
            shiftSpinner.setEnabled(false);
            startingPointSpinner.setEnabled(false);
            startLabel.setEnabled(false);
            syncLabel.setEnabled(false);
        }
    }
    
    private void spinnerState() {
        double spinnerValue = (double) shiftSpinner.getValue();
        stateLabel.setVisible(true);
        if (spinnerValue > 0.0001) {
            stateLabel.setText(" (delay)");
        }
        else if (spinnerValue < -0.0001) {
            stateLabel.setText("(speed up)");
        }
        else {
            shiftSpinner.setValue(0.0); // to prevent -0.000
            stateLabel.setVisible(false);
            applyButton.setEnabled(false);
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton browseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField pathText;
    private javax.swing.JSpinner shiftSpinner;
    private javax.swing.JLabel startLabel;
    private javax.swing.JSpinner startingPointSpinner;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel syncLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}