import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sms msg : ");
        String smsmsg=scan.next();
        System.out.println("Enter a Email msg : ");
        String emailmsg=scan.next();
        System.out.println("Enter Whatsapp msg : ");
        String whatsappmsg=scan.next();

SMSMessagingService smsMessagingService=new SMSMessagingService();
EmailMessagingService emailMessagingService=new EmailMessagingService();
WhatsappMessagingService whatsappMessagingService=new WhatsappMessagingService();
MessagingService.messagingService();
smsMessagingService.Message(smsmsg);
        MessagingService.messagingService();
emailMessagingService.Message(emailmsg);
        MessagingService.messagingService();
whatsappMessagingService.Message(whatsappmsg);
    }
}
interface MessagingService
{
   static void messagingService()
   {
       System.out.println("Send Message");
   }
    abstract void Message(String message);
}
class SMSMessagingService implements MessagingService
{
    @Override
    public void Message(String message) {
        System.out.println("SMS : "+message);
    }
}
class EmailMessagingService implements MessagingService
{
    @Override
    public void Message(String message) {
        System.out.println("Email : "+message);
    }
}
class WhatsappMessagingService implements MessagingService
{
    @Override
    public void Message(String message) {
        System.out.println("Whatsapp : "+message);
    }
}