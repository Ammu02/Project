package waterportal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.file.FileSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Loginsystem {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	protected JFrame frmLoginsystem;
	//protected Jframe frmLoginsystem;
	//protected Jframe ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginsystem window = new Loginsystem();
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
	public Loginsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setBounds(211, 23, 67, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(68, 84, 61, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 165, 61, 14);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(277, 81, 125, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(277, 144, 125, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// TODO Auto-generated method stub
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				Connection conn=null;
				try {
					conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
				}catch(SQLException e){
					e.printStackTrace();
				}
			    if(conn != null)
			    {
			    	System.out.println("Connected");
			    }
			    else
			    	System.out.println("Not Connected");
			    try {
			    	conn.close();
			    }catch (SQLException e) {
			    	e.printStackTrace();
			    }

				String Password = txtPassword.getText();
				String Username = txtUsername.getText();
				
				if (Password.contains("great") && Username.contains("Ammu")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					//create object
					secondbox second =new secondbox();
					second.setVisible(true);
					
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login details","Login error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}

			}
		});
		btnLogin.setBounds(68, 205, 89, 20);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);

			}
		});
		btnReset.setBounds(200, 204, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginsystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginsystem, "Confirm if you want to exit","Loginsystem",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
				System.exit(0);
			}
		});
		btnExit.setBounds(320, 204, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
