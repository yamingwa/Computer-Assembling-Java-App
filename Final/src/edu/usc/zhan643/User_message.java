package edu.usc.zhan643;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
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
public class User_message extends javax.swing.JFrame {
	/**
	 * @uml.property  name="helloForUserMessage"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel helloForUserMessage;
	/**
	 * @uml.property  name="userMessage1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextArea userMessage1;
	/**
	 * @uml.property  name="componentName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField componentName;
	/**
	 * @uml.property  name="nextSuggestion"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton nextSuggestion;
	/**
	 * @uml.property  name="suggestion1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel suggestion1;
	/**
	 * @uml.property  name="checkComponent"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton checkComponent;
	/**
	 * @uml.property  name="onWhichComponent"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel onWhichComponent;
	/**
	 * @uml.property  name="byUserName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField byUserName;
	/**
	 * @uml.property  name="by"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel by;
	/**
	 * @uml.property  name="userNameTextForUserMessage"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField userNameTextForUserMessage;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				User_message inst = new User_message();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public User_message() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				helloForUserMessage = new JLabel();
				getContentPane().add(helloForUserMessage);
				helloForUserMessage.setText("Hello !");
				helloForUserMessage.setBounds(20, 26, 44, 21);
			}
			{
				userNameTextForUserMessage = new JTextField();
				getContentPane().add(userNameTextForUserMessage);
				userNameTextForUserMessage.setBounds(82, 23, 95, 28);
				userNameTextForUserMessage.setEditable(false);
			}
			{
				userMessage1 = new JTextArea();
				getContentPane().add(userMessage1);
				userMessage1.setBounds(20, 90, 434, 63);
			}
			{
				by = new JLabel();
				getContentPane().add(by);
				by.setText("By :");
				by.setBounds(314, 165, 26, 22);
			}
			{
				byUserName = new JTextField();
				getContentPane().add(byUserName);
				byUserName.setBounds(352, 163, 71, 28);
				byUserName.setEditable(false);
			}
			{
				componentName = new JTextField();
				getContentPane().add(componentName);
				componentName.setBounds(142, 163, 102, 28);
				componentName.setEditable(false);
			}
			{
				onWhichComponent = new JLabel();
				getContentPane().add(onWhichComponent);
				onWhichComponent.setText("On Component :");
				onWhichComponent.setBounds(20, 166, 108, 21);
			}
			{
				checkComponent = new JButton();
				getContentPane().add(checkComponent);
				checkComponent.setText("Check Component");
				checkComponent.setBounds(20, 210, 135, 26);
			}
			{
				nextSuggestion = new JButton();
				getContentPane().add(nextSuggestion);
				nextSuggestion.setText("Next One");
				nextSuggestion.setBounds(352, 266, 76, 28);
			}
			{
				suggestion1 = new JLabel();
				getContentPane().add(suggestion1);
				suggestion1.setText("Suggestion1 :");
				suggestion1.setBounds(20, 59, 89, 21);
			}
			pack();
			this.setSize(493, 373);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
