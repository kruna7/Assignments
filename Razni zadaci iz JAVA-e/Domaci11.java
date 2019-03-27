package glavni;

import java.util.Scanner;

public class Domaci11 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj N.
		// Taj broj N se prosledjuje metodi koja formira i vraca ceo broj koji
		// predstavlja inverzan broj.
		// Glavni program nakon toga ispisuje taj inverzan broj.
		// Primer: 121 - > 121
		// 452 - > 254
		// 326 - > 623

		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Unesite ceo broj:");
		x = sc.nextInt();
		sc.close();
		System.out.println(inverzan(x));

	}

	public static int inverzan(int a) {
		int inv = 0;
		while (a > 0) {
			inv *= 10;
			inv += a % 10;
			a /= 10;
		}
		return inv;
	}

}
