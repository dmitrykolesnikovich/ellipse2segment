package e2s;

import javax.swing.*;

public class MainForm {

  public JPanel rootPanel;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Ellipse to Segment");
    frame.setContentPane(new MainForm().rootPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(600, 600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }


  private void createUIComponents() {
    rootPanel = new MyPanel();
  }
}
