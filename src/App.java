import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declarando as variaveis
        String msgBemVindo = "Alô, Jardim!";
        String tituloBemVindo = "Bem Vindo";
        String tituloCadastro = "Cadastro";
        String entradaNome = "Digite o seu nome: ";
        String entradaEmdereco = "Digite o seu endereco: ";

        // Boas-vindas
        JOptionPane.showMessageDialog(null, msgBemVindo, tituloBemVindo, 1);
        
        // Cadastro de cliente
        String nomeCliente = JOptionPane.showInputDialog(null, entradaNome, tituloCadastro, 1);
        String enderecoCliente = JOptionPane.showInputDialog(null, entradaEmdereco, tituloCadastro, 1);

        // Exibindo as informacoes
        JOptionPane.showMessageDialog(null, " #####  Suas informacoes #####\n\n\n" + "Nome: " + nomeCliente + "\n" + "Endereco: " + enderecoCliente, tituloCadastro, 3);
        

    }
}
