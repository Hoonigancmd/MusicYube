package controller;

import javax.swing.JFrame;
import view.*;
import model.*;

public class AppNavigator {
    private JFrame mainFrame;
    public AppNavigator(){
        mainFrame=new JFrame();
    }
    public void start(){
        viewLoginUI();
    }
    public void viewLoginUI(){
        LoginUI loginUI =new LoginUI(this);
        loginUI.setVisible(true);
        loginUI.setLocationRelativeTo(mainFrame);
    }
    public void viewMusicUI(User user){
        MusicUI musicUI =new MusicUI(user, this);
        musicUI.setVisible(true);
        musicUI.setLocationRelativeTo(mainFrame);

    }
}
