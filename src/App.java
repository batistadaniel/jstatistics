import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {
        System.out.println("Aula3 - Switch e Loops");
		

		// O switch e uma estrutura de selecao multipla
		// Um if mais organizado
		// Escolha
			// Caso
		// Para resolver listas ou constantes
			// Memu
				// opcao1 
				// opcao2
				
		// int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opcao: \n1 - Estatistica Descritiva \n2 - Probabilidade \n3 - Modelos Probabilisticos \n4 - Sair" ));

		// // != sinal de diferente
		// if (op != 4) {
		// 	switch (op) {
		// 		case 1:
		// 			JOptionPane.showMessageDialog(null, "Estatistica Descritiva");
		// 			break;
			
		// 		case 2:
		// 			JOptionPane.showMessageDialog(null, "Probabilidade");
		// 			break;
			
		// 		case 3:
		// 			JOptionPane.showMessageDialog(null, "Modelos Probabilisticos");
		// 			break;
			
		// 		default:
		// 			JOptionPane.showMessageDialog(null, "Opcao invalida!");
	
		// 			break;
		// 	}
		// } else {
		// 	JOptionPane.showMessageDialog(null, "Encerrando sistema ...");

		// }

		/*
		 * Como funciona os loops
		 * 
		 * while - teste no inicio
		 * for - while compacto
		 * do while - teste no final
		 * 
		 * 
		 * inicio = 1
		 * condicao <= 5
		 * incremento i = i + 1
		 * decremento i = i - 1
		 * 
		 */

		// int contador = 1;

		// while (contador < 3) {
		// 	JOptionPane.showMessageDialog(null, "Viva o SENAI");
		// 	contador += 1;
			
		// }

		// int i = 1;

		// while (i <= 5) {
		// 	System.out.println(i);
		// 	i++;
		// }
		// System.out.println(i);

		// for (int cont = 0; cont <= 10; cont++) {
		// 	System.out.println(cont);
		// }

		// String sair;
		// do {
		// 	// System.out.println("Sair: s ou n");
		// 	sair =  JOptionPane.showInputDialog(null, "Sair: (s ou n) ");
		// } while (!sair.equalsIgnoreCase("s"));

		do {
			int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opcao: \n1 - Estatistica Descritiva \n2 - Probabilidade \n3 - Modelos Probabilisticos \n4 - Sair" ));
			if(op == 4){
				JOptionPane.showMessageDialog(null, "Encerrando sistema ...");
				break;
			} else {
				switch (op) {
					case 1:
						JOptionPane.showMessageDialog(null, "Estatistica Descritiva");
						break;
				
					case 2:
						JOptionPane.showMessageDialog(null, "Probabilidade");
						break;
				
					case 3:
						JOptionPane.showMessageDialog(null, "Modelos Probabilisticos");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opcao invalida!");
						break;
				} 
			}
		} while (true);
	}
}
