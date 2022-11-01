import javax.swing.*;
import java.awt.*;

public class SimpleGUI {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private int width;
    private int height;

    public SimpleGUI(int height, int width){
        frame = new JFrame();
        panel = new JPanel(new GridLayout(1,2));
        button1 = new JButton("yes");
        button2 = new JButton("no");
        this.width = width;
        this.height = height;

    }

    public void setUpGUI(){
        frame.setSize(width,height);
        frame.setTitle("hello <3");
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
