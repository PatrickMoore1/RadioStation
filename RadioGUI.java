import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.*;

import OrderCalculatorGUI.CalcButtonListener;

public class RadioGUI extends JFrame {
	
	private JButton createPlaylist;
	private JPanel picturePanel;
	private JPanel buttonPanel;
	private JPanel currentPlaying;
	private JLabel currentTitle;
	private JPanel djPanel;
	private playlistPanel songPanel;
	private JFrame frame;
	private ArrayList<Audio> playlist;
	private String currentSong;
	
	
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
		
		
		add(songPanel, BorderLayout.WEST);
		add(picturePanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		add(currentPlaying, BorderLayout.CENTER);
		
		
		
		pack();
	    setVisible(true);
		
	}
	
	
	//private class createPlaylistListener implements ActionListener
	 //  {
	  //    public void actionPerformed(ActionEvent e)
	   ///   {
	     //    // Variables to hold the subtotal, tax, and total
	      //   double subtotal, tax, total;

	         // Calculate the subtotal.
	         //subtotal = bagels.getBagelCost() + 
	           //         toppings.getToppingCost() +
	             //       coffee.getCoffeeCost();
//
	//         // Calculate the sales tax.
	  //       tax = subtotal * TAX_RATE;
//
	//         // Calculate the total.
	  //       total = subtotal + tax;
//
	//         // Create a DecimalFormat object to format output.
	  //       DecimalFormat dollar = new DecimalFormat("0.00");
//
	//         // Display the charges.
	  //       JOptionPane.showMessageDialog(null, "Subtotal: $" +
	    //                   dollar.format(subtotal) + "\n" +
	      //                 "Tax: $" + dollar.format(tax) + "\n" +
	        //               "Total: $" + dollar.format(total));
	     // }//
	   //}//

	public void setCurrentSong(String currentSong) {
		currentTitle.setText("Now Playing: " + currentSong);
		pack();
	    setVisible(true);
		
		
	}

}

