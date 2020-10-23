//Pavel_Zmushko



public class Task3 {
    public static void main(String[] args) {
        Point first = new Point(1,2);
        Point secend = new Point(9,2);
        Point third = new Point(7,9);
        System.out.println("Can this points make line? - " + foo(first,secend,third));
        printCoord(first,secend,third);// only if coord in 0...9
        
    }
 public static boolean foo(Point f, Point s, Point t){
    if(f.x==s.x && f.x==t.x){
        return true;
		} else if(f.y==s.y&&f.y==t.y){
				return true;
			}
				else if ((f.x - s.x)/(t.x - s.x) == (f.y - s.y)/(t.y - s.y)){
					return true;
				}
		return false;
    }
 public static void printCoord(Point f, Point s, Point t){
     String[][] printArr = new String[10][10];
     for(int x =0;x<printArr.length;x++){
         for(int y =0; y<printArr[x].length;y++){
             printArr[x][y] = ".";
         }
     }
     try{
     printArr[(int)f.y][(int)f.x] = "#";
     printArr[(int)s.y][(int)s.x] = "#";
     printArr[(int)t.y][(int)t.x] = "#";
     for(int x = printArr.length-1; x >= 0 ; x--){
         for(int y = 0 ; y < printArr[x].length ; y++){
             System.out.print(printArr[x][y]+" ");
         }
         System.out.print("\n");
     }
     }
     catch(Exception e){
         System.out.println("Error, if you wont print result\n coord must be in 0..9");
     }
}
}
 class Point{
                public double x;
                public double y;
                public static int count=0;
                
                 Point(double x, double y){
                    this.x = x;
                    this.y = y;
                    System.out.println("Point "+count+": x="+x+" y= "+y);
                    count++;
                }
                 
            }