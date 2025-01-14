package Music_Library;

public class Artist{
    private String name;
    private String genre;

    public Artist(String name, String genre){
        this.name=name;
        this.genre=genre;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    @Override
    public String toString() {
        return "Исполнитель: " + name + ", Жанр: " + genre;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + genre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return name.equals(artist.name) && genre.equals(artist.genre);
    }

}
