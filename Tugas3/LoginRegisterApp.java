import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginRegisterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Panel Login
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        loginPanel.setBackground(new Color(176, 196, 222));

        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(new JLabel("LOGIN FORM"), gbc);

        // Email
        gbc.gridx = 0;
        gbc.gridy = 2;
        loginPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField emailField = new JTextField(15);
        loginPanel.add(emailField, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy = 3;
        loginPanel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(15);
        loginPanel.add(passwordField, gbc);

        // Submit Login Button
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        JButton loginButton = new JButton("Submit Login");
        loginPanel.add(loginButton, gbc);

        // Action Listener untuk Submit Login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                JOptionPane.showMessageDialog(loginPanel, "Welcome back, "+ email + "! You have successfully logged in.");
            }
        });

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Register");
            }
        });
        gbc.gridy = 5;
        loginPanel.add(registerButton, gbc);

        // Panel Register
        JPanel registerPanel = new JPanel(new GridBagLayout());
        registerPanel.setBackground(new Color(176, 196, 222)); 

        gbc.gridx = 0;
        gbc.gridy = 0;
        registerPanel.add(new JLabel("REGISTER FORM"), gbc);

        // Nama
        gbc.gridx = 0;
        gbc.gridy = 1;
        registerPanel.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 2;
        JTextField nameField = new JTextField(18);
        registerPanel.add(nameField, gbc);
        
        // Email
        gbc.gridx = 0;
        gbc.gridy = 2;
        registerPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 2;
        JTextField regEmailField = new JTextField(18);
        registerPanel.add(regEmailField, gbc);
        
        // Password
        gbc.gridx = 0;
        gbc.gridy = 3;
        registerPanel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 2;
        JPasswordField regPasswordField = new JPasswordField(18);
        registerPanel.add(regPasswordField, gbc);

        // Submit Register Button
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 5;
        JButton registerSubmitButton = new JButton("Submit Register");
        registerPanel.add(registerSubmitButton, gbc);

        // Action Listener untuk Submit Register
        registerSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = regEmailField.getText();
                String password = new String(regPasswordField.getPassword());
                JOptionPane.showMessageDialog(registerPanel, "Registration successful, Welcome " + name + "!");
            }
        });

        // Login Button from Register
        JButton loginFromRegisterButton = new JButton("Login");
        loginFromRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Login");
            }
        });
        gbc.gridy = 7;
        registerPanel.add(loginFromRegisterButton, gbc);

        // Menambahkan panel ke mainPanel
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Register");

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}