package CSIA;

import javax.swing.*;
import java.awt.*;

public class CustomerList extends JFrame {
    private static final long serialVersionUID = 1L;

    public CustomerList() {
        setTitle("Customer List");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        // Create table with sample data
        String[] columnNames = {"Customer Name", "Contact", "Email", "Orders"};
        Object[][] data = {
                {"John Doe", "123-456-7890", "john@example.com", 5},
                {"Jane Smith", "098-765-4321", "jane@example.com", 3}
        };
        JTable customerTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(customerTable);
        contentPane.add(scrollPane, BorderLayout.CENTER);
    }
}
