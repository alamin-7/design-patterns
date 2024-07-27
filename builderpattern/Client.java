
public class Client{
    public static void main(String args[]) {

        Mobile mobile = new MobileBuilder().setOs("Android").setProcessor("Qualcom").getMobile();

        System.out.println(mobile);
    }
}