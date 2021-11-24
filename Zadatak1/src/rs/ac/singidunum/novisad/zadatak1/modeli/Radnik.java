package rs.ac.singidunum.novisad.zadatak1.modeli;

public class Radnik {

	private double plata; // bice nasumicno zadata
	
	
	public Radnik() {
		super();
		this.plata = this.randomPlata();
	}


	public double getPlata() {
		return plata;
	}


	public void setPlata(double plata) {
		this.plata = plata;
	}

	
	public double randomPlata() {
		return Math.round(Math.random() * 10000);
		
	}
	

	@Override
	public String toString() {
		return "Radnik [plata=" + plata + "]";
	}
	
	
	
	
}
