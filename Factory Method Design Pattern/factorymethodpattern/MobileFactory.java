package factorymethodpattern;

public class MobileFactory {

    public static Mobile getMobile(String mobileCompany, int RAM, int ROM, int CAMERA){

        if("Samsung".equalsIgnoreCase(mobileCompany)) return new Samsung(RAM, ROM, CAMERA);
        else if("OnePlus".equalsIgnoreCase(mobileCompany)) return new Oneplus(RAM, ROM, CAMERA);

        return null;
    }
}
