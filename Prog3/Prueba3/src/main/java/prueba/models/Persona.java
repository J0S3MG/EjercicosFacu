package prueba.models;


public abstract class Persona implements Comparable<Persona>{

	private int id;
	private String ape;
	private String nom;
	private int edad;
	private int dni;
	
	public Persona(int i,String a,String n,int e,int d) {
		id = i;
		ape = a;
		nom = n;
		edad = e;
		dni = d;
	}
	public int copareTo(Persona p) {
		if(this.ape.compareTo(p.ape) == 0)
		 return this.ape.compareTo(p.ape) + this.nom.compareTo(p.nom);
		return this.ape.compareTo(p.ape);
	}
	@Override
	public String toString() {
		return "[id=" + id + ", ape=" + ape + ", nom=" + nom + ", edad=" + edad + ", dni=" + dni;
	}
	
}
