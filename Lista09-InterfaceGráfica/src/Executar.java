
import java.awt.EventQueue;

/**
 * @author Gabriel Budke
 */

public class Executar {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Menu();
            }
        });
        
    }
    
}
