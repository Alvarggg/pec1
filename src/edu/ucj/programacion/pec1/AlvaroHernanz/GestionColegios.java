package edu.ucj.programacion.pec1.AlvaroHernanz;
// github https://github.com/Alvarggg/pec1/tree/master/src/edu/ucj/programacion/pec1/AlvaroHernanz
public class GestionColegios {

	public static void main(String[] args) {

		Colegio colegio=new Colegio(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		GestionColegios gar=new GestionColegios();
		gar.identificaciones(colegio,Integer.parseInt(args[3]),Integer.parseInt(args[2]));

	}
	
//cramos un metodo para yamar a los otros metodos	
	public void identificaciones(Colegio colegio,int num, int au ){
		UtilsColegio far=new UtilsColegio();
		Alumno [] x = far.CrearAlumno(num);
		colegio.darAsiento(3, au,x);
	}
}

 