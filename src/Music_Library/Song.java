package Music_Library;

public class Song extends BaseEntity implements Playable{
    private String title;
    private Artist artist;

    public Song(String title, Artist artist) {
        super(GeneratorId.generateSongId());
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Играющая песня: " + title + " от " + artist.getName());
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
