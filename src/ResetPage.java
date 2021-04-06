import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class ResetPage extends JFrame {
	
	private final static String ROOT_PASSWORD = "";
	
	private JTextField usernameField;
	private JPasswordField oldPasswordField;
	private JPasswordField newPasswordField;

	public ResetPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(725, 350, 450, 300);
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
		
		JLabel ResetLabel = new JLabel("Reset");
		ResetLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ResetLabel.setBounds(175, 10, 65, 45);
		getContentPane().add(ResetLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(170, 80, 170, 25);
		getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		oldPasswordField = new JPasswordField();
		oldPasswordField.setBounds(170, 115, 170, 25);
		getContentPane().add(oldPasswordField);
		
		newPasswordField = new JPasswordField();
		newPasswordField.setBounds(170, 150, 170, 25);
		getContentPane().add(newPasswordField);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameLabel.setBounds(30, 80, 112, 25);
		getContentPane().add(usernameLabel);
		
		JLabel oldPasswordLabel = new JLabel("Old password");
		oldPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		oldPasswordLabel.setBounds(30, 115, 130, 25);
		getContentPane().add(oldPasswordLabel);
		
		JLabel newPasswordLabel = new JLabel("New password");
		newPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		newPasswordLabel.setBounds(30, 150, 130, 25);
		getContentPane().add(newPasswordLabel);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String oldPassword = oldPasswordField.getText();
				String newPassword = newPasswordField.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/OSSdb","root", ROOT_PASSWORD);
					Statement statement=con.createStatement();
					String sql="Select * from Users where UserID ='"+username+"' and UserPassword='"+oldPassword+"'";
					ResultSet rs=statement.executeQuery(sql);
					if(rs.next()){
						if(username.equals("") || newPassword.equals("")) {
							 JOptionPane.showMessageDialog(null, "Please fill in all the fields");
					     }
						 else if (newPassword.length()<8 && newPassword!="") {
							 JOptionPane.showMessageDialog(null, "Password too short. Atleast 8 digit.");
						 } 
						 else if(!LoginPage.checkPassword(newPassword)) {
							 JOptionPane.showMessageDialog(null, "Password requires atleast 1 uppercase, 1 lowcase, and 1 number.");
						 }
						 else {
							 String sql2="UPDATE Users SET Userpassword ='"+newPassword+"' WHERE UserID ='"+username+"'";
							 PreparedStatement pst = con.prepareStatement(sql2);
							 pst.execute();
							 JOptionPane.showMessageDialog(null, "Password reset success");
							 setVisible(false);
							 LoginPage frame = new LoginPage();
							 frame.setVisible(true);
						 }
					}
					else {
						JOptionPane.showMessageDialog(null, "Username or password incorrect");
					}
					con.close();
					statement.close();
				}catch(Exception ex) {
					 System.out.print(ex);
				}	
			}
		});
		resetButton.setBounds(71, 205, 89, 23);
		getContentPane().add(resetButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LoginPage frame = new LoginPage();
				frame.setVisible(true);
			}
		});
		BackButton.setBounds(251, 205, 89, 23);
		getContentPane().add(BackButton);
		
		JCheckBox showOldPassBox = new JCheckBox("show");
		showOldPassBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showOldPassBox.isSelected()) {
					oldPasswordField.setEchoChar((char)0);
				}
				else {
					oldPasswordField.setEchoChar('*');
				}
			}
		});
		showOldPassBox.setBounds(346, 116, 97, 23);
		getContentPane().add(showOldPassBox);
		
		JCheckBox showNewPassBox = new JCheckBox("show");
		showNewPassBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showNewPassBox.isSelected()) {
					newPasswordField.setEchoChar((char)0);
				}
				else {
					newPasswordField.setEchoChar('*');
				}
			}
		});
		showNewPassBox.setBounds(346, 151, 97, 23);
		getContentPane().add(showNewPassBox);
	}
}
