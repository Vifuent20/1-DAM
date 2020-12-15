
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblResultado;
	private JLabel lblNmero;
	private JLabel lblNmero_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSumar = new JButton("SUMAR");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNum1 = textField.getText();
				String txtNum2 = textField.getText();
				
				int n1 = Integer.parseInt(txtNum1);
				int n2 = Integer.parseInt(txtNum2);
				
				lblResultado.setRes(n1 + n2);
				
			}
		});
		btnSumar.setBounds(323, 11, 111, 71);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("RESTAR");
		btnRestar.setBounds(323, 93, 111, 71);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("MULTIPLICAR");
		btnMultiplicar.setBounds(323, 175, 111, 71);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("DIVIDIR");
		btnDividir.setBounds(323, 257, 111, 71);
		contentPane.add(btnDividir);
		
		textField = new JTextField();
		textField.setBounds(98, 34, 71, 71);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(98, 159, 71, 71);
		contentPane.add(textField_1);
		
		lblNmero = new JLabel("N\u00FAmero 2:");
		lblNmero.setBounds(31, 161, 57, 14);
		contentPane.add(lblNmero);
		
		lblNmero_1 = new JLabel("N\u00FAmero 1:");
		lblNmero_1.setBounds(31, 39, 57, 14);
		contentPane.add(lblNmero_1);
		
		lblResultado = new JLabel("RESULTADO");
		lblResultado.setBounds(31, 315, 97, 47);
		contentPane.add(lblResultado);
	}

}
