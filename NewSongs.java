
public class NewSongs extends Audio
{
	private String author;
	
	public NewSongs(String title, int audioLength, String author) {
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
