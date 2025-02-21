import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// CREO OBJETO DE PRUEBA Y IMPRIMO SUS VARIABLES
		Empleado e1 = new Empleado("Juanito Fulano", 1, Departamento.TI, Genero.MASCULINO);
		e1.imprimirInformacion();

		// CREO SCANER PARA IMPRIMIR POR CONSOLA
		Scanner st = new Scanner(System.in);
		System.out.println("\n¿A que departamento te vas a cambiar?\nOpciones: ");

		// IMPRIMO OPCIONES
		Departamento[] departamento2 = Departamento.values();
		for (int i = 0; i < departamento2.length; i++) {
			System.out.print(departamento2[i] + " ");
		}

		// GUARDO TEXTO INGRESADO LO PONGO EN MAYUSCULA LO CASTEO.
		String departamento = st.nextLine();
		departamento = departamento.toUpperCase();
		Departamento nuevoDepartamento = Departamento.valueOf(departamento);

		// USO EL METODO DE CAMBIO DE DEPARTAMENTO Y IMPRIMIR
		e1.cambiarDepartamento(nuevoDepartamento);
		e1.imprimirInformacion();

	}
}