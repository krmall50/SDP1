//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CinemaConfig i1 = CinemaConfig.getInstance();
        System.out.println(i1.toString());
        CinemaConfig i2 = CinemaConfig.getInstance();
        System.out.println(i2.toString());


    }

}