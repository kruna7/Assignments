package uredjaj;

public class Njiva extends Parcela {

//	Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. 
//	Prinos po kvadratnom metru moze da se promeni. Oznaka vrste je N. 
//	Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. 
//	Tekstualni oblik je Parcela:PrinosPoKvM.

	private double godPrinos;

	public Njiva(double povrsinaParcele, double godPrinos) {
		super(povrsinaParcele);
		this.godPrinos = godPrinos;
	}

	@Override

	public char getVrsta() {

		return 'N';

	}
	
	public double getGodPrinos() {
		return godPrinos;
	}

	public void setGodPrinos(double godPrinos) {
		this.godPrinos = godPrinos;
	}

	@Override

	public double prinos(int godine) {

		return this.getPovrsinaParcele() * this.getGodPrinos()*godine;

	}

	@Override
	public String toString() {
		return super.toString() + ":" + getGodPrinos();
	}

}
