package edu.usc.zhan643;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.DecimalFormat;

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
public class ResultList extends javax.swing.JFrame {
	/**
	 * @uml.property  name="program"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel program;
	/**
	 * @uml.property  name="priceText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField priceText;
	/**
	 * @uml.property  name="userPrice"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel userPrice;
	/**
	 * @uml.property  name="userWatch"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton userWatch;
	/**
	 * @uml.property  name="proWatch"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton proWatch;
	/**
	 * @uml.property  name="userRateText2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField userRateText2;
	/**
	 * @uml.property  name="userRate2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel userRate2;
	/**
	 * @uml.property  name="ourRateText2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField ourRateText2;
	/**
	 * @uml.property  name="ourRate2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel ourRate2;
	/**
	 * @uml.property  name="userPriceText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField userPriceText;
	/**
	 * @uml.property  name="userRec"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel userRec;
	/**
	 * @uml.property  name="ourRateText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField ourRateText;
	/**
	 * @uml.property  name="userRateText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField userRateText;
	/**
	 * @uml.property  name="userRate"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel userRate;
	/**
	 * @uml.property  name="proRate"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel proRate;
	/**
	 * @uml.property  name="price1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel price1;

	/**
	 * @uml.property  name="proTotalPrice"
	 */
	private int proTotalPrice;
	/**
	 * @uml.property  name="userTotalPrice"
	 */
	private int userTotalPrice;
	/**
	 * @uml.property  name="proProRate"
	 */
	private double proProRate;
	/**
	 * @uml.property  name="proUserRate"
	 */
	private double proUserRate;
	/**
	 * @uml.property  name="userProRate"
	 */
	private double userProRate;
	/**
	 * @uml.property  name="userUserRate"
	 */
	private double userUserRate;
	/**
	 * @uml.property  name="proResult" multiplicity="(0 -1)" dimension="1"
	 */
	private ResultSet[] proResult;
	/**
	 * @uml.property  name="userResult" multiplicity="(0 -1)" dimension="1"
	 */
	private ResultSet[] userResult;
	/**
	* Auto-generated main method to display this JFrame
	*/

	public ResultList() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				program = new JLabel();
				getContentPane().add(program);
				program.setText("Program Recommand :");
				program.setBounds(17, 32, 152, 21);
			}
			{
				price1 = new JLabel();
				getContentPane().add(price1);
				price1.setText("Price : ");
				price1.setBounds(17, 90, 43, 21);
			}
			{
				priceText = new JTextField();
				getContentPane().add(priceText);
				priceText.setBounds(72, 87, 61, 28);
				
				priceText.setEditable(false);
			}
			{
				proRate = new JLabel();
				getContentPane().add(proRate);
				proRate.setText("Our Rate : ");
				proRate.setBounds(151, 90, 69, 21);
			}
			{
				userRate = new JLabel();
				getContentPane().add(userRate);
				userRate.setText("User Rate : ");
				userRate.setBounds(308, 90, 74, 21);
			}
			{
				userRateText = new JTextField();
				getContentPane().add(userRateText);
				userRateText.setBounds(387, 87, 69, 28);
				
				userRateText.setEditable(false);
			}
			{
				ourRateText = new JTextField();
				getContentPane().add(ourRateText);
				
				ourRateText.setBounds(225, 87, 71, 28);
				ourRateText.setEditable(false);
			}
			{
				userRec = new JLabel();
				getContentPane().add(userRec);
				userRec.setText("User Recommand : ");
				userRec.setBounds(17, 152, 128, 21);
			}
			{
				userPrice = new JLabel();
				getContentPane().add(userPrice);
				userPrice.setText("Price : ");
				userPrice.setBounds(17, 209, 43, 21);
			}
			{
				userPriceText = new JTextField();
				getContentPane().add(userPriceText);
				userPriceText.setBounds(72, 206, 61, 28);
				
				userPriceText.setEditable(false);
			}
			{
				ourRate2 = new JLabel();
				getContentPane().add(ourRate2);
				ourRate2.setText("Our Rate : ");
				ourRate2.setBounds(151, 209, 69, 21);
			}
			{
				ourRateText2 = new JTextField();
				getContentPane().add(ourRateText2);
				ourRateText2.setBounds(225, 206, 71, 28);
				
				ourRateText2.setEditable(false);
			}
			{
				userRate2 = new JLabel();
				getContentPane().add(userRate2);
				userRate2.setText("User Rate : ");
				userRate2.setBounds(308, 209, 74, 21);
			}
			{
				userRateText2 = new JTextField();
				getContentPane().add(userRateText2);
				userRateText2.setBounds(387, 206, 69, 28);
				
				userRateText2.setEditable(false);
			}
			{
				proWatch = new JButton();
				getContentPane().add(proWatch);
				proWatch.setText("Details");
				proWatch.setBounds(192, 29, 104, 28);
				proWatch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						proWatchActionPerformed(evt);
					}
				});
			}
			{
				userWatch = new JButton();
				getContentPane().add(userWatch);
				userWatch.setText("Details");
				userWatch.setBounds(192, 149, 104, 28);
				userWatch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						userWatchActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(499, 388);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void proWatchActionPerformed(ActionEvent evt) {
		
		ProgramResultDetails proResultDetails = new ProgramResultDetails();
		proResultDetails.fillContent(1);
		proResultDetails.setVisible(true);
	}
	
	private void userWatchActionPerformed(ActionEvent evt) {
	
		ProgramResultDetails proResultDetails = new ProgramResultDetails();
		proResultDetails.fillContent(0);
		proResultDetails.setVisible(true);
	}
	
	public void setProgramRec(int price, double prorate, double userrate) {
		priceText.setText(Integer.toString(price));
		userRateText.setText(new DecimalFormat("0.00").format(userrate));
		ourRateText.setText(new DecimalFormat("0.00").format(prorate));
		
		
	}
	public void setUserRec(int price, double prorate, double userrate) {
		userPriceText.setText(Integer.toString(price));
		ourRateText2.setText(new DecimalFormat("0.00").format(prorate));
		userRateText2.setText(new DecimalFormat("0.00").format(userrate));
		
	}
	public void setResult(ResultSet[] proRes, ResultSet[] userRes) {
		this.proResult = proRes;
		this.userResult = userRes;
	}

}
