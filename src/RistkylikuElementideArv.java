
public class RistkylikuElementideArv {
	
	public static int pikemVariant(double kylg, double element){
		return((int)Math.floor((kylg-element)/element)*2);
	}
	
	public static int lyhemVariant(double kylg, double element){
		return (int)Math.ceil((kylg-element)/element)*2;
	}
	
	public static int kylg(double elemendiPikkus, double element){
		return (int) (element*elemendiPikkus/2 + element);
	}
	

	
}
