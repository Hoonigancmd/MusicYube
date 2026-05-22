package controller;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.*;

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
            clip.open(aiStream);
        }catch(Exception e){
            JOptionPane.showMessageDialog(fParent,"Error: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void syncMusic(){
        try{
            int selectedIndex=0;
            for(int i=0;i<this.user.getPlaylist().size();i++){
                if(this.user.getPlaylist().get(i).isDipilih()){
                    selectedIndex=i;
                }
            }
            aiStream=AudioSystem.getAudioInputStream(this.user.getPlaylist().get(selectedIndex).getFile());
            clip=AudioSystem.getClip();
            clip.open(aiStream);
        }catch(Exception e){

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
            clip.stop();
            for(FileMusik fm:user.getPlaylist()){
                if(fm.isDipilih()){
                    fm.setStatusDiputar(false);
                }
            }
        }else if(playOrPause==PlayOrPause.PLAY&&clip!=null){
            clip.start();
            for(FileMusik fm:user.getPlaylist()){
                if(fm.isDipilih()){
                    fm.setStatusDiputar(true);
                }
            }
        }
    }
}