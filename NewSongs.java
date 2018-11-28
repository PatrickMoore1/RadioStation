
/**
 * Another subclass of Audio
 * @author Kevin Nguyen
 *
 */
public class NewSongs extends Audio
{
	private String author;
	
	/**
	 * instance of NewSongs is created
	 * 
	 * @param title			Title of the new song
	 * @param audioLength	Length of the new song
	 * @param author		Author of the new song
	 */
	public NewSongs(String title, int audioLength, String author) {
		super(title, audioLength);
		this.author = author;
	}

	/**
	 * Gives back the author name
	 * @return			The name of the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author name 
	 * @param author		The name of the author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

