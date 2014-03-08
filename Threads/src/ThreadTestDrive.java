public class ThreadTestDrive
{

  public static void main(String[] args)
  {
    Runnable threadJob = new MyRunnable();
    Thread myThread = new Thread(threadJob);

    myThread.setName("MyThread");

    myThread.start();

    for (int i = 0; i < 10; i++)
    {
      System.out.println("Main Thread: " + i);
      try
      {
        Thread.sleep(2000);
      } catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
    System.out.println("back in main");

  }
}
