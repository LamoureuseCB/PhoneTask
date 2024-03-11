
public class Smartphone extends MobilePhone{
    public Smartphone(String number) {
        super(number);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    @Override
    public void sendSms(String targetNumber, String messageText) {
        super.sendSms(targetNumber, messageText);
    }

    @Override
    public void makeCall(String targetNumber) {
        System.out.println("Позвоним через приложение по номеру " + targetNumber);
        super.makeCall(targetNumber);

    }
}