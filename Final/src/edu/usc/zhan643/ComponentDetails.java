package edu.usc.zhan643;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
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
public class ComponentDetails extends javax.swing.JFrame implements ActionListener{
	/**
	 * @uml.property  name="image"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel image;
	/**
	 * @uml.property  name="name"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel name;
	/**
	 * @uml.property  name="nameText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField nameText;
	/**
	 * @uml.property  name="ourRateLabel"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel ourRateLabel;
	/**
	 * @uml.property  name="twoStar"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JRadioButton twoStar;
	/**
	 * @uml.property  name="commentLabel"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel commentLabel;
	private ButtonGroup buttonGroup6;
	private ButtonGroup buttonGroup5;
	private ButtonGroup buttonGroup4;
	private ButtonGroup buttonGroup3;
	private ButtonGroup buttonGroup;
	private ButtonGroup buttonGroup2;
	private ButtonGroup buttonGroup1;
	private JTextField managerText;
	private JLabel manager;
	private JTextField priceText;
	private JLabel price;
	private JTextField brandText;
	private JLabel brand;
	private JTextField categoryText;
	private JLabel category;
	private JTextField viewText;
	private JLabel viewTimes;
	private JTextField userRateText;
	private JLabel inputRate;
	/**
	 * @uml.property  name="submit"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton submit;
	/**
	 * @uml.property  name="comments"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextArea comments;
	/**
	 * @uml.property  name="oneStar"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JRadioButton oneStar;
	/**
	 * @uml.property  name="threeStar"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JRadioButton threeStar;
	/**
	 * @uml.property  name="fourStar"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JRadioButton fourStar;
	/**
	 * @uml.property  name="fiveStar"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JRadioButton fiveStar;
	/**
	 * @uml.property  name="userRateLabel"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel userRateLabel;
	/**
	 * @uml.property  name="ourRateText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField ourRateText;
	private String[] categoryList = {"cpu", "memory", "motherboard", "videocard", "storage", "cases", "monitor"};
	
	private int rating = 0;
	private int times;
	private String managerName;
	private String suggestion;
	private int index, type, id;
	private double oldRate;
	private int count = 0;

	private Connection conn = Connection2DB.conn;
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public ComponentDetails() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			{
				image = new JLabel();
				getContentPane().add(image);
				image.setBounds(74, 33, 287, 180);
				image.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("    Model :");
				name.setBounds(437, 127, 85, 21);
			}
			{
				nameText = new JTextField();
				getContentPane().add(nameText);
				nameText.setBounds(540, 124, 106, 28);
				nameText.setEditable(false);
			}
			{
				ourRateLabel = new JLabel();
				getContentPane().add(ourRateLabel);
				ourRateLabel.setText("Our Rate : ");
				ourRateLabel.setBounds(437, 183, 69, 21);
			}
			{
				ourRateText = new JTextField();
				getContentPane().add(ourRateText);
				ourRateText.setBounds(540, 176, 106, 28);
				ourRateText.setEditable(false);
			}
			{
				userRateLabel = new JLabel();
				getContentPane().add(userRateLabel);
				userRateLabel.setText("User Rate : ");
				userRateLabel.setBounds(710, 179, 74, 21);
			}
			{
				fiveStar = new JRadioButton();
				getContentPane().add(fiveStar);
				fiveStar.setText("5 Star");
				fiveStar.setBounds(217, 235, 79, 25);
				fiveStar.setActionCommand("5");
				fiveStar.addActionListener(this);
			}
			{
				fourStar = new JRadioButton();
				getContentPane().add(fourStar);
				fourStar.setText("4 Star ");
				fourStar.setBounds(345, 235, 76, 25);
				fourStar.setActionCommand("4");
				fourStar.addActionListener(this);
			}
			{
				threeStar = new JRadioButton();
				getContentPane().add(threeStar);
				threeStar.setText("3 Star");
				threeStar.setBounds(468, 235, 72, 25);
				threeStar.setActionCommand("3");
				threeStar.addActionListener(this);
			}
			{
				twoStar = new JRadioButton();
				getContentPane().add(twoStar);
				twoStar.setText("2 Star");
				twoStar.setBounds(588, 235, 75, 25);
				twoStar.setActionCommand("2");
				twoStar.addActionListener(this);
			}
			{
				oneStar = new JRadioButton();
				getContentPane().add(oneStar);
				oneStar.setText("1 Star");
				oneStar.setBounds(710, 235, 79, 25);
				oneStar.setActionCommand("1");
				oneStar.addActionListener(this);
			}
			{
				ButtonGroup bg = new ButtonGroup();
				bg.add(fiveStar);
				bg.add(fourStar);
				bg.add(threeStar);
				bg.add(twoStar);
				bg.add(oneStar);
			}
			{
				comments = new JTextArea();
				getContentPane().add(comments);
				comments.setBounds(74, 358, 816, 163);
			}
			{
				commentLabel = new JLabel();
				getContentPane().add(commentLabel);
				commentLabel.setText("Give Suggestions :");
				commentLabel.setBounds(74, 298, 132, 21);
			}
			{
				submit = new JButton();
				getContentPane().add(submit);
				submit.setText("Submit");
				submit.setBounds(449, 527, 76, 28);
				submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						submitActionPerformed(evt);
					}
				});
			}
			{
				inputRate = new JLabel();
				getContentPane().add(inputRate);
				inputRate.setText("Choose your rate :");
				inputRate.setBounds(74, 237, 119, 21);
			}
			{
				userRateText = new JTextField();
				getContentPane().add(userRateText);
				userRateText.setBounds(802, 176, 91, 28);
				userRateText.setEditable(false);
			}
			{
				viewTimes = new JLabel();
				getContentPane().add(viewTimes);
				viewTimes.setText("Times Viewed : ");
				viewTimes.setBounds(681, 127, 103, 21);
			}
			{
				viewText = new JTextField();
				getContentPane().add(viewText);
				viewText.setBounds(802, 124, 91, 28);
				viewText.setEditable(false);
			}
			{
				category = new JLabel();
				getContentPane().add(category);
				category.setText("Category :");
				category.setBounds(437, 33, 67, 21);
			}
			{
				categoryText = new JTextField();
				getContentPane().add(categoryText);
				categoryText.setBounds(540, 30, 106, 28);
				categoryText.setEditable(false);
			}
			{
				brand = new JLabel();
				getContentPane().add(brand);
				brand.setText("Brand : ");
				brand.setBounds(456, 76, 50, 21);
			}
			{
				brandText = new JTextField();
				getContentPane().add(brandText);
				brandText.setBounds(540, 76, 106, 28);
				brandText.setEditable(false);
			}
			{
				price = new JLabel();
				getContentPane().add(price);
				price.setText("Price :");
				price.setBounds(739, 79, 39, 21);
			}
			{
				priceText = new JTextField();
				getContentPane().add(priceText);
				priceText.setBounds(802, 76, 91, 28);
				priceText.setEditable(false);
			}
			{
				manager = new JLabel();
				getContentPane().add(manager);
				manager.setText("Manager : ");
				manager.setBounds(714, 33, 70, 21);
			}
			{
				managerText = new JTextField();
				getContentPane().add(managerText);
				managerText.setBounds(802, 30, 91, 28);
				managerText.setEditable(false);
			}
			pack();
			this.setSize(980, 626);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		String comm = e.getActionCommand();
		this.rating = Integer.parseInt(comm);
		System.out.println(this.rating);
	}
	public void fillContent(int index, int type) {
		/*
		 * type indicates wheter it's program recommand or
		 * user recommand
		 * 
		 * @ 1: program 
		 *   0: user
		 */
		
