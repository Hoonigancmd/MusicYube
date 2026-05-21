package model;

import java.io.File;

public class FileMusik {
    private File file;
    private String alamatFile;
    private String judul;
    private String artis;
    private String album;
    private int tahun;
    private int indexDisplay;
    private boolean statusDiputar;
    private boolean statusDipilih;
    private String format;
    private long duration;
    private long fileSize;

    public FileMusik(String alamatFile, int indexDisplay) {
        this.alamatFile = alamatFile;
        this.file = new File(alamatFile);
        this.indexDisplay = indexDisplay;
        this.statusDiputar = false;
        this.statusDipilih = false;
        this.format = getFormatFile();
        this.duration = 0;
        this.fileSize = file.length();
        this.judul = extractJudul();
        this.artis = "Unknown Artist";
        this.album = "Unknown Album";
        this.tahun = 0;
    }

    public FileMusik(String alamatFile, String judul, String artis, String album, int tahun, int indexDisplay) {
        this.alamatFile = alamatFile;
        this.file = new File(alamatFile);
        this.judul = judul;
        this.artis = artis;
        this.album = album;
        this.tahun = tahun;
        this.indexDisplay = indexDisplay;
        this.statusDiputar = false;
        this.statusDipilih = false;
        this.format = getFormatFile();
        this.duration = 0;
        this.fileSize = file.length();
    }

    private String getFormatFile() {
        if (alamatFile == null) return "UNKNOWN";
        String namaFile = alamatFile.toLowerCase();
        if (namaFile.endsWith(".wav")) {
            return "WAV";
        } else if (namaFile.endsWith(".mp3")) {
            return "MP3";
        }
        return "UNKNOWN";
    }

    private String extractJudul() {
        if (file != null) {
            String namaFile = file.getName();
            int lastDot = namaFile.lastIndexOf(".");
            if (lastDot > 0) {
                return namaFile.substring(0, lastDot);
            }
            return namaFile;
        }
        return "Unknown";
    }

    public boolean isFormatValid() {
        return format.equals("WAV") || format.equals("MP3");
    }

    public File getFile() {
        return file;
    }

    public String getAlamatFile() {
        return alamatFile;
    }

    public String getJudul() {
        return judul;
    }

    public String getArtis() {
        return artis;
    }

    public String getAlbum() {
        return album;
    }

    public int getTahun() {
        return tahun;
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

    public String getFormat() {
        return format;
    }

    public long getDuration() {
        return duration;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getFileSizeFormatted() {
        if (fileSize < 1024) {
            return fileSize + " B";
        } else if (fileSize < 1048576) {
            return String.format("%.2f KB", fileSize / 1024.0);
        } else {
            return String.format("%.2f MB", fileSize / 1048576.0);
        }
    }

    public void setAlamatFile(String alamatFile) {
        this.alamatFile = alamatFile;
        this.file = new File(alamatFile);
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setIndexDisplay(int indexDisplay) {
        this.indexDisplay = indexDisplay;
    }

    public void setStatusDiputar(boolean statusDiputar) {
        this.statusDiputar = statusDiputar;
    }

    public void setStatusDipilih(boolean statusDipilih) {
        this.statusDipilih = statusDipilih;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return judul + " - " + artis + " [" + format + ", " + getFileSizeFormatted() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FileMusik that = (FileMusik) obj;
        return alamatFile != null && alamatFile.equals(that.alamatFile);
    }

    @Override
    public int hashCode() {
        return alamatFile != null ? alamatFile.hashCode() : 0;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 760ee9db77990b014ea533457376a73f88d29214
