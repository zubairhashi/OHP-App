

package starter;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class loadingPage2 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loadingPage2 window = new loadingPage2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loadingPage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1442, 816);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel loadingGif1 = new JLabel(new ImageIcon("gifs/hRate.gif"));
		loadingGif1.setBounds(160, 22, 1086, 483);
		frame.getContentPane().add(loadingGif1);
		
		JLabel loadingGif2 = new JLabel(new ImageIcon("gifs/loading10.gif"));
		loadingGif2.setBounds(364, 590, 680, 154);
		frame.getContentPane().add(loadingGif2);
		
		setTime();
		
	}
	
	public void setTime() {
		
		// This block sets a timer during the loading animations. After 30 seconds, the program
		// will dispose of the frame and move to the main page of the program

		        Timer timer = new Timer();

		// Sets new timertask which schedules the task to execute when timer is done

		        TimerTask task = new TimerTask() {

		            @Override
		            public void run() {
		                frame.dispose();
		                
		                login l = new login();
		                
		                l.frame.setVisible(true);

		            }
		        };

		// Timer will execute the task (specifics in code above) with a delay of
		// 30000 milliseconds (30 seconds)

		        timer.schedule(task, 30000);
	}
	

}