		this.type = type;
		this.index = index;
		DecimalFormat df = new DecimalFormat("0.00");
		if (type == 1) {
			this.nameText.setText(Price_and_function_select.pModel[index]);
			this.ourRateText.setText(df.format(Price_and_function_select.pProRate[index]));
			//this.userRateText.setText(df.format(Price_and_function_select.pUserRate[index]));
			
			String path = Price_and_function_select.pPicAddr[index];
			if (index == 1) {
				path = path.replace("*", "_");
			}
			ImageIcon icon = new ImageIcon(path);
			int width = image.getWidth();
			int height = image.getHeight();
			Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
			ImageIcon newIcon = new ImageIcon(scaledImage);
			this.image.setIcon(newIcon);
			
			String cate = this.categoryList[index].toUpperCase();
			this.categoryText.setText(cate);
			this.brandText.setText(Price_and_function_select.pBrand[index]);
			this.priceText.setText(Integer.toString(Price_and_function_select.pPrice[index]));
			
		} else {
			this.nameText.setText(Price_and_function_select.uModel[index]);
			this.ourRateText.setText(df.format(Price_and_function_select.uProRate[index]));
			//this.userRateText.setText(df.format(Price_and_function_select.uUserRate[index]));
			
			String path = Price_and_function_select.uPicAddr[index];
			if (index == 1) {
				path = path.replace("*", "_");
			}
			ImageIcon icon = new ImageIcon(path);
			int width = image.getWidth();
			int height = image.getHeight();
			Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
			ImageIcon newIcon = new ImageIcon(scaledImage);
			this.image.setIcon(newIcon);
			
			String cate = this.categoryList[index].toUpperCase();
			this.categoryText.setText(cate);
			this.brandText.setText(Price_and_function_select.uBrand[index]);
			this.priceText.setText(Integer.toString(Price_and_function_select.uPrice[index]));
		}
		
