
public class OldSongs extends Audio {

	private String author;
	private String datePlayed;
	
	
	public oldSongs(String title, int audioLength, String author, String datePlayed) {
		super(title, audioLength);
		this.author = author;
		this.datePlayed = datePlayed;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getDatePlayed() {
		return datePlayed;
	}


	public void setDatePlayed(String datePlayed) {
		this.datePlayed = datePlayed;
	}
	
	
	

	}


