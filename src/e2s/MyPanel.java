package e2s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel {

  private Segment segment;
  private Ellipse ellipse;

  public MyPanel() {
    segment = new Segment(0, 0, 100, 100);
    ellipse = new Ellipse(300, 300, 50, 50, 0);
    KeyboardFocusManager.getCurrentKeyboardFocusManager()
      .addKeyEventDispatcher(new KeyEventDispatcher() {
        @Override
        public boolean dispatchKeyEvent(KeyEvent event) {
          if (event.getID() == KeyEvent.KEY_PRESSED) {
            if (event.getKeyCode() == KeyEvent.VK_SPACE) {
              ellipse.angle += 5;
              return true;
            }
          }
          return false;
        }
      });
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    segment.paint(g);
    ellipse.paint(g);
    Point[] points = Formula.getPoints(segment, ellipse);
    for (Point point : points) {
      g.setColor(Color.green);
      g.fillOval(point.x - 6, point.y - 6, 12, 12);
      g.setColor(Color.black);
    }
    repaint();
  }

}
