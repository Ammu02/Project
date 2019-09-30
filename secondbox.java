package waterportal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secondbox extends JFrame {

	protected static JFrame secondbox;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondbox frame = new secondbox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public secondbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("water portal");
		lblNewLabel.setBounds(178, 22, 79, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnUsers = new JButton("Users");
		btnUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdbox third =new thirdbox();
				third.setVisible(true);
			}
		});
		btnUsers.setBounds(10, 83, 89, 23);
		contentPane.add(btnUsers);
		
		JButton btnReignol = new JButton("Reignoal");
		btnReignol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthbox fourth =new fourthbox();
				fourth.setVisible(true);
			}
		});
		btnReignol.setBounds(109, 83, 89, 23);
		contentPane.add(btnReignol);
		
		JButton btnStudies = new JButton("Studies");
		btnStudies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthbox fifth =new fifthbox();
				fifth.setVisible(true);
			}
		});
		btnStudies.setBounds(236, 83, 89, 23);
		contentPane.add(btnStudies);
		
		JButton btnWater = new JButton("Water");
		btnWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixthbox sixth =new sixthbox();
				sixth.setVisible(true);
			}
		});
		btnWater.setBounds(335, 83, 89, 23);
		contentPane.add(btnWater);
		
		JButton btnComplaintsenquiry = new JButton("Complaints&Enquiry");
		btnComplaintsenquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seventhbox seventh =new seventhbox();
				seventh.setVisible(true);
			}
		});
		btnComplaintsenquiry.setBounds(39, 153, 145, 23);
		contentPane.add(btnComplaintsenquiry);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eigthbox eighth =new eigthbox();
				eighth.setVisible(true);
			}
		});
		btnProfile.setBounds(208, 153, 89, 23);
		contentPane.add(btnProfile);
		
		JButton btnSecurity = new JButton("Security");
		btnSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ninethbox nineth =new ninethbox();
				nineth.setVisible(true);
			}
		});
		btnSecurity.setBounds(317, 153, 89, 23);
		contentPane.add(btnSecurity);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondbox =  new JFrame("Logout");
				if(JOptionPane.showConfirmDialog(secondbox, "Confirm if you want to exit","Loginsystem",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
				System.exit(0);
			}
		});
		btnLogout.setBounds(208, 206, 89, 23);
		contentPane.add(btnLogout);
	}
}
