import java.lang.Math;
class Task3{
	public static void main(String[] args){
	
	int a = 3;

	System.out.println("Dano: a = "+a);
	System.out.println("Area 6-corner = "+areaSixCorner(a));

	


	}
	public static Double areaSixCorner(int a){
		return  6*(a*a*Math.sqrt(3))/4.0;
	}


}