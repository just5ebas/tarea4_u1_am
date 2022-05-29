package com.uce.edu.tarea4;

public class Matricula {

	private Estudiante estudiante;
	private Materia materia;

	public void matricular(Estudiante est, Materia mat) {
		this.estudiante = est;
		this.materia = mat;

		System.out.println(" ------ Ingresando a la base de datos ------ ");
	}

	// GET & SET
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
