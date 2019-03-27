package glavni;

import java.util.Scanner;

public class Domaci6 {

	public static void main(String[] args) {
		// Napisati program koji unosi i sabira brojeve dokle god nije unesen broj koji
		// je negativan.
		// Na primer ako se unese 1 2 5 3 -1 program treba da ispise 11

		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Unosite brojeve koje zelite da saberete:");
		if ((x = sc.nextInt()) >= 0) {
			while ((y = sc.nextInt()) >= 0) {
				x = x + y;
				System.out.println(
						"Dosadasnji zbir unetih pozitivnih brojeva je " + x + ". Mozete nastaviti sa unosom.");
			}
			System.out.println("Unet je negativan broj. Program je zavrsen.");
			System.out.println("Zbir svih unetih pozitivnih brojeva je " + x + ".");
		} else
			System.out.println("Unet je negativan broj. Program je zavrsen.");

	}

}
