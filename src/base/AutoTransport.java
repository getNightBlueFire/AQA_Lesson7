package base;

public final class AutoTransport extends Transport {
    public AutoTransport() {
        super();

    }

    @Override
    public void drive() {
        System.out.println("водитель управляет машиной");
    }

    public AutoTransport(String name, Wheel[] wheels, Engine engine) {
        super(name, wheels, engine);
    }

    @Override
    public void transfer() {
        System.out.println("Машина может перевезти 4 пасажиров");
    }

    public static void testStaticMethod(){
        System.out.println("static");

    }

}
