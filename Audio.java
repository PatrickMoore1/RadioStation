/**
 * The audio is the superclass and will provide for the title author and time
 * 
 * @author Patrick Moore, Alexander Abbot, Kevin Nguyen
 *
 */
public class Audio {

	protected String title;
	protected int audioLength;
	protected int time;
	
	/**
	 * Creates music, news, commercials, and traffic reports using the info
	 * 
	 * @param author			The creator of audio piece
	 * @param audioLength		How long the audio piece runs for
	 */
	public Audio(String title, int audioLength) {
		this.title = title;
		this.audioLength = audioLength;
		this.time = 0;
	}


	/**
	 * Gives back the name of the author
	 * 
	 * @return			The name of the author
	 */
	public String getTitle() {
		return title;
	}

	
	/**
	 * Sets the name of the author
	 * 
	 * @param author		The name of the author
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	
	/**
	 * Retrieves the length of the audio piece
	 * 
	 * @return		How long the audio piece runs for
	 */
	public int getAudioLength() {
		return audioLength;
	}

	/**
	 * Sets the length time of the audio
	 * 
	 * @param audioLength		The play time of the audio piece
	 */
	public void setAudioLength(int audioLength) {
		this.audioLength = audioLength;
	}

	/**
	 * Gives back the time that has passed in general
	 * 
	 * 
	 * @return			The amount of time that has passed
	 */
	public int getTime() {
		return time;
	}	
	
	/**
	 * Plays the song by incrementing the time
	 */
	public void playSong()	{
		time++;
	}
}
