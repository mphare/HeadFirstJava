public class MyRunnable implements Runnable
{
  public void run()
  {
    go();
  }

  public void go()
  {
    doMore();
  }

  public void doMore()
  {
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Runnable Thread: " + i);
      try
      {
        Thread.sleep(3000);

      } catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
    System.out.println("Thread Ending");
  }
}
