package prueba;

public class Profesor {

	private String Ape = "";
	private int Legajo = 0;
	
	public Profesor(String a,int l) {
		Ape = a;
		Legajo = l;
	}
	
	//Getters
	public String getApellido() {
		return Ape;
	}
	public int getLegajo() {
		return Legajo;
	}
	//Setters
	public void setApellido(String a) {
		Ape = a;
	}
	public void setLegajo(int l) {
		Legajo = l;
	}

	@Override
	public String toString() {
		return "Apellido: " + Ape + ", Legajo: " + Legajo;
	}
	
}
