import java.util.ArrayList;

public class DJS {
	
	private ArrayList<Audio> audioList = new ArrayList<Audio>();
	private String djName;
	
	
	public DJS(String djName) {
		this.djName = djName;
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


	public void setDjName(String djName) {
		this.djName = djName;
	}

}
