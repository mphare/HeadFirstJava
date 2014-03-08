import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleChatClientA
{

  JTextField  outgoing;
  PrintWriter writer;
  Socket      sock;

  public void go()
  {
    JFrame frame = new JFrame("Ludicrously Simple Chat Client");
    JPanel mainPanel = new JPanel();
    outgoing = new JTextField(20);
    JButton sendButton = new JButton("Send");
    sendButton.addActionListener(new SendButtonListener());
    mainPanel.add(outgoing);
    mainPanel.add(sendButton);
    frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
    setUpNetworking();
    frame.setSize(400, 500);
    frame.setVisible(true);
  }

  private void setUpNetworking()
  {
    try
    {
      sock = new Socket("127.0.0.1", 4242);
      writer = new PrintWriter(sock.getOutputStream());
      System.out.println("network established");
    } catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  public class SendButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent a)
    {
      try
      {
        writer.println(outgoing.getText());
        writer.flush();
      } catch (Exception ex)
      {
        ex.printStackTrace();
      }
      outgoing.setText("");
      outgoing.requestFocus();
    }
  }

  public static void main(String[] args)
  {
    new SimpleChatClientA().go();

  }

}
