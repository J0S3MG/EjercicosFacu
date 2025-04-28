package prueba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
public class Curso {

	private String NomCur = "";
	private Profesor Fili = null;
	private ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
	
	public Curso(String n, Profesor f) {
		NomCur = n;
		Fili = f;
	}
	
	//Getters
	public String getNombreCurso() {
		return NomCur;
	}
	public Profesor getProfesor() {
		return Fili;
	}
	//Setters
	public void setNombreCurso(String n) {
		NomCur = n;
	}
	public void setProfesor(Profesor p) {
		Fili = p;
	}
	//Methods
	public void AgregarAlumno(Alumno a) {
		Alumnos.add(a);
	}
	public Vector<String> Imprimir() {
	    Iterator i = Alumnos.iterator();
	    Vector<String> vec = new Vector<>();
	    while(i.hasNext()) {
	    	Alumno a = (Alumno)i.next();
	    	vec.add(a.Descripcion());
	    }
	    return vec;
	}
	@Override
	public String toString() {
		return "Nombre Curso: " + NomCur + ", Profesor: " + Fili.toString();
	}
	
}
