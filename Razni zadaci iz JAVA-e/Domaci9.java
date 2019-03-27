package glavni;

import java.util.Scanner;

public class Domaci9 {

	public static void main(String[] args) {
		// Napisati program u kojem korisnik unosi broj n i ispisuje sve brojeve
		// fibonacijevog niza
		// ciji je zbir cifara deljiv sa k (takodje unosi korisnik).
		// Ako se unese broj 10 i k =3 fibonacijev niz brojeva je 1 1 2 3 5 8 13 21 34
		// 55
		// ispis treba da bude 3 21.

		int n, k, x, y, z, zbir, brojniza;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva Fibronacijevog niza zelite da bude obuhvaceno:");
		n = sc.nextInt();
		System.out.println("Unesite broj koji ce filtrirati ovaj niz:");
		k = sc.nextInt();
		System.out.println(
				"Od prvih " + n + " brojeva Fibonacijevog niza, brojevi ciji zbir cifara je deljiv sa " + k + " su:");
		x = 1;
		y = 1;
		z = 0;
		for (int i = 0; i < n; i++) {
			x = y;
			y = z;
			z = x + y;
			brojniza = z;
			zbir = 0;
			while (brojniza > 0) {
				zbir += brojniza % 10;
				brojniza /= 10;
			}
			if (zbir % k == 0)
				System.out.println(z);

		}

	}

}
