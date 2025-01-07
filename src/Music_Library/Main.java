package Music_Library;

public class Main {
    public static void main(String[] args) {
        Artist maxKorzh = new Artist("Макс Корж", "Хип-хоп");
        Artist eminem = new Artist("Eminem", "Rap");

        Song s1 = new Song("2 типа людей", maxKorzh);
        Song s2 = new Song("Without Me", eminem);
        Song s3 = new Song("Горы по колено", maxKorzh);

        Playlist playlist = new Playlist("Мне нравится");

        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);

        playlist.showPlaylist();

        System.out.println("\nПесни Макса Коржа:");
        playlist.filterByArtist(maxKorzh).forEach(System.out::println);

        System.out.println("\nПоиск песни 'Without Me':");
        playlist.searchByTitle("Without Me").forEach(System.out::println);

        System.out.println("\nСортировка песен по названию:");
        playlist.sortByTitle();
        playlist.showPlaylist();

        System.out.println("\nСравнение песен:");
        System.out.println(s1.isSameSong(s3) ? "Песни одинаковые" : "Песни разные");
        System.out.println(s1.isSameArtist(s3) ? "Автор один" : "Авторы разные");
    }
}
