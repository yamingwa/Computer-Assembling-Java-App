package edu.usc.zhan643;
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
public class UserSignUp extends javax.swing.JFrame {
	/**
	 * @uml.property  name="username"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel Username;
	/**
	 * @uml.property  name="pwd"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel pwd;
	/**
	 * @uml.property  name="rePwd"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel rePwd;
	/**
	 * @uml.property  name="emailText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField emailText;
	/**
	 * @uml.property  name="repwdText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JPasswordField repwdText;
	/**
	 * @uml.property  name="pwdText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JPasswordField pwdText;
	/**
	 * @uml.property  name="signUp"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton signUp;
	/**
	 * @uml.property  name="userText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField userText;
	/**
	 * @uml.property  name="email"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel email;
	/**
	 * @uml.property  name="conn"
	 */
	private Connection conn = null;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public UserSignUp() {
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
				Username = new JLabel();
				getContentPane().add(Username);
				Username.setText("Username: ");
				Username.setBounds(76, 23, 78, 21);
			}
			{
				pwd = new JLabel();
				getContentPane().add(pwd);
				pwd.setText("Password : ");
				pwd.setBounds(77, 62, 78, 21);
			}
			{
				rePwd = new JLabel();
				getContentPane().add(rePwd);
				rePwd.setText("Password : ");
				rePwd.setBounds(77, 99, 73, 21);
			}
			{
				email = new JLabel();
				getContentPane().add(email);
				email.setText("Email       : ");
				email.setBounds(77, 136, 73, 21);
			}
			{
				userText = new JTextField();
				getContentPane().add(userText);
				userText.setBounds(162, 20, 98, 28);
			}
			{
				signUp = new JButton();
				getContentPane().add(signUp);
				signUp.setText("Sign Up");
				signUp.setBounds(136, 185, 75, 28);
				signUp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						signUpActionPerformed(evt);
					}
				});
			}
			{
				pwdText = new JPasswordField();
				getContentPane().add(pwdText);
				pwdText.setBounds(162, 59, 98, 28);
			}
			{
				repwdText = new JPasswordField();
				getContentPane().add(repwdText);
				repwdText.setBounds(162, 96, 98, 28);
			}
			{
				emailText = new JTextField();
				getContentPane().add(emailText);
				emailText.setBounds(162, 133, 98, 28);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void signUpActionPerformed(ActionEvent evt) {
		
		/*
		 * submit all information to database,
		 * then set dispose this frame
		 * 
		 * need to handle the invalid information
		 *
		 */
		String newUser = userText.getText();
		String pwd = pwdText.getText();
		String repwd = repwdText.getText();
		String emailAddr = emailText.getText();
		if (!pwd.equals(repwd)) {
			System.exit(-1);
		}
		String sql = "select * from member where username='" + newUser + "' and password='" + pwd + "'";
		try{
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			
			if (!res.next()) {
				sql = "insert into member(username, password) values('" + newUser + "', '" + pwd + "')";
				stmt.executeUpdate(sql);
				res.close();
				stmt.close();
			}
		} catch(SQLException e) {
			System.out.println("Error while regestering");
			e.printStackTrace();
			System.exit(-1);
		}
		this.dispose();
		
	}

}
