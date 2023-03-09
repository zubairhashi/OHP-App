package starter;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class signup {

	public JFrame frame;
	private JTextField fName;
	private JTextField lName;
	private JTextField email;
	private JTextField password;
	private JTextField phoneNumber;
	private JTextField confirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	
	login newuser = new login();
	private void initialize() {
		frame = new JFrame();
		//frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1442, 816);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 11, 1351, 766);
		//panel.setBackground(Color.white);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel fnameLabel = new JLabel("First Name");
		fnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fnameLabel.setBounds(32, 85, 102, 22);
		panel.add(fnameLabel);
		
		
		JLabel lnameLabel = new JLabel("Last Name");
		lnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lnameLabel.setBounds(32, 163, 102, 22);
		panel.add(lnameLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailLabel.setBounds(32, 300, 102, 22);
		panel.add(emailLabel);
		
		JLabel phoneLabel = new JLabel("Phone Number");
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		phoneLabel.setBounds(32, 380, 102, 22);
		panel.add(phoneLabel);
		
		JLabel passwrdLabel = new JLabel("Password");
		passwrdLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwrdLabel.setBounds(32, 458, 102, 22);
		panel.add(passwrdLabel);
		
		
		JLabel passwrd2Label = new JLabel("Confirm Password");
		passwrd2Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwrd2Label.setBounds(32, 550, 104, 16);
		panel.add(passwrd2Label);
		
		fName = new JTextField();
		fName.setBounds(140, 85, 189, 22);
		panel.add(fName);
		fName.setColumns(10);
		
		fName.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();

		        if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
		            e.consume();  // if it's not a number, ignore the event
		        }
		    }
		});

		
		lName = new JTextField();
		lName.setBounds(140, 164, 189, 22);
		panel.add(lName);
		lName.setColumns(10);
		
		lName.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();

		        if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
		            e.consume();  // if it's not a number, ignore the event
		        }
		    }
		});
		
		email = new JTextField();
		email.setBounds(140, 301, 189, 22);
		panel.add(email);
		email.setColumns(10);
		
		
		phoneNumber = new JTextField();
		phoneNumber.setBounds(140, 381, 189, 22);
		panel.add(phoneNumber);
		phoneNumber.setColumns(10);
		
		phoneNumber.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        int length = phoneNumber.getText().length();
		        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
		            e.consume();  // if it's not a number, ignore the event
		        }else if (length > 9) {
					
		        	e.consume(); //makes sure numbers entered phone number is not more than 10 numbers  
				}
		    }
		});
		
		password = new JPasswordField();
		password.setBounds(144, 459, 189, 22);
		panel.add(password);
		password.setColumns(10);
		
		confirmPassword = new JPasswordField();
		confirmPassword.setBounds(146, 548, 189, 22);
		panel.add(confirmPassword);
		confirmPassword.setColumns(10);
		
		
		
		JLabel genderLabel = new JLabel("Gender");
		genderLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		genderLabel.setBounds(32, 235, 46, 14);
		panel.add(genderLabel);
		
		JLabel example1 = new JLabel("Ex: John");
		example1.setForeground(Color.GRAY);
		example1.setBounds(140, 118, 69, 16);
		panel.add(example1);
		
		JLabel example2 = new JLabel("Ex: Doe");
		example2.setForeground(Color.GRAY);
		example2.setBounds(140, 197, 69, 16);
		panel.add(example2);
		
		JLabel example3 = new JLabel("Ex: applesmith33@gmail.com");
		example3.setForeground(Color.GRAY);
		example3.setBounds(140, 334, 189, 16);
		panel.add(example3);
		
		JLabel example4 = new JLabel("Ex: 544 883 9800");
		example4.setForeground(Color.GRAY);
		example4.setBounds(140, 414, 109, 14);
		panel.add(example4);
		
		
		
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(773, 206, 429, 447);
		panel.add(scrollPane);
		
		JTextPane txtpnTermsAndConditions = new JTextPane();
		scrollPane.setViewportView(txtpnTermsAndConditions);
		txtpnTermsAndConditions.setText("Introduction\r\n\r\nThe Optimum Health application is an online mechanism for diagnosing, managing, and sharing all of your health problems. So that we may safely and responsibly manage this site for all of our users, your use of this site is subject to certain terms and conditions. The terms and conditions set forth below (\u201CTerms of Use\u201D) apply to your use of the services and functionality provided on or through the Optimum Health site and mobile application (the \u201CServices\u201D).\r\nBy accessing and using the Services, you acknowledge that you have read, understood, and agree to be bound by these Terms of Use. If you do not accept these Terms of Use, you are not authorized to use the Services. We may modify these Terms of Use at any time and such modification will be effective upon posting to the Services.\r\nThese Services are intended for use by individuals 18 years or older in Canada and anywhere else. If you are under 18, you may use this Site and Services only with involvement of a parent or guardian.\r\n\r\n\r\nUse of the Services\r\n\r\nThe Services allow for the delivery of software, text, graphics, images, video, audio, data and other material (collectively referred to as the \u201CContent\u201D). The Content may be owned by us or may be provided through an arrangement we have with others, including other users of the Services, or our partners, sponsors, or affiliates. The Content is protected by copyright under both Canadian and foreign laws. Unauthorized use of the Content may violate copyright, trademark, and other laws. You have no rights in or to the Content, and you may not use the Content except as permitted under these Terms of Use. No other use is permitted without prior written consent from us or the owner of the Content. You must retain all copyright and other proprietary notices contained in the original Content on any copy you make of the Content. You may not sell, transfer, assign, license, sublicense, or modify the Content or reproduce, display, publicly perform, make a derivative version of, distribute, or otherwise use the Content in any way for any public or commercial purpose, except to utilize features of the Services that, by their nature, involve publishing or sharing of Content with the public. If you violate any part of these Terms of Use, your permission to access and/or use the Content and Services automatically terminates and you must immediately destroy any copies you have made of the Content.\r\nVarious company, product, and service names displayed on the Services may be trademarks or service marks owned by others (the \u201CThird-Party Trademarks\u201D). Your use of the Services should not be construed as granting, by implication, estoppel, or otherwise, any license or right to use any Third-Party Trademark displayed on this Services. The Third-Party Trademarks may not be used to disparage any applicable third-party, any of their products or services, or in any manner in which, in our reasonable judgment, may damage any goodwill in the Third-Party Trademarks.\r\nThe Services may include access to links to, and content and data from, third-party websites (\u201CExternal Services\u201D). These links, content, and data are provided solely as a convenience to you and not as an endorsement, sponsorship, or recommendation by us of the content on such External Services. The content of such External Services is developed and provided by others. In addition, the Services permit access to content posted, stored, or displayed at the direction of users of the Services, for which we cannot accept any responsibility or liability.\r\nThe Services are for personal use only and may not be used in connection with any commercial endeavors except those that are specifically approved by us. The following activities are expressly prohibited: (i) collecting usernames and/or email addresses of other users by electronic or other means for the purpose of sending unsolicited email or other communications, (ii) any use of the Services, which in our sole judgment, degrades the reliability, speed, or operation of the Services or any underlying hardware or software thereof, (iii) use of web scraping, web harvesting, or web data extraction methods from OHP even if the OHP account owner gives permission; and (iv) any use of the Services which is unlawful or in violation of these Terms of Use. Your use of the Services is subject, in our sole discretion, to termination at any time.\r\n\r\n\r\nOptimum Health\r\n\r\nIn order to enjoy the Services, you are required to become a member of Optimum Health. Optimum Health is a free membership program which offers certain benefits and exclusive offers for the users of services provided by OHP or its group companies. Please read more information on the Optimum Health Program.  You are responsible for the security of your Optimum Health account and all activities that occur. You agree to provide true and accurate information and to notify us in the event of any unauthorized access to your Optimum Health or any changes to your account information.\r\n\r\n\r\nPayment\r\n\r\nPayment for the Optimum Health service will be made by a valid credit card or Paypal\u00AE accounts accepted by us. Fees are payable in CAD dollars. You hereby authorize us to charge your credit card for such amounts on a regular monthly or yearly basis beginning at the beginning of your subscription and continuing until such time as your account is terminated. If we are for any reason unable to effect automatic payment via your credit card, we will attempt to notify you via email and your subscription will be disabled until payment is received. Amounts paid for the Optimum Health service, including prepayments, are not refundable.\r\n");
		
		JLabel tacLabel = new JLabel("Terms and Conditions\r\n");
		tacLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		tacLabel.setBounds(888, 157, 198, 33);
		panel.add(tacLabel);
		
		
		JLabel rfMessage = new JLabel("This field is required!");
		rfMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rfMessage.setForeground(Color.RED);
		//rfMessage.setBounds(361, 225, 137, 33);
		rfMessage.setVisible(false);
		panel.add(rfMessage);
		
		
		
		
		
		
		JRadioButton selectMale = new JRadioButton("Male\r\n");
		selectMale.setBounds(267, 232, 109, 23);
		panel.add(selectMale);
		
		JRadioButton selectFemale = new JRadioButton("Female");
		selectFemale.setBounds(140, 232, 109, 23);
		panel.add(selectFemale);
		
		
		ButtonGroup b = new ButtonGroup();
		b.add(selectMale);
		b.add(selectFemale);
		
		
		
		
		
		
		
		
		JButton createAcc = new JButton("Create");
		createAcc.setBounds(150, 702, 122, 33);
		createAcc.setEnabled(false);
		panel.add(createAcc);
		
		
		createAcc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (fName.getText().isEmpty()) {
					
					rfMessage.setBounds(351, 79, 175, 22);
					rfMessage.setVisible(true);
				}else if (lName.getText().isEmpty()) {
					
					rfMessage.setBounds(351, 157, 175, 22);
					rfMessage.setVisible(true);
					
				}else if (email.getText().isEmpty()) {
					
					rfMessage.setBounds(351, 294, 175, 22);
					rfMessage.setVisible(true);
					
				}else if (phoneNumber.getText().isEmpty()) {
					
					rfMessage.setBounds(351, 371, 175, 22);
					rfMessage.setVisible(true);
					
				}else if (password.getText().isEmpty()) {
					
					rfMessage.setBounds(351, 452, 175, 22);
					rfMessage.setVisible(true);
					
				}else if (confirmPassword.getText().isEmpty()) {
					
					rfMessage.setBounds(351, 541, 175, 22);
					rfMessage.setVisible(true);
					
					
				}else {
					
					frame.dispose();
					newuser.frame.setVisible(true);
				}
				
				if (password.getText().equals(confirmPassword.getText())) {
					
					// CONDITION HERE
				}
			}
		});
		
		
		JCheckBox tosCheckbox = new JCheckBox("I have read and agreed to the Terms and Conditions");
		tosCheckbox.setBackground(new Color(255, 255, 255));
		tosCheckbox.setBounds(820, 676, 328, 16);
		panel.add(tosCheckbox);
		
		tosCheckbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			if(tosCheckbox.isSelected() == true) {
				createAcc.setEnabled(true);
			}
			
			else {
				createAcc.setEnabled(false);
			}
			}
		});
		

		

		
		
	}
}
