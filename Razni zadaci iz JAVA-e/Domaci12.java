package glavni;

import java.util.Scanner;

public class Domaci12 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od N elemenata niza, kao i neki broj br.
		// Napisati metodu koja ispisuje elemente niza deljive sa brojem br
		Scanner sc = new Scanner(System.in);
		int n, br;
		System.out.println("Unesite koliko clanova niza zelite:");
		n = sc.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan:");
			niz[i] = sc.nextInt();
		}
		System.out.println("Unesite broj koji ce filtrirati ovaj niz:");
		br = sc.nextInt();
		sc.close();
		System.out.print("Clanovi niza deljivi sa "+br+" su: ");
        deljivi(niz,br);
	}
	
	public static void deljivi (int niz[], int n) {
		for(int i=0;i<niz.length;i++) {
			if(niz[i]%n==0) System.out.print(niz[i]+" ");
		}
	}

}
