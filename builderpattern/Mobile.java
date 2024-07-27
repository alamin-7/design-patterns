package builderpattern;

public class Mobile {

    private String os;
    private int ram;
    private String processor;

    public Mobile(String os, int ram, String processor) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                '}';
    }
}
