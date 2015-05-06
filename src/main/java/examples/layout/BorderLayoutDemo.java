package examples.layout;

import java.awt.BorderLayout;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
 
public class BorderLayoutDemo { 
    public static void main(String[] args) { 
        // создаем фрейм и устанавливаем его размер. 
        JFrame jf = new JFrame(); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jf.setSize(400, 300); 
        jf.setVisible(true); 
 
        // создаем панель. 
        JPanel p = new JPanel(); 
        jf.add(p); 
 
        // к панели добавляем менеджер BorderLayout. 
        p.setLayout(new BorderLayout()); 
 
        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение. 
        p.add(new JButton("NORTH"), BorderLayout.NORTH);
        p.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        p.add(new JButton("EAST"), BorderLayout.EAST);
        p.add(new JButton("WEST"), BorderLayout.WEST);
        p.add(new JButton("CENTER"), BorderLayout.CENTER);
    }
} 