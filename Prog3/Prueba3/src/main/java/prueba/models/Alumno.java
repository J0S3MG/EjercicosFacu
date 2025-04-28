package prueba.models;

public class Alumno extends Persona  {

	private int nroL;
	private int matApro;
	private double pro; 
	
	public Alumno(int i,String a,String n,int e,int d,int n2,int m,double p) {
		super(i,a,n,e,d);
		nroL = n2;
		matApro = m;
		pro = p;
	}
	public double getPro() {
		return pro;
	}

	@Override
	public int compareTo(Persona a) {
		return super.copareTo(a);
	}

	@Override
	public String toString() {
		return super.toString()+"nroL=" + nroL + ", matApro=" + matApro + ", pro=" + pro + "]"+"\n";
	}
	
}
