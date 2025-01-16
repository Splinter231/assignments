package Music_Library;

public class GeneratorId {
    private static int songIdCounter = 1;
    private static int artistIdCounter = 1;

    public static int generateSongId() {
        return songIdCounter++;
    }

    public static int generateArtistId() {
        return artistIdCounter++;
    }
}
