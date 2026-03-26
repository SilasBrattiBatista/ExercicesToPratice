package spotify;

public class Music extends Audio{
    private String artist;
    private String album;

    public Music(String artist, String album) {
        this.artist = artist;
        this.album = album;
    }

    public Music() {}

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
