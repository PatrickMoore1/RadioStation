import java.awt.*;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * The panel for the playlist is created with the needed information
 * @author Patrick Moore
 *
 */
public class playlistPanel extends JPanel{

	private ArrayList<Audio> playlist;

	public playlistPanel(ArrayList<Audio> playlist)	{
		setLayout(new GridLayout(playlist.size(),1));
		this.playlist = playlist;

		for(int count = 0; count < playlist.size(); count++) {
			add(new JLabel(playlist.get(count).getTitle()));
		}		
	}
}

