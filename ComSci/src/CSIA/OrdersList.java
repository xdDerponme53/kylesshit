package CSIA;

import javax.swing.*;
import java.awt.*;

public class OrdersList extends JFrame {
    private static final long serialVersionUID = 1L;

    public OrdersList() {
        setTitle("Orders List");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        // Create table with sample data
        String[] columnNames = {"Order ID", "Customer Name", "Product", "Quantity", "Total"};
        Object[][] data = {
                {"001", "John Doe", "Product A", 2, "$40"},
                {"002", "Jane Smith", "Product B", 1, "$20"}
        };
        JTable orderTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(orderTable);
        contentPane.add(scrollPane, BorderLayout.CENTER);
    }
}
