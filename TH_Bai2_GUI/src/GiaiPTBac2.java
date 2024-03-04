import java.awt.EventQueue;
import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtX1;
	private JTextField txtX2;
	/**
	 * Create the frame.
	 */
	public GiaiPTBac2() {
		setTitle("Chương trình giải bậc 2 đơn giản\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTxtA = new JLabel("Nhập số thứ nhất (a):");
		lbTxtA.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lbTxtA.setBounds(10, 11, 214, 31);
		contentPane.add(lbTxtA);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lblNhpSTh.setBounds(10, 71, 214, 31);
		contentPane.add(lblNhpSTh);
		
		JLabel lblNhpSTh_1 = new JLabel("Nhập số thứ ba (c):");
		lblNhpSTh_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lblNhpSTh_1.setBounds(10, 132, 214, 31);
		contentPane.add(lblNhpSTh_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtA.setColumns(10);
		txtA.setBounds(275, 18, 214, 31);
		contentPane.add(txtA);
		
		txtB = new JTextField();
		txtB.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(275, 71, 214, 31);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(275, 132, 214, 31);
		contentPane.add(txtC);
		
		JButton btnGii = new JButton("Giải");
		btnGii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaiPT2();
			}
		});
		btnGii.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnGii.setBounds(165, 185, 327, 43);
		contentPane.add(btnGii);
		
		JLabel lblNhpSTh_1_1 = new JLabel("X1:");
		lblNhpSTh_1_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lblNhpSTh_1_1.setBounds(10, 257, 53, 31);
		contentPane.add(lblNhpSTh_1_1);
		
		txtX1 = new JTextField();
		txtX1.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtX1.setColumns(10);
		txtX1.setBounds(73, 257, 214, 31);
		contentPane.add(txtX1);
		
		JLabel lblNhpSTh_1_1_1 = new JLabel("X2:");
		lblNhpSTh_1_1_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		lblNhpSTh_1_1_1.setBounds(326, 257, 53, 31);
		contentPane.add(lblNhpSTh_1_1_1);
		
		txtX2 = new JTextField();
		txtX2.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		txtX2.setColumns(10);
		txtX2.setBounds(368, 257, 214, 31);
		contentPane.add(txtX2);
	}
	private void GiaiPT2() {
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		String str_c = txtC.getText();
		
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		Double c = Double.parseDouble(str_c);
		
		Double x1, x2;
		Double delta = (b*b)-(4*a*c);
		if(a == 0) {
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Không phải phương trình bậc 2");
		}
		else if (delta>0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			txtX1.setText(String.valueOf(x1));
			txtX2.setText(String.valueOf(x2));
		}
		else if (delta == 0) {
            x1 = (-b / (2 * a));
            x2= x1;
            txtX1.setText(String.valueOf(x1));
            txtX2.setText(String.valueOf(x2));
        } else {
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Phương trình vô nghiệm");
        }
	}
}
