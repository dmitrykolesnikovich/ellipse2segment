package e2s;

import java.awt.*;

public class Ellipse {

  public float x0;
  public float y0;
  public float a;
  public float b;
  public float angle; // in degrees

  public Ellipse(float x0, float y0, float a, float b, float angle) {
    this.x0 = x0;
    this.y0 = y0;
    this.a = a;
    this.b = b;
    this.angle = angle;
  }

  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.fillOval((int) (x0 - 2), (int) (y0 - 2), 4, 4);

    float x = x0 - a;
    float y = y0 - b;
    g2d.setColor(Color.blue);
    g2d.rotate(Math.toRadians(angle), x0, y0);
    g2d.drawOval((int) x, (int) y, (int) (2 * a), (int) (2 * b));
    g2d.rotate(Math.toRadians(-angle), x0, y0);
    g2d.setColor(Color.black);
  }

}
