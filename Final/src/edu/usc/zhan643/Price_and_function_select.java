package edu.usc.zhan643;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ListModel;
import javax.swing.SpinnerListModel;

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
public class Price_and_function_select extends javax.swing.JFrame {
	/**
	 * @uml.property  name="function_requirement"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel Function_requirement;
	/**
	 * @uml.property  name="hello"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel hello;
	/**
	 * @uml.property  name="funcList"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JComboBox funcList;
	/**
	 * @uml.property  name="priceRange"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JComboBox priceRange;
	/**
	 * @uml.property  name="helloUserName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField helloUserName;
	/**
	 * @uml.property  name="search"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton Search;
	/**
	 * @uml.property  name="jLabel1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel jLabel1;
	/**
	 * @uml.property  name="userName"
	 */
	private String userName = null;
	/**
	 * @uml.property  name="priceList" multiplicity="(0 -1)" dimension="1"
	 */
	private String[] priceList = {"", "0 ~ 600", "600 ~ 800", "800 ~ 1000", "1000 up"};
	/**
	 * @uml.property  name="price"
	 */
	private int price = 0;
	/**
	 * @uml.property  name="functionList" multiplicity="(0 -1)" dimension="1"
	 */
	private String[] functionList = {"", "Game", "Business", "Family"};
	/**
	 * @uml.property  name="func"
	 */
	private String func = null;
	/**
	 * @uml.property  name="conn"
	 */
	private Connection conn = null;
	/**
	 * @uml.property  name="componentNum"
	 */
	private int componentNum = 7;
	/**
	 * @uml.property  name="table" multiplicity="(0 -1)" dimension="1"
	 */
	private String[] table = {"cpu", "memory", "motherboard", "videocard", "storage", "cases", "monitor"};
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static int num = 7;
	public static int[] pId = new int[num];
	public static String[] pBrand = new String[num];
	public static String[] pModel = new String[num];
	public static int[] pView = new int[num];
	public static int[] pPrice = new int[num];
	public static double[] pUserRate = new double[num];
	public static double[] pProRate = new double[num];
	public static String[] pPicAddr = new String[num];
	
