package base;

public class FlyTransport extends Transport {

    Gun gun;

    public FlyTransport() {
        super();
        this.gun = new Gun();
    }

    @Override
    public void go() {
        System.out.println("fly transport flies away");
    }

    @Override
    public String toString() {
        String s = "Название " + "!!!!" + "\nСтоимость " + price + "\nЦвет " + color + "\n";
        for (int i = 0; i < wheels.length; i++) {
            s += wheels[i].toString() + "\n";
        }
        s += gun.toString();
        return s;
    }
}
