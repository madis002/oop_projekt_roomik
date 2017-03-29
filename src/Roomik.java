import java.util.Scanner;

public class Roomik {

	public static int raadius = 50;
	public static int rectSideA = 100;
	public static int rectSideB;
	public static int elementC = 15;
		
	public static void main(String[] args){
		userInput();

		System.out.println("V2iksem ring: " + RingiElementideArv.sRingiRaadius(raadius, elementC));
		double sRingiRaadius = RingiElementideArv.sRingiRaadius(raadius, elementC);
		double bRingiRaadius = RingiElementideArv.bRingiRaadius(raadius, elementC);
		//System.out.println("R2: " + RingiElementideArv.ringiR2(raadius, elementC));
		System.out.println("Suurem ring: " + RingiElementideArv.bRingiRaadius(raadius, elementC));
		System.out.println("V2ikse ringi elementide arv: " + Math.round(RingiElementideArv.elementideArv(sRingiRaadius, elementC)));
		System.out.println("Suure ringi elementide arv: " + Math.round(RingiElementideArv.elementideArv(bRingiRaadius, elementC)));
		
		int lyhemPikkus = RistkylikuElementideArv.pikemVariant(rectSideA, elementC);
		int pikemPikkus = RistkylikuElementideArv.lyhemVariant(rectSideA, elementC);
		
		System.out.println("Lyhem pikkus: " + lyhemPikkus);
		System.out.println("Pikem pikkus: " + pikemPikkus);
		System.out.println("Lyhem pikkus: " + RistkylikuElementideArv.kylg(lyhemPikkus, elementC));
		System.out.println("Pikem pikkus: " + RistkylikuElementideArv.kylg(pikemPikkus, elementC));
		
	}
	
	public static void userInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sisesta ringi raadius: ");
		raadius = scanner.nextInt();
		System.out.print("Sisesta a kylg: ");
		rectSideA = scanner.nextInt();
		System.out.print("Sisesta elemendi kylg: ");
		elementC = scanner.nextInt();
		rectSideA = 2*raadius;
	}
	
}
