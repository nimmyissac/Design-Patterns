package CompositePattern;

public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void setPlaybackSpeed(float newSpeed) {
        this.speed = newSpeed;
    }

    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }

    public void play() {
        System.out.println(String.format("Playing %s by %s", this.songName, this.artist));
    }
}
