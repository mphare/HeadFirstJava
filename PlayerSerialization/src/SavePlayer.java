import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SavePlayer
{

  public static void main(String[] args)
  {

    Player p1 = new Player("Bin", 434, 187, 234, 567);
    Player p2 = new Player("Serin", 23, 200, 300, 10);

    try
    {
      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Player.ser"));
      os.writeObject(p1);
      os.writeObject(p2);
      os.close();
    } catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
