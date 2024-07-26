package abstractfactorypattern;

public class MobileFactory extends AbstractFactory {


    @Override
    public Mobile getMobile(String mobile) {

        if(mobile == null){
            return null;
        }

        if(mobile.equalsIgnoreCase("Samsung")){
            return new Samsung("Samsung");
        }

        return null;
    }

    @Override
    public Ram getRam(String ram) {
        return null;
    }
}
