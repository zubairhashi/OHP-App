package starter;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;	
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;



public class loadingPage1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loadingPage1 window = new loadingPage1();
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
	public loadingPage1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1442, 816);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1426, 545);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel frontGif = new JLabel(new ImageIcon("gifs/medical5.gif"));
		frontGif.setBounds(301, 83, 816, 452);
		panel.add(frontGif);
		
		JLabel lblNewLabel = new JLabel("Optimum Health Pro: Self- Diagnosis right at your fingertips\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(405, 0, 712, 57);
		panel.add(lblNewLabel);
		

		
		/*
		 * JLabel logo = new JLabel(new ImageIcon("images/ohpLogo2a.png"));
		 * logo.setBounds(337, 0, 722, 545); panel.add(logo);
		 */
		
		JButton clicktoStart = new JButton(new ImageIcon("gifs/startgif.gif"));
		clicktoStart.setBounds(414, 619, 559, 150);
        clicktoStart.setContentAreaFilled(false);
        clicktoStart.setBorderPainted(false);
		frame.getContentPane().add(clicktoStart);
		
		clicktoStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				loadingPage2 w = new loadingPage2();
				w.frame.setVisible(true);
			}
		});

	}
}
