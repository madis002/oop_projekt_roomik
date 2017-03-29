
public class RistkylikuElementideArv {
	//elementide arv roomiku sirgel osal kui külje pikkust pikendada
	public static int pikemVariant(double kylg, double element){
		return((int)Math.floor((kylg-element)/element)*2);
	}
	//elementide arv roomiku sirgel osal kui külje pikkust lühendada
	public static int lyhemVariant(double kylg, double element){
		return (int)Math.ceil((kylg-element)/element)*2;
	}
	//külje pikkus elementide arvu järgi
	public static int kylg(double kogus, double pikkus){
		return (int) (pikkus*kogus/2 + pikkus);
	}
	

	
}
