package edu.ucj.programacion.pec1.AlvaroHernanz;

import java.util.Scanner;

public class UtilsColegio {
//creamos el metodo para crear el numero de alumnos indicado y devuelvan un array con todos los datos de todos los alumnos
public Alumno[] CrearAlumno (int cantidad) {
	Alumno [] alumnos= new Alumno[cantidad];
	for(int i=0; i<cantidad;i++) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el nombre del alumno");
		String nombre=teclado.nextLine();
		System.out.println("Escribe al apellido del alumno");
		String apellidos=teclado.nextLine();
		System.out.println("Escribe el dni del alumno");
		String dni=teclado.nextLine();
		Alumno alumno=new Alumno(nombre,apellidos,dni);
		alumnos[i]=alumno;
	}
	return alumnos;
}
}
