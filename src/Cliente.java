import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cliente {
    public String nome;
    public String endereco;
    public static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir() {
        JOptionPane.showMessageDialog(null, "Nome do cliente: " + nome + "\nEndereco do cliente: " + endereco, "Exibindo informacoes", 1);
    }

    // public void exibirClientes() {
    //     for (int i = 0; i < clientes.size(); i++) {
    //         Cliente c = clientes.get(i);  // atualizacoes futuras
            
    //         JOptionPane.showMessageDialog(null, "Nome do cliente: " + c.nome + "\nEndereco do cliente: " + c.endereco, "Exibindo informacoes" + "\n######################################", 1);
    //     }
    // }
}
