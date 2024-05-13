package terminal_game;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Canvas;

public class EntryPoint {
    public static void main(String[] args) {
        // create the frame
        JFrame frame = new JFrame("Demo");

        // set what the X does
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // one of many components to the window
        frame.getContentPane().add(new JLabel(""), BorderLayout.CENTER);
        frame.getContentPane().add(new Canvas());

        // sets the size of the frame to the lowest possible with available components
        frame.setSize(400, 400);

        // center the window on spawn
        frame.setLocationRelativeTo(null);

        // sets window to visible
        frame.setVisible(true);
    }
}
