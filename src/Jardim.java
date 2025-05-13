import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jardim {
    String tituloCalculoArea = "Calculo de Area";
    String entradaLargura = "Digite a largura: ";
    String entradaComprimento = "Digite o comprimento: ";
    double largura;
    double comprimento;
    double valorArea;
    String escolhaMenu2;
    double media = 0.0;
    double soma = 0.0;
    String[] listaServicos = {"Corte de grama", "Plantio de flores", "Poda de arvores", "Limpeza de jardim"};
    ArrayList<Servico> listaServicosSolicitados = new ArrayList<>();
    ArrayList<Servico> servicosDisponiveis;
    ArrayList<Double> areasCalculadas = new ArrayList<>();
    Servico servico = new Servico(); 
    int escolhaServico;
    String tituloDesconto = "DESCONTOS!!!";
    String opcaoCalculo;
    boolean rodando = true;

    public Jardim(){
        this.largura = -1;
        this.comprimento = -1;
    } 
    public Jardim(ArrayList<Servico> servicos) {
        this.servicosDisponiveis = servicos;
    }
    public Jardim(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularArea() {

        opcaoCalculo = JOptionPane.showInputDialog(null, "1 - Calcular uma area \n2 - Calcular media de N areas", "Escolha", 3);

        switch (opcaoCalculo.toLowerCase()) {
            case "1":
                // Calculando a area do jardim.
                largura = Double.parseDouble(JOptionPane.showInputDialog(null, entradaLargura, tituloCalculoArea, 3));
                comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, entradaComprimento, tituloCalculoArea, 3));

                do { // Validando campos de area
                    if (largura < 0) {
                        largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor invalido!!!\n\n" + entradaLargura, tituloCalculoArea, 3));
                    } else if (comprimento < 0) {
                        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor invalido!!!\n\n" + entradaComprimento, tituloCalculoArea, 3));
                    } else {
                        break;
                    }
                } while (largura > 0 && comprimento > 0);
                
                valorArea = (largura * comprimento);

                if (valorArea >= 100) {
                    JOptionPane.showMessageDialog(null, "Jardim com area de " + valorArea + " m² e considerado grande! (Maior ou igual a 100m²).", tituloCalculoArea, 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Jardim com area de " + valorArea + " m² e considerado pequeno! (Menor que 100m²).", tituloCalculoArea, 1);
                }

                // Menu de servicos
                do {
                    if (servicosDisponiveis.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum servico cadastrado!!", "ERRO", 0);
                    }

                    StringBuilder menu = new StringBuilder(" ---------- Escolha um serviço ----------\n\n");
                    for (int i = 0; i < servicosDisponiveis.size(); i++) {
                        menu.append("Serviço ").append(i + 1).append(": ").append(servicosDisponiveis.get(i).nome).append("\n");
                    }
                    menu.append("\nSAIR - 0: ");

                    escolhaServico = Integer.parseInt(JOptionPane.showInputDialog(null, menu.toString()));

                    if (escolhaServico == 0) {
                        break;
                    } else if (escolhaServico > 0 && escolhaServico <= servicosDisponiveis.size()) {
                        Servico servicoSelecionado = servicosDisponiveis.get(escolhaServico - 1);
                        listaServicosSolicitados.add(servicoSelecionado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente.");
                    }
                } while (true);

                servico.aplicarDesconto(this);

                
                break;
        
            case "2":
                do {
                    // Calculando a area do jardim.
                    largura = Double
                            .parseDouble(JOptionPane.showInputDialog(null, entradaLargura, tituloCalculoArea, 3));
                    comprimento = Double
                            .parseDouble(JOptionPane.showInputDialog(null, entradaComprimento, tituloCalculoArea, 3));

                    do { // Validando campos de area
                        if (largura < 0) {
                            largura = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Valor invalido!!!\n\n" + entradaLargura, tituloCalculoArea, 0));
                        } else if (comprimento < 0) {
                            comprimento = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Valor invalido!!!\n\n" + entradaComprimento, tituloCalculoArea, 0));
                        } else {
                            break;
                        }
                    } while (largura > 0 && comprimento > 0);

                    valorArea = (largura * comprimento);
                    areasCalculadas.add(valorArea);


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

                // mostra a media das areas calculadas
                JOptionPane.showMessageDialog(null, "A media das " + areasCalculadas.size() + " areas calculadas e de: " + String.format("%.2f", media) + " m².", tituloCalculoArea, 1);
                break;
            
            case "sair":
                rodando = false;
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente.", "Erro", 0);
                break;
        }
        
        return valorArea;
    }
}
