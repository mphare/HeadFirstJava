import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGUI3 implements ActionListener
{

  JFrame  frame  = null;
  JButton button = null;

  public static void main(String[] args)
  {
    SimpleGUI3 gui = new SimpleGUI3();
    gui.go();
  }

  public void go()
  {
    frame = new JFrame();
    button = new JButton("Change Color");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    button.addActionListener(this);
    MyDrawPanel panel = new MyDrawPanel();

    frame.getContentPane().add(BorderLayout.SOUTH, button);
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    frame.setSize(300, 300);
    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent event)
  {
    frame.repaint();
  }

}
