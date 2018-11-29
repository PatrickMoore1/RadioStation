import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class playlistPanel extends JPanel{

	private ArrayList<Audio> playlist;

	public playlistPanel(ArrayList<Audio> playlist)	{
		setLayout(new GridLayout(playlist.size(),1));
		this.playlist = playlist;

		for(int count = 0; count < playlist.size(); count++) {
			add(new JLabel(playlist.get(count).getTitle()));
		}	
		
	//	for(JLabel song : songPanel)
		
	}
}

