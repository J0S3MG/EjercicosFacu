package prueba;

public class Principal {

	public static void main(String[] args) {
		Profesor p = new Profesor("Filipuzzi",12345);
		Alumno a1 = new Alumno("Maxima","Caceres",45177133);
		Alumno a2 = new Alumno("Jose","Gonzalez",44819615);
		Curso c = new  Curso("programacion",p);
		c.AgregarAlumno(a1);
		c.AgregarAlumno(a2);
		System.out.println(c);
		System.out.print(c.Imprimir());
	}
   
}
