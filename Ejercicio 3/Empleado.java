public class Empleado {

	private String nombre;
	private int id;
	private Departamento departamento;
	private Genero genero;

	public Empleado(String nombre, int id, Departamento departamento, Genero genero) {
		this.nombre = nombre;
		this.id = id;
		this.departamento = departamento;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	// METODO PARA IMPRIMIR VARIANTES DE CLASE EMPLEADO
	
	public void imprimirInformacion() {
		System.out.println("\nNombre: " + nombre);
		System.out.println("ID: " + id);
		System.out.println("Departamento: " + departamento);
		System.out.println("Genero: " + genero);
	}

	// METODO PARA CAMBIAR DE DEPARTAMIENTO

	public void cambiarDepartamento(Departamento nuevoDepartamento) {
		this.departamento = nuevoDepartamento;
	}
}
