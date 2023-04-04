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

        CosmosTransport cosmosTransport = new CosmosTransport();
        WaterTransport waterTransport = new WaterTransport();

        info(cosmosTransport);
        info(waterTransport);




        int i = poly1(3, 4);
        System.out.println(i);
        int i1 = poly1(3, 4, 5);
        System.out.println(i1);


        Day day = new Day();
        day.day = Days.Mo;

        String name = day.day.name;
        System.out.println(name);



        switch (day.day){
            case Mo -> System.out.println();
        }








    }


     public static void info(Move move){
         Test test = Test.valueOf(move.move() + "");
         switch (test){
           case A1 -> move.move();
           case A2 -> move.move();

        }
        move.move();
        move.transfer();
     }

     public static int poly1(int a, int b){
        return a + b;
     }

    public static int poly1(int a, int b, int c){
        return a + b + c;
    }




}