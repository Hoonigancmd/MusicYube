package controller;

import view.*;
import model.*;

public class AppNavigator {
    public void start(){
        viewLoginUI();
    }
    public void viewLoginUI(){
        LoginUI loginUI =new LoginUI(this);
        loginUI.setVisible(true);
        loginUI.setLocationRelativeTo(null);
    }
    public void viewMusicUI(User user){
        MusicUI musicUI =new MusicUI(user, this);
        musicUI.setVisible(true);
        musicUI.setLocationRelativeTo(null);

    }
}
