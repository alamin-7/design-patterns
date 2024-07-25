package factorymethodpattern;

public class Samsung implements Mobile {

    private int RAM;
    private int ROM;
    private int CAMERA;

    public Samsung(int RAM, int ROM, int CAMERA) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.CAMERA = CAMERA;
    }

    public int getRAM(){
        return this.RAM;
    }

    public int getROM(){
        return this.ROM;
    }

    public int getCAMERA(){
        return this.CAMERA;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "RAM=" + RAM +
                ", ROM=" + ROM +
                ", CAMERA=" + CAMERA +
                '}';
    }
}
