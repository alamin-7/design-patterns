package abstractfactorypattern;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("mobile")){
            return new MobileFactory();
        }

        if(choice.equalsIgnoreCase("ram")){
            return new RamFactory();
        }

        return null;
    }
}
