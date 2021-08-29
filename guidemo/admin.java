package guidemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 434, 36);
		contentPane.add(panel);
		
		JLabel lblAdminLoginSection = new JLabel("ADMIN LOGIN SECTION");
		lblAdminLoginSection.setForeground(Color.WHITE);
		lblAdminLoginSection.setBackground(Color.WHITE);
		panel.add(lblAdminLoginSection);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setBounds(97, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 72, 102, 20);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 111, 102, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(75, 114, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("click me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =textField.getText();
				String pass = String.valueOf(passwordField.getPassword());
				
				if(name.equals("admin") && pass.equals("pass"))
				{
					JOptionPane.showMessageDialog(admin.this, "Welcome to swing "+name);
					AdminWelcome wel = new AdminWelcome();
					wel.setVisible(true);
					admin.this.setVisible(false);
				}
				else
					JOptionPane.showMessageDialog(admin.this, "Wrong user or password","Error"
							, JOptionPane.ERROR_MESSAGE);
			}
			
		});
		btnNewButton.setBounds(171, 161, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(0, 226, 434, 36);
		contentPane.add(panel_1);
	}

}
