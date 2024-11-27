import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Teste {
    private static JFrame jFrame;
    
        public static void main(String[] args){
            jFrame = new JFrame("Monitorar");
            jFrame.setSize(246, 410);
            jFrame.setResizable(false);
            jFrame.setLayout(null);
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try{
            jFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Dw_0zPdVsAA6GsK.jpg")))));
            jFrame.setIconImage(new ImageIcon("").getImage());
        }catch(IOException e){
            System.out.println("teste");
        }

    }
}
