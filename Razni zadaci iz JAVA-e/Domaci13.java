package glavni;

import java.util.Scanner;

public class Domaci13 {
//U nastavku je dat kod koji predstavlja kalkulator povrsina 
	// kvadrata, pravougaonika i kruga.
	// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	// Ukoliko se unese 'izadji', program treba da se zavrsi.
	// Program treba da se ponavlja dokle god se ne unese izadji.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Unesite figuru koju zelite: krug, kvadrat, pravougaonik:");
			String figura;
			figura = sc.nextLine();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				System.out.println("Program je zavrsen.");
				return;
			default:
				System.out.println("Los unos, pokusajte ponovo.");
			}
		}
	}

	private static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Unesite poluprecnik:");
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r));
	}

	private static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite velicinu jedne stranice:");
		a = sc.nextDouble();
		System.out.println("Unesite velicinu druge stranice:");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));

	}

	private static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Unesite velicinu stranice:");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

	}

	private static double pKruga(double r) {
		return r * r * 3.14;
	}

	private static double pKvadrata(double a) {
		return a * a;
	}

	private static double pPravougaonika(double a, double b) {
		return a * b;
	}
}