package matilde;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class combobox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtResultadoEs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combobox frame = new combobox();
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
	public combobox() {
		setBackground(new Color(255, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ingresa un numero:");
		lblNewLabel.setBounds(14, 37, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ingresa un numero:");
		lblNewLabel_1.setBounds(14, 95, 110, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"suma", "resta", "multiplicacion", "division"}));
		comboBox.setBounds(278, 33, 88, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("Calcular");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        double num1=Double.parseDouble(textField.getText());
	        double num2=Double.parseDouble(textField_1.getText());
	        double resp=0;
	        
	        int i=comboBox.getSelectedIndex();
	        
	        if(i==0) {
	        	resp=num1+num2;
	        }else if(i==1) {
	        	resp=num1-num2;        	
	        }else if(i==2) {
	        	resp=num1*num2;
	        }else if(i==3) {
	        	resp=num1/num2;
	        }
	        
	        textField_2.setText(String.valueOf(resp));
			}
			
		});
		btnNewButton_3.setBounds(277, 86, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Limpiar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_4.setBounds(278, 120, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Cerrar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5.setBounds(277, 174, 89, 23);
		contentPane.add(btnNewButton_5);
		
		textField = new JTextField();
		textField.setBounds(141, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 92, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 175, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		txtResultadoEs = new JTextField();
		txtResultadoEs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtResultadoEs.setText("resultado es:");
		txtResultadoEs.setBounds(22, 175, 86, 20);
		contentPane.add(txtResultadoEs);
		txtResultadoEs.setColumns(10);
	}
}
