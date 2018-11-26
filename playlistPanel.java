import java.awt.GridLayout;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playlistPanel extends JPanel{
	
	private JLabel title1;
	private JLabel title2;
	private JLabel title3;
	private JLabel title4;
	private JLabel title5;
	private JLabel title6;
	private JLabel title7;
	private JLabel title8;
	private JLabel title9;
	
	public playlistPanel()	{
		setLayout(new GridLayout(9,1));
		
		//title1 = new JLabel("" + audioList.get(0).getTitle());
		title2 = new JLabel("title2");
		title3 = new JLabel("title3");
		title4 = new JLabel("title4");
		title5 = new JLabel("title5");
		title6 = new JLabel("title6");
		title7 = new JLabel("title7");
		title8 = new JLabel("title8");
		title9 = new JLabel("title9");
		
		add(title1);
		add(title2);
		add(title3);
		add(title4);
		add(title5);
		add(title6);
		add(title7);
		add(title8);
		add(title9);
		
		public playlistPanel(ArrayList<Audio> playlist)	{
		setLayout(new GridLayout(9,1));
		this.playlist = playlist;
			
			for(int count = 0; count <= playlist.size(); count++) {
				add(new JLabel(playlist.get(count).getTitle()));
			}		
		}		
	}
	}

}
