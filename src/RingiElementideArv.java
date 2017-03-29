
public class RingiElementideArv {

	public static double ringiC(double raadius){
		return 2*Math.PI*(double)raadius;
	}
	
	public static double ringiR2(double radius, double elemendiC){
		double angle = 2*Math.PI/Math.floor(ringiC(radius)/elemendiC);
		return elemendiC/(2 * Math.sin(angle/2));
	}
	//V2iksem ringi raadius
	public static double sRingiRaadius(double radius, double elemendiC){
		double r2 = ringiR2(radius, elemendiC);
		return Math.sqrt(Math.pow(r2, 2) - Math.pow(elemendiC/2, 2));
	}
	//Suurem ringi raadius
	public static double bRingiRaadius(double radius, double elemendiC){
		double angle = 2*Math.PI/Math.floor(ringiC(radius)/elemendiC + 2);
		double r2 = elemendiC/(2 * Math.sin(angle/2));
		return Math.sqrt(Math.pow(r2, 2) - Math.pow(elemendiC/2, 2));
	}
	
	public static double elementideArv(double radius, double elemendiC){
		return ringiC(radius)/elemendiC;
	}
	
	
}