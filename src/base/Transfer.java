package base;

public interface Transfer {
    int TEST = 141;

    void transfer();

    default void test(){
        testPrivate();
        System.out.println("default method");
    }

    static void testStatic(){
        System.out.println("Static Interface Method");
    }

    private void testPrivate(){

    }

}
