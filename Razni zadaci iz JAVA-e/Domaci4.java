package glavni;

import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {
		// Napisati program koji u zavisnoti od unesenog stringa racuna povrsine
		// kvadrata, kruga ili pravougaonika.
		// Ukoliko se unese “pravougaonik” nek pita koristnika za 2 stranice
		// i ispise povrsinu.
		// Ukoliko se unese “krug” nek pita korisnika za poluprecnik kruga
		// i izracuna povrsinu.
		// Ukoliko se unese “kvadrat” nek pita korisnika za unos stranice
		// i izracuna povrsinu kvadrata

		String povrsina;
		double r, a, b, ab, pkr, pkv, ppr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Da li zelite da izracunate povrsinu kvadrata, kruga ili pravougaonika?");
		System.out.println("Validan unos: krug, kvadrat, pravougaonik!");
		povrsina = sc.nextLine();
		switch (povrsina) {
		case "krug":
			System.out.println("Unesite poluprecnik kruga:");
			r = sc.nextDouble();
			if (r >= 0) {
				pkr = r * r * 3.14;
				System.out.println("Povrsina kruga je " + pkr);
			} else
				System.out.println("Uneli ste negativan broj!");
			break;
		case "kvadrat":
			System.out.println("Unesite duzinu stranice:");
			ab = sc.nextDouble();
			if (ab >= 0) {
				pkv = ab * ab;
				System.out.println("Povrsina kvadrata je " + pkv);
			} else
				System.out.println("Uneli ste negativan broj!");
			break;
		case "pravougaonik":
			System.out.println("Unesite duzinu jedne stranice:");
			a = sc.nextDouble();
			System.out.println("Unesite duzinu druge stranice:");
			b = sc.nextDouble();
			if (a >= 0 && b >= 0) {
				ppr = a * b;
				System.out.println("Povrsina pravougaonika je " + ppr);
			} else
				System.out.println("Uneli ste negativan broj!");
			break;
		default:
			System.out.println("Nepoznata rec! Validne vrednosti: krug, kvadrat, pravougaonik!");
		}

	}

}