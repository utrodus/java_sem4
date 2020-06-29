/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_MediaPlayer;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author utrodus
 */
public class MediaPlayer extends javax.swing.JFrame {

    String fileExtention;
    // to store current position 
    Long currentFrame;
    Clip clip;

    // current status of clip 
    String status;

    AudioInputStream audioInputStream;
    static String filePath;
    // Define MP3Player Class From JACO MP3Player Lib
    MP3Player player;
    // Define File For Song
    File songFile;

    /**
     * Creates new form MediaPlayer
     */
    public MediaPlayer() {
        initComponents();
        this.setTitle("MP3 & WAV MEDIA PLAYER");
        this.setLocationRelativeTo(this);
        play.setEnabled(false);
        pause.setEnabled(false);
        stop.setEnabled(false);
        // Add our method to player variable
        player = mp3Player();
    }

    private MP3Player mp3Player() {
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }

    public void WavPlayer() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // create AudioInputStream object 
        audioInputStream
                = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        // create clip reference 
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip 
        clip.open(audioInputStream);

//        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void playWav() {
        //start the clip 
        clip.start();
        status = "play";
    }

    public void pauseWav() {
        if (status.equals("paused")) {
            System.out.println("audio is already paused");
            return;
        }
        this.currentFrame
                = this.clip.getMicrosecondPosition();
        clip.stop();
        status = "paused";

    }

    public void stopWav() throws UnsupportedAudioFileException,
            IOException, LineUnavailableException {
        currentFrame = 0L;
        clip.stop();
        clip.close();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        songName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        findFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(86, 112, 247));

        jPanel1.setBackground(new java.awt.Color(233, 238, 242));

        jPanel2.setBackground(new java.awt.Color(115, 89, 247));

        songName.setBackground(new java.awt.Color(150, 157, 157));
        songName.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        songName.setForeground(new java.awt.Color(255, 255, 255));
        songName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songName.setText("Silahkan Cari Audio");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_MediaPlayer/music.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(songName)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        play.setBackground(new java.awt.Color(255, 255, 255));
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_MediaPlayer/play.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        pause.setBackground(new java.awt.Color(255, 255, 255));
        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_MediaPlayer/pause.png"))); // NOI18N
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        stop.setBackground(new java.awt.Color(255, 255, 255));
        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_MediaPlayer/stop.png"))); // NOI18N
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        findFile.setBackground(new java.awt.Color(255, 255, 255));
        findFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_MediaPlayer/explorer.png"))); // NOI18N
        findFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(findFile, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pause, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(play, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(findFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findFileActionPerformed
        // TODO add your handling code here:
        File filenya;
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".wav", ".mp3", "wav", "mp3"));
        int buka_dialog = chooser.showOpenDialog(MediaPlayer.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            filePath = filenya.getAbsolutePath();
            String fileName = filenya.getName();
            try {
                fileExtention = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                if (!".wav".equals(fileExtention) && !".mp3".equals(fileExtention)) {
                    JOptionPane.showMessageDialog(null, "Maaf ! Hanya dapat menerima Format File .Wav & .Mp3");
                } else {
                    songName.setText(fileName);
                    play.setEnabled(true);
                    pause.setEnabled(true);
                    stop.setEnabled(true);
                    if (".wav".equals(fileExtention)) {
                        WavPlayer();
                    } else {
                        player.addToPlayList(chooser.getSelectedFile());
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
//                JOptionPane.showMessageDialog(null, "Maaf ! Hanya dapat menerima Format File .txt atau .doc ");
            }

        }
    }//GEN-LAST:event_findFileActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        findFile.setEnabled(false);
        if (".wav".equals(fileExtention)) {
            playWav();
        } else {
            player.play();
        }

    }//GEN-LAST:event_playActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
        findFile.setEnabled(false);
        if (".wav".equals(fileExtention)) {
            pauseWav();
        } else {
            player.pause();
        }
    }//GEN-LAST:event_pauseActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        songName.setText("Silahkan Cari Audio");
        play.setEnabled(false);
        pause.setEnabled(false);
        stop.setEnabled(false);
        findFile.setEnabled(true);
        if (".wav".equals(fileExtention)) {
            try {
                stopWav();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            player.stop();
        }

    }//GEN-LAST:event_stopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MediaPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findFile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pause;
    private javax.swing.JButton play;
    private javax.swing.JLabel songName;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
