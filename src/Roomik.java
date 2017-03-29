import java.util.Scanner;

public class Roomik {

	public static int raadius;
	public static int rectSideA;
	public static int elementC;
		
	public static void main(String[] args){
		System.out.println("  ====================================================================");
		System.out.println("|| Programm arvutab lähendused roomikule sisestatud                   ||");
		System.out.println("|| raadiuse ja küljepikkuse järgi eeldusel, et elemendi külg ei muutu ||");
		System.out.println("  ====================================================================");
		userInput();
		System.out.println();		
		System.out.println("Sisestatud raadius: " + raadius);
		System.out.println("Roomiku pikkus: " + rectSideA);
		System.out.println("Elemendi pikkus: " + elementC);
		System.out.println();
		double sRingiRaadius = RingiElementideArv.sRingiRaadius(raadius, elementC);
		double bRingiRaadius = RingiElementideArv.bRingiRaadius(raadius, elementC);
		int lyhemKogus = RistkylikuElementideArv.pikemVariant(rectSideA, elementC);
		int pikemKogus = RistkylikuElementideArv.lyhemVariant(rectSideA, elementC);
		int v2ikeSumma = (int)Math.round(RingiElementideArv.elementideArv(sRingiRaadius, elementC)) + lyhemKogus;
		int suurSumma = (int)Math.round(RingiElementideArv.elementideArv(bRingiRaadius, elementC)) + pikemKogus;
		System.out.println("Väiksema roomiku variandi raadius on: " + RingiElementideArv.sRingiRaadius(raadius, elementC) + " ja külje pikkus: " + RistkylikuElementideArv.kylg(lyhemKogus, elementC));
		System.out.println("Väiksema roomiku elemente on kokku: " + v2ikeSumma);
		System.out.println();
		System.out.println("Suurema roomiku variandi raadius on: " + RingiElementideArv.bRingiRaadius(raadius, elementC) + " ja külje pikkus: " + RistkylikuElementideArv.kylg(pikemKogus, elementC));
		System.out.println("Suurema roomiku elemente on kokku: " + suurSumma);	
	}
	
	public static void userInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sisesta roomiku raadius või sisesta väärtuseks 0 kui soovid kasutada juhuslikke suuruseid: ");
		raadius = scanner.nextInt();
		if (raadius == 0)
		{
			raadius = (int)Math.round(Math.random() * 200) + 30;
			elementC = (int)Math.round(Math.random() * 30) + 10;
			rectSideA = (int)Math.round(Math.random() * 200) + elementC;
		}
		else{
			System.out.print("Sisesta roomiku sirge osa pikkus: ");
			rectSideA = scanner.nextInt();
			System.out.print("Sisesta elemendi pikkus, elemendi pikkus peab olema vähemalt sama suur, kui külje pikkus: ");
			elementC = scanner.nextInt();
			rectSideA = 2*raadius;
		}
		scanner.close();
	}
	
}
