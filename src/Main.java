import base.*;

public class Main {
    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[6];

        wheels[0] = new Wheel("continental", 20);
        wheels[1] = new Wheel("continental", 20);
        wheels[2] = new Wheel("continental", 20);
        wheels[3] = new Wheel("continental", 20);
        wheels[4] = new Wheel("hankook", 20);
        wheels[5] = new Wheel("hankook", 20);
        Engine engine = new Engine();

        FlyTransport plane = new FlyTransport();

        plane.go();
        plane.drive();

        AutoTransport auto = new AutoTransport();
        auto.go();
        auto.drive();










    }
}