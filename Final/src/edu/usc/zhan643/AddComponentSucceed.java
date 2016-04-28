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
public class AddComponentSucceed extends javax.swing.JFrame {
	private JLabel msg;
	private JButton back;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public AddComponentSucceed() {
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
				msg = new JLabel();
				getContentPane().add(msg);
				msg.setText("Operation Succeeds!");
				msg.setBounds(50, 41, 151, 39);
			}
			{
				back = new JButton();
				getContentPane().add(back);
				back.setText("Back");
				back.setBounds(90, 106, 64, 28);
				back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						backActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(257, 240);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void backActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
