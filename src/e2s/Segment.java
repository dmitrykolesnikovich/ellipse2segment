package e2s;

import java.awt.*;

public class Segment {

  public float x1;
  public float y1;
  public float x2;
  public float y2;

  public Segment(float x1, float y1, float x2, float y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillOval((int) (x1 - 2), (int) (y1 - 2), 4, 4);
    g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    g.fillOval((int) (x2 - 2), (int) (y2 - 2), 4, 4);
    g.setColor(Color.black);
  }

}
