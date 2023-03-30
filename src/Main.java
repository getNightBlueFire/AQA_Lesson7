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

        Transport tesla = new Transport("VIJIEJRIEA1231245", wheels , engine);




        Transport transport = new Transport();

        transport.go();

        FlyTransport plane = new FlyTransport();

        plane.go();

        System.out.println(transport);
        System.out.println(plane);


        AutoTransport auto = new AutoTransport();
        auto.go();






    }
}