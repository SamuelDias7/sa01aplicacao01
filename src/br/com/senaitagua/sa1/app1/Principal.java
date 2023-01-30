package br.com.senaitagua.sa1.app1;// Pacote

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;

public class Principal { // Classe

	// Metodo main - é o método principal pra executar o programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		JOptionPane.showMessageDialog(null, "Empresa voe - Grupo Empresarial");
		
		// Entrada de dados
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do avião:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do avião:"));
		
		// Passar uma mensagem(método) para o objeto
		CalculoBO cbo = new CalculoBO();
		
		// Ultilizar o objeto
		JOptionPane.showMessageDialog(null, cbo.somar(valor1, valor2));
	}

}
