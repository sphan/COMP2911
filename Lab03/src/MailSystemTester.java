import java.util.Scanner;

/**
   This program tests the mail system. A single phone
   communicates with the program through System.in/System.out.
*/
public class MailSystemTester
{
   public static void main(String[] args)
   {
      MailSystem system = new MailSystem(MAILBOX_COUNT);
      Scanner console = new Scanner(System.in);
      TelephoneManager p = new TelephoneManager(console, system);
      //Connection c = new Connection(system, p);
      p.run();
   }

   private static final int MAILBOX_COUNT = 20;
}
