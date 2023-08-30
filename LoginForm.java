package AutomationForm;

//Alpha version 1.0

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Get use data id and password.
//NOT include save data <--- 2nd stage implementation 
public class LoginForm extends JFrame {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton enterButton;

    public LoginForm() {
        setTitle("WiFi Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10)); 

        ImageIcon icon = new ImageIcon("C:\\Users\\Asus\\Desktop\\appicon.png");
        setIconImage(icon.getImage());
        
        
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        enterButton = new JButton("Login"); 
        
        usernameLabel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0)); 
        passwordLabel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0)); 
        usernameField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
        passwordField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));

        usernameField.setToolTipText("Enter your username");
        passwordField.setToolTipText("Enter your password");

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                FillForm fillForm = new FillForm();
				fillForm.performAutomation(username, password); //calling function
            }
        });

        add(new JLabel()); 
        add(new JLabel("Application Name", SwingConstants.CENTER));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(enterButton);

        pack();
        setLocationRelativeTo(null);
		 
    }

    public void showForm() {
        setVisible(true);
    }
}
