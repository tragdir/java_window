package terminal_game;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Canvas;

public class MainWindow {

    private JFrame frame;

    public MainWindow() {
        initialize();
    }

    public void show() {
        // sets window to visible
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Demo");

        // set what the X does
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // one of many components to the window
        frame.getContentPane().add(new Canvas());
        frame.getContentPane().add(new JLabel("Test Label"), BorderLayout.CENTER);

        frame.pack();
        // center the window on spawn
        frame.setLocationRelativeTo(null);
    }
}
