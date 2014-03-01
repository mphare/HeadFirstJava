import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadPlayer
{

  public static void main(String[] args)
  {

    try
    {
      ObjectInputStream is = new ObjectInputStream(new FileInputStream("Player.ser"));
      Player p1 = (Player) is.readObject();
      Player p2 = (Player) is.readObject();

      System.out.println("One:");
      System.out.println(" - Name: " + p1.getName());
      System.out.println(" - Age: " + p1.getAge());
      System.out.println(" - Strength: " + p1.getStrength());
      System.out.println(" - Agility: " + p1.getAgility());
      System.out.println(" - Magic: " + p1.getMagic());
      System.out.println("Two");
      System.out.println(" - Name: " + p2.getName());
      System.out.println(" - Age: " + p2.getAge());
      System.out.println(" - Strength: " + p2.getStrength());
      System.out.println(" - Agility: " + p2.getAgility());
      System.out.println(" - Magic: " + p2.getMagic());

    } catch (Exception ex)
    {
      ex.printStackTrace();
    }

  }
}
