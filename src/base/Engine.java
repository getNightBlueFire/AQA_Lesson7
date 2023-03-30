package base;

public class Engine {
    int a;
    int b;

    public String doSomething(int a, int b){
        this.a = a;
        this.b = b;
        return this.a+ ""+this.a + b;
    }

}
