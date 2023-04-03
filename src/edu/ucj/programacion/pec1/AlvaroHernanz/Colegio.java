package edu.ucj.programacion.pec1.AlvaroHernanz;
//declaramos las variables
public class Colegio {
	private String nombre;
	private  String direccion;
	private int aulas;
	private int numAlumnos;
	// creamos los get set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	//creamos el constructor
	public Colegio(String nombre, String direccion, int aulas, int numAlumnos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
		this.numAlumnos= numAlumnos;
	}
	//creamos el metodo para asignar los asientos
	
	public void darAsiento(int asiento, int aulas, Alumno [] alumnos) {
		Alumno [][] asientos= new Alumno [aulas][3];
		int h=0;
		for(int i=0; i<aulas; i++) {
			for(int j=0;j < asiento;j++) {
				if(asientos[i][j]== null) {
					asientos[i][j]=alumnos[h];
					System.out.println("el alumno "+asientos[i][j].getNombre()+"con apellido "+asientos[i][j].getApellidos()+
							"con dni "+asientos[i][j].getDni()+" se encuentra en el asiento "+j+" del aula "+i);
					h++;
					}
				else if(asientos[aulas-1][2]!=null) {
					System.out.println("No hay sitios libres para el alumno "+alumnos[h]);
					h++;
				}
			}
		}
	}
}

