package glavni;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		// Napisati program koji unosi 2 realna broja i operaciju kao karakter.
		// Program napisati na osnovu programa radjenog na casu koristeci switch za
		// izbor operacije.
		// Voditi racuna oko deljenja

		double x, y, z;
		String ope;
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvi broj:");
		x = sc.nextDouble();
		System.out.print("Unesite drugi broj:");
		y = sc.nextDouble();
		System.out.print("Unesite operaciju (Dozvoljene operacije:+,-,*,/):");
		sc.nextLine();
		ope = sc.nextLine();
		switch (ope) {
		case "+":
			z = x + y;
			System.out.println("Zbir ova dva broja je " + z);
			break;
		case "-":
			z = x - y;
			System.out.println("Razlika ova dva broja je " + z);
			break;
		case "*":
			z = x * y;
			System.out.println("Proizvod ova dva broja je " + z);
			break;
		case "/":
			if (y != 0) {
				z = x / y;
				System.out.println("Kolicnik ova dva broja je " + z);
			} else
				System.out.println("Deljenje nulom nije dozvoljeno!");
			break;
		default:
			System.out.println("Nepoznata operacija! Dozvoljene operacije:+,-,*,/");
		}

	}

}
