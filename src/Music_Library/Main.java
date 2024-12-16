package Music_Library;

public class Main{
    public static void main(String[] args) {
        Artist MaxKorzh=new Artist("Макс Корж","Хипхоп");
        Artist Eminem=new Artist("Eminem","Rap");

        Song s1=new Song("2 типа людей", MaxKorzh);
        Song s2=new Song("Without Me", Eminem);
        Song s3=new Song("Горы по колено", MaxKorzh);

        Playlist playlist=new Playlist("Мне нравится");

        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);

        playlist.showPlaylist();

        System.out.println("\nСравнение песен");
        if (s1.isSameSong(s2)) {
            System.out.println("Песни одинаковые");
        } else {
            System.out.println("Песни разные");
        }
        if (s2.isSameArtist(s3)) {
            System.out.println("Автор один");
        } else {
            System.out.println("Авторы разные");
        }
        if (s1.isSameArtist(s3)) {
            System.out.println("Автор один");
        } else {
            System.out.println("Авторы разные");
        }
    }
}