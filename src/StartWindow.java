import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow implements ActionListener {
    // Components
    private JPanel panel;
    private JFrame frame;
    private JButton button;
    private JLabel label1;
    private JLabel label2;

    // Constructor
    public StartWindow() {
        button = new JButton("Start Chatting");
        button.setPreferredSize(new Dimension(40,55));

        label1 = new JLabel("<html> Welcome to the Chatty Bot! <br><br>");
        label1.setFont(new Font("Courier New", Font.BOLD, 18));
        label1.setForeground(Color.DARK_GRAY);

        label2 = new JLabel("Created by a lazy student", JLabel.CENTER);
        label2.setFont(new Font("Courier New", Font.PLAIN, 13));

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(40, 50, 5, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label1);
        panel.add(button);
        panel.add(Box.createGlue());
        panel.add(label2);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Simple Chatty Bot");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
