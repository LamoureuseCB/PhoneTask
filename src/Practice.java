
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }
//        MobilePhone mp = new MobilePhone("123");
//        mp.sendSms("555", "Hello");
//
//        Smartphone sp = new Smartphone("224");
//        sp.sendEmail("emailAdress", "Hi!");


        Phone phone = getPhone(type, number);

        if (phone != null) {
            phone.makeCall(friendNumber);
        }
    }


    public static Phone getPhone(int type, String number) {
        if (type == 1) {
            return new Phone(number);
        } else if (type == 2) {
            return new MobilePhone(number);
        } else if (type == 3) {
            return new Smartphone(number);
        } else {
            System.out.println("Введена неверная модель телефона");
            return null;
        }


    }

}
