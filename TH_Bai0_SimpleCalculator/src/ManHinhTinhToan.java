import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setTitle("Máy Tính Đơn Giản");
		setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTxtA = new JLabel("Nhập số thứ nhất (a):");
		lbTxtA.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lbTxtA.setBounds(53, 42, 214, 31);
		contentPane.add(lbTxtA);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lblNhpSTh.setBounds(53, 103, 214, 31);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtA.setBounds(313, 42, 214, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(313, 103, 214, 31);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXyLyCong();
			}
		});
		btnCong.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnCong.setBounds(53, 184, 119, 31);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXyLyTru();
			}
		});
		btnTru.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnTru.setBounds(204, 184, 119, 31);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXyLyNhan();
			}
		});
		btnNhan.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnNhan.setBounds(356, 184, 119, 31);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXyLyChia();
			}
		});
		btnChia.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnChia.setBounds(506, 184, 119, 31);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lblKtQu.setBounds(53, 249, 214, 31);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(313, 249, 214, 31);
		contentPane.add(txtKetQua);
	}
	private void HamXyLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double ketQua = soA+soB;
		
		txtKetQua.setText( String.valueOf(ketQua) );
	}
	
	private void HamXyLyTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double ketQua = soA-soB;
		
		txtKetQua.setText( String.valueOf(ketQua) );
	}
	
	private void HamXyLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double ketQua = soA*soB;
		
		txtKetQua.setText( String.valueOf(ketQua) );
	}
	
	private void HamXyLyChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double ketQua = soA/soB;
		
		txtKetQua.setText( String.valueOf(ketQua) );
	}
}
