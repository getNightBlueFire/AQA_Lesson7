package temp;

public class MainConverter {
    public static void main(String[] args) {
        BaseConverter bs = new BaseConverter(10, Grade.C);


        bs.setCurrentGrade(Grade.K);
        System.out.println(bs.info());
    }
}
