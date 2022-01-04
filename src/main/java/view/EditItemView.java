package main.java.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditItemView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField textField_ProductID;
	private JTextField textField_Name;
	private JTextField textField_Supplier;
	private JTextField textField_Quantity;
	private JTextField textField_Price;
	private JTextField textField_ReceivedDate;
	private JTextField textField_ExpiredDate;
	private JTextField textField_CostPrice;
	
	/**
	 * Create the frame.
	 */
	public EditItemView() {
//		File logoImage = new File("EditItemView.png");
//		String imagePath = logoImage.getPath();
//		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		setTitle("Edit Product");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(620, 280, 550, 450);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_ProductID = new JLabel("Product ID:");
		label_ProductID.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_ProductID.setBounds(18, 48, 100, 22);
		contentPane.add(label_ProductID);
		
		JLabel label_Category = new JLabel("Category:");
		label_Category.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_Category.setBounds(18, 89, 100, 16);
		contentPane.add(label_Category);
		
		JLabel label_Name = new JLabel("Name:");
		label_Name.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_Name.setBounds(18, 118, 100, 22);
		contentPane.add(label_Name);
		
		JLabel label_Quantity = new JLabel("Quantity:");
		label_Quantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_Quantity.setBounds(18, 156, 100, 16);
		contentPane.add(label_Quantity);
		
		JLabel lblSellPrice = new JLabel("Unit Price:");
		lblSellPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSellPrice.setBounds(18, 189, 100, 23);
		contentPane.add(lblSellPrice);
		
		JLabel lblReceivedDate = new JLabel("Received Date:");
		lblReceivedDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReceivedDate.setBounds(18, 223, 150, 22);
		contentPane.add(lblReceivedDate);
		
		JLabel label_ExpiredDate = new JLabel("Expiration Date:");
		label_ExpiredDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_ExpiredDate.setBounds(18, 257, 150, 22);
		contentPane.add(label_ExpiredDate);
		
		textField_ProductID = new JTextField();
		textField_ProductID.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_ProductID.setColumns(10);
		textField_ProductID.setBounds(152, 48, 116, 22);
		contentPane.add(textField_ProductID);
		
		JComboBox comboBox_Category = new JComboBox();
		comboBox_Category.setModel(new DefaultComboBoxModel(new String[] {"Select", "Bio", "Vegetables", "Fruits", "Canning", "Sauce", "Snacks", "Bakery", "Cleaning", "Beverage", "Spice", "Grain", "Dairy"}));
		comboBox_Category.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_Category.setBounds(152, 83, 116, 25);
		contentPane.add(comboBox_Category);
		
		textField_Name = new JTextField();
		textField_Name.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_Name.setColumns(10);
		textField_Name.setBounds(152, 121, 116, 22);
		contentPane.add(textField_Name);
		
		textField_Quantity = new JTextField();
		textField_Quantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_Quantity.setColumns(10);
		textField_Quantity.setBounds(152, 153, 116, 22);
		contentPane.add(textField_Quantity);
		
		textField_Price = new JTextField();
		textField_Price.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_Price.setColumns(10);
		textField_Price.setBounds(152, 189, 116, 25);		
		contentPane.add(textField_Price);
		
		textField_ReceivedDate = new JTextField();
		textField_ReceivedDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_ReceivedDate.setColumns(10);
		textField_ReceivedDate.setBounds(152, 223, 116, 22);		
		contentPane.add(textField_ReceivedDate);
		
		textField_ExpiredDate = new JTextField();
		textField_ExpiredDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_ExpiredDate.setColumns(10);
		textField_ExpiredDate.setBounds(152, 257, 116, 22);		
		contentPane.add(textField_ExpiredDate);

		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ItemView screen = new ItemView();
				screen.display();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(395, 375, 97, 25);
		contentPane.add(btnBack);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_ProductID.setText("");
				textField_Name.setText("");
				textField_Supplier.setText("");
				textField_Quantity.setText("");
				textField_Price.setText("");
				textField_ReceivedDate.setText("");
				textField_ExpiredDate.setText("");
				comboBox_Category.setSelectedIndex(0);
				textField_CostPrice.setText("");				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(395, 118, 97, 25);
		contentPane.add(btnClear);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
//					Product newProduct = m_Factory.creatProduct(textField_Name.getText(), textField_ProductID.getText(), textField_Quantity.getText(),
//							textField_Price.getText(), (String) comboBox_Weight.getSelectedItem(), textField_Supplier.getText(),
//							(String) comboBox_Category.getSelectedItem(), textField_ReceivedDate.getText(),
//							textField_ExpiredDate.getText(), textField_CostPrice.getText());
//					
//					updateProduct(newProduct);
//					
//					textField_ProductID.setText("");
//					textField_Name.setText("");
//					textField_Supplier.setText("");
//					textField_Quantity.setText("");
//					textField_Price.setText("");
//					textField_ReceivedDate.setText("");
//					textField_ExpiredDate.setText("");
//					comboBox_Weight.setSelectedIndex(0);
//					comboBox_Category.setSelectedIndex(0);
//					textField_CostPrice.setText("");					
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error please check all filds date must be in fotmat: DD-MM-YYYY");
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(395, 189, 97, 25);
		contentPane.add(btnUpdate);
		
		JLabel lblPleaseFillProduct = new JLabel("Please fill Product ID and click Search");
		lblPleaseFillProduct.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPleaseFillProduct.setBounds(23, 11, 299, 22);
		contentPane.add(lblPleaseFillProduct);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				try
				{
//					Product searchedProduct =  searchProduct(textField_ProductID.getText());
//					textField_Name.setText(searchedProduct.getProductName());
//					textField_Supplier.setText(searchedProduct.getProductSupplier());
//					textField_Quantity.setText(searchedProduct.getProductQuantity());
//					textField_Price.setText(searchedProduct.getProductPrice());
//					textField_ReceivedDate.setText(searchedProduct.getProductReceiveDate());
//					textField_ExpiredDate.setText(searchedProduct.getProductExpireDate());
//					comboBox_Weight.setSelectedItem(searchedProduct.getProductWeight());
//					comboBox_Category.setSelectedItem(searchedProduct.getProductCategory());
//					textField_CostPrice.setText(searchedProduct.getProductCostPrice());	
				}
				catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, "The Product is not in the data base");
				}

		}});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(395, 48, 97, 25);
		contentPane.add(btnSearch);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				deleteProduct(textField_ProductID.getText());
//				textField_ProductID.setText("");
//				textField_Name.setText("");
//				textField_Supplier.setText("");
//				textField_Quantity.setText("");
//				textField_Price.setText("");
//				textField_ReceivedDate.setText("");
//				textField_ExpiredDate.setText("");
//				comboBox_Weight.setSelectedIndex(0);
//				comboBox_Category.setSelectedIndex(0);
//				textField_CostPrice.setText("");
		}});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(395, 257, 97, 25);
		contentPane.add(btnDelete);
		
		JLabel lblPicture = new JLabel("");
//		File EditItemView = new File("EditItemView.png");
//		String ProductEditPath = EditItemView.getPath();
//		lblPicture.setIcon(new ImageIcon(ProductEditPath));
		lblPicture.setBounds(400, 0, 862, 525);
		contentPane.add(lblPicture);	
	}
	
	public void display() {
        setVisible(true);
        setResizable(true);        
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500,500));
    }
}
