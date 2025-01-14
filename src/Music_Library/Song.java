package Music_Library;

public class Song extends BaseEntity {
    private String title;
    private Artist artist;

    public Song(String title, Artist artist) {
        super();
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString() + ", Песня: " + title + ", Исполнитель: " + artist.getName();
    }
}
