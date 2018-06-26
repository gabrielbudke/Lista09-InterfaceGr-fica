package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel Budke
 */
public class Exercicio01 implements ExercicioBaseInterface{
    
    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;

    
    public Exercicio01(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensões();
        gerarLocalização();
        acaoButtonConcatenar();
        
        jFrame.setVisible(true);
    }
    
    
    
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(250,200);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
    
    }

    @Override
    public void instanciarComponentes() {
        
        jLabelNome = new JLabel("Nome:");
        jLabelSobrenome = new JLabel("Sobrenome:");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");        
        
    }

    @Override
    public void gerarDimensões() {
        jLabelNome.setSize(50,10);
        jLabelSobrenome.setSize(100,10);
        jTextFieldNome.setSize(100,20);
        jTextFieldSobrenome.setSize(100,20);
        jButtonConcatenar.setSize(100,25);
        
    }

    @Override
    public void gerarLocalização() {
        jLabelNome.setLocation(10,10);
        jTextFieldNome.setLocation(10,30);
        jLabelSobrenome.setLocation(120,10);
        jTextFieldSobrenome.setLocation(120,30);
        jButtonConcatenar.setLocation(60, 60);
    }

    private void acaoButtonConcatenar() {
        
        jButtonConcatenar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String nome = jTextFieldNome.getText().trim();
                String sobrenome = jTextFieldSobrenome.getText().trim();
                
                if(nome.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo Nome está vazio!!", "AVISO", 
                            JOptionPane.WARNING_MESSAGE);
                    jTextFieldNome.requestFocus();
                    return;
                }
                
                if(sobrenome.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo Sobrenome está vazio!!", "AVISO", 
                            JOptionPane.WARNING_MESSAGE);
                    jTextFieldSobrenome.requestFocus();
                    return;
                }
                
                JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
                
                
            }
        });
        
        
        
        
    }
    
    
    
    
    
}
