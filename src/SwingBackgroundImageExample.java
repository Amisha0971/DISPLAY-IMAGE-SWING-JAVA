

import javax.swing.*;
import java.awt.*;

public class SwingBackgroundImageExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Background Image Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Set the size of the JFrame
            frame.setSize(400, 300);

            // Create a JPanel with a background image
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Image image = new ImageIcon("C:\\Users\\USER\\OneDrive\\Pictures\\Camera Roll\\Swing-In-Java.jpg").getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            panel.setLayout(null);

            // Set the layout manager for the panel
     //       panel.setLayout(new BorderLayout());

            // Add other components to the panel
            // ...

            // Add the panel to the frame
            frame.add(panel);

            // Set the frame visible
            frame.setVisible(true);
        });
    }
}
