package Music_Library;

public class Artist extends BaseEntity {
    private String name;
    private String genre;

    public Artist(String name, String genre) {
        super(GeneratorId.generateArtistId());
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Исполнитель: " + name + ", Жанр: " + genre;
    }
}
