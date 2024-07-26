import factorymethodpattern.Mobile;
import factorymethodpattern.MobileFactory;

public class ClientClass {
    public static void main(String[] args) {

        Mobile samsung = MobileFactory.getMobile("Samsung", 6, 128, 48);

        Mobile oneplus = MobileFactory.getMobile("OnePlus", 8, 264, 96);

        System.out.println(samsung.toString());


        System.out.println(oneplus.toString());
    }
}