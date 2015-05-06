package examples;

import javax.swing.*;

public class SimpleFrameMain {
    public static void main(String[] args) {
        SimpleFrame frame = new SimpleFrame("A Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class SimpleFrame extends JFrame {
    public SimpleFrame(String title) {
        super(title);
        setSize(300, 200);
    }
}

