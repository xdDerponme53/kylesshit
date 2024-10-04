package CSIA;

//proof of pull

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.util.HashMap;

public class LogIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField user;
    private JPasswordField pass;

    // HashMap to store allowed usernames and passwords
    private HashMap<String, String> validUsers;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LogIn frame = new LogIn();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public LogIn() {
        setTitle("Sticky MNL - Log In");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1920, 1080); // Size of the window

        // Initialize valid users and passwords
        validUsers = new HashMap<>();
        validUsers.put("MissBehaves", "GabyDi94"); // Original user
        validUsers.put("MarketManager", "Mikaella13"); // New user 1

        // Panel settings
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.DARK_GRAY); // Dark theme	
        setContentPane(contentPane);
        contentPane.setLayout(null); // Absolute layout for precise positioning

        // Brand Label
        JLabel brandLabel = new JLabel("Sticky MNL");
        brandLabel.setHorizontalAlignment(SwingConstants.CENTER);
        brandLabel.setForeground(Color.WHITE);
        brandLabel.setFont(new Font("Arial", Font.BOLD, 36));
        brandLabel.setBounds(596, 156, 300, 40);
        contentPane.add(brandLabel);

        // Est. Label
        JLabel estLabel = new JLabel("est. 2022");
        estLabel.setHorizontalAlignment(SwingConstants.CENTER);
        estLabel.setForeground(Color.LIGHT_GRAY);
        estLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        estLabel.setBounds(693, 195, 100, 30);
        contentPane.add(estLabel);

        // Username Label
        JLabel userLabel = new JLabel("Username");
        userLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        userLabel.setBounds(596, 273, 300, 30);
        contentPane.add(userLabel);

        // Username Field
        user = new JTextField();
        user.setHorizontalAlignment(SwingConstants.CENTER);
        user.setBounds(596, 318, 300, 40);
        user.setBackground(Color.GRAY);
        user.setForeground(Color.WHITE);
        user.setFont(new Font("Arial", Font.PLAIN, 18));
        user.setBorder(BorderFactory.createEmptyBorder());
        user.setToolTipText("Enter Username");
        contentPane.add(user);
        user.setColumns(10);

        // Password Label
        JLabel passLabel = new JLabel("Password");
        passLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        passLabel.setBounds(596, 368, 300, 30);
        contentPane.add(passLabel);

        // Password Field
        pass = new JPasswordField();
        pass.setHorizontalAlignment(SwingConstants.CENTER);
        pass.setBounds(596, 413, 300, 40);
        pass.setBackground(Color.GRAY);
        pass.setForeground(Color.WHITE);
        pass.setFont(new Font("Arial", Font.PLAIN, 18));
        pass.setBorder(BorderFactory.createEmptyBorder());
        pass.setToolTipText("Enter Password");
        contentPane.add(pass);

        // Login Button
        JButton loginButton = new JButton("Sign-In");
        loginButton.setBounds(679, 482, 143, 47);
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(70, 130, 180)); // Steel Blue color
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(loginButton);

        // Add action listener for the button
        loginButton.addActionListener(e -> {
            // Get the username and password from the text fields
            String username = user.getText();
            String password = new String(pass.getPassword()); // Convert char[] to String

            // Check if the username exists in the validUsers HashMap
            if (validUsers.containsKey(username)) {
                // Check if the password matches the username
                if (validUsers.get(username).equals(password)) {
                    // If successful, open MainPage
                    JOptionPane.showMessageDialog(this, "Login Successful! Welcome!");
                    new MainPage().setVisible(true); // Open MainPage
                    this.dispose(); // Close login page
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid password. Please try again.");
                    // Clear the password field only
                    pass.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username. Please try again.");
                // Clear both the username and password fields
                user.setText("");
                pass.setText("");
            }
        });
    }
}