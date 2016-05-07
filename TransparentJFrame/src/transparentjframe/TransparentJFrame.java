package transparentjframe;

import java.awt.Color;
import javax.swing.JFrame;

/*
 * @author Admin
 */
public class TransparentJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransparentJFrame.buildWindow(0.6F);
    }
    
    private static JFrame buildWindow(Float opacity){                                          //building the JFrame
        JFrame frame = new JFrame();                //new jFrame
        frame.setUndecorated(true);                 
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  //Fullscreen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //terminate  when closed
        frame.setOpacity(opacity);                              //transparency
        frame.getContentPane().setBackground(Color.BLACK);      //setting a colour
        frame.setLayout(null);
        frame.setVisible(true);                                    //visible true
        return frame;
    }
}
