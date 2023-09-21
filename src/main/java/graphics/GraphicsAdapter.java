package graphics;

import javax.swing.JFrame;

//
public class GraphicsAdapter {
    //
    public GraphicsAdapter() {
        new Window();
    }

    private static class Window extends JFrame {
        private static final int[]
                WINDOW_LOCATION = {500, 300},
                WINDOW_SIZE = {700, 600};

        protected Window() {
            super();
            setLocation(WINDOW_LOCATION[0], WINDOW_LOCATION[1]);
            setSize(WINDOW_SIZE[0], WINDOW_SIZE[1]);
            addWindowListener(new WindowListener(this));
            add(new GraphicsPanel());
            setVisible(true);
        }
    }
}