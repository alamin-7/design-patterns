package abstractfactorypattern;

public class Samsung implements Mobile{

    private String mobileName;

    public Samsung(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public String getMobileName() {
        return "Samsung";
    }
}
