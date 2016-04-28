package edu.usc.zhan643;
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class SignUpSuccess extends javax.swing.JFrame {
	/**
	 * @uml.property  name="thankYourForJoinUs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel thankYourForJoinUs;
	/**
	 * @uml.property  name="signUpName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField signUpName;
	/**
	 * @uml.property  name="goSignIn"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton goSignIn;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public SignUpSuccess() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				thankYourForJoinUs = new JLabel();
				getContentPane().add(thankYourForJoinUs);
				thankYourForJoinUs.setText("Thank you for join us !!!");
				thankYourForJoinUs.setBounds(137, 65, 164, 28);
			}
			{
				signUpName = new JTextField();
				getContentPane().add(signUpName);
				signUpName.setBounds(163, 120, 95, 28);
			}
			{
				goSignIn = new JButton();
				getContentPane().add(goSignIn);
				goSignIn.setText("Go sign in !");
				goSignIn.setBounds(150, 186, 124, 28);
			}
			pack();
			this.setSize(460, 366);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
