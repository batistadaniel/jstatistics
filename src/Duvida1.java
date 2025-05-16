// Correcao do exercicio

import javax.swing.JOptionPane;

public class Duvida1 {
    public static void main(String[] args) throws Exception {

        String msg = "JGarden";
        byte numFerramentas = 127;
        short agendamentosMes = 32767;
        int idAgendamento = 2147483647;
        long dataAgendamento = System.currentTimeMillis();
        float precoServico = 99.9f;
        double areaJardim = 120.75;
        char tipoServico = 'p';
        boolean concluido = true;
        String cliente = "João Silva";
        JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null, "Id do agendamento: " + idAgendamento);
        JOptionPane.showMessageDialog(null, "Numero de ferramentas: " + numFerramentas);
        JOptionPane.showMessageDialog(null, "Quantidade de agendamentos no mes: " + agendamentosMes);
        JOptionPane.showMessageDialog(null, "Data em milissegundos: " + dataAgendamento);
        JOptionPane.showMessageDialog(null, "Preco do servico: R$ " + precoServico);
        JOptionPane.showMessageDialog(null, "Area do jardim: " + areaJardim);
        JOptionPane.showMessageDialog(null, "Tipo de servico: " + (tipoServico == 'p'  ? "Poda" : "Corte"));
        JOptionPane.showMessageDialog(null, "Status: " + (concluido == true  ? "Faz o pix AGORA: " + cliente + "voce sabia que seu nome tem " + cliente.length() + " letras.": "Servico em andamento (aguarde)"));
        mostrarMsg();
    }

    /*na logica: funcao ou procedimento */
    /*na POO: metodo */
    public static void mostrarMsg(){
        JOptionPane.showMessageDialog(null, "Alo funcao");
    }
}
