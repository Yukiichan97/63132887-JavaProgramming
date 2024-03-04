import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTK;
	private JTextField txtMK;
	
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTK = new JLabel("Nhập tài khoản:");
		lbTK.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lbTK.setBounds(39, 45, 214, 31);
		contentPane.add(lbTK);
		
		JLabel lbMK = new JLabel("Nhập mật khẩu:");
		lbMK.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lbMK.setBounds(39, 110, 214, 31);
		contentPane.add(lbMK);
		
		txtTK = new JTextField();
		txtTK.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtTK.setColumns(10);
		txtTK.setBounds(285, 45, 214, 31);
		contentPane.add(txtTK);
		
		txtMK = new JTextField();
		txtMK.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtMK.setColumns(10);
		txtMK.setBounds(285, 110, 214, 31);
		contentPane.add(txtMK);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAction();
			}
		});
		btnLogin.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnLogin.setBounds(202, 194, 163, 51);
		contentPane.add(btnLogin);
	}
	private void LoginAction() {
		String str_TK = txtTK.getText();
		String str_MK = txtMK.getText();
		if(str_TK.equals("63CNTT")&& str_MK.equals("123")){
			new HomeFrame().setVisible(true);
			this.setVisible(false);
		}
		else {
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
