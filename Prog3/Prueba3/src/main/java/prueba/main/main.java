package prueba.main;

import java.util.ArrayList;
import java.util.Collections;

import prueba.models.Alumno;
import prueba.models.Profesor;

public class main  {

	public static void main(String[] args) {
		ArrayList<Alumno> als = GenerarAls();
		ArrayList<Profesor> pls = GenerarPls();
		ordenarAluApe(als);
		ordenarProLeg(pls);
		ordenarAluPro(als);
		ordenarAluPro7(als);
	}
    public static void ordenarAluApe(ArrayList<Alumno> als) {
    	Collections.sort(als);
    	System.out.println("Lista de Alumnos");
    	System.out.println(als);
    }
    public static void ordenarAluPro(ArrayList<Alumno> als) {
    	als.sort((a1, a2) -> Double.compare(a2.getPro(), a1.getPro()));
    	System.out.println("Mayor Promedio");
    	System.out.println(als.get(0));
    	System.out.println("Menor Promedio");
    	System.out.println(als.get(4));
    }
    public static void ordenarAluPro7(ArrayList<Alumno> als) {
    	als.sort((a1, a2) -> Double.compare(a2.getPro(), a1.getPro()));
    	System.out.println("Alumnos con Pro. Superior a 7");
    	for (int i = 0; i < als.size(); i++) {
			if(als.get(i).getPro() >= 7)
				System.out.println(als.get(i));
		}
    }
    public static void ordenarProLeg(ArrayList<Profesor> pls) {
    	Collections.sort(pls);
    	System.out.println("Lista de Profesores");
    	System.out.println(pls);
    }
    public static ArrayList<Alumno> GenerarAls(){
    	ArrayList<Alumno> aList = new ArrayList<>();
    	//Alumnos
    	Alumno a1 = new Alumno(1,"Alvarez","Jaime",10,245213,11,5,8.9);
    	Alumno a2 = new Alumno(2,"Alonzo","Joaquin",13,245215,12,6,4.4);
    	Alumno a3 = new Alumno(3,"Ozuna","Julian",9,245216,13,7,2.1);
    	Alumno a4 = new Alumno(4,"Lando","Carrisan",11,245219,14,3,6);
    	Alumno a5 = new Alumno(5,"Murcia","Monda",12,245212,15,10,9);
    	
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.add(a5);
        return aList;
    }
    public static ArrayList<Profesor> GenerarPls(){
    	ArrayList<Profesor> pList = new ArrayList<>();
    	//Profesores
    	Profesor p1 = new Profesor(1,"Alvarez","Jaime",10,245213,111,"Ing. Pelotudo");
    	Profesor p2 = new Profesor(2,"Alonzo","Joaquin",13,245215,112,"Ing. Pelotudo");
    	Profesor p3 = new Profesor(3,"Ozuna","Julian",9,245216,113,"Ing. Pelotudo");
    	Profesor p4 = new Profesor(4,"Lando","Carrisan",11,245219,114,"Ing. Pelotudo");
    	Profesor p5 = new Profesor(5,"Murcia","Monda",12,245212,115,"Ing. Pelotudo");

        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);
        pList.add(p5);
        return pList;
    }
	
}
