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
	ArrayList<Audio> playlist = new ArrayList<Audio>();
	private String currentSong;
	private boolean isAction = false;
	private RadioStations wmmr = new RadioStations();
	private JLabel currentDJ;
	private DJS djs = new DJS();
	//private boolean isPlaying = false;
	


	public RadioGUI()	{	
		makeGUI();
	}
	
	public void makeGUI()	{
		
		RadioStations wmmr = new RadioStations();
		wmmr.sortMasterList();
		wmmr.createPlaylist();
		
		playlist = wmmr.getDjSet1();
		
		makeFrame();
		displayList(playlist); 
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
		
		djPanel = new JPanel();
		currentDJ = new JLabel();
		djPanel.add(currentDJ);
		currentDJ.setText(djs.getDjName());
		
		
		add(djPanel, BorderLayout.EAST);
		add(scrollPane, BorderLayout.WEST);
		add(picturePanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		add(currentPlaying, BorderLayout.CENTER);

		pack();
		setSize(600,400);
		setVisible(true);
	}

	private class createPlaylistListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			dispose();
			makeGUI();
			
			//makeGUI();
			//isPlaying = false;
			//wmmr.sortMasterList();
			//wmmr.createPlaylist();
			//playlist = wmmr.getDjSet1();
			//makeFrame();
			
		}
	}

	public void setCurrentSong(String currentSong) {
		currentTitle.setText("Now Playing: " + currentSong);	
	}

	public void displayList(ArrayList<Audio> audioList)	{
				
		for(Audio audio : audioList)	{
			System.out.print("Title: " + audio.getTitle() + ". ");				 
			System.out.println("Audio Length:" + audio.getAudioLength());
			delay(audio.getAudioLength() * 20);
			setCurrentSong(audio.getTitle());
	}
	}

	public void delay(int milliseconds)	{
		try {
			Thread.sleep(milliseconds);
		}
		catch (InterruptedException ie)	{
		}		
	}
}
