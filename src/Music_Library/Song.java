package Music_Library;
public class Song{
    private String title;
    private Artist artist;
    public Song(String title, Artist artist){
        this.title=title;
        this.artist=artist;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public Artist getArtist(){
        return artist;
    }
    public void setArtist(Artist artist){
        this.artist=artist;
    }
    public boolean isSameSong(Song other){
        return this.title.equals(other.title) && this.artist.getName().equals(other.artist.getName());
    }
    public boolean isSameArtist(Song other){
        return this.artist.getName().equals(other.artist.getName());
    }
    public void printSongInfo(){
        System.out.println("Песня: " + title + ", Исполнитель: " + artist.getName());
    }
}
