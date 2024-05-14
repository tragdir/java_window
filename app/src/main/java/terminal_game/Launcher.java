package terminal_game;

import javax.swing.SwingUtilities;

public class Launcher {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow();
                window.show();
            }
        });
    }
}
