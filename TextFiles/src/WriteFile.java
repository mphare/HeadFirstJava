import java.io.FileWriter;

public class WriteFile
{

  public static void main(String[] args)
  {
    try
    {
      String str = "This is what I intend to write to the file this time";

      FileWriter writer = new FileWriter("Foo.txt");
      writer.write(str);
      writer.close();
    } catch (Exception ex)
    {
      ex.printStackTrace();
    }

  }
}
