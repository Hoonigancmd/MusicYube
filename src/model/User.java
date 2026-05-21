package model;

import java.util.ArrayList;
import java.util.List;

public class User{
    private List<FileMusik> playlist;
    public ArrayList<FileMusik> getPlaylist(){
        return (ArrayList<FileMusik>)playlist;
    }
}