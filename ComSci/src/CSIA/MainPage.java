package CSIA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable itable;
	private JTable stable;

	DefaultTableModel dtm = new DefaultTableModel();
	final Object[] fields = new Object[5];
	private JTextField iitextField;
	private JTextField ibtextField;
	private JTextField idtextField;
	private JTextField ictextField;
	private JTextField iqtextField;
	private JTextField sitextField;
	private JTextField sbtextField;
	private JTextField sdtextField;
	private JTextField sctextField;
	private JTextField sqtextField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane inventoryscrollPane = new JScrollPane();
		inventoryscrollPane.setBounds(10, 120, 728, 401);
		contentPane.add(inventoryscrollPane);
		
		itable = new JTable();
		inventoryscrollPane.setViewportView(itable);
		Object [] icolumns = {"Name", "Brand", "Description", "Category", "Quantity"};
		dtm.setColumnIdentifiers(icolumns);
		itable.setModel(dtm);
		
		JScrollPane shoppingscrollPane = new JScrollPane();
		shoppingscrollPane.setBounds(802, 120, 728, 401);
		contentPane.add(shoppingscrollPane);
		
		stable = new JTable();
		shoppingscrollPane.setViewportView(stable);
		Object [] scolumns = {"Name", "Brand", "Description", "Category", "Quantity"};
		dtm.setColumnIdentifiers(scolumns);
		stable.setModel(dtm);
		
		JLabel lblNewLabel = new JLabel("STICKY MNL est. 2022");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 31));
		lblNewLabel.setBounds(10, 10, 325, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setFont(new Font("Arial", Font.PLAIN, 31));
		lblInventory.setBounds(319, 65, 129, 30);
		contentPane.add(lblInventory);
		
		JLabel lblShoppingList = new JLabel("Shopping List");
		lblShoppingList.setFont(new Font("Arial", Font.PLAIN, 31));
		lblShoppingList.setBounds(1067, 65, 191, 30);
		contentPane.add(lblShoppingList);
		
		JLabel iilblNewLabel = new JLabel("Item");
		iilblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iilblNewLabel.setBounds(10, 571, 51, 30);
		contentPane.add(iilblNewLabel);
		
		JLabel iblblNewLabel = new JLabel("Brand");
		iblblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iblblNewLabel.setBounds(10, 636, 71, 30);
		contentPane.add(iblblNewLabel);
		
		JLabel idlblNewLabel = new JLabel("Description");
		idlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		idlblNewLabel.setBounds(10, 700, 129, 30);
		contentPane.add(idlblNewLabel);
		
		JLabel iclblNewLabel = new JLabel("Category");
		iclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iclblNewLabel.setBounds(10, 773, 104, 30);
		contentPane.add(iclblNewLabel);
		
		JLabel iqlblNewLabel = new JLabel("Quantity");
		iqlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iqlblNewLabel.setBounds(10, 841, 97, 30);
		contentPane.add(iqlblNewLabel);
		
		JLabel silblNewLabel = new JLabel("Item");
		silblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		silblNewLabel.setBounds(802, 571, 51, 30);
		contentPane.add(silblNewLabel);
		
		JLabel sblblNewLabel = new JLabel("Brand");
		sblblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sblblNewLabel.setBounds(802, 636, 71, 30);
		contentPane.add(sblblNewLabel);
		
		JLabel sdlblNewLabel = new JLabel("Description");
		sdlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sdlblNewLabel.setBounds(802, 700, 129, 30);
		contentPane.add(sdlblNewLabel);
		
		JLabel sclblNewLabel = new JLabel("Category");
		sclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sclblNewLabel.setBounds(802, 773, 104, 30);
		contentPane.add(sclblNewLabel);
		
		JLabel sqlblNewLabel = new JLabel("Quantity");
		sqlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sqlblNewLabel.setBounds(802, 841, 97, 30);
		contentPane.add(sqlblNewLabel);
		
		iitextField = new JTextField();
		iitextField.setFont(new Font("Arial", Font.PLAIN, 25));
		iitextField.setBounds(149, 573, 325, 30);
		contentPane.add(iitextField);
		iitextField.setColumns(10);
		
		ibtextField = new JTextField();
		ibtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		ibtextField.setColumns(10);
		ibtextField.setBounds(149, 636, 325, 30);
		contentPane.add(ibtextField);
		
		idtextField = new JTextField();
		idtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		idtextField.setColumns(10);
		idtextField.setBounds(149, 702, 325, 30);
		contentPane.add(idtextField);
		
		ictextField = new JTextField();
		ictextField.setFont(new Font("Arial", Font.PLAIN, 25));
		ictextField.setColumns(10);
		ictextField.setBounds(149, 773, 325, 30);
		contentPane.add(ictextField);
		
		iqtextField = new JTextField();
		iqtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		iqtextField.setColumns(10);
		iqtextField.setBounds(149, 841, 325, 30);
		contentPane.add(iqtextField);
		
		sitextField = new JTextField();
		sitextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sitextField.setColumns(10);
		sitextField.setBounds(944, 573, 325, 30);
		contentPane.add(sitextField);
		
		sbtextField = new JTextField();
		sbtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sbtextField.setColumns(10);
		sbtextField.setBounds(944, 636, 325, 30);
		contentPane.add(sbtextField);
		
		sdtextField = new JTextField();
		sdtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sdtextField.setColumns(10);
		sdtextField.setBounds(944, 702, 325, 30);
		contentPane.add(sdtextField);
		
		sctextField = new JTextField();
		sctextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sctextField.setColumns(10);
		sctextField.setBounds(944, 773, 325, 30);
		contentPane.add(sctextField);
		
		sqtextField = new JTextField();
		sqtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sqtextField.setColumns(10);
		sqtextField.setBounds(944, 841, 325, 30);
		contentPane.add(sqtextField);
		
		JButton abtnNewButton = new JButton("Add");
		abtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		abtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                CustomerList cl = new CustomerList();
                cl.setVisible(true);
                dispose();
			}
		});
		
		abtnNewButton.setBounds(266, 917, 208, 86);
		contentPane.add(abtnNewButton);
		
		JButton dbtnNewButton = new JButton("Delete");
		dbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		dbtnNewButton.setBounds(530, 917, 208, 86);
		contentPane.add(dbtnNewButton);
		
		JButton sbtnNewButton = new JButton("Save");
		sbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		sbtnNewButton.setBounds(802, 917, 208, 86);
		contentPane.add(sbtnNewButton);
		
		JButton bbtnNewButton = new JButton("Bought");
		bbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		bbtnNewButton.setBounds(1061, 917, 208, 86);
		contentPane.add(bbtnNewButton);
		
		JButton clbtnNewButton = new JButton("Customer List");
		clbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		clbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		clbtnNewButton.setBounds(404, 10, 252, 30);
		contentPane.add(clbtnNewButton);
		
		JButton olbtnNewButton = new JButton("Orders List");
		olbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                OrdersList ol = new OrdersList();
                ol.setVisible(true);
                dispose();
			}
		});
		olbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		olbtnNewButton.setBounds(697, 10, 252, 30);
		contentPane.add(olbtnNewButton);
		
		JButton cfbtnNewButton = new JButton("Cash Flow");
		cfbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                CashFlow cf = new CashFlow();
                cf.setVisible(true);
                dispose();
			}
		});
		cfbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		cfbtnNewButton.setBounds(983, 10, 252, 30);
		contentPane.add(cfbtnNewButton);

	}
}
