import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        double h = 0;

		System.out.print("Enter a ");
		a = Integer.parseInt(reader.readLine());

		System.out.print("Enter b ");
		b = Integer.parseInt(reader.readLine());

		System.out.print("Enter h ");
		h = Double.parseDouble(reader.readLine());

        foo(a, b, h);
    }

    public static void foo(int a, int b, double h) {
        double min, max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        while (min <= max) {
            double y_result;
            if (min > 2) {
                y_result = min;
            } else {
                y_result = min * -1;
            }
            System.out.println("x = " + min + "; y = " + y_result);
            min += h;
        }
    }
}