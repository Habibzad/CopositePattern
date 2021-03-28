package compositePattern;

public class Song implements IComponent {
	
	private String songName;
	private String artist;
	private float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	public String getName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public void play() {
		System.out.println("Song playing " + songName + "....");
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}

}
