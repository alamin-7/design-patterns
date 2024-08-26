package SingleTonDesignPattern;

public class SingleTonObject {
    private static SingleTonObject singleTonObject;

    private SingleTonObject(){

    }

    public static synchronized SingleTonObject getSingleTonObjectInstance(){

        if(singleTonObject == null){
            singleTonObject = new SingleTonObject();
        }
        return singleTonObject;
    }

    public void displayMessage(){
        System.out.println("Hello from SingleTonObject class");
    }
}
