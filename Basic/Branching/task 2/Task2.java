//Pavel_Zmushko



public class Task2 {
    public static void main(String[] args) {
        int a = 326;
        int b = 132;
        int c = 654;
        int d = 432;
        System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "
                +d+"\nmax{min(a, b), min(c, d)} = "+foo(a, b, c, d));
    }
    
static int foo(int a, int b, int c, int d){
    return whoIsMax(whoIsMin(a,b),whoIsMin(c,d));
}

public static int whoIsMin(int a, int b){
    if(a < b)
    {
        return a;
    }
    return b;
}

public static int whoIsMax(int a, int b){
    if(a>b){
        return a;
    }
    return b;
}
}



