package prueba.models;

public class Profesor extends Persona {

	private int legajo;
	private String titulo;
	
	public Profesor(int i,String a,String n,int e,int d,int l,String t) {
		super(i,a,n,e,d);
		legajo = l;
		titulo = t;
	}

	@Override
	public int compareTo(Persona p) {
		Profesor pr = (Profesor)p;
		return this.legajo - pr.legajo;
	}

	@Override
	public String toString() {
		return super.toString()+"legajo=" + legajo + ", titulo=" + titulo + "]" + "\n";
	}
	
}
