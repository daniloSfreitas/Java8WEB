package unidade2;

import javax.swing.JOptionPane;

public class FatoramentoTrimestral {

	public static void main(String[] args) {
		double vendas_janeiro; // = 15_000;
		double vendas_feveriero;// = 23_000;
		double vendas_marco; // = 17_000;

		vendas_janeiro = Double.parseDouble(JOptionPane.showInputDialog("FAvor informar as vendas de janeiro"));
		vendas_feveriero = Double.parseDouble(JOptionPane.showInputDialog("FAvor informar as vendas de janeiro"));
		vendas_marco = Double.parseDouble(JOptionPane.showInputDialog("FAvor informar as vendas de janeiro"));

		double faturamenteo_trimestral = vendas_janeiro + vendas_feveriero + vendas_marco;

		JOptionPane.showMessageDialog(null, "Resultado do Faturamento Trimestral:" + faturamenteo_trimestral);
	}

}
