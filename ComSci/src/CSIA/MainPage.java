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

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable itable;
	private JTable stable;

	DefaultTableModel dtm = new DefaultTableModel();
	final Object[] fields = new Object[5];
	
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
		iilblNewLabel.setBounds(10, 541, 51, 30);
		contentPane.add(iilblNewLabel);
		
		JLabel iblblNewLabel = new JLabel("Brand");
		iblblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iblblNewLabel.setBounds(10, 581, 71, 30);
		contentPane.add(iblblNewLabel);
		
		JLabel idlblNewLabel = new JLabel("Description");
		idlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		idlblNewLabel.setBounds(10, 621, 129, 30);
		contentPane.add(idlblNewLabel);
		
		JLabel iclblNewLabel = new JLabel("Category");
		iclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iclblNewLabel.setBounds(10, 660, 104, 30);
		contentPane.add(iclblNewLabel);
		
		JLabel iqlblNewLabel = new JLabel("Quantity");
		iqlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iqlblNewLabel.setBounds(10, 700, 97, 30);
		contentPane.add(iqlblNewLabel);
		
		JLabel silblNewLabel = new JLabel("Item");
		silblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		silblNewLabel.setBounds(802, 541, 51, 30);
		contentPane.add(silblNewLabel);
		
		JLabel sblblNewLabel = new JLabel("Brand");
		sblblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sblblNewLabel.setBounds(802, 581, 71, 30);
		contentPane.add(sblblNewLabel);
		
		JLabel sdlblNewLabel = new JLabel("Description");
		sdlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sdlblNewLabel.setBounds(802, 621, 129, 30);
		contentPane.add(sdlblNewLabel);
		
		JLabel sclblNewLabel = new JLabel("Category");
		sclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sclblNewLabel.setBounds(802, 660, 104, 30);
		contentPane.add(sclblNewLabel);
		
		JLabel sqlblNewLabel = new JLabel("Quantity");
		sqlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sqlblNewLabel.setBounds(802, 700, 97, 30);
		contentPane.add(sqlblNewLabel);

	}
}
