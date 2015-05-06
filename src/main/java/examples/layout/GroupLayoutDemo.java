package examples.layout;

import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;

public class GroupLayoutDemo extends JFrame {

    public GroupLayoutDemo() {
        JLabel label = new JLabel("Find What:");
        JTextField textField = new JTextField();
        JCheckBox caseCheckBox = new JCheckBox("Match Case");
        JCheckBox wrapCheckBox = new JCheckBox("Wrap Around");
        JCheckBox wholeCheckBox = new JCheckBox("Whole Words");
        JCheckBox backCheckBox = new JCheckBox("Search Backwards");
        JButton findButton = new JButton("Find");
        JButton cancelButton = new JButton("Cancel");

        caseCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wrapCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wholeCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        backCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addGroup(layout.createParallelGroup(LEADING)
                                .addComponent(textField)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(LEADING)
                                                .addComponent(caseCheckBox)
                                                .addComponent(wholeCheckBox))
                                        .addGroup(layout.createParallelGroup(LEADING)
                                                .addComponent(wrapCheckBox)
                                                .addComponent(backCheckBox))))
                        .addGroup(layout.createParallelGroup(LEADING)
                                .addComponent(findButton)
                                .addComponent(cancelButton))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(BASELINE)
                                .addComponent(label)
                                .addComponent(textField)
                                .addComponent(findButton))
                        .addGroup(layout.createParallelGroup(LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(BASELINE)
                                                .addComponent(caseCheckBox)
                                                .addComponent(wrapCheckBox))
                                        .addGroup(layout.createParallelGroup(BASELINE)
                                                .addComponent(wholeCheckBox)
                                                .addComponent(backCheckBox)))
                                .addComponent(cancelButton))
        );

        setTitle("Find");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(MetalLookAndFeel.class.getName());
//                    UIManager.setLookAndFeel(MotifLookAndFeel.class.getName());
//                    UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
//                    UIManager.setLookAndFeel(SynthLookAndFeel.class.getName());
//                    UIManager.setLookAndFeel(WindowsLookAndFeel.class.getName());
//                    UIManager.setLookAndFeel(WindowsClassicLookAndFeel.class.getName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new GroupLayoutDemo().setVisible(true);
            }
        });
    }
} 