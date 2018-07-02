package exercicio05;

import exercicio01.ExercicioBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Gabriel Budke
 */
public class Exercicio05 implements ExercicioBaseInterface {

    private JFrame jFrame;
    private JButton jButtonSomar, jButtonSubtrair, jButtonDividir, jButtonMultiplicar;
    private JLabel jLabelNumero01, jLabelNumero02, jLabelResultado;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JTextArea jTextAreaResultado;

    private double n1 = 0, n2 = 0,
            somar = 0,
            sub = 0,
            multiplica = 0,
            dividir = 0;

    
    public Exercicio05() {
        gerarTela();
        instanciarComponentes();
        gerarDimensões();
        gerarLocalização();
        adicionarComponentes();
        acaoButtonSomar();
        acaoButtonSubtrair();
        acaoButtonMultiplicar();
        acaoButtonDividir();
        
        jFrame.setVisible(true);

    }
    
    
    
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exercicio05");
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {

        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);

        jFrame.add(jTextFieldNumero01);
        jFrame.add(jTextFieldNumero02);

        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);

    }

    

    @Override
    public void instanciarComponentes() {
        jButtonSomar = new JButton("Somar");
        jButtonSubtrair = new JButton("Subtrair");
        jButtonMultiplicar = new JButton("Multiplicar");
        jButtonDividir = new JButton("Dividir");

        jLabelNumero01 = new JLabel("Número:");
        jLabelNumero02 = new JLabel("Número:");
        
        jTextFieldNumero01 = new JTextField();
        jTextFieldNumero02 = new JTextField();
    }

    @Override
    public void gerarDimensões() {

        jLabelNumero01.setSize(50, 20);
        jLabelNumero02.setSize(50, 20);

        jTextFieldNumero01.setSize(130, 20);
        jTextFieldNumero02.setSize(130, 20);


        jButtonSomar.setSize(150, 40);
        jButtonSubtrair.setSize(150, 40);
        jButtonDividir.setSize(150, 40);
        jButtonMultiplicar.setSize(150, 40);
    }

    @Override
    public void gerarLocalização() {
        jLabelNumero01.setLocation(10, 10);
        jLabelNumero02.setLocation(10, 60);

        jTextFieldNumero01.setLocation(10, 30);
        jTextFieldNumero02.setLocation(10, 80);

        jButtonSomar.setLocation(50, 50);
        jButtonSubtrair.setLocation(80, 50);
        jButtonDividir.setLocation(110, 50);
        jButtonMultiplicar.setLocation(140, 50);
    }

    private void acaoButtonSomar() {
        jButtonSomar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                validacao();

                somar += n1 + n2;
                
                
                sub += n1 - n2;
                multiplica += n1 - n2;
                dividir += n1 / n2;

            }
        });
    }

    private void acaoButtonSubtrair() {
        jButtonSubtrair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    private void acaoButtonMultiplicar() {
        jButtonMultiplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    private void acaoButtonDividir() {
        jButtonDividir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void validacao() {

        if (jTextFieldNumero01.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "!! Campo está vazio !!", "AVISO",
                    JOptionPane.WARNING_MESSAGE);
            jTextFieldNumero01.requestFocus();
            return;
        }

        if (jTextFieldNumero02.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "!! Campo está vazio !!", "AVISO",
                    JOptionPane.WARNING_MESSAGE);
            jTextFieldNumero02.requestFocus();
            return;
        }

        try {
            n1 = Double.parseDouble(jTextFieldNumero01.getText().trim());
            n2 = Double.parseDouble(jTextFieldNumero02.getText().trim());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "!! Entrada Inválida !!", "AVISO",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

    }

}