		switch (this.type) {
		case 0: this.id = Price_and_function_select.uId[this.index]; break;
		case 1: this.id = Price_and_function_select.pId[this.index]; break;
		}
		
		setViewedTimeAndManager();
	}
	private void setViewedTimeAndManager() {
		
		try {
			Statement stmt = conn.createStatement();
			//get viewed times from database
			String sql = "select time_reviewed, user_rating from " + categoryList[this.index]  + " where " + categoryList[this.index] + "_id='" + this.id + "'"; 
			ResultSet res = stmt.executeQuery(sql);
			if (res.next()) {
				this.times = res.getInt("time_reviewed");
				this.oldRate = res.getDouble("user_rating");
			}
			//get manager name from database
			sql = "select manager from " + categoryList[this.index]  + " where " + categoryList[this.index] + "_id='" + this.id + "'"; 
			res = stmt.executeQuery(sql);
			if (res.next()) {
				this.managerName = res.getString("manager");
			}
			res.close();
			stmt.close();
		} catch(SQLException e) {
			System.out.println("Can not get reviewed times");
			e.printStackTrace();
			System.exit(-1);
		}
		this.viewText.setText(Integer.toString(this.times));
		this.managerText.setText(this.managerName);
		DecimalFormat df = new DecimalFormat("0.00");
		this.userRateText.setText(df.format(this.oldRate));
	}
	

	
	private void submitActionPerformed(ActionEvent evt) {

		try {
			Statement stmt = conn.createStatement();
			//update view times
			int viewTimes = this.times + 1;
			String sql = "update " + categoryList[this.index] + " set time_reviewed='" + viewTimes + 
						 "'" + " where " + categoryList[this.index] + "_id='" + this.id + "'";
			stmt.executeUpdate(sql);
			
			//upload suggestions
			String user = Main.currentUser;
			sql = "insert into suggestions(content, manager, user, items, items_id) values('" 
				   + this.comments.getText() + "' , '" + this.managerName + "', '" + user + 
				   "', '" + categoryList[this.index] + "', '" + this.id + "')";
			stmt.executeUpdate(sql);
			
			//update user rating
			if (this.rating > 0) {
				int newUserRate = (int)(this.oldRate * this.times + this.rating) / (this.times + 1);
				sql = "update " + categoryList[this.index] + " set user_rating='" + newUserRate + 
					  "' where " + categoryList[this.index] + "_id='" + this.id + "'";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			}
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("Can not update viewed times in Database: " + categoryList[this.index]);
			e.printStackTrace();
			System.exit(-1);
		}
		new UpdatesSucceed().setVisible(true);
		this.dispose();
	}
	
}
