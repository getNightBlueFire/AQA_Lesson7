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
        plane.transfer();


        AutoTransport auto = new AutoTransport();
        auto.go();
        auto.drive();
        auto.transfer();

        AutoTransport.testStaticMethod();

        Transfer.testStatic();


        Transfer[] transports = new Transfer[2];

        transports[0] = plane;
        transports[1] = auto;

        for (int i = 0; i < transports.length; i++) {
            transports[i].transfer();
        }













    }
}