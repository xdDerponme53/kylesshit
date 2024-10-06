package CSIA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable itable;
	private JTable stable;
	private JFrame errorMessage;

	final Object[] rowFields = new Object[6];
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
	DefaultTableModel itm = new DefaultTableModel();
	DefaultTableModel stm = new DefaultTableModel();
	private JTextField istextField;
	private JTextField sstextField;
	private JTextField sptextField;
	private JTextField iptextField;

	
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
		
		JScrollPane iscrollPane = new JScrollPane();
		iscrollPane.setBounds(10, 120, 728, 401);
		contentPane.add(iscrollPane);
		
		itable = new JTable();
		itable.setShowGrid(true);
		itable.setAutoCreateRowSorter(true);
		itable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				int selRow = itable.getSelectedRow();
				
				iitextField.setText((String)itable.getValueAt(selRow, 0));
				ibtextField.setText((String)itable.getValueAt(selRow, 1));
				idtextField.setText((String)itable.getValueAt(selRow, 2));
				ictextField.setText((String)itable.getValueAt(selRow, 3));
				iqtextField.setText((String)itable.getValueAt(selRow, 4));
				iptextField.setText((String)itable.getValueAt(selRow, 5));

			}
		});
		iscrollPane.setViewportView(itable);
		Object [] icolumns = {"Name", "Brand", "Description", "Category", "Quantity", "Price"};
		itm.setColumnIdentifiers(icolumns);
		itable.setModel(itm);
		TableRowSorter<DefaultTableModel> searchInventory = new TableRowSorter<DefaultTableModel>(itm);
		itable.setRowSorter(searchInventory);
		
		JScrollPane sscrollPane = new JScrollPane();
		sscrollPane.setBounds(802, 120, 728, 401);
		contentPane.add(sscrollPane);
		
		stable = new JTable();
		stable.setShowGrid(true);
		stable.setAutoCreateRowSorter(true);
		stable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int selRow = stable.getSelectedRow();
				
				sitextField.setText((String)stable.getValueAt(selRow, 0));
				sbtextField.setText((String)stable.getValueAt(selRow, 1));
				sdtextField.setText((String)stable.getValueAt(selRow, 2));
				sctextField.setText((String)stable.getValueAt(selRow, 3));
				sqtextField.setText((String)stable.getValueAt(selRow, 4));	
				sptextField.setText((String)stable.getValueAt(selRow, 5));	
			}
		});
		sscrollPane.setViewportView(stable);
		Object [] scolumns = {"Name", "Brand", "Description", "Category", "Quantity", "Price"};
		stm.setColumnIdentifiers(scolumns);
		stable.setModel(stm);
		TableRowSorter<DefaultTableModel> searchShopping = new TableRowSorter<DefaultTableModel>(stm);
		stable.setRowSorter(searchShopping);
		
		
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
		
		JLabel iilblNewLabel = new JLabel("Name");
		iilblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iilblNewLabel.setBounds(10, 550, 71, 30);
		contentPane.add(iilblNewLabel);
		
		JLabel iblblNewLabel = new JLabel("Brand");
		iblblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iblblNewLabel.setBounds(10, 606, 71, 30);
		contentPane.add(iblblNewLabel);
		
		JLabel idlblNewLabel = new JLabel("Description");
		idlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		idlblNewLabel.setBounds(10, 664, 129, 30);
		contentPane.add(idlblNewLabel);
		
		JLabel iclblNewLabel = new JLabel("Category");
		iclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iclblNewLabel.setBounds(10, 716, 104, 30);
		contentPane.add(iclblNewLabel);
		
		JLabel iqlblNewLabel = new JLabel("Quantity");
		iqlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iqlblNewLabel.setBounds(10, 773, 97, 30);
		contentPane.add(iqlblNewLabel);
		
		JLabel silblNewLabel = new JLabel("Name");
		silblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		silblNewLabel.setBounds(802, 550, 71, 30);
		contentPane.add(silblNewLabel);
		
		JLabel sblblNewLabel = new JLabel("Brand");
		sblblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sblblNewLabel.setBounds(802, 606, 71, 30);
		contentPane.add(sblblNewLabel);
		
		JLabel sdlblNewLabel = new JLabel("Description");
		sdlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sdlblNewLabel.setBounds(802, 664, 129, 30);
		contentPane.add(sdlblNewLabel);
		
		JLabel sclblNewLabel = new JLabel("Category");
		sclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sclblNewLabel.setBounds(802, 716, 104, 30);
		contentPane.add(sclblNewLabel);
		
		JLabel sqlblNewLabel = new JLabel("Quantity");
		sqlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sqlblNewLabel.setBounds(802, 773, 97, 30);
		contentPane.add(sqlblNewLabel);
		
		iitextField = new JTextField();
		iitextField.setFont(new Font("Arial", Font.PLAIN, 25));
		iitextField.setBounds(149, 552, 325, 30);
		contentPane.add(iitextField);
		iitextField.setColumns(10);
		
		ibtextField = new JTextField();
		ibtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		ibtextField.setColumns(10);
		ibtextField.setBounds(149, 608, 325, 30);
		contentPane.add(ibtextField);
		
		idtextField = new JTextField();
		idtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		idtextField.setColumns(10);
		idtextField.setBounds(149, 666, 325, 30);
		contentPane.add(idtextField);
		
		ictextField = new JTextField();
		ictextField.setFont(new Font("Arial", Font.PLAIN, 25));
		ictextField.setColumns(10);
		ictextField.setBounds(149, 718, 325, 30);
		contentPane.add(ictextField);
		
		iqtextField = new JTextField();
		iqtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		iqtextField.setColumns(10);
		iqtextField.setBounds(149, 775, 325, 30);
		contentPane.add(iqtextField);
		
		sitextField = new JTextField();
		sitextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sitextField.setColumns(10);
		sitextField.setBounds(944, 552, 325, 30);
		contentPane.add(sitextField);
		
		sbtextField = new JTextField();
		sbtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sbtextField.setColumns(10);
		sbtextField.setBounds(944, 608, 325, 30);
		contentPane.add(sbtextField);
		
		sdtextField = new JTextField();
		sdtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sdtextField.setColumns(10);
		sdtextField.setBounds(941, 666, 325, 30);
		contentPane.add(sdtextField);
		
		sctextField = new JTextField();
		sctextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sctextField.setColumns(10);
		sctextField.setBounds(944, 718, 325, 30);
		contentPane.add(sctextField);
		
		sqtextField = new JTextField();
		sqtextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sqtextField.setColumns(10);
		sqtextField.setBounds(944, 775, 325, 30);
		contentPane.add(sqtextField);
		
		JButton abtnNewButton = new JButton("Add");
		abtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		abtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ii = iitextField.getText();
				String ib = ibtextField.getText();
				String id = idtextField.getText();
				String ic = ictextField.getText();
				String iq = iqtextField.getText();
				String ip = iptextField.getText();
				
				String si = sitextField.getText();
				String sb = sbtextField.getText();
				String sd = sdtextField.getText();
				String sc = sctextField.getText();
				String sq = sqtextField.getText();
				String sp = sptextField.getText();
				
				if(!ii.isEmpty() && !ib.isEmpty() && !id.isEmpty() && !ic.isEmpty() && !iq.isEmpty() && !ip.isEmpty()) {
					rowFields[0] = ii;
					rowFields[1] = ib;
					rowFields[2] = id;
					rowFields[3] = ic;
					rowFields[4] = iq;
					rowFields[5] = ip;
					
					itm.addRow(rowFields);
					
					iitextField.setText(null);
					ibtextField.setText(null);
					idtextField.setText(null);
					ictextField.setText(null);
					iqtextField.setText(null);
					iptextField.setText(null);
					
				} else if (!si.isEmpty() && !sb.isEmpty() && !sd.isEmpty() && !sc.isEmpty() && !sq.isEmpty() && !sp.isEmpty()) {
					
					rowFields[0] = si;
					rowFields[1] = sb;
					rowFields[2] = sd;
					rowFields[3] = sc;
					rowFields[4] = sq;
					rowFields[5] = sp;
					
					stm.addRow(rowFields);
					
					sitextField.setText(null);
					sbtextField.setText(null);
					sdtextField.setText(null);
					sctextField.setText(null);
					sqtextField.setText(null);	
					sptextField.setText(null);	
					
				} else {
				    errorMessage=new JFrame();  
				    JOptionPane.showMessageDialog(errorMessage,"Please completely fill all fields to add an item.");  
				}
				
			}
		});
		
		abtnNewButton.setBounds(266, 917, 208, 86);
		contentPane.add(abtnNewButton);
		
		JButton dbtnNewButton = new JButton("Delete");
		dbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selRowInventory = itable.getSelectedRow();
				int selRowShopping = stable.getSelectedRow();
				
				if(selRowInventory != -1) { // -1 means no row is selected, NOT -1 means row IS selected
					itm.removeRow(selRowInventory);
					
					iitextField.setText(null);
					ibtextField.setText(null);
					idtextField.setText(null);
					ictextField.setText(null);
					iqtextField.setText(null);		
					iptextField.setText(null);	
					
				}
				else if(selRowShopping != -1) {
					stm.removeRow(selRowShopping);
					
					sitextField.setText(null);
					sbtextField.setText(null);
					sdtextField.setText(null);
					sctextField.setText(null);
					sqtextField.setText(null);		
					sptextField.setText(null);	
					
				} else {
				    errorMessage=new JFrame();  
				    JOptionPane.showMessageDialog(errorMessage,"Please select an item to delete.");  
				}
			}
		});
		dbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		dbtnNewButton.setBounds(530, 917, 208, 86);
		contentPane.add(dbtnNewButton);
		
		JButton sbtnNewButton = new JButton("Update");
		sbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ii = iitextField.getText();
				String ib = ibtextField.getText();
				String id = idtextField.getText();
				String ic = ictextField.getText();
				String iq = iqtextField.getText();
				String ip = iptextField.getText();
				
				String si = sitextField.getText();
				String sb = sbtextField.getText();
				String sd = sdtextField.getText();
				String sc = sctextField.getText();
				String sq = sqtextField.getText();
				String sp = sptextField.getText();
				
				if(!ii.isEmpty() && !ib.isEmpty() && !id.isEmpty() && !ic.isEmpty() && !iq.isEmpty() && !ip.isEmpty()) {
					itm.setValueAt(ii, itable.getSelectedRow(), 0);
					itm.setValueAt(ib, itable.getSelectedRow(), 1);
					itm.setValueAt(id, itable.getSelectedRow(), 2);
					itm.setValueAt(ic, itable.getSelectedRow(), 3);
					itm.setValueAt(iq, itable.getSelectedRow(), 4);
					itm.setValueAt(ip, itable.getSelectedRow(), 5);
					
				iitextField.setText(null);
				ibtextField.setText(null);
				idtextField.setText(null);
				ictextField.setText(null);
				iqtextField.setText(null);	
				iptextField.setText(null);	
				
				} else if(!si.isEmpty() && !sb.isEmpty() && !sd.isEmpty() && !sc.isEmpty() && !sq.isEmpty() && !sp.isEmpty()) {
				
					stm.setValueAt(si, stable.getSelectedRow(), 0);
					stm.setValueAt(sb, stable.getSelectedRow(), 1);
					stm.setValueAt(sd, stable.getSelectedRow(), 2);
					stm.setValueAt(sc, stable.getSelectedRow(), 3);
					stm.setValueAt(sq, stable.getSelectedRow(), 4);
					stm.setValueAt(sp, stable.getSelectedRow(), 5);
					
					sitextField.setText(null);
					sbtextField.setText(null);
					sdtextField.setText(null);
					sctextField.setText(null);
					sqtextField.setText(null);	
					sptextField.setText(null);
					
				} else {
				    errorMessage=new JFrame();  
				    JOptionPane.showMessageDialog(errorMessage,"Please select an item and completely fill all fields to update.");  
				}
			}
		});
		sbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		sbtnNewButton.setBounds(802, 917, 208, 86);
		contentPane.add(sbtnNewButton);
		
		JButton bbtnNewButton = new JButton("Purchased");
		bbtnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int selRowShopping = stable.getSelectedRow(); // Get the selected row in the Shopping List table

		        if (selRowShopping != -1) { // Check if a row is selected in the Shopping List table
		            // Get values from the selected row in the Shopping List table
		            String shoppingItemName = (String) stable.getValueAt(selRowShopping, 0);
		            String shoppingItemBrand = (String) stable.getValueAt(selRowShopping, 1);
		            String shoppingItemDescription = (String) stable.getValueAt(selRowShopping, 2);
		            String shoppingItemCategory = (String) stable.getValueAt(selRowShopping, 3);
		            int shoppingItemQuantity = Integer.parseInt((String) stable.getValueAt(selRowShopping, 4));
		            int shoppingItemPrice = Integer.parseInt((String) stable.getValueAt(selRowShopping, 5));

		            // Check if the item already exists in the Inventory table
		            boolean itemExistsInInventory = false;
		            for (int i = 0; i < itm.getRowCount(); i++) {
		                String inventoryItemName = (String) itm.getValueAt(i, 0);

		                if (inventoryItemName.equals(shoppingItemName)) { // If the item name matches
		                    // Get current inventory quantity and update it
		                    int inventoryItemQuantity = Integer.parseInt((String) itm.getValueAt(i, 4));
		                    int updatedQuantity = inventoryItemQuantity + shoppingItemQuantity;
		                    itm.setValueAt(String.valueOf(updatedQuantity), i, 4); // Set the updated quantity in the Inventory table
		                    itemExistsInInventory = true;
		                    int inventoryItemPrice = Integer.parseInt((String) itm.getValueAt(i, 5));
		                    int updatedPrice = inventoryItemPrice + shoppingItemPrice;
		                    itm.setValueAt(String.valueOf(updatedPrice), i, 5); // Set the updated quantity in the Inventory table
		                    itemExistsInInventory = true;
		                    break;
		                }
		            }

		            // If the item does not exist in the Inventory table, add it
		            if (!itemExistsInInventory) {
		            	Object[] newItemRow = {
		            		    shoppingItemName,
		            		    shoppingItemBrand,
		            		    shoppingItemDescription,
		            		    shoppingItemCategory,
		            		    String.valueOf(shoppingItemQuantity), // Add a comma here
		            		    String.valueOf(shoppingItemPrice)     // Ensure shoppingItemPrice is converted to String
		            		};
		                itm.addRow(newItemRow); // Add new item to the Inventory table
		            }

		            // Remove the item from the Shopping List table
		            stm.removeRow(selRowShopping);

		            // Clear the Shopping List text fields
		            sitextField.setText(null);
		            sbtextField.setText(null);
		            sdtextField.setText(null);
		            sctextField.setText(null);
		            sqtextField.setText(null);
		            sptextField.setText(null);

		            JOptionPane.showMessageDialog(errorMessage, "Item successfully moved to the Inventory!");
		        } else {
		            JOptionPane.showMessageDialog(errorMessage, "Please select an item to mark as purchased.");
		        }
		    }
		});
		bbtnNewButton.setFont(new Font("Arial", Font.PLAIN, 35));
		bbtnNewButton.setBounds(1061, 917, 208, 86);
		contentPane.add(bbtnNewButton);
		
		JButton clbtnNewButton = new JButton("Customer List");
		clbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                CustomerList cl = new CustomerList();
                cl.setVisible(true);
                dispose();
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
		
		JLabel islblSearch = new JLabel("Search");
		islblSearch.setFont(new Font("Tahoma", Font.PLAIN, 25));
		islblSearch.setBounds(10, 944, 97, 30);
		contentPane.add(islblSearch);
		
		istextField = new JTextField();
		
		// Added listeners for the search field to filter the tables
		istextField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				updateInventoryFilter();
			}

			public void removeUpdate(DocumentEvent e) {
				updateInventoryFilter();
			}

			public void insertUpdate(DocumentEvent e) {
				updateInventoryFilter();
			}

			public void updateInventoryFilter() {
				RowFilter<DefaultTableModel, Object> rf = null;
				try {
					rf = RowFilter.regexFilter(istextField.getText(), 0);
				} catch (java.util.regex.PatternSyntaxException e) {
					return;
				}
				searchInventory.setRowFilter(rf);
			}
		});
		
		istextField.setColumns(10);
		istextField.setBounds(79, 760, 153, 26);
		contentPane.add(istextField);
		
		istextField.setFont(new Font("Arial", Font.PLAIN, 25));
		istextField.setColumns(10);
		istextField.setBounds(91, 944, 165, 30);
		contentPane.add(istextField);
		
		JLabel sslblSearch = new JLabel("Search");
		sslblSearch.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sslblSearch.setBounds(1298, 944, 97, 30);
		contentPane.add(sslblSearch);
		
		sstextField = new JTextField();
		
		// Added listeners for the search field to filter the tables
		sstextField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				updateShoppingFilter();
			}

			public void removeUpdate(DocumentEvent e) {
				updateShoppingFilter();
			}

			public void insertUpdate(DocumentEvent e) {
				updateShoppingFilter();
			}

			public void updateShoppingFilter() {
				RowFilter<DefaultTableModel, Object> rf = null;
				try {
					rf = RowFilter.regexFilter(sstextField.getText(), 0);  // Use sstextField for Shopping List search
				} catch (java.util.regex.PatternSyntaxException e) {
					return;
				}
				searchShopping.setRowFilter(rf);
			}
		});
		
		sstextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sstextField.setColumns(10);
		sstextField.setBounds(1380, 944, 165, 30);
		contentPane.add(sstextField);
		
		JLabel iplblNewLabel = new JLabel("Price");
		iplblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		iplblNewLabel.setBounds(10, 828, 97, 30);
		contentPane.add(iplblNewLabel);
		
		sptextField = new JTextField();
		sptextField.setFont(new Font("Arial", Font.PLAIN, 25));
		sptextField.setColumns(10);
		sptextField.setBounds(944, 828, 325, 30);
		contentPane.add(sptextField);
		
		JLabel splblNewLabel = new JLabel("Price");
		splblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		splblNewLabel.setBounds(802, 828, 97, 30);
		contentPane.add(splblNewLabel);
		
		iptextField = new JTextField();
		iptextField.setFont(new Font("Arial", Font.PLAIN, 25));
		iptextField.setColumns(10);
		iptextField.setBounds(149, 828, 325, 30);
		contentPane.add(iptextField);
		
		

	}
}