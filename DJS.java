import java.util.ArrayList;
import java.util.Random;

/**
 * The list of DJs with their playlists are made
 * @author penns
 *
 */
public class DJS {
	
	private ArrayList<Audio> audioList;
	private ArrayList<String> nameList;
	private Random rand;
	
	
	public DJS() {
		nameList = new ArrayList<String>();
		nameList.add("DJ Kevin");
		nameList.add("DJ Alex");
		nameList.add("DJ Pat");
		nameList.add("DJ Steve");
		nameList.add("DJ Funky Fresh");
		nameList.add("DJ Nasty Nathaniel");
	}


	public ArrayList<Audio> getAudioList() {
		return audioList;
	}


	public void addAudio(ArrayList<Audio> audioList) {
		this.audioList = audioList;
	}


	public String getDjName() {
		rand = new Random(nameList.size());
		return nameList.get(rand.nextInt());
	}
	

}