	public static int[] uId = new int[num];
	public static String[] uBrand = new String[num];
	public static String[] uModel = new String[num];
	public static int[] uView = new int[num];
	public static int[] uPrice = new int[num];
	public static double[] uUserRate = new double[num];
	public static double[] uProRate = new double[num];
	public static String[] uPicAddr = new String[num];
	
	
	public Price_and_function_select() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Price Range:");
				jLabel1.setBounds(21, 62, 96, 28);
			}
			{
				Function_requirement = new JLabel();
				getContentPane().add(Function_requirement);
				Function_requirement.setText("Function Requirement:");
				Function_requirement.setBounds(21, 135, 171, 21);
			}
			{
				Search = new JButton();
				getContentPane().add(Search);
				Search.setText("Search");
				Search.setBounds(147, 187, 72, 28);
				Search.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						SearchActionPerformed(evt);
					}
				});
			}
			{
				hello = new JLabel();
				getContentPane().add(hello);
				hello.setText("Hello !");
				hello.setBounds(21, 12, 44, 21);
			}
			{
				helloUserName = new JTextField();
				getContentPane().add(helloUserName);
				helloUserName.setBounds(77, 9, 83, 28);
				helloUserName.setText(userName);
				helloUserName.setEditable(false);
			}
			{
				ComboBoxModel priceRangeModel = 
					new DefaultComboBoxModel(priceList);
				priceRange = new JComboBox();
				getContentPane().add(priceRange);
				priceRange.setModel(priceRangeModel);
				priceRange.setBounds(114, 62, 104, 28);
				priceRange.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent evt) {
						priceRangeItemStateChanged(evt);
					}
				});
			}
			{
				ComboBoxModel funcListModel = 
					new DefaultComboBoxModel(functionList);
				funcList = new JComboBox();
				getContentPane().add(funcList);
				funcList.setModel(funcListModel);
				funcList.setBounds(204, 131, 146, 28);
				funcList.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent evt) {
						funcListItemStateChanged(evt);
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
	
	private void SearchActionPerformed(ActionEvent evt) {
		System.out.println("Search.actionPerformed, event="+evt);
		//TODO add your code for Search.actionPerformed
		
		try{
			Statement stmt = conn.createStatement();
			//get components with the same function
			int totalPrice = 0;
			double totalProRate = 0;
			double totalUserRate = 0;
			for (int i = 0; i < componentNum; i++) {
				String sql = "select * from " + table[i] + " where function='" + func + "' and " + table[i] + ".range<='" + price  + "' order by program_rating DESC limit 1";
				
				ResultSet res = stmt.executeQuery(sql);
				if (res.next()) {
					//System.out.println(res.getInt("price"));
					
					int price = res.getInt("price");
					double pRate = res.getDouble("program_rating");
					double uRate = res.getDouble("user_rating");
					
					pId[i] = res.getInt(table[i] + "_id");
					pBrand[i] = res.getString("brand");
					pModel[i] = res.getString("model");
					//pView[i] = res.getInt("time_reviewed");
					pPrice[i] = price;
					pProRate[i] = pRate;
					pUserRate[i] = uRate;
					pPicAddr[i] = res.getString("pic_address");
					totalPrice += price;
					totalProRate += pRate;
					totalUserRate += uRate;
				}
			}
			totalProRate /= componentNum;
			totalUserRate /= componentNum;
			
			
			Statement stmt2 = conn.createStatement();
			
			int userTotalPrice = 0;
			double userProRate = 0;
			double userUserRate = 0;
			for (int i = 0; i < componentNum; i++) {
				String sql = "select * from " + table[i] + " where function='" + func + "' and " + table[i] + ".range<='" + price  + "' order by user_rating DESC limit 1";
				
				ResultSet userResult = stmt2.executeQuery(sql);
				if (userResult.next()) {
					int price = userResult.getInt("price");
					double pRate = userResult.getDouble("program_rating");
					double uRate = userResult.getDouble("user_rating");
					
					uId[i] = userResult.getInt(table[i] + "_id");
					uBrand[i] = userResult.getString("brand");
					uModel[i] = userResult.getString("model");
					//uView[i] = userResult.getInt("time_reviewed");
					uPrice[i] = price;
					uProRate[i] = pRate;
					uUserRate[i] = uRate;
					uPicAddr[i] = userResult.getString("pic_address");
					
					userTotalPrice += price;
					userProRate += pRate;
					userUserRate += uRate;
				}
			}
			userProRate /= componentNum;
			userUserRate /= componentNum;
			
			ResultList rl = new ResultList();
			rl.setProgramRec(totalPrice, totalProRate, totalUserRate);
			rl.setUserRec(userTotalPrice, userProRate, userUserRate);
			//rl.setResult(res, userResult);
			rl.setVisible(true);
			
			stmt.close();
			stmt2.close();
			
		} catch(SQLException e) {
			System.out.println("Can not execute query");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	/**
	 * @param name
	 * @uml.property  name="userName"
	 */
	public void setUserName(String name) {
		this.userName = name;
		this.helloUserName.setText(name);
	}
	
	public void setConnection(Connection connection) {
		this.conn = connection;
	}
	
	private void priceRangeItemStateChanged(ItemEvent evt) {
		
		if (evt.getSource() == priceRange) {
			for (int i = 0; i < 5; i++) {
				if (priceRange.getSelectedItem().toString().equals(priceList[i])) {
					this.price = i;
					break;
				}
			}
		}
	}
	
	private void funcListItemStateChanged(ItemEvent evt) {
		
		if (evt.getSource() == funcList) {
			this.func = funcList.getSelectedItem().toString();
		}
	}

}
