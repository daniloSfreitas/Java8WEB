package unidade6;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;


public class ConverterAppv2 extends JInternalFrame {
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterAppv2 frame = new ConverterAppv2();
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
	public ConverterAppv2() {
		setResizable(true);
		getContentPane().setForeground(Color.WHITE);
		setTitle("Celsius Converter");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton btnConverte = new JButton("Converte");
		btnConverte.addActionListener(ev->{
			float cls = Float.parseFloat(textField.getText());
			float fht =(float) (9.0/5.0)*cls + 32;
			textField.setText(""+fht);
		});
		
		JLabel lblNewLabel = new JLabel("32 Farenheit");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConverte, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(105)
							.addComponent(lblCelsius)
							.addContainerGap(104, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)
							.addGap(61))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCelsius)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConverte, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
