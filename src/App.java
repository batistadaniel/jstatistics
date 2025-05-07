// Importando Pacotes
import java.util.Random;
import javax.swing.JOptionPane;

// Classe App
public class App {
    
    // Metodo principal
    public static void main(String[] args) throws Exception {
        System.out.println("""
        Criar um jogo de lançar dados similar ao jogo do cara ou coroa.

        Estudar, pesquisar, escolher um dos métodos estatísticos

        Bonus+

        - P(A) - cálculo simples
        - Teorema de Bayes - avançado
        """);

        // Instanciando o Random
        Random random = new Random();

        // Declarando e iniciando as variaveis contadoras para cada lado do dado
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;

        // Mensagem 
        String msg = "Lancamento de dados\n" + "Probabilidade de 16,6%\n" + "\nDeseja lancar a dado?" ;

        while (true) {

            // Variavel contadora de lancamentos
            int qtdLancamentos = cont1 + cont2 + cont3 + cont4 + cont5 + cont6;

            // Iniciando jogo
            int opcao = JOptionPane.showConfirmDialog(null, msg, "Lancando dado", 0);

            // Se o usuario nao iniciar ou finalizar o jogo
            if (opcao != 0) {
                String estatisticas = "Lancamento finalizado!\n" + "Total de lancamentos: "
                        + (qtdLancamentos) 
                        + "\n\n #### Estatisticas ####"
                        + "\n\nLado UM:     " + cont1 + "    ---> " + String.format("%.2f", (cont1 / (float)qtdLancamentos * 100)) + "%"
                        + "\nLado DOIS:     " + cont2 + "    ---> " + String.format("%.2f", (cont2 / (float)qtdLancamentos * 100)) + "%"
                        + "\nLado TRES:     " + cont3 + "    ---> " + String.format("%.2f", (cont3 / (float)qtdLancamentos * 100)) + "%"
                        + "\nLado QUATRO:   " + cont4 + "    ---> " + String.format("%.2f", (cont4 / (float)qtdLancamentos * 100)) + "%" 
                        + "\nLado CINCO:    " + cont5 + "    ---> " + String.format("%.2f", (cont5 / (float)qtdLancamentos * 100)) + "%"
                        + "\nLado SEIS:     " + cont6 + "    ---> " + String.format("%.2f", (cont6 / (float)qtdLancamentos * 100)) + "%";

                        // formatacao chata do caramba


                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando lancamento", 1);

                JOptionPane.showMessageDialog(null, "    Obrigado por jogar!!!", "bye", 1);
                break;
            } else { // Se o usuario iniciar o jogo
                int resultado = random.nextInt(1, 7);

                // Incrementando contagem
                switch (resultado) {
                    case 1:
                        cont1++;
                        break;
                    case 2:
                        cont2++;
                        break;
                    case 3:
                        cont3++;
                        break;
                    case 4:
                        cont4++;
                        break;
                    case 5:
                        cont5++;
                        break;
                    case 6:
                        cont6++;
                        break;
                    default:
                        break;
                }

                // Mostra o Lado do Dado
                JOptionPane.showMessageDialog(null,
                        "Resultado do lancamento:  " + resultado); 
            }
        }
    }
}
