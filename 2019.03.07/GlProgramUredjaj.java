package uredjaj;

public class GlProgramUredjaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uredjaj u1 = new Uredjaj(1);
		Uredjaj u2 = new Uredjaj(2);
		System.out.println(u1.toString());
		u1.setStanje(true);
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		
		System.out.println();
		
		Televizor t1 = new Televizor(1, true);
		t1.setKanal("Pink");
		System.out.println(t1.toString());
		Televizor t2 = new Televizor(2, false);
		System.out.println(t2.toString());
		
		System.out.println();
		
		Laptop l1 = new Laptop(1, false);
		l1.setRamMemorija(6);
		l1.setModelProcesora("Intel Core i7");
		System.out.println(l1.toString());
		Laptop l2 = new Laptop(2, true);
		l2.setRamMemorija(4);
		l2.setModelProcesora("Intel Core i5");
		System.out.println(l2.toString());
	

	}

}
