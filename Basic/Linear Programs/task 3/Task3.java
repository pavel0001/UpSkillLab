import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class Task3 {
    public static void main(String[] args) {
        int y = 1;
        int x = 3;

        System.out.println(foo(x,y));
    }
    static double foo(int x, int y){
           double tmp = (sin(x)+cos(y))/(cos(x)-sin(y));
           return tmp * tan(x*y);
    }

}