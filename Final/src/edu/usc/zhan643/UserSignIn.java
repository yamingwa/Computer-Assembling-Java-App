package edu.usc.zhan643;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class UserSignIn extends javax.swing.JFrame {
	/**
	 * @uml.property  name="user"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel User;
	/**
	 * @uml.property  name="login"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton Login;
	/**
	 * @uml.property  name="error"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel error;
	/**
	 * @uml.property  name="pwd"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JPasswordField pwd;
	/**
	 * @uml.property  name="signup"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton Signup;
	/**
	 * @uml.property  name="userText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField UserText;
	/**
	 * @uml.property  name="pwd"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel Pwd;
	/**
	 * @uml.property  name="conn"
	 */
	private Connection conn = null;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public UserSignIn() {
		super();
		conn = Main.c.getConn();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				User = new JLabel();
				getContentPane().add(User);
				User.setText("Username: ");
				User.setBounds(88, 47, 80, 21);
			}
			{
				Pwd = new JLabel();
				getContentPane().add(Pwd);
				Pwd.setText("Password : ");
				Pwd.setBounds(82, 94, 80, 21);
			}
			{
				UserText = new JTextField();
				getContentPane().add(UserText);
				UserText.setBounds(180, 44, 109, 28);
			}
			{
				Login = new JButton();
				getContentPane().add(Login);
				Login.setText("Sign In");
				Login.setBounds(62, 166, 80, 28);
				Login.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						LoginActionPerformed(evt);
					}
				});
			}
			{
				Signup = new JButton();
				getContentPane().add(Signup);
				Signup.setText("Sign Up");
				Signup.setBounds(228, 166, 83, 28);
				Signup.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						SignupActionPerformed(evt);
					}
				});
			}
			{
				pwd = new JPasswordField();
				getContentPane().add(pwd);
				pwd.setBounds(180, 91, 109, 28);
			}
			{
				error = new JLabel();
				getContentPane().add(error);
				error.setBounds(82, 131, 244, 16);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void LoginActionPerformed(ActionEvent evt) {
		
		String userName = UserText.getText();
		String password = pwd.getText();
		String sql = "select * from member where username='" + userName + "' and password='" + password +"'";
		try{
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			
			/*
			 * need handle wrong username&password
			 */
			if (res.next()){
				Main.currentUser = userName;
				String userType = res.getString("user_type");
				if (userType.equals("manager")) {
					new ManagerPage().setVisible(true);
				} else {
					
					System.out.println(Main.currentUser);
					Price_and_function_select userFrame = new Price_and_function_select();
					userFrame.setUserName(UserText.getText());
					userFrame.setConnection(this.conn);
					userFrame.setVisible(true);
				}
				res.close();
				stmt.close();
				this.dispose();
			} else {
				UserText.setText("");
				pwd.setText("");
				error.setForeground(Color.red);
				error.setText("username & password does not match!");
			}
		} catch(SQLException e) {
			System.out.println("Error while querying database");
			System.exit(-1);
		}
		
	}
	
	private void SignupActionPerformed(ActionEvent evt) {
		
		new UserSignUp().setVisible(true);
		//this.setVisible(false);
	}

}
