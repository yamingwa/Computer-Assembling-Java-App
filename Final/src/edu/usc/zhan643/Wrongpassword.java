package edu.usc.zhan643;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

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
public class Wrongpassword extends javax.swing.JFrame {
	/**
	 * @uml.property  name="wrongPassword"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel wrongPassword;
	/**
	 * @uml.property  name="signUpForWrongPassword"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton signUpForWrongPassword;
	/**
	 * @uml.property  name="back"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton back;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Wrongpassword inst = new Wrongpassword();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Wrongpassword() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				wrongPassword = new JLabel();
				getContentPane().add(wrongPassword);
				wrongPassword.setText("Wrong Password");
				wrongPassword.setBounds(163, 78, 119, 35);
			}
			{
				back = new JButton();
				getContentPane().add(back);
				back.setText("Back");
				back.setBounds(55, 174, 82, 27);
			}
			{
				signUpForWrongPassword = new JButton();
				getContentPane().add(signUpForWrongPassword);
				signUpForWrongPassword.setText("Sign Up");
				signUpForWrongPassword.setBounds(300, 174, 90, 28);
			}
			pack();
			this.setSize(483, 343);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
