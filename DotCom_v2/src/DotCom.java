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
}
