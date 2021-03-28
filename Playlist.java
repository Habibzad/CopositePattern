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
		for(IComponent component : playlist) {
			component.play();
	    }
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for(IComponent component : this.playlist){
			component.setPlaybackSpeed(speed);
		}
	}

	@Override
	public String getName() {
		return this.playlistName;
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}

}
