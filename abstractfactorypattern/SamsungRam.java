package abstractfactorypattern;

public class SamsungRam extends Ram {

    private int ram;

    public SamsungRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int getRam() {
        return this.ram;
    }

    @Override
    public String getRamCompany() {
        return "Samsung";
    }


}
