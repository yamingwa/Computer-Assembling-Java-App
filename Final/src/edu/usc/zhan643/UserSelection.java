package edu.usc.zhan643;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

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
public class UserSelection extends javax.swing.JFrame {
	/**
	 * @uml.property  name="user_Login"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton User_Login;
	/**
	 * @uml.property  name="manager_Login"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton Manager_Login;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public UserSelection() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(0,0,0));
			{
				User_Login = new JButton();
				getContentPane().add(User_Login);
				User_Login.setText("User");
				User_Login.setBounds(61, 118, 69, 28);
				User_Login.setBackground(new java.awt.Color(255,255,255));
				User_Login.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						User_LoginActionPerformed(evt);
					}
				});
			}
			{
				Manager_Login = new JButton();
				getContentPane().add(Manager_Login);
				Manager_Login.setText("Manager");
				Manager_Login.setBounds(235, 118, 85, 28);
				Manager_Login.setBackground(new java.awt.Color(255,255,255));
				Manager_Login.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						Manager_LoginActionPerformed(evt);
					}
				});
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void User_LoginActionPerformed(ActionEvent evt) {
		
		new UserSignIn().setVisible(true);
		this.dispose();
		
	}
	
	private void Manager_LoginActionPerformed(ActionEvent evt) {
		
		new UserSignIn().setVisible(true);
		this.dispose();
	}

}
