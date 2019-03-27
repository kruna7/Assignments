package uredjaj;


public class GlProgramParcela {
	public static void main(String[] args) {

//		Napisati i glavni program koji kreira niz parcela koje mogu da budu ili šume ili njive 
//		i ispisuje njihov prinos u toku 3 godine.

		
		
		Parcela[] parcela = new Parcela[5];

		Parcela n1 = new Njiva(470, 2);
		Parcela n2 = new Njiva(110,5);
		Parcela s1 = new Suma(262, 100, 2, 6);
		Parcela s2 = new Suma(322, 130, 3, 3);
		Parcela s3 = new Suma(120, 20, 5, 4);

		parcela[0] = n1;

		parcela[1] = n2;

		parcela[2] = s1;

		parcela[3] = s2;

		parcela[4] = s3;

		for (int i = 0; i < parcela.length; i++) {

			if (parcela[i] == null)

				continue;
			System.out.println(parcela [i].toString()+" "+"Prinos: "+ parcela[i].prinos(3));
		
		}
	}
}
