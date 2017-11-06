package uk.co.cjmc.section_10.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone brynsPhone;
        brynsPhone = new DeskPhone(123456);
        brynsPhone.powerOn();
        brynsPhone.callPhone(123456);
        brynsPhone.answer();

        brynsPhone = new MobilePhone(246895);
        brynsPhone.powerOn();
        brynsPhone.callPhone(246895);
        brynsPhone.answer();

    }
}
