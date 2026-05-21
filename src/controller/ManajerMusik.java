package controller;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

import model.User;
public class ManajerMusik{
    public enum PlayOrPause{
        PLAY,
        PAUSE
    }
    private User user;
    private AudioInputStream aiStream;
    private Clip clip;
    public ManajerMusik(User user){
        this.user=user;
        aiStream=new AudioInputStream(user.getPlaylist().get(0).getFile().getPath());
    }
    public boolean isMemutar(){
        
    }
    public void setPlayOrPause(PlayOrPause playOrPause){
        if(playOrPause==PlayOrPause.PAUSE){
            
        }
    }
}