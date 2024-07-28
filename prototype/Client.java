
public class Client {
    public static void main(String args []){


        MobileShop mobileShop = new MobileShop();

        mobileShop.setMobileshopName("Galaxy");

        mobileShop.loadData();

        MobileShop mobileShop1 = (MobileShop) mobileShop.clone();

        System.out.println(mobileShop);

        System.out.println(mobileShop1);

    }
}