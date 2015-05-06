package examples.layout;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
 
public class CardLayoutDemo implements ItemListener { 
    JPanel cards; 
    final static String BUTTONPANEL = "Card with JButtons"; 
    final static String TEXTPANEL = "Card with JTextField"; 
     
    public void addComponentToPane(Container pane) { 
        // поместить JComboBox в JPanel для наглядности. 
        JPanel comboBoxPane = new JPanel(); 
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL }; 
        JComboBox cb = new JComboBox(comboBoxItems); 
        cb.setEditable(false); 
        cb.addItemListener(this); 
        comboBoxPane.add(cb); 
 
        // Создание "cards". 
        JPanel card1 = new JPanel(); 
        card1.add(new JButton("Button 1")); 
        card1.add(new JButton("Button 2")); 
        card1.add(new JButton("Button 3")); 
 
        JPanel card2 = new JPanel(); 
        card2.add(new JTextField("TextField", 20)); 
         
        // Создаем панель 
        cards = new JPanel(new CardLayout()); 
        cards.add(card1, BUTTONPANEL); 
        cards.add(card2, TEXTPANEL); 
 
        pane.add(comboBoxPane, BorderLayout.PAGE_START); 
        pane.add(cards, BorderLayout.CENTER); 
    } 
     
    public void itemStateChanged(ItemEvent evt) { 
        CardLayout cl = (CardLayout)(cards.getLayout()); 
        cl.show(cards, (String)evt.getItem()); 
    } 
     
    private static void createAndShowGUI() { 
        // Создание и настройка окна 
        JFrame frame = new JFrame("CardLayoutDemo"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        CardLayoutDemo demo = new CardLayoutDemo(); 
        demo.addComponentToPane(frame.getContentPane()); 
         
        // Показ окна 
        frame.pack(); 
        frame.setVisible(true); 
    } 
     
    public static void main(String[] args) { 
        try { 
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
        } catch (UnsupportedLookAndFeelException ex) { 
            ex.printStackTrace(); 
        } catch (IllegalAccessException ex) { 
            ex.printStackTrace(); 
        } catch (InstantiationException ex) { 
            ex.printStackTrace(); 
        } catch (ClassNotFoundException ex) { 
            ex.printStackTrace(); 
        } 
 
        UIManager.put("swing.boldMetal", Boolean.FALSE); 
 
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                createAndShowGUI(); 
            } 
        }); 
    } 
} 