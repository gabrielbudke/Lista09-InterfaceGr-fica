
import exercicio01.ExercicioBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Gabriel
 */
public class Menu implements ExercicioBaseInterface {

    private JLabel fundo;
    private JFrame jFrame;
    private JButton exercicio01,
            exercicio02,
            exercicio03,
            exercicio04,
            exercicio05,
            exercicio06,
            exercicio07,
            exercicio08,
            exercicio09;

    public Menu() {
        gerarTela();
        instanciarComponentes();
        gerarDimensões();
        gerarLocalização();
        adicionarComponentes();
        acaoExercicio01();
        acaoExercicio02();
        acaoExercicio03();
        acaoExercicio04();

        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame();
        jFrame.setSize(640, 359);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(exercicio01);
        jFrame.add(exercicio02);
        jFrame.add(exercicio03);
        jFrame.add(exercicio04);
        jFrame.add(exercicio05);
        jFrame.add(exercicio06);
        jFrame.add(exercicio07);
        jFrame.add(exercicio08);
        jFrame.add(exercicio09);
        jFrame.add(fundo);
    }

    @Override
    public void instanciarComponentes() {
        exercicio01 = new JButton("Exercicio01");
        exercicio02 = new JButton("Exercicio02");
        exercicio03 = new JButton("Exercicio03");
        exercicio04 = new JButton("Exercicio04");
        exercicio05 = new JButton();
        exercicio06 = new JButton();
        exercicio07 = new JButton();
        exercicio08 = new JButton();
        exercicio09 = new JButton();

        fundo = new JLabel(new ImageIcon(Menu.class.getResource("/imagens/madeira.jpg")));
    }

    @Override
    public void gerarDimensões() {
        exercicio01.setSize(120, 40);
        exercicio02.setSize(120, 40);
        exercicio03.setSize(120, 40);
        exercicio04.setSize(120, 40);

        /*
         exercicio05.setSize(100, 100);
         exercicio06.setSize(100, 100);
         exercicio07.setSize(100, 100);
         exercicio08.setSize(100, 100);
         exercicio09.setSize(100, 100);*/
        fundo.setSize(640, 359);

    }

    @Override
    public void gerarLocalização() {
        exercicio01.setLocation(15, 10);
        exercicio02.setLocation(140, 10);
        exercicio03.setLocation(265, 10);
        exercicio04.setLocation(390, 10);

        /*
         exercicio05.setLocation(90, 30);
         exercicio06.setLocation(110, 30);
         exercicio07.setLocation(130, 30);
         exercicio08.setLocation(150, 30);
         exercicio09.setLocation(170, 30);
         */
        fundo.setLocation(0, 0);
    }

    private void acaoExercicio01() {
        exercicio01.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new exercicio01.Exercicio01();
            }

        });
    }

    private void acaoExercicio02() {
        exercicio02.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new exercicio02.Exercicio02();
            }

        });

    }

    private void acaoExercicio03() {
        exercicio03.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new exercicio03.Exercicio03();
            }

        });

    }

    private void acaoExercicio04() {
        exercicio04.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new exercicio04.Exercicio04();
            }

        });

    }

    private void acaoExercicio05() {
    }

    private void acaoExercicio07() {
    }

    private void acaoExercicio08() {
    }

    private void acaoExercicio09() {
    }

}
