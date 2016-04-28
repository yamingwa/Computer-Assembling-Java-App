package edu.usc.zhan643;
import javax.swing.JButton;
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
public class NoNextSuggestion extends javax.swing.JFrame {
	/**
	 * @uml.property  name="noNextSuggestion"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField noNextSuggestion;
	/**
	 * @uml.property  name="noMoreSuggestionsOk"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton noMoreSuggestionsOk;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public NoNextSuggestion() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				noNextSuggestion = new JTextField();
				getContentPane().add(noNextSuggestion);
				noNextSuggestion.setText("No More Suggestions");
				noNextSuggestion.setBounds(108, 44, 164, 28);
				noNextSuggestion.setEditable(false);
			}
			{
				noMoreSuggestionsOk = new JButton();
				getContentPane().add(noMoreSuggestionsOk);
				noMoreSuggestionsOk.setText("OK");
				noMoreSuggestionsOk.setBounds(154, 124, 80, 32);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
