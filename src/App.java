import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {
		// System.out.println("Alo Git!");

		// if
		// if else
		// switch
		// ternario

		// int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o resultado
		// de uma populacao? \n1- Parametro \n2- Estatistica"));

		// if (op == 1){
		// JOptionPane.showMessageDialog(null, "Certa resposta!");
		// } else {
		// JOptionPane.showMessageDialog(null, "Resposta errada!", "JStatistics", 0 );
		// }

		// Exercicios (para cada pergunta crie um if)
		/*
		 * Considerando os numeros 30, 50, 80, 90 Digige o valor da media aritmetica
		 * simples "62.5"
		 * 
		 * Considerando os numeros 10, 40, 50, 80, 10 Digige qual e a moda "10"
		 * 
		 * Qual e a medida de tendencia central que mostra o centro da amostra?
		 * "mediana"
		 * 
		 */

		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Considerando os numeros 30, 50, 80, 90. Digite o valor da media aritmetica simples: "));

		if (media == 62.5) {
			JOptionPane.showMessageDialog(null, "Certa resposta!");
		} else {
			JOptionPane.showMessageDialog(null, "Resposta errada!", "JStatistics", 0);
		}

		int moda = Integer.parseInt(JOptionPane.showInputDialog(null, "Considerando os numeros 10, 40, 50, 80, 10. Digige qual e a moda: "));

		if (moda == 10) {
			JOptionPane.showMessageDialog(null, "Certa resposta!");
		} else {
			JOptionPane.showMessageDialog(null, "Resposta errada!", "JStatistics", 0);
		}

		String mediana = JOptionPane.showInputDialog(null, "Qual e a medida de tendencia central que mostra o centro da amostra: ").toLowerCase();

		if (mediana.equals("mediana")) {
			JOptionPane.showMessageDialog(null, "Certa resposta!");
		} else {
			JOptionPane.showMessageDialog(null, "Resposta errada!", "JStatistics", 0);
		}
	}
}
