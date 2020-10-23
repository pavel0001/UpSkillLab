//Pavel_Zmushko



public class Task5 {
    public static void main(String[] args) {

        foo(4);
        foo(2);
        foo(-100500);
        foo(0);
        foo(3.14);
        
    }
    public static void foo(double x){
        double result=0;
        if(x <=3 ){
            result = Math.pow(x, 2) - 3*x+9;
        }
        else{
            result = 1/ (Math.pow(x, 3)+6);
        }
        System.out.println("F(x) when x = "+x+" = "+result);
    }
}