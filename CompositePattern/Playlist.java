package CompositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public String getName() {
        return this.playlistName;
    }

    public void setPlaybackSpeed(float speed) {
        for (int i = 0; i < this.playlist.size(); i++) {
            IComponent playListOrSong = this.playlist.get(i);
            playListOrSong.setPlaybackSpeed(speed);
        }
    }

    public void play() {
        for (int i = 0; i < this.playlist.size(); i++) {
            IComponent playListOrSong = this.playlist.get(i);
            playListOrSong.play();
        }
    }
}
