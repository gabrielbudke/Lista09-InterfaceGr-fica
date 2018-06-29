package exercicio04;

import exercicio01.ExercicioBaseInterface;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Gabriel Budke
 */
public class Exercicio04 implements ExercicioBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JButton jButtonVerificar;
    private JTextField jTextFieldNumero;

    public Exercicio04() {
        gerarTela();
        instanciarComponentes();
        gerarDimensões();
        gerarLocalização();
        adicionarComponentes();
        acaoButtonVerificar();

        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame("Exercicio04");
        jFrame.setSize(250, 200);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {

        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);

    }

    @Override
    public void instanciarComponentes() {

        jButtonVerificar = new JButton("Verificar");
        jButtonVerificar.setFont(new Font("Old English Text MT", Font.PLAIN, 20));
        jLabelNumero = new JLabel("Número:");
        jTextFieldNumero = new JTextField();

    }

    @Override
    public void gerarDimensões() {

        jLabelNumero.setSize(60, 20);
        jTextFieldNumero.setSize(130, 20);
        jButtonVerificar.setSize(150, 40);

    }

    @Override
    public void gerarLocalização() {

        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(65, 10);
        jButtonVerificar.setLocation(50, 50);

    }

    private void acaoButtonVerificar() {

        jButtonVerificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (jTextFieldNumero.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "!! Campo está vazio !!", "AVISO",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                int numero = 0;
                String texto = "";

                try {
                    numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "!! Entrada Inválida !!", "AVISO",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (numero > 0 && numero % 2 == 0) {
                    texto += numero + " é par e positivo.";
                } else if (numero < 0 && numero % 2 == 0) {
                    texto += numero + " é par e negativo.";

                } else if (numero > 0 && numero % 2 != 0) {
                    texto += numero + " é ímpar e positivo.";

                } else if (numero < 0 && numero % 2 != 0) {
                    texto += numero + " é ímpar e negativo.";
                }

                JOptionPane.showMessageDialog(null, texto);

            }
        });
                
    }
    
}
