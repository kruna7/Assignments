package uredjaj;

public class Suma extends Parcela {

//	Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, 
//	prinos po zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju godina. 
//	Oznaka vrste je S. 
//	Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
//  Tekstualni oblik je *Parcela:(povrsstabla,prinosSt,Period).
//	*Ovo se ostvaruje pozivom super.toString();

	public static double prinos = 0;
	private double povrsinaStabala;
	private double prinosPoStablu;
	private int godSazrevanja;

	public Suma(double povrsinaParcele, double povrsinaStabala, double prinosPoStablu, int godSazrevanja) {
		super(povrsinaParcele);
		this.povrsinaStabala = povrsinaStabala;
		this.prinosPoStablu = prinosPoStablu;
		this.godSazrevanja = godSazrevanja;

	}

	@Override

	public char getVrsta() {

		return 'S';

	}

	public double getPovrsinaStabala() {
		return this.povrsinaStabala;
	}

	public double getPrinosPoStablu() {
		return this.prinosPoStablu;
	}

	public int getGodSazrevanja() {
		return this.godSazrevanja;
	}

	@Override

	public double prinos(int godine) {

		return this.getPovrsinaParcele() / this.getPovrsinaStabala() * this.getPrinosPoStablu()
				* this.getGodSazrevanja()*godine;
		
	}

	@Override
	public String toString() {
		return super.toString() + ":(" + this.povrsinaStabala + ", " + this.prinosPoStablu + ", " + this.godSazrevanja
				+ ")";
	}

}
