import java.util.ArrayList;

public class DotCom
{
  private ArrayList<String> locationCells = new ArrayList<String>();
  int                       numOfHits     = 0;

  public String checkYourself(String stringGuess)
  {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";

    int index = locationCells.indexOf(stringGuess);
    if (index >= 0)
    {
      locationCells.remove(index);
      if (locationCells.isEmpty())
      {
        result = "kill";
      } else
      {
        result = "hit";
      }
    }
    System.out.println(result);
    return result;
  }

  public void setLocationCells(int[] locations)
  {

    for (int loc : locations)
    {
      locationCells.add(String.valueOf(loc));
    }
  }
}
