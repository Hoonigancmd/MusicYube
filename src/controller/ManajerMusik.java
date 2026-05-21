package controller;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.User;
public class ManajerMusik{
    public enum PlayOrPause{
        PLAY,
        PAUSE
    }
    private User user;
    private AudioInputStream aiStream;
    private Clip clip;
    private JFrame fParent;
    public ManajerMusik(User user){
        this.user=user;
        try{
            aiStream=AudioSystem.getAudioInputStream(this.user.getPlaylist().get(0).getFile());
            clip=AudioSystem.getClip();
        }catch(Exception e){
            JOptionPane.showMessageDialog(fParent,JOptionPane.ERROR_MESSAGE);
        }
    }
    public boolean isMemutar(){
        if(clip!=null){
            return clip.isRunning();
        }
        return false;
    }
    public void setPlayOrPause(PlayOrPause playOrPause){
        if(playOrPause==PlayOrPause.PAUSE&&clip!=null&&clip.isRunning()){
            try{
                clip.open(aiStream);
            }catch(Exception e){
                JOptionPane.showMessageDialog(fParent,JOptionPane.ERROR_MESSAGE);
            }
        }else if(playOrPause==PlayOrPause.PLAY&&clip!=null&&clip.isRunning()){
            clip.close();
        }
    }
}