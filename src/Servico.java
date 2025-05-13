import javax.swing.JOptionPane;

public class Servico {

    String nome;

    public Servico() {
        this.nome = "";
    }

    public Servico(String nome) {
        this.nome = nome;
    }
    
    public void exibir(){
        JOptionPane.showMessageDialog(null, "Nome do Servico: " + nome , "Exibindo servico cadastrado", 1);

    }
    public void aplicarDesconto(Jardim jardim) {
        // Desconto fidelidade
        JOptionPane.showMessageDialog(null, " ----- Desconto por fidelidade -----\n\n"
                + "Apenas 1 Servico: 0%\n"
                + "2 Servicos: 5% de desconto\n"
                + "3 Servicos: 10% de desconto\n"
                + "4 ou mais Servicos: 15% de desconto\n"
                + "Total de Servicos: " + jardim.listaServicosSolicitados.size(), jardim.tituloDesconto, 1);

        switch (jardim.listaServicosSolicitados.size()) {
            case 1:
                JOptionPane.showMessageDialog(null, "Voce ganhou 0% de desconto. Que pena!", jardim.tituloDesconto, 1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Voce ganhou 5% de desconto. Parabens!", jardim.tituloDesconto, 1);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Voce ganhou 10% de desconto. Parabens!", jardim.tituloDesconto, 1);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Voce ganhou 15% de desconto. Parabens!", jardim.tituloDesconto, 1);
                break;
            default:
                break;
        }

        if (jardim.listaServicosSolicitados.size() > 4) {
            JOptionPane.showMessageDialog(null, "Voce ganhou 15% de desconto. Parabens!", jardim.tituloDesconto, 1);

        }

        
    }
}
