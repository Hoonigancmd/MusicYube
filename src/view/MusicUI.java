/*
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/
package view;
import java.util.List;

import controller.*;
import model.*;

public class MusicUI extends javax.swing.JFrame {

    private AppNavigator appNav;
    private javax.swing.JTextArea txtPlaylist;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblPlaylist;
    private javax.swing.JButton bPrev;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPlayPause;
    private javax.swing.JButton bLogout;
    private ManajerMusik manajerMusik;
    private User user;

    public MusicUI(User user, AppNavigator appNav) {
        this.appNav = appNav;
        this.user=user;
        this.manajerMusik = new ManajerMusik(user);
        initComponents();
        lblUser.setText("User: " + user.getUsername());
        tampilkanPlaylist(user);
    }

    private void tampilkanPlaylist(User user) {
        List<FileMusik> playlist = user.getPlaylist();
        
        if (playlist.isEmpty()) {
            txtPlaylist.setText("Playlist kosong");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("=== DAFTAR LAGU ===\n\n");
            
            for (int i = 0; i < playlist.size(); i++) {
                FileMusik musik = playlist.get(i);
                String namaFile = musik.getFile().getName();
                
                String judulLagu = namaFile.replace(".wav", "");
                
                sb.append((i + 1)).append(". ").append(judulLagu).append("\n");
                
                if (musik.isDiputar()) {
                    sb.append(" ||Sedang diputar||\n");
                }
                if (musik.isDipilih()&& !musik.isDiputar()) {
                    sb.append(" <Dipilih>\n");
                }
                sb.append("\n");
            }
            
            txtPlaylist.setText(sb.toString());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel(); 
        lblPlaylist = new javax.swing.JLabel();
        bPlayPause = new javax.swing.JButton();
        bPrev = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        bLogout = new javax.swing.JButton();
        txtPlaylist = new javax.swing.JTextArea();
        txtPlaylist.setLineWrap(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlaylist.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        lblPlaylist.setText("Playlist");

        bPlayPause.setText("Play");
        bPlayPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayPauseActionPerformed(evt);
            }
        });

        bPrev.setText("Prev.");
        bPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrevActionPerformed(evt);
            }
        });

        bNext.setText("Next");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        lblUser.setText("User");

        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        txtPlaylist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPlaylist.setColumns(20);
        txtPlaylist.setRows(5);
        txtPlaylist.setText("Belum ada lagu.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPlayPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bLogout)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPrevActionPerformed(java.awt.event.ActionEvent evt) {}
    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {}

    private void bPlayPauseActionPerformed(java.awt.event.ActionEvent evt) {
        if (manajerMusik.isMemutar()) {
            manajerMusik.setPlayOrPause(ManajerMusik.PlayOrPause.PAUSE);
            bPlayPause.setText("Play");
            tampilkanPlaylist(user);
        } else {
            manajerMusik.setPlayOrPause(ManajerMusik.PlayOrPause.PLAY);
            bPlayPause.setText("Pause");
            tampilkanPlaylist(user);
        }
    }

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        appNav.viewLoginUI(); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}