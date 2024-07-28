package prototype;

public class Mobile {

    private int mobileID;
    private String mobileName;

    public Mobile(){

    }

    public Mobile(int mobileID, String mobileName) {
        this.mobileID = mobileID;
        this.mobileName = mobileName;
    }

    public int getMobileID(int i) {
        return mobileID;
    }

    public void setMobileID(int mobileID) {
        this.mobileID = mobileID;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }


}
