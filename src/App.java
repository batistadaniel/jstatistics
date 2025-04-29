import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("JStatistics");

		Scanner leia = new Scanner(System.in);
		

		// variavel: e um espaco reservado na memoria do computador
		// variavel: serve para guarda valores
		// variavel: ela tem um tipo (texto, numero. logico ...)

		/*
		 * Ex-1: crie um algoritmo para o jstatistics que leia a opcao desejada
		 * 
		 * "Qual o conjunto de dados utilizado: 1- populacional 2- amostral"
		 * o valor recebido deve ser um inteiro.
		 * 
		 * 
		 */

		// int opcao; // declarei a variavel em java,
		// System.out.println("\t #----- \t #----- \t JStatistics \t -----# \t -----#\t");
		// System.out.print("Qual o conjunto de dados utilizado: (1- populacional 2- amostral) ");
		// opcao = leia.nextInt();
		// leia.close();

		// System.out.println(opcao);

		int opcao;
		JOptionPane.showMessageDialog(null, "O Jogo da Estatistica: JStatistics", "Jogo", 2); // declarei a variavel em java
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o conjunto de dados utilizado: \n1- Populacional \n2- Amostral \nResposta: ","JStatistics", 3));
		JOptionPane.showMessageDialog(null, "Sua escolha foi: " + opcao, "JStatistics", 2 );


		/* 
		 * Ex-2
		 * voce deve criar um menu perguntando para o usuario:
		 * Que tipo de variavel ele quer cadastrar:
		 * 1- Quantitativa
		 * 2- Qualitativa
		 * 
		 * o menu deve ter as quebras de linhas conforme o texto acima
		 * tudo deve ser feito em apenas em um unico sysoutln
		 * 
		 * 
		 */

		String opcaoVariavel = JOptionPane.showInputDialog(null, "Que tipo de variavel deseja cadastrar: \n1- Quantitativa \n2- Qualitativa \nResposta: ","Exercicio", 3); // declarei a variavel em java
		int opVariavel = Integer.parseInt(opcaoVariavel);
		JOptionPane.showMessageDialog(null, "Sua escolha foi: " + opVariavel, "JStatistics", 2 );
		// System.out.print("\t #----- \t #----- \t JStatistics \t -----# \t -----# \t" + "\n" + "Que tipo de variavel deseja cadastrar: \n1- Quantitativa \n2- Qualitativa \nResposta: ");
		// System.out.print("Que tipo de variavel deseja cadastrar: (1- Quantitativa 2- Qualitativa) ");
		// opcaoVariavel = leia.nextInt();
		// leia.close();

		// System.out.println(opcaoVariavel);

	}
}
