package edu.usc.zhan643;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class DealingWithSuggestions extends javax.swing.JFrame {
	private JTable sTable;
	private JLabel msg;

	private int num = 10;
	private String[] content = new String[num];
	private String[] user = new String[num];
	private String[] item = new String[num];
	private String[] item_id = new String[num];
	
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public DealingWithSuggestions() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				TableModel sTableModel = new DefaultTableModel();
				sTable = new JTable();
				getContentPane().add(sTable);
				sTable.setModel(sTableModel);
				sTable.setBounds(0, 84, 747, 253);
				sTable.setRowHeight(25);
			}
			{
				msg = new JLabel();
				getContentPane().add(msg);
				msg.setText("Suggestion List :");
				msg.setBounds(12, 25, 107, 21);
			}
			pack();
			this.setSize(765, 384);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void setResult(ResultSet res){
		try{
			int count = 0;
			while (res.next()) {
				content[count] = res.getString("content");
				user[count] = res.getString("user");
				item[count] = res.getString("items");
				item_id[count] = res.getString("items_id");
				count++;
				
			}	
			System.out.println(count);
			DefaultTableModel d = (DefaultTableModel)this.sTable.getModel();
			d.setRowCount(count + 1);
			d.setColumnCount(4);
			
			
			d.setValueAt("Content", 0, 0);
			d.setValueAt("User Name", 0, 1);
			d.setValueAt("Component", 0, 2);
			d.setValueAt("Component ID", 0, 3);
			
			for (int i = 1; i <= count; i++) {
				d.setValueAt(content[i - 1], i, 0);
				d.setValueAt(user[i - 1], i, 1);
				d.setValueAt(item[i - 1], i, 2);
				d.setValueAt(item_id[i - 1], i, 3);
			}
			this.sTable.setModel(d);
		}catch(SQLException e) {
			System.out.println("Can not set suggestion message");
			e.printStackTrace();
			System.exit(-1);
		}
		
	}

}
