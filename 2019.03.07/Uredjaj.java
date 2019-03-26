package uredjaj;

public class Uredjaj {

	// Uredjaj ima stanje da li je ukljucen ili iskljucen. Njegovo stanje moze da se
	// postavi i da se dohvati. Takodje poseduje i jedinstveni identifikator koji se
	// zadaje prilikom kreiranja uredjaja i moze da se dohvati.
	// Ispisuje se u formatu “Uredjaj(ID:STATUS)”
	// STATUS treba da ima vrednosti ON i OFF;
	// Televizor je uredjaj koji pored stanje poseduje i kanal tipa string na kom se
	// nalazi. Televizoru moze da se postavi kanal i da se dohvati trenutni kanal,
	// ukoliko je ukljucen.
	// Ispisuje se u formatu “Televizor(ID:STATUS) je na kanalu KANAL”;
	// STATUS treba da ima vrednosti ON i OFF;
	// Laptop je uredjaj koji poseduje RAM memoriju izrazenu u GB, Model procesora
	// (String).
	// Ispisuje se u formatu “Laptop(ID:STATUS)[RAM GB,Model Procesor]”
	// STATUS treba da ima vrednosti ON i OFF;

	protected boolean stanje;
	private int uid;
	public static String x;

	public Uredjaj(int uid) {
		this.stanje = false;
		this.uid = uid;
	}

	public Uredjaj(int uid, boolean stanje) {
		this.stanje = stanje;
		this.uid = uid;
	}

	public boolean getStanje() {
		return this.stanje;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}

	public int getUid() {
		return this.uid;
	}

	@Override
	public String toString() {
		{
			if (this.stanje == true)
				x = "ON";
			else
				x = "OFF";
		}
		return "Uredjaj (" + getUid() + ": " + x + ")";

	}

}
