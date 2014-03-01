import java.io.Serializable;

public class Player implements Serializable
{
  String name;
  int    age;
  int    strength;
  int    agility;
  int    magic;

  public Player(String name, int age, int strength, int agility, int magic)
  {
    this.name = name;
    this.age = age;
    this.strength = strength;
    this.agility = agility;
    this.magic = magic;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getStrength()
  {
    return strength;
  }

  public void setStrength(int strength)
  {
    this.strength = strength;
  }

  public int getAgility()
  {
    return agility;
  }

  public void setAgility(int agility)
  {
    this.agility = agility;
  }

  public int getMagic()
  {
    return magic;
  }

  public void setMagic(int magic)
  {
    this.magic = magic;
  }

}
