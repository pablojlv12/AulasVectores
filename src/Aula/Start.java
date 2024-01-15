package Aula;

public class Start {

	public static void main(String[] args) {
		
		Aula aula = new Aula(2);
		Alumno casero = new Alumno("Dieguete",1);
		Alumno blete = new Alumno("Tuna",3);
		Alumno Archarf = new Alumno("Charaf",5);
		
		
		aula.addAlumno(casero);
		aula.addAlumno(blete);
		aula.addAlumno(Archarf);
	
		System.out.println(aula);
		
		
	}

}
