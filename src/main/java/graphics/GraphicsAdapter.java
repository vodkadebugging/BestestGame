package graphics;

import javax.swing.JFrame;

import org.jetbrains.annotations.NotNull;

import data.Data;

//
public class GraphicsAdapter {
    //
    public GraphicsAdapter(@NotNull Data data) {
        new Window(data);
    }

    private static class Window extends JFrame {
        private static final int[]
                WINDOW_LOCATION = {500, 300},
                WINDOW_SIZE = {700, 600};

        protected Window(@NotNull Data data) {
            super();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(WINDOW_LOCATION[0], WINDOW_LOCATION[1]);
            setSize(WINDOW_SIZE[0], WINDOW_SIZE[1]);
            addWindowListener(new WindowListener(this));
            add(new GraphicsPanel(data));
            setVisible(true);
        }
    }
}