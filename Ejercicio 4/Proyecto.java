public class Proyecto {
	private String nombre;
	private EstadoProyecto estado;
	private Prioridad prioridad;

	public Proyecto(String nombre, EstadoProyecto estado, Prioridad prioridad) {
		this.nombre = nombre;
		this.estado = estado;
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoProyecto getEstado() {
		return estado;
	}

	public void setEstado(EstadoProyecto estado) {
		this.estado = estado;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	// METODO PARA AVANZAR DEL ESTADO CON SEGURO QUE SI ESTA YA COMPLETADO NO PUEDE
	// AVANZAR MAS

	public boolean avanzarEstado() {
		boolean exito = true;
		if (estado != EstadoProyecto.COMPLETADO) {
			switch (estado) {
			case NO_INICIADO:
				estado = EstadoProyecto.EN_PROGRESO;
				break;
			case EN_PROGRESO:
				estado = EstadoProyecto.COMPLETADO;
				break;
			}
		} else {
			exito = false;
		}
		return exito;
	}

	// METODO PARA IMPRIMIR VARIABLES

	public void imprimirInformacion() {
		System.out.println("Nombre del Proyecto: " + nombre);
		System.out.println("Estado: " + estado);
		System.out.println("Prioridad: " + prioridad);
		System.out.println();
	}

}
