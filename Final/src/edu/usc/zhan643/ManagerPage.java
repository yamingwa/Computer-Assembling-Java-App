package edu.usc.zhan643;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
public class ManagerPage extends javax.swing.JFrame {
	/**
	 * @uml.property  name="addComponent"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton addComponent;
	/**
	 * @uml.property  name="seeSuggestions"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton seeSuggestions;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public ManagerPage() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				addComponent = new JButton();
				getContentPane().add(addComponent);
				addComponent.setText("Add Component");
				addComponent.setBounds(87, 48, 212, 30);
				addComponent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						addComponentActionPerformed(evt);
					}
				});
			}
			{
				seeSuggestions = new JButton();
				getContentPane().add(seeSuggestions);
				seeSuggestions.setText("See Suggestions");
				seeSuggestions.setBounds(87, 113, 212, 27);
				seeSuggestions.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						seeSuggestionsActionPerformed(evt);
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
	
	private void addComponentActionPerformed(ActionEvent evt) {
		
		new AddComponent().setVisible(true);
		
	}
	
	private void seeSuggestionsActionPerformed(ActionEvent evt) {
		Connection conn = Connection2DB.conn;
		DealingWithSuggestions deal = new DealingWithSuggestions();
		try{
			Statement stmt = conn.createStatement();
			String sql = "select * from suggestions where manager='" + Main.currentUser + "'";
			ResultSet res = stmt.executeQuery(sql);
			
			deal.setResult(res);
			deal.setVisible(true);
			
			
		} catch(SQLException e) {
			System.out.println("Can not get suggestions");
			e.printStackTrace();
			System.exit(-1);
		}
		
		
		
	}

}
