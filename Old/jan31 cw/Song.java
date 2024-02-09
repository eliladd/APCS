public class Song{
	private String artist;
	private String songName;
	
	public Song(String artist, String name){
		this.artist = artist;
		this.songName = name;
	}
	
	public String toString(){
		return artist + " - " + songName;
	}
	
	public String getSongName(){
		return songName;
	}
}