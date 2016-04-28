package edu.usc.zhan643;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

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
public class ProgramResultDetails extends javax.swing.JFrame {
	/**
	 * @uml.property  name="name"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel name;
	/**
	 * @uml.property  name="price"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel price;
	/**
	 * @uml.property  name="total"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField total;
	/**
	 * @uml.property  name="component7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component7;
	/**
	 * @uml.property  name="component6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component6;
	/**
	 * @uml.property  name="component5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component5;
	/**
	 * @uml.property  name="component4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component4;
	/**
	 * @uml.property  name="component3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component3;
	/**
	 * @uml.property  name="component2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component2;
	/**
	 * @uml.property  name="component1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel component1;
	/**
	 * @uml.property  name="detail7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail7;
	/**
	 * @uml.property  name="detail6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail6;
	/**
	 * @uml.property  name="detail5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail5;
	/**
	 * @uml.property  name="detail4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail4;
	/**
	 * @uml.property  name="detail3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail3;
	/**
	 * @uml.property  name="detail2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail2;
	/**
	 * @uml.property  name="detail1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton detail1;
	/**
	 * @uml.property  name="totalPrice"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel totalPrice;
	/**
	 * @uml.property  name="price7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price7;
	/**
	 * @uml.property  name="brand7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand7;
	/**
	 * @uml.property  name="price6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price6;
	/**
	 * @uml.property  name="brand6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand6;
	/**
	 * @uml.property  name="price5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price5;
	/**
	 * @uml.property  name="brand5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand5;
	/**
	 * @uml.property  name="price4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price4;
	/**
	 * @uml.property  name="brand4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand4;
	/**
	 * @uml.property  name="price3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price3;
	/**
	 * @uml.property  name="brand3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand3;
	/**
	 * @uml.property  name="price2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price2;
	/**
	 * @uml.property  name="brand2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand2;
	/**
	 * @uml.property  name="price1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField price1;
	/**
	 * @uml.property  name="brand1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField brand1;
	/**
	 * @uml.property  name="brand"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel brand;
	private int type;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public ProgramResultDetails() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("Components");
				name.setBounds(38, 28, 84, 21);
			}
			{
				brand = new JLabel();
				getContentPane().add(brand);
				brand.setText("Brand");
				brand.setBounds(167, 28, 44, 21);
			}
			{
				price = new JLabel();
				getContentPane().add(price);
				price.setText("Price");
				price.setBounds(263, 28, 32, 21);
			}
			{
				brand1 = new JTextField();
				getContentPane().add(brand1);
				brand1.setBounds(154, 67, 63, 28);
				brand1.setEditable(false);
			}
			{
				price1 = new JTextField();
				getContentPane().add(price1);
				price1.setBounds(252, 67, 57, 28);
				price1.setEditable(false);
			}
			{
				brand2 = new JTextField();
				getContentPane().add(brand2);
				brand2.setBounds(154, 121, 63, 28);
				brand2.setEditable(false);
			}
			{
				price2 = new JTextField();
				getContentPane().add(price2);
				price2.setBounds(252, 121, 57, 28);
				price2.setEditable(false);
			}
			{
				brand3 = new JTextField();
				getContentPane().add(brand3);
				brand3.setBounds(154, 175, 63, 28);
				brand3.setEditable(false);
			}
			{
				price3 = new JTextField();
				getContentPane().add(price3);
				price3.setBounds(252, 175, 57, 28);
				price3.setEditable(false);
			}
			{
				brand4 = new JTextField();
				getContentPane().add(brand4);
				brand4.setBounds(154, 229, 63, 28);
				brand4.setEditable(false);
			}
			{
				price4 = new JTextField();
				getContentPane().add(price4);
				price4.setBounds(252, 229, 57, 28);
				price4.setEditable(false);
			}
			{
				brand5 = new JTextField();
				getContentPane().add(brand5);
				brand5.setBounds(154, 280, 63, 28);
				brand5.setEditable(false);
			}
			{
				price5 = new JTextField();
				getContentPane().add(price5);
				price5.setBounds(252, 280, 57, 28);
				price5.setEditable(false);
			}
			{
				brand6 = new JTextField();
				getContentPane().add(brand6);
				brand6.setBounds(154, 329, 63, 28);
				brand6.setEditable(false);
			}
			{
				price6 = new JTextField();
				getContentPane().add(price6);
				price6.setBounds(252, 329, 57, 28);
				price6.setEditable(false);
			}
			{
				brand7 = new JTextField();
				getContentPane().add(brand7);
				brand7.setBounds(154, 375, 63, 28);
				brand7.setEditable(false);
			}
			{
				price7 = new JTextField();
				getContentPane().add(price7);
				price7.setBounds(252, 375, 57, 28);
				price7.setEditable(false);
			}
			{
				totalPrice = new JLabel();
				getContentPane().add(totalPrice);
				totalPrice.setText("Total : ");
				totalPrice.setBounds(166, 440, 45, 21);
			}
			{
				total = new JTextField();
				getContentPane().add(total);
				total.setBounds(252, 437, 57, 28);
				total.setEditable(false);
			}
			{
				detail1 = new JButton();
				getContentPane().add(detail1);
				detail1.setText("More...");
				detail1.setBounds(321, 67, 58, 28);
				detail1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail1ActionPerformed(evt);
					}
				});
			}
			{
				detail2 = new JButton();
				getContentPane().add(detail2);
				detail2.setText("More...");
				detail2.setBounds(321, 121, 58, 28);
				detail2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail2ActionPerformed(evt);
					}
				});
			}
			{
				detail3 = new JButton();
				getContentPane().add(detail3);
				detail3.setText("More...");
				detail3.setBounds(321, 175, 58, 28);
				detail3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail3ActionPerformed(evt);
					}
				});
			}
			{
				detail4 = new JButton();
				getContentPane().add(detail4);
				detail4.setText("More...");
				detail4.setBounds(321, 229, 58, 28);
				detail4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail4ActionPerformed(evt);
					}
				});
			}
			{
				detail5 = new JButton();
				getContentPane().add(detail5);
				detail5.setText("More...");
				detail5.setBounds(321, 280, 58, 28);
				detail5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail5ActionPerformed(evt);
					}
				});
			}
			{
				detail6 = new JButton();
				getContentPane().add(detail6);
				detail6.setText("More...");
				detail6.setBounds(321, 329, 58, 28);
				detail6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail6ActionPerformed(evt);
					}
				});
			}
			{
				detail7 = new JButton();
				getContentPane().add(detail7);
				detail7.setText("More...");
				detail7.setBounds(321, 375, 58, 28);
				detail7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						detail7ActionPerformed(evt);
					}
				});
			}
			{
				component1 = new JLabel();
				getContentPane().add(component1);
				component1.setText("CPU :");
				component1.setBounds(85, 70, 38, 21);
			}
			{
				component2 = new JLabel();
				getContentPane().add(component2);
				component2.setText("Memory :");
				component2.setBounds(57, 124, 65, 21);
			}
			{
				component3 = new JLabel();
				getContentPane().add(component3);
				component3.setText("Motherboard :");
				component3.setBounds(24, 178, 98, 21);
			}
			{
				component4 = new JLabel();
				getContentPane().add(component4);
				component4.setText("Video Card :");
				component4.setBounds(36, 232, 84, 21);
			}
			{
				component5 = new JLabel();
				getContentPane().add(component5);
				component5.setText("Storage :");
				component5.setBounds(55, 283, 62, 21);
			}
			{
				component6 = new JLabel();
				getContentPane().add(component6);
				component6.setText("Cases :");
				component6.setBounds(65, 332, 48, 21);
			}
			{
				component7 = new JLabel();
				getContentPane().add(component7);
				component7.setText("Monitor :");
				component7.setBounds(48, 378, 63, 21);
			}
			pack();
			this.setSize(409, 540);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void fillContent(int t) {
		/*
		 * type indicates the previous selection
		 * t:
		 * @ 1: program recommand
		 * 	 0: user recommand
		 */
		JTextField[] brand = {brand1, brand2, brand3, brand4, brand5, brand6, brand7};
		JTextField[] price = {price1, price2, price3, price4, price5, price6, price7};
		int sum = 0;
		this.type = t;
		for (int i = 0; i < 7; i++) {
			int temp = 0;
			if (t == 0) {
				brand[i].setText(Price_and_function_select.uBrand[i]);
				temp = Price_and_function_select.uPrice[i];
				price[i].setText(Integer.toString(temp));
			} else {
				brand[i].setText(Price_and_function_select.pBrand[i]);
				temp = Price_and_function_select.pPrice[i];
				price[i].setText(Integer.toString(temp));
			}
			sum += temp;
		}
		total.setText(Integer.toString(sum));
	}
	
	private void detail1ActionPerformed(ActionEvent evt) {
		//System.out.println("detail1.actionPerformed, event="+evt);
		
		ComponentDetails item1 = new ComponentDetails();
		item1.fillContent(0, this.type);
		item1.setVisible(true);
		
	}
	private void detail2ActionPerformed(ActionEvent evt) {
		//System.out.println("detail2.actionPerformed, event="+evt);
		
		ComponentDetails item2 = new ComponentDetails();
		item2.fillContent(1, this.type);
		item2.setVisible(true);
	}
	
	private void detail3ActionPerformed(ActionEvent evt) {
		ComponentDetails item3 = new ComponentDetails();
		item3.fillContent(2, this.type);
		item3.setVisible(true);
	}
	
	private void detail4ActionPerformed(ActionEvent evt) {
		ComponentDetails item4 = new ComponentDetails();
		item4.fillContent(3, this.type);
		item4.setVisible(true);
	}
	
	private void detail5ActionPerformed(ActionEvent evt) {
		ComponentDetails item5 = new ComponentDetails();
		item5.fillContent(4, this.type);
		item5.setVisible(true);
	}
	
	private void detail6ActionPerformed(ActionEvent evt) {
		ComponentDetails item6 = new ComponentDetails();
		item6.fillContent(5, this.type);
		item6.setVisible(true);
	}
	
	private void detail7ActionPerformed(ActionEvent evt) {
		ComponentDetails item7 = new ComponentDetails();
		item7.fillContent(6, this.type);
		item7.setVisible(true);
	}

}
