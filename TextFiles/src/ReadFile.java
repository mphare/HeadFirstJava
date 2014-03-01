import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile
{

  public static void main(String[] args)
  {
    try
    {
      File myFile = new File("Foo.txt");
      FileReader fileReader = new FileReader(myFile);
      BufferedReader reader = new BufferedReader(fileReader);

      String str = null;

      while ((str = reader.readLine()) != null)
      {
        System.out.println(str);
      }
      reader.close();

    } catch (Exception ex)
    {
      ex.printStackTrace();
    }

  }
}
