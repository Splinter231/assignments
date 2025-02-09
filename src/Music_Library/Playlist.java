package Music_Library;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist implements Playable {
    private String name;
    private ArrayList<Song> songs=new ArrayList<>();

    public Playlist(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public void showPlaylist() {
        System.out.println("Плейлист: " + name);
        songs.forEach(System.out::println);
    }

    @Override
    public void play() {
        System.out.println("Проигрывающийся плейлист: " + name);
        for (Song song : songs) {
            song.play();
        }
    }

    public List<Song> filterByArtist(Artist artist) {
        return songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .collect(Collectors.toList());
    }

    public List<Song> searchByTitle(String title) {
        return songs.stream()
                .filter(song -> song.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    public void sortByTitle() {
        songs.sort(Comparator.comparing(Song::getTitle));
    }

    @Override
    public String toString() {
        return "Плейлист: " + name + ", Количество песен: " + songs.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Playlist playlist = (Playlist) obj;
        return name.equals(playlist.name) && songs.equals(playlist.songs);
    }

}
