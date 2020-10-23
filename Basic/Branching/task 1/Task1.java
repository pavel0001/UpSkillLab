//Pavel_Zmushko
public class Task1 {
    public static void main(String[] args) {
        
        System.out.println(foo(30,60));
		System.out.println(foo(140,60));
		System.out.println(foo(2,60));
		System.out.println(foo(90,60));
    }
static String foo(int x, int y){
    String result = "(x, y) = (" +x+ ";" +y+ ": From this deg";
int three_deg = 180 -x -y;
if(three_deg<=0){
   result += " can't build triangle";
}
else{
    result += " can build triangle";
if(three_deg == 90 ||x ==90 || y == 90) result += " and he's right triangle";
}
return result;
}
}