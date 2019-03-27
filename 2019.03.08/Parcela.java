package uredjaj;

public abstract class Parcela {

	// Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu
	// povrsinu(u kvadratnim metrima) prilikom kreiranja.
	// Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char).
	// Moze da joj se odredi prinos u periodu zadatom brojem godina.
	// Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRsINA].

	public static int uid = 0;
	private double povrsinaParcele;
	private int id;

	public Parcela(double povrsinaParcele) {
		this.povrsinaParcele = povrsinaParcele;
		this.id = ++uid;
	}

	public abstract char getVrsta();

	public abstract double prinos(int godine);

	public double getPovrsinaParcele() {
		return this.povrsinaParcele;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return getVrsta() + " - " +  "id: "+this.id+ " [P: "+this.povrsinaParcele + "m^2]";
	}

}
