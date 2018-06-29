package exercicio03;

import exercicio01.ExercicioBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Gabriel Budke
 */
public class Exercicio03 implements ExercicioBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JButton jButtonTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JTextArea jTextAreaTabuada;

    @Override
    public void gerarTela() {

        jFrame = new JFrame("Exercicio03");
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void instanciarComponentes() {

        jLabelNumero = new JLabel("Número:");
        jLabelTabuada = new JLabel("Tabuada:");
        jTextAreaTabuada = new JTextArea();
        jButtonTabuada = new JButton("Gerar Tabuada");

    }

    @Override
    public void gerarDimensões() {
        jLabelNumero.setSize(100, 10);
        jLabelTabuada.setSize(100, 100);
        jTextAreaTabuada.setSize(100, 100);
        jButtonTabuada.setSize(100, 100);
        
        
    }

    @Override
    public void gerarLocalização() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println("jLabelNumero.setLocation(100,10);"
                    + "\njLabelTabuada.setLocation(100,100);"
                    + "\njTextArea.setLocation(100,100);"
                    + "\njButtonTabuada.setLocation(100,100);");

        }

    }

}
