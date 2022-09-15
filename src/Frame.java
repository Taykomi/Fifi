
import javax.swing.*;

public class Frame extends JFrame {

    Panel panel;

    Frame() { // The frame hosts the panel, the stuff happens there.
        panel = new Panel();

        this.add(panel); // Just the basic stuff so the frame looks ok and is centered.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
