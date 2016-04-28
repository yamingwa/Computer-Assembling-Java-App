package edu.usc.zhan643;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class UpdatesSucceed extends javax.swing.JFrame {
	private JLabel succ;
	private JButton ok;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public UpdatesSucceed() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(255,255,255));
			{
				succ = new JLabel();
				getContentPane().add(succ);
				succ.setText("Updates Succeed!");
				succ.setBounds(84, 40, 118, 21);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("OK");
				ok.setBounds(106, 83, 74, 28);
				ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						okActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(311, 195);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void okActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
