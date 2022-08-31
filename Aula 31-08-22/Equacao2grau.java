import java.lang.Math;

public class Equacao2grau {
	
	public double a;
	public double b;
	public double c;
	private double x1;
	private double x2;
	public double delta;
	public String raizes;
	
	void calculaDelta()
	{
		delta = ((Math.pow(b,2))-4*a*c);
	}
	
	String calcula()
	{
		if(delta == 0){
			x1 = -b/2*a;
			raizes = ""+x1;
		}
		
		else if(delta > 0){
			x1 = -b + (Math.sqrt(delta))/2*a;
			x2 = -b - (Math.sqrt(delta))/2*a;
			raizes = ""+x1+", "+x2;
		}
		
		else{
			raizes = "Números imaginários";
		}
			
			
		return raizes;
	}
}