package compositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {
	
	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void add(IComponent song){
		playlist.add(song);
	}
	
	// Your code goes here!
	@Override
	public void play() {

	}

	@Override
	public void setPlaybackSpeed(float speed) {

	}

	@Override
	public String getName() {
		return null;
	}

}
