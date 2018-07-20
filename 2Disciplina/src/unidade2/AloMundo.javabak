package unidade2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class AloMundo extends JApplet {

	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		System.out.println("Inicializando...");
		super.init();
	}
	
	@Override
	public void paint(Graphics g) {
		this.setBackground(Color.GREEN);
		g.setColor(Color.BLUE);
		this.setSize(400,100);
		g.setFont(new Font("Times New Roman", Font.BOLD,30));
		g.drawString("Versao JVM:"+ System.getProperty("java.version"), 20, 20);
		g.drawString("Versao S.O:"+ System.getProperty("os.name"), 50, 50);
	}
	
	@Override
	public void start() {
		System.out.println("Executando..");
		
	}
	
	@Override
	public void stop() {
		System.out.println("Parando...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Eliminando...");
	}
	
	

}
