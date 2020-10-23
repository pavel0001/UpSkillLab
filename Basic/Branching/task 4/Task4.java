//Pavel_Zmushko



public class Task4 {
    public static void main(String[] args) {
    int a = 3;
    int b = 4;
    Kirpi4 obj = new Kirpi4(10,4,3);
    Kirpi4 obj1 = new Kirpi4(10,1,8);
    foo(obj, a,b);
    foo(obj1, a,b);
    
    
        
    }
    public static void foo(Kirpi4 obj, int a, int b){
        System.out.print("Can we put kirpi4 with size: "+obj.getStr()+" in to \n"
                + "box with size: "+a+"x"+b+" ?\nAnswer is - ");
        if(obj.x <= a && obj.y <= b || obj.x <= b && obj.y <= a){
            System.out.print("true");    
        } else if(obj.x <= a && obj.z <= b || obj.x <= b && obj.z <= a){
            System.out.print("true");    
        }else if(obj.y <= a && obj.z <= b || obj.y <= b && obj.z <= a){
            System.out.print("true");    
        }
        else {
            System.out.print("false");  
        }
        System.out.println("\n##########################################");
        
        
    }
    public static int whoIsMin(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }
}
class Kirpi4{
    int x;
    int y;
    int z;
    Kirpi4(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String getStr(){
        return "x= "+x+" y= "+y+" z= "+z;
    }
}