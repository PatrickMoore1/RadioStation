import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

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
	private JScrollPane scrollPane;
	private ArrayList<Audio> playlist;
	private String currentSong;
	private boolean isAction = false;
	

	public RadioGUI(ArrayList<Audio> playlist)	{
		this.playlist = playlist;
		makeFrame();
	}
	
	public void makeFrame()	{
		
		setTitle("Radio Station");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		
		songPanel = new playlistPanel(playlist);
		picturePanel = new JPanel();
		buttonPanel = new JPanel();
		currentPlaying = new JPanel();
			
		createPlaylist = new JButton("Create Playlist");
		buttonPanel.add(createPlaylist);
		createPlaylist.addActionListener(new createPlaylistListener());
		
		currentTitle = new JLabel();
		currentPlaying.add(currentTitle);
		scrollPane = new JScrollPane(songPanel);
			
		add(scrollPane, BorderLayout.WEST);
		add(picturePanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		add(currentPlaying, BorderLayout.CENTER);
		
		pack();
	    setVisible(true);
		
	}
	
	private class createPlaylistListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  isAction = true;

	      }
	   }


	public void setCurrentSong(String currentSong) {
		currentTitle.setText("Now Playing: " + currentSong);
		pack();
	    setVisible(true);
		
		
	}
	
	
	public boolean getIsAction() {
		return isAction;
	}

	public void setAction(boolean isAction) {
		this.isAction = isAction;
	}

}


