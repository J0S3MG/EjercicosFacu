package prueba;

public class Alumno {

	private String Nom = "";
	private String Ape = "";
	private int DNI = 0;
	
	public Alumno(String n,String a,int d ) {
		Nom = n;
		Ape = a;
		DNI = d;
	}
	//Getters
	public String getNombre() {
		return Nom;
	}
	public String getApellido() {
		return Ape;
	}
	public int getDNI() {
		return DNI;
	}
	//Setters
	public void setNombre(String n) {
		Nom = n;
	}
	public void setApellido(String a) {
		Ape = a;
	}
	public void setDNI(int d) {
		DNI = d;
	}
	//Methods
	public String Descripcion() {
		return Nom + ","+ Ape + " DNI: "+ DNI;
	}
}	
	
