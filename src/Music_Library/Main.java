package Music_Library;

public class Main {
    public static void main(String[] args) {
        Artist maxkorzh = new Artist("Макс Корж", "Хип-хоп");
        Artist eminem = new Artist("Eminem", "Rap");

        Song song1 = new Song("2 типа людей", maxkorzh);
        Song song2 = new Song("Without Me", eminem);
        Song song3 = new Song("Горы по колено", maxkorzh);

        Playlist playlist = new Playlist("Любимые треки");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.showPlaylist();

        System.out.println("\nСравнение песен:");
        System.out.println(song1.equals(song3) ? "Одинаковые песни" : "Разные песни");

        System.out.println("\nПесни Макса Коржа:");
        playlist.filterByArtist(maxkorzh).forEach(System.out::println);

        System.out.println("\nПоиск песни 'Without Me':");
        playlist.searchByTitle("Without Me").forEach(System.out::println);

        System.out.println("\nСортировка песен по названию:");
        playlist.sortByTitle();
        playlist.showPlaylist();

    }
}
