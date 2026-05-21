package model;

import java.io.File;
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
        setPlaylist();
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

    public ArrayList<FileMusik> getPlaylist() {
        return new ArrayList<>(playlist);
    }

    private void setPlaylist() {
        String path="music"+File.separator;
        if(id==1){
            playlist.add(new FileMusik((path+"Official Choreo Jingle RAJA Brawijaya 2025.wav"),1));
            playlist.add(new FileMusik((path+"Puspa (Kau Tak Sendiri).wav"),2));
        }else if(id==2){
            playlist.add(new FileMusik((path+"Hindia - Cincin (Official Lyric Video).wav"),1));
            playlist.add(new FileMusik((path+"Hindia - everything u are _ Lirik Lagu.wav"),2));
        }
        playlist.get(0).setStatusDipilih(true);
    }



}
