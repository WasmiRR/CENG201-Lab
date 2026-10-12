
package lab1.exercise1;

/**
 * Name and Surname:   Enes ATICI
 * Student ID:  240444030
 * Date:        05.10.2026
 */
public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // --- Default constructor ---
        Track defaultTrack = new Track();
        System.out.println("Default Track:");
        System.out.println(defaultTrack);
        System.out.println();


        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(titleOnlyTrack);
        System.out.println();


        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack);
        System.out.println();


        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack);
        System.out.println();


        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -45, false);
        System.out.println(invalidTrack);
        System.out.println();


        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.println(String.format("%-10s %s", "Title:", getterTrack.getTitle()));
        System.out.println(String.format("%-10s %s", "Artist:", getterTrack.getArtist()));
        System.out.println(String.format("%-10s %s", "Duration:", getterTrack.getDurationFormatted()));
        System.out.println(String.format("%-10s %s", "Explicit:", getterTrack.isExplicit()));
    }
}