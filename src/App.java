import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Cara ou Coroa (probabilidade)
        // 50% cara
        // 50% coroa
        // espaco amostral 
        // Variavel que receba a interacao do jogo 
        // Random
        // Switch
        // For, do while e while

        // String[] opcoes = {"teste1", "teste2"}; 
        // String[] espacoAmostral = {"Cara", "Coroa"}; 

        
        // Random teste = new Random();
        
        // System.out.println(opcoes.length);
        // System.out.println(opcoes[teste.nextInt(opcoes.length)]);

        // int resultado = teste.nextInt(1,3);

        // if (resultado == 1) {
        //     System.out.println("Cara");
        // } else {
        //     System.out.println("Coroa");
        // }


        String[] espacoAmostral = {"Cara", "Coroa"};

        Random random = new Random();
        
        // contadores para verificar a distribuicao

        
        int contCara = 0;
        int contCoroa = 0;
        String msg = "Espaco amostral {Cara, Coroa}\n" + "Probabilidade de Cara: 50%\n" + "Probabilidade de Coroa: 50%\n\n" + "Deseja lancar a moeda?" ;

        while (true) {


            int opcao = JOptionPane.showConfirmDialog(null, msg, "Lancando moedas", 0);

            if (opcao != 0) {
                String estatisticas = "Jogo finalizado!\n" + "Total de lancamentos: " + (contCara + contCoroa) + "\n\nQuantidade de Cara: " + contCara + "\nQuantidade de Coroa: " + contCoroa;
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando jogo", 1);
                break;
            } else {
                int resultado = random.nextInt(espacoAmostral.length);
                if (resultado == 0) {
                    contCara++;
                } else {
                    contCoroa++;
                }
                // espacoAmostral[random.nextInt(espacoAmostral.length)];

                JOptionPane.showMessageDialog(null, "Resultado do lancamento:  " + espacoAmostral[resultado] + "\n(Indice gerado: " + resultado + ")" + "\n\nQuantidade de Cara: " + contCara + "\nQuantidade de Coroa: " + contCoroa);
            }
        }
        // JOptionPane.showMessageDialog(null, msg);

    }
}
