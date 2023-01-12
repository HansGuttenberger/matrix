import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int x;
		int y;
		int z;

		System.out.print("Geben sie eine Zahl von 2 bis 9 an: ");
		Scanner tastatur = new Scanner(System.in);
		x = tastatur.nextInt();

		System.out.print("00 ");
		if (x > 1 && x < 10) {
			for (i = 1; i < 100; i++) {

				y = i % 10;
				z = i / 10;	
				
				if (y == 0) {
					System.out.println("");
				}
				if (i % x == 0 || y == x || z == x || y + z == x) {
					System.out.print(" * ");

				} else {
					System.out.printf("%02d ", i);
				}
				tastatur.close();
			

		}
	}
}
}
