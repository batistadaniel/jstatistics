import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Classse e um conjunto de objetos
        /*
         * Nosso objetivo nesse codigo e entender a diferenaca entre metodo com o tipo void e o metodo com o tipo String
         */

        Mamifero m1 = new Mamifero();
        m1.setnNmeCientifico("Bos taurus");
        m1.getNomeCientifico();

        JOptionPane.showMessageDialog(null, "Nome Cientifico: " +m1.getNomeCientifico(), "Nome Cientifico", 1);

        /*
         * Exercicio
         * 
         * Considerando a utilizacao de metodos set e get
         * Considerando a aula de hoje 
         * Anatomia de funcao/procedimento
         * diferenca entre funcao e procedimento
         * set - void (procedimento)
         * get - String (funcao)
         * Java = Metodos
         *  void
         *  String, int, boolean ...
         * 
         * Desafio:
         * 
         * Criar mais dois objetos:
         * 
         * Para armazenar e mostrar os dados do Canguru e Peixe Boi
         */

        Mamifero m2 = new Mamifero();
        m2.setnNmeCientifico("Trichechus");
        m2.getNomeCientifico();

        JOptionPane.showMessageDialog(null, "Nome Cientifico: " +m2.getNomeCientifico(), "Nome Cientifico", 1);

        Mamifero m3 = new Mamifero();
        m3.setnNmeCientifico("Macropus");
        m3.getNomeCientifico();

        JOptionPane.showMessageDialog(null, "Nome Cientifico: " +m3.getNomeCientifico(), "Nome Cientifico", 1);
        
    }
}
