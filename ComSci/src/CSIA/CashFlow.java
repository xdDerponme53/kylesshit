package CSIA;

import javax.swing.*;
import java.awt.*;

public class CashFlow extends JFrame {
    private static final long serialVersionUID = 1L;

    public CashFlow() {
        setTitle("Cash Flow");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        // Create table with sample data
        String[] columnNames = {"Date", "Description", "Income", "Expense", "Balance"};
        Object[][] data = {
                {"2024-10-01", "Sales", "$500", "", "$500"},
                {"2024-10-02", "Supplies", "", "$200", "$300"}
        };
        JTable cashFlowTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(cashFlowTable);
        contentPane.add(scrollPane, BorderLayout.CENTER);
    }
}
