/**
 * Another subclass of Audio
 * @author Kevin Nguyen
 *
 */
public class oldSongs extends Audio {

	private String author;
	private String datePlayed;

	/**
	 * Instance of oldSong is created
	 * @param title				Title of the song 
	 * @param audioLength		Length of the song
	 * @param author			The author of the song
	 * @param datePlayed		The date of the song played
	 */
	public oldSongs(String title, int audioLength, String author, String datePlayed) {
		super(title, audioLength);
		this.author = author;
		this.datePlayed = datePlayed;
	}

	/**
	 * Gives back the author name
	 * @return		The authors name
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author name to the input
	 * @param author		The name of the author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gives back the date played
	 * 
	 * @return		The date played
	 */
	public String getDatePlayed() {
		return datePlayed;
	}

	/**
	 * Sets the date played of the song
	 * @param datePlayed		The date that the song played
	 */
	public void setDatePlayed(String datePlayed) {
		this.datePlayed = datePlayed;
	}


}




