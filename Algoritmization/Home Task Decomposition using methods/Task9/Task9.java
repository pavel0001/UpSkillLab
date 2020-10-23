import java.lang.Math;
class Task9{
	public static void main(String[] args){
		int x = 5;
		int y = 7;
		int z = 2;
		int t = 9;
		System.out.println("Arean = "+areaRectangle(x,y,z,t));
		

	}
	public static double areaRectangle(int x, int y, int z, int t){
		double diag = Math.sqrt(x*x+y*y);
		double fP = (x+y+diag)/2;
		double firstTri = Math.sqrt(fP*(fP-x)*(fP-y)*(fP-diag));
		double sP = (diag+z+t)/2;
		double secTri = Math.sqrt(sP*(sP-diag)*(sP-z)*(sP-t));
		return (double) firstTri+secTri;
	}
}