package Aula;

import java.util.Arrays;

public class Aula {

	private Alumno aulas[];
	private int contador;

	public Aula(int num) {

		this.aulas = new Alumno[num];
		this.contador = 0;
	}

	public void addAlumno(Alumno alumno) {

		if (contador < aulas.length) {
			aulas[contador] = alumno;
			contador++;
		}

	}

	@Override
	public String toString() {
		return  Arrays.toString(aulas) ;
	}
}
