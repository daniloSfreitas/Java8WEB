package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTFApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplicação");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();        
        JTextField tj = new JTextField("Digite Aqui.");
        cont.add(tj, BorderLayout.NORTH);
        frame.setVisible(true);

	}

}
