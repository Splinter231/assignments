package Music_Library;
public class Song{
    private int id;
    private static int id_gen=1;
    private String title;
    private Artist artist;
    public Song() {
        id = id_gen++;
    }
    public Song(String title, Artist artist){
        this();
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
    @Override
    public String toString() {
        return "Песня " + id + ": " + title + ", " + artist;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + artist.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return title.equals(song.title) && artist.equals(song.artist);
    }

}
