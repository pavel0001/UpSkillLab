//Pavel_Zmushko

public class Task4 {
    public static void main(String[] args) {

        double x = 123.456;

        System.out.println(foo(x));
    }
    static double foo(double x){
        return ((x * 1000) % 1000 + (int) x / 1000.0);
    }

}