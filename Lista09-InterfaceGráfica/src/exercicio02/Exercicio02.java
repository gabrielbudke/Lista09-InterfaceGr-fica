package exercicio02;

import exercicio01.ExercicioBaseInterface;
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
public class Exercicio02 implements ExercicioBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public Exercicio02() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensões();
        gerarLocalização();
        acaoButtonTabuada();
        
        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(250, 200);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);

    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número:");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Gerar Tabuada");
    }

    @Override
    public void gerarDimensões() {
        jLabelNumero.setSize(50, 10);
        jTextFieldNumero.setSize(100, 15);
        jButtonTabuada.setSize(120, 30);
    }

    @Override
    public void gerarLocalização() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(65, 10);
        jButtonTabuada.setLocation(55, 40);

    }
    
    private void acaoButtonTabuada(){
        jButtonTabuada.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "!!Campo Número está em branco!!", "AVISO", 
                            JOptionPane.WARNING_MESSAGE);
                }
                
                int numero = 0;
                try{
                    numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Entrada Inválida");
                    
                
                }
            }
        });
    }

}
