/*
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
import javax.swing.SwingUtilities;

public class MusicYube {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppNavigator nav = new AppNavigator();
            nav.viewLoginUI();
        });
    }
}

class AppNavigator {
    public void viewLoginUI() {
        new LoginUI(this).setVisible(true);
    }

    public void viewMusicUI(User user) {
        new MusicUI(user, this).setVisible(true);
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}

class ManajerMusik {
    private User user;
    private boolean isMemutar = false;

    public ManajerMusik(User user) {
        this.user = user;
    }

    public boolean isMemutar() { return isMemutar; }

    public void setPlayOrPause(PlayOrPause state) {
        isMemutar = (state == PlayOrPause.PLAY);
    }
}
