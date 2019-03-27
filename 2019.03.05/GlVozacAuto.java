package drum;

public class GlVozacAuto {

//	Napraviti paket drum.
//	Unutar paketa drum, pisati klase.
//	Vozac ima ime i prezime koje se zadaje prilikom kreiranja vozaca. 
//	Vozac poseduje i broj vozacke dozvole koji se moze dohvatiti i postaviti. 
//	Ime vozaca se moze dohvatiti ali ne i postaviti. 
//	Vozac se ispisuje u obliku: IME_PREZIME{BROJ_VOZACKE}.

//	Automobil ima serijski broj koji se zadaje pri kreiranju automobila. 
//	Serijski broj se moze samo dohvatiti. 
//  Takodje poseduje snagu koja se moze dohvatiti i postaviti. 

//	Auto poseduje vozaca i stvara se bez njega(u konstruktoru treba da se vozac postavi na null); 
//	Vozac se naknadno postavlja koristeci setter. Vozac se moze postaviti i dohvatiti. 
//	Automobil se ispsuje u sledecem formatu: SERIJSKI_BROJ{SNAGA}VOZAC
	
	public static void main(String[] args) {
		Vozac v1=new Vozac("Ana", "Krunic");
		Vozac v2=new Vozac("Sasa","Matic");
		Automobil a1=new Automobil(123456,150);
		Automobil a2=new Automobil(654321,110);
		System.out.println(a1);
		System.out.println(a2);
		v1.setBrDozvole(2233);
		a1.setVozac(v1);
		a2.setVozac(v2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("Promena automobila:");
		a1.setVozac(v2);
		a2.setVozac(v1);
		System.out.println(a1);
		System.out.println(a2);

	}

}
