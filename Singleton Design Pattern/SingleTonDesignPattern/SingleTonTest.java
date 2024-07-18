package SingleTonDesignPattern;

public class SingleTonTest {
    public static void main(String[] args){

        SingleTonObject singleTonObject = SingleTonObject.getSingleTonObjectInstance();
        singleTonObject.displayMessage();
    }
}
