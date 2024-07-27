package builderpattern;

public class MobileBuilder {

    private String os;
    private int ram;
    private String processor;

    public MobileBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public MobileBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public MobileBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Mobile getMobile(){
        return new Mobile(os, ram, processor);
    }
}
