package prototype;

import java.util.ArrayList;
import java.util.List;

public class MobileShop implements Cloneable{

    private String mobileshopName;

    List<Mobile> mobiles = new ArrayList<>();

    public MobileShop(){

    }

    public MobileShop(String mobileshopName, List<Mobile> mobiles) {
        this.mobileshopName = mobileshopName;
        this.mobiles = mobiles;
    }

    public String getMobileshopName() {
        return mobileshopName;
    }

    public void setMobileshopName(String mobileshopName) {
        this.mobileshopName = mobileshopName;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public void loadData(){

        for(int i = 1; i <= 10; i++){
            Mobile m = new Mobile();
            m.setMobileID(i);
            m.setMobileName("Mobile "+i);
            getMobiles().add(m);
        }

    }

    @Override
    public MobileShop clone() throws CloneNotSupportedException {

        MobileShop mobileShop = new MobileShop();

        for(Mobile m: this.getMobiles()){
            mobileShop.getMobiles().add(m);
        }

        return mobileShop;
    }

    @Override
    public String toString() {
        return "MobileShop{" +
                "mobileshopName='" + mobileshopName + '\'' +
                ", mobiles=" + mobiles +
                '}';
    }
}
