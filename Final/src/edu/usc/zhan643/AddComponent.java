package edu.usc.zhan643;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class AddComponent extends javax.swing.JFrame {
	/**
	 * @uml.property  name="componentName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel componentName;
	/**
	 * @uml.property  name="choosePic"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton choosePic;
	private JTextField enterFunc;
	private JLabel func;
	private JLabel image;
	/**
	 * @uml.property  name="addPic"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel addPic;
	/**
	 * @uml.property  name="typeText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField typeText;
	/**
	 * @uml.property  name="type"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel type;
	/**
	 * @uml.property  name="submitComponent"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JButton submitComponent;
	/**
	 * @uml.property  name="enterOurRate"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField enterOurRate;
	/**
	 * @uml.property  name="componentOurRate"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel componentOurRate;
	/**
	 * @uml.property  name="enterPrice"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField enterPrice;
	/**
	 * @uml.property  name="componentPrice"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel componentPrice;
	/**
	 * @uml.property  name="enterBrand"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField enterBrand;
	/**
	 * @uml.property  name="componentBrand"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JLabel componentBrand;
	/**
	 * @uml.property  name="enterName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JTextField enterName;
	
	private String path;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public AddComponent() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				componentName = new JLabel();
				getContentPane().add(componentName);
				componentName.setText("Category :");
				componentName.setBounds(350, 40, 78, 23);
			}
			{
				enterName = new JTextField();
				getContentPane().add(enterName);
				enterName.setBounds(462, 38, 77, 28);
			}
			{
				componentBrand = new JLabel();
				getContentPane().add(componentBrand);
				componentBrand.setText("Brand :");
				componentBrand.setBounds(371, 84, 57, 21);
			}
			{
				enterBrand = new JTextField();
				getContentPane().add(enterBrand);
				enterBrand.setBounds(462, 81, 77, 28);
			}
			{
				componentPrice = new JLabel();
				getContentPane().add(componentPrice);
				componentPrice.setText("Price :");
				componentPrice.setBounds(376, 169, 40, 21);
			}
			{
				enterPrice = new JTextField();
				getContentPane().add(enterPrice);
				enterPrice.setBounds(462, 166, 77, 28);
			}
			{
				componentOurRate = new JLabel();
				getContentPane().add(componentOurRate);
				componentOurRate.setText("Pro Rate :");
				componentOurRate.setBounds(353, 260, 68, 21);
			}
			{
				enterOurRate = new JTextField();
				getContentPane().add(enterOurRate);
				enterOurRate.setBounds(463, 257, 76, 28);
			}
			{
				submitComponent = new JButton();
				getContentPane().add(submitComponent);
				submitComponent.setText("Submit");
				submitComponent.setBounds(292, 309, 74, 28);
				submitComponent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						submitComponentActionPerformed(evt);
					}
				});
			}
			{
				type = new JLabel();
				getContentPane().add(type);
				type.setText("Model :");
				type.setBounds(366, 126, 50, 21);
			}
			{
				typeText = new JTextField();
				getContentPane().add(typeText);
				typeText.setBounds(462, 123, 77, 28);
			}
			{
				addPic = new JLabel();
				getContentPane().add(addPic);
				addPic.setText("Add Picture :");
				addPic.setBounds(31, 41, 97, 21);
			}
			{
				choosePic = new JButton();
				getContentPane().add(choosePic);
				choosePic.setText("Choose Picture");
				choosePic.setBounds(140, 38, 143, 28);
				choosePic.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						choosePicActionPerformed(evt);
					}
				});
			}
			{
				image = new JLabel();
				getContentPane().add(image);
				image.setBounds(43, 84, 240, 176);
				image.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			}
			{
				func = new JLabel();
				getContentPane().add(func);
				func.setText("Function :");
				func.setBounds(353, 213, 63, 21);
			}
			{
				enterFunc = new JTextField();
				getContentPane().add(enterFunc);
				enterFunc.setBounds(462, 210, 77, 28);
			}
			pack();
			this.setSize(670, 443);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void choosePicActionPerformed(ActionEvent evt) {
		JFileChooser fileChooser = new JFileChooser();
		int ret = fileChooser.showOpenDialog(this);
		FileNameExtensionFilter filter = new FileNameExtensionFilter ("Image files", "jpg", "png");
		if (ret == JFileChooser.APPROVE_OPTION) {
			File f = fileChooser.getSelectedFile();
			if (filter.accept(f)) {
				this.path = f.getPath();
				ImageIcon icon = new ImageIcon(path);
				int width = image.getWidth();
				int height = image.getHeight();
				Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
				ImageIcon newIcon = new ImageIcon(scaledImage);
				this.image.setIcon(newIcon);
			} else {
				new WrongFileType().setVisible(true);
			}
		}
	}
	private boolean checkTextField() {
		String cat = this.enterName.getText();
		String brand = this.enterBrand.getText();
		String model = this.typeText.getText();
		String p = this.enterPrice.getText();
		String f = this.enterFunc.getText();
		String rate = this.enterOurRate.getText();
		if (cat.equals("") || brand.equals("") || p.equals("") || rate.equals("") || f.equals("") || model.equals("")) {
			return false;
		}
		return true;
	}
	
	private void submitComponentActionPerformed(ActionEvent evt) {
		if (checkTextField()) {
			Connection conn = Connection2DB.conn;
			String cat = this.enterName.getText();
			String brand = this.enterBrand.getText();
			String model = this.typeText.getText();
			String p = this.enterPrice.getText();
			String f = this.enterFunc.getText();
			String rate = this.enterOurRate.getText();
			
			/*
			 * need to handle price range 
			 * according to entered price
			 */
			int range = 1;
			try {
				Statement stmt = conn.createStatement();
				String sql = "insert into " + cat + "(category, brand, model, price, function, pic_address, program_rating," +
							 "user_rating, time_reviewed," + cat + ".range, manager)" + " values('" + cat + "','" + brand + "','" +
							 model + "','" + p + "','" + f + "','" + path +"','" + rate + "','" + 0 + "','" + 0 + "','" + range + "','" +
							 Main.currentUser + "')";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			} catch(SQLException e) {
				System.out.println("Can not add new component to Database" + cat);
				e.printStackTrace();
				System.exit(-1);
			}
			new AddComponentSucceed().setVisible(true);
			
		} else {
			new EmptyTextFiledError().setVisible(true);
		}
	}

}
