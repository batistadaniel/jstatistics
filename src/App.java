import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declarando as variaveis
        String nomeNovoServico;
        String opcaoMenu;
        String tituloCalculoArea = "Calculo de Area";
        String entradaLargura = "Digite a largura: ";
        String entradaComprimento = "Digite o comprimento: ";
        String escolhaMenu2;
        double valorLargura = 0;
        double valorCompromento = 0;
        double valorArea = 0;
        double tamanhoPequeno = 100;
        int contadorJardimGrande = 0;
        double media = 0.0;
        double soma = 0.0;
        ArrayList<String> servicosCadastrados = new ArrayList<>(); 
        ArrayList<Double> areasCalculadas = new ArrayList<>(); 
        
        // Menu geral
        do {
            opcaoMenu = JOptionPane.showInputDialog(null," ---------- Escolha uma opcao ----------\n\n" + 
                    "\n1 - Cadastrar servico"
                    + "\n2 - Calcular    areas"
                    + "\nPara sair digite: sair"
                );
                
            if (opcaoMenu.equalsIgnoreCase("sair")){ // saindo do laco
                break;
            } else if (opcaoMenu.equals("1")) { // entra na opcao de cadastrar servico
                nomeNovoServico = JOptionPane.showInputDialog(null, "Digite o nome do servico: ", "Cadastrando servicos", 1);
                servicosCadastrados.add(nomeNovoServico);
            } else if (opcaoMenu.equals("2")) { // entra na opcao calcular areas
                do {
                    // Calculando a area do jardim.
                    valorLargura = Double
                            .parseDouble(JOptionPane.showInputDialog(null, entradaLargura, tituloCalculoArea, 3));
                    valorCompromento = Double
                            .parseDouble(JOptionPane.showInputDialog(null, entradaComprimento, tituloCalculoArea, 3));

                    do { // Validando campos de area
                        if (valorLargura < 0) {
                            valorLargura = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Valor invalido!!!\n\n" + entradaLargura, tituloCalculoArea, 3));
                        } else if (valorCompromento < 0) {
                            valorCompromento = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Valor invalido!!!\n\n" + entradaComprimento, tituloCalculoArea, 3));
                        } else {
                            break;
                        }
                    } while (valorLargura > 0 && valorCompromento > 0);

                    valorArea = (valorLargura * valorCompromento);
                    areasCalculadas.add(valorArea);

                    if (valorArea >= tamanhoPequeno) {
                        contadorJardimGrande++;
                    }

                    soma = 0;
                    for (double areas : areasCalculadas){
                        soma += areas;
                    }

                    media = (soma / areasCalculadas.size()); 
                    escolhaMenu2 = JOptionPane.showInputDialog(null, " ----- Escolha uma opcao ----- \n\n1 - Continuar \nDigite 'sair' para sair ", tituloCalculoArea, 0);
                    if (escolhaMenu2.equalsIgnoreCase("sair")) {
                        break;
                    }
                } while (true);
            } else {
                JOptionPane.showMessageDialog(null,
                    "Opcao invalida! Tente novamente.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } while (true);

        // mostra a media das areas calculadas
        JOptionPane.showMessageDialog(null, "A media das " + areasCalculadas.size() + " areas calculadas e de: " + String.format("%.2f", media) + " m².", tituloCalculoArea, 1);

        // calcula quantos jardins sao grandes
        JOptionPane.showMessageDialog(null, "A quantidade de jardins grandes maiores que 100m² e de " +  contadorJardimGrande + ".", tituloCalculoArea, 1);

        System.out.println(servicosCadastrados); 
        System.out.println(areasCalculadas);
        System.out.println(areasCalculadas.size());
        System.out.println("Media das areas calculadas: " + media); 
    }
}