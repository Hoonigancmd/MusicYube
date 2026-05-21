package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private List<FileMusik> playlist;

    public User(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.playlist = new ArrayList<>();
<<<<<<< HEAD
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public List<FileMusik> getPlaylist() {
        return new ArrayList<>(playlist);
    }

    public void setPlaylist(List<FileMusik> playlist) {
        if (playlist != null) {
            this.playlist = new ArrayList<>(playlist);
        }
    }

    public void addToFileMusik(FileMusik fileMusik) {
        if (fileMusik != null && !playlist.contains(fileMusik)) {
            playlist.add(fileMusik);
        }
    }

    public void removeFromFileMusik(FileMusik fileMusik) {
        playlist.remove(fileMusik);
    }

    @Override
    public String toString() {
        return username;
=======
>>>>>>> 760ee9db77990b014ea533457376a73f88d29214
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public List<FileMusik> getPlaylist() {
        return new ArrayList<>(playlist);
    }

    public void setPlaylist(List<FileMusik> playlist) {
        if (playlist != null) {
            this.playlist = new ArrayList<>(playlist);
        }
    }

    public void addToFileMusik(FileMusik fileMusik) {
        if (fileMusik != null && !playlist.contains(fileMusik)) {
            playlist.add(fileMusik);
        }
    }

    public void removeFromFileMusik(FileMusik fileMusik) {
        playlist.remove(fileMusik);
    }

    @Override
    public String toString() {
        return username;
    }
}
