package examples;

import javax.swing.*;
import java.awt.*;

public class SimpleLayoutMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Layout Example");
        JPanel panel = new JPanel();
        //panel.setBackground(Color.PINK);
        panel.setPreferredSize(new Dimension(300, 200));
        JLabel label = new JLabel("Smile!!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
