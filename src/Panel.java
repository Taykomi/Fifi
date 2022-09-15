import java.awt.Graphics;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

    Scanner scanner = new Scanner(System.in);

    int i = scanner.nextInt(); // To choose how much of the Fibonnaci sequel will appear.

    int fWidth = 500; // Frame dimension (Can be changed)
    int fHeight = 500;

    Panel() {
        this.setPreferredSize(new Dimension(fWidth, fHeight));

    }

    public void paint(Graphics g) { // This will make our axises and points

        int j; // This will help us store the units of the Fibo. sequel into the r array.
        int x = 0; // Part of the formula to get the sequel.
        int y = 1; // Part of the formula to get the sequel.
        int z; // Part of the formula to get the sequel.

        /*
         * i = Integer.parseInt(JOptionPane.showInputDialog(null, "How many ?")); I just
         * can't make this part work. The optionpane bugs into the frame once fulfilled.
         */

        // i = 20; To work with in order to quickly juggle between editing and running.

        int[] r = new int[i]; // The array to stash the values.

        for (j = 0; j < i; j++) { // Calculates each of the Fibo. sequel "i" many times

            z = y + x;
            x = y;
            y = z;

            r[j] = z; // Stocks the values.

        }

        Graphics2D g2D = (Graphics2D) g; // Will draw our values onto a panel.
        g2D.setColor(Color.black);
        g2D.drawLine(10, (fHeight - 10), 10, 10); // Vertical line
        g2D.drawLine(10, (fHeight - 10), (fWidth - 10), (fHeight - 10)); // Horizontal line
        for (int k = 0; k < i; k++) { /*
                                       * For each "k" (our "x" value [which goes up to how far into the sequel we
                                       * chose)] a "y" value will be assigned and drawn onto the panel.
                                       */

            g2D.drawRoundRect(10 + (20 * (k + 1)), (fHeight - 10) - (r[k]), 1, 1, 1, 1);
        }
    }
}
