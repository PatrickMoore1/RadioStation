import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class RadioGUI extends JFrame {
	
	private JButton createPlaylist;
	private JPanel picturePanel;
	private JPanel buttonPanel;
	private JPanel currentPlaying;
	private JLabel currentTitle;
	private JPanel djPanel;
	private playlistPanel songPanel;
	private JFrame frame;
	
	
	public RadioGUI()	{
		makeFrame();
	}
	
	public void makeFrame()	{
		
		setTitle("Radio Station");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		
		songPanel = new playlistPanel();
		picturePanel = new JPanel();
		buttonPanel = new JPanel();
		currentPlaying = new JPanel();
		
		
		createPlaylist = new JButton("Create Playlist");
		buttonPanel.add(createPlaylist);
		
		currentTitle = new JLabel("Current Song");
		currentPlaying.add(currentTitle);
		
		add(songPanel, BorderLayout.WEST);
		add(picturePanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		add(currentPlaying, BorderLayout.CENTER);
		
		pack();
	    setVisible(true);
		
	}

}
