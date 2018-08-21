package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ButtonAppv2 extends JFrame implements ActionListener, WindowListener {
	
	public UIManager.LookAndFeelInfo looks[];
	


	public static void main(String[] args) {
		ButtonAppv2 frame = new ButtonAppv2();
		frame.setTitle("Primeira Aplicação");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout()); 
        JButton botao = new JButton("Isto é um Botao");
        botao.addActionListener(frame);
        cont.add(botao);
        frame.addWindowListener(frame);
        frame.setVisible(true);
        
        frame.looks = UIManager.getInstalledLookAndFeels();
        try {
		UIManager.setLookAndFeel(frame.looks[3].getClassName());
        	
		} catch (Exception e) {
			
		}
        
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		JOptionPane.showMessageDialog(null,ev.getActionCommand().toString());// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(null,"Encerrando a APlicação...");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent ev) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
