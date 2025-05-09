import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // // Parte 1

        // // Declarando as variaveis
        // String msgBemVindo = "Alô, Jardim!";
        // String tituloBemVindo = "Bem Vindo";
        // String tituloCadastro = "Cadastro";
        // String entradaNome = "Digite o seu nome: ";
        // String entradaEmdereco = "Digite o seu endereco: ";
        // String tituloCalculoArea = "Calculo de Area";
        // String entradaLargura = "Digite a largura: ";
        // String entradaComprimento = "Digite o comprimento: ";
        // double valorLargura = 0;
        // double valorCompromento = 0;
        // double valorArea = 0;
        // double tamanhoPequeno = 50;
        // String[] listaServicos = {"Corte de grama", "Plantio de flores", "Poda de arvores", "Limpeza de jardim"};
        // // String[] listaServicosSolicitados = {};
        // ArrayList<String> listaServicosSolicitados = new ArrayList<>();
        // int escolhaServico;
        // String tituloDesconto = "DESCONTOS!!!";

        // // Boas-vindas
        // JOptionPane.showMessageDialog(null, msgBemVindo, tituloBemVindo, 1);
        
        // // Cadastro de cliente
        // String nomeCliente = JOptionPane.showInputDialog(null, entradaNome, tituloCadastro, 1);
        // String enderecoCliente = JOptionPane.showInputDialog(null, entradaEmdereco, tituloCadastro, 1);

        // // Exibindo as informacoes
        // JOptionPane.showMessageDialog(null, " #####  Suas informacoes #####\n\n\n" + "Nome: " + nomeCliente + "\n" + "Endereco: " + enderecoCliente, tituloCadastro, 3);
        
        // // Calculando a area do jardim.
        // valorLargura = Double.parseDouble(JOptionPane.showInputDialog(null, entradaLargura, tituloCalculoArea, 3));
        // valorCompromento = Double.parseDouble(JOptionPane.showInputDialog(null, entradaComprimento, tituloCalculoArea, 3));

        // do { // Validando campos de area
        //     if (valorLargura < 0) {
        //         valorLargura = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor invalido!!!\n\n" + entradaLargura, tituloCalculoArea, 3));
        //     } else if (valorCompromento < 0) {
        //         valorCompromento = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor invalido!!!\n\n" + entradaComprimento, tituloCalculoArea, 3));
        //     } else {
        //         break;
        //     }
        // } while (valorLargura > 0 && valorCompromento > 0);
        
        // valorArea = (valorLargura * valorCompromento);

        // // Exibindo o valor da area do jardim
        // JOptionPane.showMessageDialog(null, "O valor da area do jardim e de " + String.format("%.2f", valorArea) + " m² !", tituloCalculoArea, 1);

        // // Parte 2

        // if (valorArea <= tamanhoPequeno) {
        //     JOptionPane.showMessageDialog(null, "O tamanho do seu jardim foi considerado pequeno!", tituloCalculoArea, 1);
        // } else {
        //     JOptionPane.showMessageDialog(null, "O tamanho do seu jardim foi considerado grande!", tituloCalculoArea, 1);
        // }

        // // Menu de servicos
        // do {
        //     escolhaServico = Integer.parseInt(JOptionPane.showInputDialog(null," ---------- Escolha um servico ----------\n\n" + 
        //             "\nServico 1: " + listaServicos[0]
        //             + "\nServico 2: " + listaServicos[1]
        //             + "\nServico 3: " + listaServicos[2]
        //             + "\nServico 4: " + listaServicos[3]
        //             + "\nSAIR - 5: "
        //         ));

        //     if (escolhaServico !=5) {
        //         switch (escolhaServico) {
        //             case 1:
        //                 listaServicosSolicitados.add(listaServicos[0]);
        //                 break;
        //             case 2:
        //                 listaServicosSolicitados.add(listaServicos[1]);
        //                 break;
        //             case 3:
        //                 listaServicosSolicitados.add(listaServicos[2]);
        //                 break;
        //             case 4:
        //                 listaServicosSolicitados.add(listaServicos[3]);
        //                 break;
        //             default:
        //                 break;
        //         }
        //     } else {
        //         break;
        //     }
        // } while (true);

        // // Desconto fidelidade
        // JOptionPane.showMessageDialog(null, " ----- Desconto por fidelidade -----\n\n" 
        //                 + "Apenas 1 Servico: 0%\n" 
        //                 + "2 Servicos: 5% de desconto\n"
        //                 + "3 Servicos: 10% de desconto\n" 
        //                 + "4 ou mais Servicos: 15% de desconto\n"
        //                 + "Total de Servicos: " + listaServicosSolicitados.size() , tituloDesconto, 1);

        // switch (listaServicosSolicitados.size()) {
        //     case 1:
        //         JOptionPane.showMessageDialog(null, "Voce ganhou 0% de desconto. Que pena!" , tituloDesconto, 1);
        //         break;
        //     case 2:
        //         JOptionPane.showMessageDialog(null, "Voce ganhou 5% de desconto. Parabens!" , tituloDesconto, 1);
        //         break;
        //     case 3:
        //         JOptionPane.showMessageDialog(null, "Voce ganhou 10% de desconto. Parabens!" , tituloDesconto, 1);
        //         break;
        //     case 4:
        //         JOptionPane.showMessageDialog(null, "Voce ganhou 15% de desconto. Parabens!" , tituloDesconto, 1);
        //         break;
        //     default:
        //         break;
        // }

        // if (listaServicosSolicitados.size() > 4) {
        //     JOptionPane.showMessageDialog(null, "Voce ganhou 15% de desconto. Parabens!" , tituloDesconto, 1);
            
        // }
    
        // Parte 3

        String nomeNovoServico;
        String opcaoMenu;
        ArrayList<String> servicosCadastrados = new ArrayList<>(); 
        
        opcaoMenu = JOptionPane.showInputDialog(null," ---------- Escolha uma opcao ----------\n\n" + 
                    "\n1 - Cadastrar servico"
                    + "\nPara sair digite: sair"
                );
        do {
            
            if (opcaoMenu.equalsIgnoreCase("sair")){
                break;
            } else {
                if (opcaoMenu.equals("1")) {
                    nomeNovoServico = JOptionPane.showInputDialog(null, "Digite o nome do servico: ", "Cadastrando servicos", 1);
                    servicosCadastrados.add(nomeNovoServico);
                } else if (!opcaoMenu.equals("1")) {
                    opcaoMenu = JOptionPane.showInputDialog(null," ---------- Opcao invalida!! ----------\n\n" + 
                        "\n1 - Cadastrar servico"
                        + "\nPara sair digite: sair"
                    );
                }
            }


            
        } while (true);

        System.out.println(servicosCadastrados);
        
    }
}

// do {
//     opcaoMenu = JOptionPane.showInputDialog(null,
//         " ---------- Escolha uma opcao ----------\n\n" +
//         "1 - Cadastrar servico\n" +
//         "Para sair digite: sair"
//     );

//     if (opcaoMenu == null || opcaoMenu.equalsIgnoreCase("sair")) {
//         break;
//     } else if (opcaoMenu.equals("1")) {
//         nomeNovoServico = JOptionPane.showInputDialog(null,
//             "Digite o nome do servico: ",
//             "Cadastrando servicos",
//             JOptionPane.PLAIN_MESSAGE
//         );
//         servicosCadastrados.add(nomeNovoServico);
//     } else {
//         JOptionPane.showMessageDialog(null,
//             "Opcao invalida! Tente novamente.",
//             "Erro",
//             JOptionPane.ERROR_MESSAGE
//         );
//     }

// } while (true);
