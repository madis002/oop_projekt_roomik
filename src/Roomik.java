import java.util.Scanner;

public class Roomik {

	static int raadius;
	static int rectSideA;
	static int rectSideB;
	static int elementC;
		
	public static void main(String[] args){
		
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
