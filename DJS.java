import java.util.ArrayList;
/**
 * The list of DJs with their playlists are made
 * @author penns
 *
 */
public class DJS {
	
	private ArrayList<Audio> audioList;
	private String djName;
	
	/**
	 * The djs with their lists are made 
	 * @param djSet			The given list that is playlist
	 */
	public DJS(ArrayList<Audio> djSet) {
		this.audioList = djSet; 
	}

	/**
	 * The playlist is given back
	 * 
	 * @return		The list of audio
	 */
	public ArrayList<Audio> getAudioList() {
		return audioList;
	}


	/**
	 * An audio file is added to the list
	 */
	public void addAudio(Audio audioFile) {
		audioList.add(audioFile);
	}

	/**
	 * Gets back the Dj name
	 * @return		The names of the dj
	 */
	public String getDjName() {
		return djName;
	}
	
	/**
	 * Sets the name of the dj
	 * @param djName
	 */
	public void setDjName(String djName)
	{
		this.djName = djName;
	}

}
