import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        this.setTitle("2048 Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(340, 400);
        this.setResizable(false);

        this.add(new Game2048());

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
