/***********************************
* Name: Juan    Date: 6/11/2015    *
* Muestra una variable de texto    *
************************************/

public class SalidaFiesta{
	public static void main(String[] args){
		boolean todosAlumnos = Boolean.parseBoolean(args[0]);
		boolean todosEquipos = Boolean.parseBoolean(args[1]);
		boolean noWindows = Boolean.parseBoolean(args[2]);
		boolean profesor = Boolean.parseBoolean(args[3]);
		System.out.println("\nTodos los alumnos: "+todosAlumnos+"\n Todos los Equipos: "+todosEquipos+"\n No tiene Windows: "+noWindows+"\n Esta el Profesor: "+profesor+"\n No hay nadie: "+!todosAlumnos+"\n Es Windows: "+!noWindows);
		
		boolean respuesta = (todosAlumnos && todosEquipos && noWindows) || (!todosAlumnos && profesor && !noWindows);		

		System.out.println("La respuesta correcta es: "+respuesta);
	}
}
