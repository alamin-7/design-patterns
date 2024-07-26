package abstractfactorypattern;

public class RamFactory extends AbstractFactory{

    @Override
    public Mobile getMobile(String mobile) {
        return null;
    }

    @Override
    public Ram getRam(String ram) {

        if(ram == null){
            return null;
        }

        if(ram.equalsIgnoreCase("Samsung")){
            return new SamsungRam(10);
        }

        return null;
    }
}
