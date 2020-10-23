public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 3;
        System.out.println(foo(a,b,c));
    }
    static double foo(int a, int b,int c){
        double tmp = (Math.sqrt(b*b+4*a*c) + b)/2.0*a;
        return tmp - (Math.pow(a, 3)*c)+ Math.pow(b, -2);
    }
}