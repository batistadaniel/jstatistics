import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // Declarando as variaveis
        String msgBemVindo = "Alô, Jardim!";
        String tituloBemVindo = "Bem Vindo";
        String tituloCadastro = "Cadastro";
        String entradaNome = "Digite o seu nome: ";
        String entradaEmdereco = "Digite o seu endereco: ";
        String opcaoMenuInicial;
        double area = 0;


        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();
        boolean rodando = true;

        // Boas-vindas
        JOptionPane.showMessageDialog(null, msgBemVindo, tituloBemVindo, 1);

        do {
            opcaoMenuInicial = JOptionPane.showInputDialog(null," ---------- Escolha uma opcao ----------\n\n" + 
                    "\n1 - Cadastrar cliente"
                    + "\n2 - Cadastrar servico"
                    + "\n3 - Calcular areas de jardins"
                    + "\n\nPara sair digite: 'sair'"
            );

            opcaoMenuInicial.equalsIgnoreCase(opcaoMenuInicial);

            switch (opcaoMenuInicial.toLowerCase()) {
                case "1":
                    // Cadastro de cliente
                    String nomeCliente = JOptionPane.showInputDialog(null, entradaNome, tituloCadastro, 1);
                    String enderecoCliente = JOptionPane.showInputDialog(null, entradaEmdereco, tituloCadastro, 1);
                    Cliente novoCliente = new Cliente(nomeCliente, enderecoCliente);

                    clientes.add(novoCliente);

                    novoCliente.exibir();

                    break;
                case "2":
                    // Cadastro de servico
                    String nomeNovoServico = JOptionPane.showInputDialog(null, "Digite o nome do servico: ", "Cadastrando servicos", 1);

                    Servico novoServico = new Servico(nomeNovoServico);
                    servicos.add(novoServico);

                    novoServico.exibir();
                    break;
                case "3":
                    Jardim jardim = new Jardim(servicos);
                    area = jardim.calcularArea();
                    break;
                // case "4":
                //     clientes     // atualizacoes futuras 
                //     break;
                case "sair":
                    rodando = false;
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente.");
                    break;
            }


        } while (rodando);

        System.out.println(clientes);
        System.out.println(servicos);
        System.out.println(area);
    }
}
