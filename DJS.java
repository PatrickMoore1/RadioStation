import java.util.ArrayList;

public class DJS {
	
	private ArrayList<Audio> audioList;
	private String djName;
	
	
	public DJS(ArrayList<Audio> djSet) {
		this.audioList = djSet; 
	}


	public ArrayList<Audio> getAudioList() {
		return audioList;
	}


	public void addAudio(Audio audioFile) {
		audioList.add(audioFile);
	}


	public String getDjName() {
		return djName;
	}
	
	public void setDjName(String djName)
	{
		this.djName = djName;
	}

}
