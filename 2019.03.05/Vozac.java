package drum;

public class Vozac {

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

	private String ime;
	private String prezime;
	private int brDozvole;

	public Vozac(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.brDozvole = 0;
	}

	public Vozac(String ime, String prezime, int brDozvole) {
		this.ime = ime;
		this.prezime = prezime;
		this.brDozvole = brDozvole;
	}

	public int getBrDozvole() {
		return this.brDozvole;
	}

	public void setBrDozvole(int brDozvole) {
		this.brDozvole = brDozvole;
	}

	public String getIme() {
		return this.ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	@Override
	public String toString() {
		return ime +" "+ prezime + " {" + brDozvole + "}";
	}

}
