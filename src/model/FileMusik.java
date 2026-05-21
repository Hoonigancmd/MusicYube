package model;

import java.io.File;

public class FileMusik {
    private File file;
    private int indexDisplay;
    private boolean statusDiputar;
    private boolean statusDipilih;

    public FileMusik(String alamatFile, int indexDisplay) {
        this.file = new File(alamatFile);
        this.indexDisplay = indexDisplay;
        this.statusDiputar = false;
        this.statusDipilih = false;
    }

    public File getFile() {
        return file;
    }

    public int getIndexDisplay() {
        return indexDisplay;
    }

    public boolean isDiputar() {
        return statusDiputar;
    }

    public boolean isDipilih() {
        return statusDipilih;
    }

    public void setStatusDiputar(boolean statusDiputar) {
        this.statusDiputar = statusDiputar;
    }

    public void setStatusDipilih(boolean statusDipilih) {
        this.statusDipilih = statusDipilih;
    }

}
