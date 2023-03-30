package base;

public class Wheel {
    String model;
    int radius;

    public Wheel(String model, int radius) {
        this.model = model;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Модель резины " + model + "\nРадиус " + radius;
    }
}
