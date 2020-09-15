package javaguiapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUIApplication extends JFrame {
    private JPanel panel;                                           // Content Panel
    private JPanel c_panel;
    
    public JavaGUIApplication() {
        super("Button Test");                                       // Set Window Title
        setSize(500, 500);                                          // Set Window Size
        panel = new JPanel();                                       // Create Panel
        JPanel n_panel = new JPanel();
        JPanel s_panel = new JPanel();
        JPanel e_panel = new JPanel();
        JPanel w_panel = new JPanel();
        c_panel = new JPanel();
        
        n_panel.setBackground(Color.BLUE);
        s_panel.setBackground(Color.RED);
        e_panel.setBackground(Color.GREEN);
        w_panel.setBackground(Color.YELLOW);
        c_panel.setBackground(new Color(255, 255, 255));

        add(n_panel, BorderLayout.NORTH);
        add(s_panel, BorderLayout.SOUTH);
        add(e_panel, BorderLayout.EAST);
        add(w_panel, BorderLayout.WEST);
        add(c_panel, BorderLayout.CENTER);
        
        JButton yellow = new JButton("Yellow");                     // Create Buttons
        JButton blue = new JButton("Blue");
        JButton red = new JButton("Red");
        yellow.addActionListener(new JavaGUIListener(Color.YELLOW));
        blue.addActionListener(new JavaGUIListener(Color.BLUE));
        red.addActionListener(new JavaGUIListener(Color.RED));

        panel.add(yellow);                                          // Add Buttons to Panel
        panel.add(blue);
        panel.add(red);
        add(panel);
        
        //panel.setBackground(Color.RED);                           // Set Background Color for Buttons
        //add(panel, BorderLayout.NORTH);                           // Where Buttons are in Window
}
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JavaGUIApplication window = new JavaGUIApplication();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
        });
    }
    
    private class JavaGUIListener implements ActionListener {
        private Color background;
        
        public JavaGUIListener(Color c) {
            this.background = c;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(background);
        }
    }
    
}
