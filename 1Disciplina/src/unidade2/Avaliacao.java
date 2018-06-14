package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
		
		// intervalo de nota valida 0-100
		
		if ((nota < 0 ) || (nota > 100)){
			
			JOptionPane.showMessageDialog(null, "Nota invalida!Favor digitar nota no intervalo de 0 a 100");
			main(null);
		} else {
			}if(nota<50){
				JOptionPane.showMessageDialog(null, "Insuficiente");
			}else if(nota<70){
				JOptionPane.showMessageDialog(null, "Regular");
			}else if(nota<90){
				JOptionPane.showMessageDialog(null, "Bom");
			}else{
				JOptionPane.showMessageDialog(null, "Excelente");
			}
			
	
	}
}
