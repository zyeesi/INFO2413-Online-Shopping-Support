import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Toolkit;

import java.sql.*;

public class LoginPage extends JFrame {
	
	private final static String ROOT_PASSWORD = "Root!420";

	private static String currentUser;
	
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(725, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		loginLabel.setBounds(175, 10, 65, 45);
		contentPane.add(loginLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameLabel.setBounds(30, 80, 90, 25);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordLabel.setBounds(30, 115, 90, 25);
		contentPane.add(passwordLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(170, 80, 170, 25);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 115, 170, 25);
		contentPane.add(passwordField);
		
		JCheckBox showPassBox = new JCheckBox("show");
		showPassBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showPassBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		showPassBox.setBounds(346, 116, 97, 23);
		getContentPane().add(showPassBox);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				try {
					 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/OSSdb","root", ROOT_PASSWORD);
					 Statement statement=con.createStatement();
					 String sql="Select * from Users where UserID ='"+username+"' and UserPassword='"+password+"'";
					 ResultSet rs=statement.executeQuery(sql);
					 if(rs.next()){
						 JOptionPane.showMessageDialog(null, "Login success");
						 java.awt.EventQueue.invokeLater(new Runnable() {
					            public void run() {
					            	currentUser=username;
					            	setVisible(false);
					                new OnlineShoppingSupport().setVisible(true);
					            }
					        });
					 }
					 else {
						 JOptionPane.showMessageDialog(null, "Login failed");
					 }
					 con.close();
					 statement.close();
				 }catch(Exception ex) {
					 System.out.print(ex);
				 }
			}
		});
		loginButton.setBounds(180, 182, 89, 23);
		contentPane.add(loginButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				try {
					 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/OSSdb","root", ROOT_PASSWORD);
					 Statement statement=con.createStatement();
					 String sql="Select * from Users where UserID ='"+username+"'";
					 ResultSet rs=statement.executeQuery(sql);
					 if(username.equals("") || password.equals("")) {
						 JOptionPane.showMessageDialog(null, "Please fill in all the fields");
				     }
					 else if (password.length()<8 && password!="") {
						 JOptionPane.showMessageDialog(null, "Password too short. Atleast 8 digit.");
					 } 
					 else if(!checkPassword(password)) {
						 JOptionPane.showMessageDialog(null, "Password requires atleast 1 uppercase, 1 lowcase, and 1 number.");
					 }
					 else if(rs.next()){
						 JOptionPane.showMessageDialog(null, "Login name has already been used");
					 }
					 else {
							String sqlInsert = "INSERT INTO Users " + 
										 			"(UserID, UserPassword)" +
										 			"VALUES ('"+username+"','"+password+"');";
								 statement.executeUpdate(sqlInsert);
								 JOptionPane.showMessageDialog(null, "Register success");
						}
					 con.close();
					 statement.close();
				 }catch(Exception ex) {
					 System.out.print(ex);
				 }
			}
		});
		registerButton.setBounds(43, 182, 89, 23);
		contentPane.add(registerButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ResetPage frame = new ResetPage();
				frame.setVisible(true);
			}
		});
		resetButton.setBounds(315, 182, 89, 23);
		contentPane.add(resetButton);
	}
	
	public static String username() {
		return currentUser;
	}
	
	public static boolean checkPassword(String password) {
		boolean hasUpper=false, hasLower=false, hasNum=false;
		for(int i=0; i<password.length();i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				hasUpper=true;
			}
			if(Character.isLowerCase(password.charAt(i))) {
				hasLower=true;
			}
			if(Character.isDigit(password.charAt(i))) {
				hasNum=true;
			}
		}
		if(hasUpper&&hasLower&&hasNum) {
			return true;
		}
		else {
			return false;
		}
	}
}



