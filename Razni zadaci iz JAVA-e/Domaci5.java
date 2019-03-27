package glavni;

import java.util.Scanner;

public class Domaci5 {

	public static void main(String[] args) {
		// Napisati program koji racuna sumu parnih brojeva i
		// proizvod neparnih brojeva od 0 do n. Koristiti jednu petlju
		int n, i, sum, pro;
		i = 0;
		sum = 0;
		pro = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n:");
		n = sc.nextInt();
		if (n >= 0) {
			while (i <= n) {
				if (i % 2 == 0) {
					sum = sum + i;
				} else {
					pro = pro * i;
				}
				i = i + 1;
			}
			System.out.println("Suma svih parnih brojeva od 0 do " + n + " je " + sum + ".");
			System.out.println("Proizvod svih neparnih brojeva od 0 do " + n + " je " + pro + ".");
		} else
			System.out.println("Unet je negativan broj. Program je zavrsen.");

	}

}
