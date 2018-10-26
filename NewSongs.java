
public class newSongs extends Audio
{
	private String author;
	
	public newSongs(String title, int audioLength, String author) {
		super(title, audioLength);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	



}
