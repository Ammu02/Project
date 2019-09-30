package waterportal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class thirdbox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thirdbox frame = new thirdbox();
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
	public thirdbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCityresdents = new JButton("Cityempregistration");
		btnCityresdents.setBounds(124, 97, 149, 23);
		contentPane.add(btnCityresdents);
		
		JButton btnNewButton = new JButton("Empregistration");
		btnNewButton.setBounds(124, 148, 149, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblEmployeeRegistrationForm = new JLabel("Employee Registration form");
		lblEmployeeRegistrationForm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmployeeRegistrationForm.setBounds(109, 11, 232, 40);
		contentPane.add(lblEmployeeRegistrationForm);
	}
}
