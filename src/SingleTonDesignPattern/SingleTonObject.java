package SingleTonDesignPattern;

public class SingleTonObject {
    private static SingleTonObject singleTonObject = new SingleTonObject();

    private SingleTonObject(){

    }

    public static SingleTonObject getSingleTonObjectInstance(){
        return singleTonObject;
    }

    public void displayMessage(){
        System.out.println("Hello from SingleTonObject class");
    }
}
