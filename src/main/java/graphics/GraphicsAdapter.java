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
        Panel() {
            setBackground(Color.CYAN);
        }
    }

}