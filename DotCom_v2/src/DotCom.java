import java.util.ArrayList;

public class DotCom
{
  private ArrayList<String> locationCells;
  private String            name = null;

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setLocationCells(ArrayList<String> loc)
  {
    locationCells = loc;
  }

  public String checkYourself(String userInput)
  {
    String result = "miss";

    int index = locationCells.indexOf(userInput);

    if (index >= 0)
    {
      locationCells.remove(index);

      if (locationCells.isEmpty())
      {
        result = "kill";
        System.out.println("Ouch! You sunk " + name + " : (");
      } else
      {
        result = "hit";
      }
    }

    return result;
  }
}
