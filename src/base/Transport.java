package base;

public abstract class Transport {
    private Engine engine;
    private String name;
    protected int price;
    protected Wheel[] wheels;
    public Color color;

    public Transport(String name, Wheel[] wheels, Engine engine) {
        this.name = name;
        this.wheels = wheels;
        this.engine = engine;
    }

    public Transport() {
        this.engine = new Engine();
        this.color = new Color(0, 0, 255);
        this.wheels = new Wheel[]{new Wheel("1", 19), new Wheel("1", 19)};
        this.price = 10000;
        this.name = "default transport";
    }

    @Override
    public String toString() {
        String s = "Название " + name + "\nСтоимость " + price + "\nЦвет " + color + "\n";
        for (int i = 0; i < wheels.length; i++) {
            s += wheels[i].toString() + "\n";
        }
        return s;
    }

    public void go(){
        System.out.println("transport goes away");
    }

    public abstract void drive();


}
