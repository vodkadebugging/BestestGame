package graphics;

import javax.swing.*;
import java.awt.*;

public class GraphicsAdapter {

    public GraphicsAdapter() {
        new Window();
    }

    private static class Window extends JWindow {
        Window() {
            super();
            setLocation(500, 300);
            setSize(700, 600);
            addWindowListener(new WindowListener(this));
            add(new Panel());
            setVisible(true);
        }
    }

    private static class Panel extends JPanel {
        private static final Color
                BACKGROUND_COLOR = new Color(10, 30, 60),
                TEXT_COLOR = new Color(200, 170, 180);

        Panel() {
            setBackground(BACKGROUND_COLOR);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(TEXT_COLOR);
            g.drawString("message", 200, 200);
        }
    }

}