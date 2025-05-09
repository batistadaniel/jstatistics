import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declarando as variaveis
        String msgBemVindo = "Alô, Jardim!";
        String tituloBemVindo = "Bem Vindo";
        String tituloCadastro = "Cadastro";
        String entradaNome = "Digite o seu nome: ";
        String entradaEmdereco = "Digite o seu endereco: ";
        String tituloCalculoArea = "Calculo de Area";
        String entradaLargura = "Digite a largura: ";
        String entradaComprimento = "Digite o comprimento: ";
        double valorLargura = 0;
        double valorCompromento = 0;
        double valorArea = 0;

        // Boas-vindas
        JOptionPane.showMessageDialog(null, msgBemVindo, tituloBemVindo, 1);
        
        // Cadastro de cliente
        String nomeCliente = JOptionPane.showInputDialog(null, entradaNome, tituloCadastro, 1);
        String enderecoCliente = JOptionPane.showInputDialog(null, entradaEmdereco, tituloCadastro, 1);

        // Exibindo as informacoes
        JOptionPane.showMessageDialog(null, " #####  Suas informacoes #####\n\n\n" + "Nome: " + nomeCliente + "\n" + "Endereco: " + enderecoCliente, tituloCadastro, 3);
        
        // Calculando a area do jardim
        valorLargura = Double.parseDouble(JOptionPane.showInputDialog(null, entradaLargura, tituloCalculoArea, 3));
        valorCompromento = Double.parseDouble(JOptionPane.showInputDialog(null, entradaComprimento, tituloCalculoArea, 3));
        valorArea = (valorLargura * valorCompromento);

        // Exibindo o valor da area do jardim
        JOptionPane.showMessageDialog(null, "O valor da area do jardim e de " + String.format("%.2f", valorArea) + " m² !", tituloCalculoArea, 1);
    }
}
