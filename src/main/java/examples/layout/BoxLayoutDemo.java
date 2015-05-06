package examples.layout;

import java.awt.Component;
import java.awt.Container; 
import javax.swing.BoxLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
 
public class BoxLayoutDemo { 
    public static void addComponentsToPane(Container pane) { 
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS)); 
        addAButton("Button 1", pane); 
        addAButton("Button 2", pane); 
        addAButton("Button 3", pane); 
        addAButton("Long-Named Button 4", pane); 
        addAButton("5", pane); 
    } 
     
    private static void addAButton(String text, Container container) { 
        JButton button = new JButton(text); 
        button.setAlignmentX(Component.CENTER_ALIGNMENT); 
        container.add(button); 
    } 
     
    private static void createAndShowGUI() { 
        // Создание фрейма 
        JFrame frame = new JFrame("BoxLayoutDemo"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        addComponentsToPane(frame.getContentPane()); 
 
        frame.pack(); 
        frame.setVisible(true); 
    } 
 
    public static void main(String[ ] args) { 
        // запустить приложение 
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                createAndShowGUI(); 
            } 
        }); 
    } 
} 