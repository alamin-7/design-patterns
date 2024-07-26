
public class Client {

    AbstractFactory mobileFactory = FactoryCreator.getFactory("mobile");

    Mobile mobile = mobileFactory.getMobile("Samsung");

    AbstractFactory ramFactory = FactoryCreator.getFactory("ram");

    Ram ram = ramFactory.getRam(mobile.getMobileName());

System.out.println("The mobile company you are making is "+mobile.getMobileName()+
        " "+"and so your ram company will be "+ram.getRamCompany());

}
