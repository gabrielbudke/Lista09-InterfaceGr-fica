package exercicio03;

import exercicio01.ExercicioBaseInterface;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Gabriel Budke
 */
public class Exercicio03 implements ExercicioBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JButton jButtonTabuada;
    private JTextField jTextFieldNumero;
    private JScrollPane jScrollPaneTabuada;
    private JTextArea jTextAreaTabuada;

    
    public Exercicio03(){
        gerarTela();
        instanciarComponentes();
        gerarDimensões();
        gerarLocalização();
        adicionarComponentes();
        acaoButtonTabuada();
        configurarScrollPane();
        
        jFrame.setVisible(true);
    }
    
    
    
    
    @Override
    public void gerarTela() {

        jFrame = new JFrame("Exercicio03");
        jFrame.setSize(225, 500);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelTabuada);
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(jScrollPaneTabuada);
    }

    @Override
    public void instanciarComponentes() {

        jLabelNumero = new JLabel("Número:");
        jLabelTabuada = new JLabel("Tabuada:");
        jTextAreaTabuada = new JTextArea();
        jButtonTabuada = new JButton("Gerar Tabuada");
        jTextFieldNumero = new JTextField();
        jScrollPaneTabuada = new JScrollPane();

    }

    @Override
    public void gerarDimensões() {
        jLabelNumero.setSize(60, 20);
        jTextFieldNumero.setSize(130, 20);
        jLabelTabuada.setSize(100, 100);
        jScrollPaneTabuada.setSize(200, 300);
        jButtonTabuada.setSize(200, 60);
    }

    @Override
    public void gerarLocalização() {

        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(65, 10);
        jLabelTabuada.setLocation(10, 100);
        jScrollPaneTabuada.setLocation(10, 160);
        jButtonTabuada.setLocation(10,50);
    }

    private void configurarScrollPane() {
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setEditable(false); //não permite editar JTextArea
        jTextAreaTabuada.setBackground(Color.LIGHT_GRAY);

    }

    private void acaoButtonTabuada() {

        jButtonTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (jTextFieldNumero.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "!! Campo está vazio !!");
                    return;
                }

                int numero = 0, resultado = 0;
                String texto = "";

                try {
                    numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "!! Entrada Inválida !!",
                            "AVISO", JOptionPane.WARNING_MESSAGE);
                    return;

                }

                for (int i = 1; i <= 20; i++) {
                    resultado = numero * i;
                    texto += "\n" + numero + " x " + i + " = " + resultado;
                    jTextAreaTabuada.setText(texto);

                }

            }

        });

    }

}
