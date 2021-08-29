package guidemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * @wbp.nonvisual location=27,489
	 */
	private final JButton button = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("click me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =textField.getText();
				String pass = String.valueOf(passwordField.getPassword());
				
				if(name.equals("raj") && pass.equals("pass"))
				{
					JOptionPane.showMessageDialog(Login.this, "Welcome to swing "+name);
					Welcome wel = new Welcome();
					wel.setVisible(true);
					Login.this.setVisible(false);
				}
				else
					JOptionPane.showMessageDialog(Login.this, "Wrong user or password","Error"
							, JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setBounds(171, 161, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 434, 36);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("LOGIN SECTION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(0, 226, 434, 36);
		contentPane.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin a = new admin();
				a.setVisible(true);
				Login.this.setVisible(false);
			}
		});
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setBounds(97, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(171, 72, 102, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 111, 102, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(75, 114, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
