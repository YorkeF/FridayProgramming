import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nov_4_2022 {
    public static void main(String[] args) {
        myCanvas();
    }
    public static void myCanvas() {
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        window.add(panel);
        panel.setLayout(new FlowLayout());

        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton yellow = new JButton("Yellow");
        JButton blue = new JButton("Blue");

        ActionListener colors = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(red)){ panel.setBackground(Color.RED); window.repaint(); }
                if(e.getSource().equals(green)){ panel.setBackground(Color.GREEN); window.repaint(); }
                if(e.getSource().equals(yellow)){ panel.setBackground(Color.YELLOW); window.repaint(); }
                if(e.getSource().equals(blue)){ panel.setBackground(Color.BLUE); window.repaint(); }
            }
        };

        panel.add(red); panel.add(green); panel.add(yellow); panel.add(blue);

        red.addActionListener(colors); green.addActionListener(colors);
        yellow.addActionListener(colors); blue.addActionListener(colors);

        window.pack(); window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}