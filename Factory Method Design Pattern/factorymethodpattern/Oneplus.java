package factorymethodpattern;

public class Oneplus implements Mobile {

    private int RAM;
    private int ROM;
    private int CAMERA;

    public Oneplus(int RAM, int ROM, int CAMERA) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.CAMERA = CAMERA;
    }

    public int getRAM() {
        return RAM;
    }

    public int getROM() {
        return ROM;
    }

    public int getCAMERA() {
        return CAMERA;
    }

    @Override
    public String toString() {
        return "Oneplus{" +
                "RAM=" + RAM +
                ", ROM=" + ROM +
                ", CAMERA=" + CAMERA +
                '}';
    }
}
