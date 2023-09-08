package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

//
class GraphicsPanel extends JPanel {
    private static final Color
            BACKGROUND_COLOR = new Color(10, 30, 60),
            TEXT_COLOR = new Color(200, 170, 180);

    //
    protected GraphicsPanel() {
        setBackground(BACKGROUND_COLOR);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(TEXT_COLOR);
        g.drawString("message", 200, 200);
    }
}