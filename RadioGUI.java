import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class RadioGUI extends JFrame {
	
	private ArrayList<Audio> playlist = new ArrayList<Audio>();
	private ImageIcon image = new ImageIcon("radio.jpg");
	private DJS djs = new DJS();
	
	private JScrollPane scrollPane;
	private JButton createPlaylist;
	private JPanel currentPlaying;
	private JPanel picturePanel;
	private JPanel buttonPanel;
	private JPanel djPanel;
	private JLabel currentTitle;
	private JLabel currentDJ;
	private JLabel picture;
	private JFrame frame;
	
	private playlistPanel songPanel;
	private String currentSong;

	public RadioGUI()	{	
		makeGUI();
	}

	public void makeGUI()	{

		RadioStations wmmr = new RadioStations();
	    wmmr.sortMasterList();
		wmmr.createPlaylist();

		playlist = wmmr.getDjSet1();
	
		displayList(playlist);
		makeFrame();
	}


	public void makeFrame()	{

		frame = new JFrame();
		frame.setTitle("Radio Station");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		songPanel = new playlistPanel(playlist);
		
		currentPlaying = new JPanel();
		picturePanel = new JPanel();
		buttonPanel = new JPanel();
		djPanel = new JPanel();
		
		picture = new JLabel(image);
		currentDJ = new JLabel();

		createPlaylist = new JButton("Create Playlist");
		buttonPanel.add(createPlaylist);
		
		createPlaylist.addActionListener(new createPlaylistListener());
		
		picturePanel.add(picture);

		currentTitle = new JLabel();
		scrollPane = new JScrollPane(songPanel);

		
		frame.add(djPanel, BorderLayout.EAST);
		frame.add(picturePanel, BorderLayout.CENTER);
		frame.add(buttonPanel, BorderLayout.SOUTH);
	
		frame.pack();
		frame.setSize(900,400);
		frame.setVisible(true);
		
		for(Audio audio : playlist)	{
			delay(audio.getAudioLength() * 200);
			currentTitle.setText("Now Playing: " + audio.getTitle());
		}
		
		currentTitle.setText("SHIFT OVER");
			
	}

	private class createPlaylistListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{ 
			currentPlaying.add(currentTitle);
			scrollPane = new JScrollPane(songPanel);
			
			djPanel.add(currentDJ);
			currentDJ.setText(djs.getDjName());
			
			frame.add(scrollPane, BorderLayout.WEST);
			frame.add(currentPlaying, BorderLayout.SOUTH);
			createPlaylist.setVisible(false);
			}
		}

	public void displayList(ArrayList<Audio> audioList)	{

		for(Audio audio : audioList)	{
			System.out.print("Title: " + audio.getTitle() + ". ");				 
			System.out.println("Audio Length:" + audio.getAudioLength() + "    ");
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
