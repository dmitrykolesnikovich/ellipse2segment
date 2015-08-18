package e2s;

import java.awt.*;

public class Formula {

  public static Point[] getPoints(Segment segment, Ellipse ellipse) {
    float a = ellipse.a;
    float b = ellipse.b;
    float A = segment.y1 - segment.y2;
    float B = segment.x2 - segment.x1;
    float C = segment.x1 * segment.y2 - segment.x2 * segment.y1;
    float x0 = ellipse.x0;
    float y0 = ellipse.y0;
    double cosa = Math.cos(Math.toRadians(ellipse.angle));
    double sina = Math.sin(Math.toRadians(ellipse.angle));
    double x1 = -(A * C * b * b - B * C * b * b * cosa - B * B * a * a * sina * a * x0 + A * B * b * b * y0 + A * C * a * a * cosa * a + B * a * b * Math.sqrt(A * A * a * a * cosa * a + A * A * b * b - A * A * cosa * cosa * cosa * cosa * x0 * x0 - 2 * A * A * cosa * a * sina * x0 * x0 - A * A * sina * a * x0 * x0 + 2 * A * B * a * a * cosa * sina - 2 * A * B * b * b * cosa - 2 * A * B * cosa * cosa * cosa * cosa * x0 * y0 - 4 * A * B * cosa * a * sina * x0 * y0 - 2 * A * B * sina * a * x0 * y0 - 2 * A * C * cosa * cosa * cosa * cosa * x0 - 4 * A * C * cosa * a * sina * x0 - 2 * A * C * sina * a * x0 + B * B * a * a * sina * a + B * B * b * b * cosa * a - B * B * cosa * cosa * cosa * cosa * y0 * y0 - 2 * B * B * cosa * a * sina * y0 * y0 - B * B * sina * a * y0 * y0 - 2 * B * C * cosa * cosa * cosa * cosa * y0 - 4 * B * C * cosa * a * sina * y0 - 2 * B * C * sina * a * y0 - C * C * cosa * cosa * cosa * cosa - 2 * C * C * cosa * a * sina - C * C * sina * a) - B * B * b * b * cosa * y0 - B * B * b * b * cosa * a * x0 + B * B * a * a * cosa * sina * y0 + B * C * a * a * cosa * sina + A * B * b * b * cosa * x0 + A * B * a * a * cosa * a * y0 - A * B * a * a * cosa * sina * x0) / (A * A * a * a * cosa * a + A * A * b * b + 2 * A * B * a * a * cosa * sina - 2 * A * B * b * b * cosa + B * B * a * a * sina * a + B * B * b * b * cosa * a);
    double y1 = -(A * x1 + C) / B;
    double x2 = -(A * C * b * b - B * C * b * b * cosa - B * B * a * a * sina * a * x0 + A * B * b * b * y0 + A * C * a * a * cosa * a - B * a * b * Math.sqrt(A * A * a * a * cosa * a + A * A * b * b - A * A * cosa * cosa * cosa * cosa * x0 * x0 - 2 * A * A * cosa * a * sina * x0 * x0 - A * A * sina * a * x0 * x0 + 2 * A * B * a * a * cosa * sina - 2 * A * B * b * b * cosa - 2 * A * B * cosa * cosa * cosa * cosa * x0 * y0 - 4 * A * B * cosa * a * sina * x0 * y0 - 2 * A * B * sina * a * x0 * y0 - 2 * A * C * cosa * cosa * cosa * cosa * x0 - 4 * A * C * cosa * a * sina * x0 - 2 * A * C * sina * a * x0 + B * B * a * a * sina * a + B * B * b * b * cosa * a - B * B * cosa * cosa * cosa * cosa * y0 * y0 - 2 * B * B * cosa * a * sina * y0 * y0 - B * B * sina * a * y0 * y0 - 2 * B * C * cosa * cosa * cosa * cosa * y0 - 4 * B * C * cosa * a * sina * y0 - 2 * B * C * sina * a * y0 - C * C * cosa * cosa * cosa * cosa - 2 * C * C * cosa * a * sina - C * C * sina * a) - B * B * b * b * cosa * y0 - B * B * b * b * cosa * a * x0 + B * B * a * a * cosa * sina * y0 + B * C * a * a * cosa * sina + A * B * b * b * cosa * x0 + A * B * a * a * cosa * a * y0 - A * B * a * a * cosa * sina * x0) / (A * A * a * a * cosa * a + A * A * b * b + 2 * A * B * a * a * cosa * sina - 2 * A * B * b * b * cosa + B * B * a * a * sina * a + B * B * b * b * cosa * a);
    double y2 = -(A * x2 + C) / B;
    return new Point[]{new Point((int) x1, (int) y1), new Point((int) x2, (int) y2)};
  }

}
