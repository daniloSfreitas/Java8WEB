package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Celsius Converter");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        cont.setLayout(new BorderLayout());
        cont.add(new JTextField("0"), BorderLayout.PAGE_START);
        cont.add(new JLabel("Celsius"),BorderLayout.EAST);
        cont.add(new JButton("Convert"),BorderLayout.WEST);
        cont.add(new JTextField("32 Fahrenheit"),BorderLayout.PAGE_END);
       
        frame.setVisible(true);
        
	}
}
