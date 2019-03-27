package drum;

public class Automobil {

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

	
	private int serijskiBr;
	private int snagaAuta;
	private Vozac vozac;
	
	public Automobil(int serijskiBr, int snagaAuta) {
		this.serijskiBr=serijskiBr;
		this.snagaAuta=snagaAuta;
		this.vozac=null;
	}

	public int getSnagaAuta() {
		return this.snagaAuta;
	}

	public void setSnagaAuta(int snagaAuta) {
		this.snagaAuta = snagaAuta;
	}

	public Vozac getVozac() {
		return this.vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public int getSerijskiBr() {
		return this.serijskiBr;
	}

	@Override
	public String toString() {
		return serijskiBr + " {" + snagaAuta + "KS} " + vozac;
	}
	
	
	
	
	}
