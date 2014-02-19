import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGUI1 implements ActionListener
{

  JButton button = null;

  public static void main(String[] args)
  {

    SimpleGUI1 gui = new SimpleGUI1();
    gui.go();
  }

  public void go()
  {
    JFrame frame = new JFrame();
    button = new JButton("Click Me");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    button.addActionListener(this);

    frame.getContentPane().add(button);
    frame.setSize(300, 300);
    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent event)
  {
    button.setText("I've been clicked");
  }

}
