public class Empresa {
	private Proyecto[] proyectos;
	private int contadorProyectos;

	public Empresa(int capacidad) {
		proyectos = new Proyecto[capacidad];
		contadorProyectos = 0;
	}

	// METODO PARA AGREGAR PROYECTO CON SEGURO POR EL CONTADOR COMO NO SE PUEDE
	// BORRARLOS ES MAS COMODO

	public boolean agregarProyecto(Proyecto proyecto) {
		boolean exito = false;
		if (contadorProyectos < proyectos.length) {
			proyectos[contadorProyectos] = proyecto;
			contadorProyectos++;
			exito = true;
		}
		return exito;
	}

	// METODO PARA LISTAS TODOS LOS PROYECTOS EN CASO DE NO TENER NINGUNO DEVUELVE
	// FALSE

	public boolean listarProyectos() {
		boolean exito = false;
		if (contadorProyectos != 0) {
			for (int i = 0; i < contadorProyectos; i++) {
				proyectos[i].imprimirInformacion();
			}
		}
		return exito;
	}

	// METODO FILTRAR POR ESTADO PRIMERO COMPRUEBA SI HAY ALGUNOS PROYECTOS
	// DISPONIBLE Y LUEGO IMPRIME SOLO POR ESTADO QUE SE INGRESA

	public boolean filtrarPorEstado(EstadoProyecto estado) {
		boolean exito = false;
		if (contadorProyectos < proyectos.length) {
			for (int i = 0; proyectos[i] != null && i < contadorProyectos; i++) {
				if (proyectos[i].getEstado() == estado) {
					proyectos[i].imprimirInformacion();
					exito = true;
				}
			}
		}
		return exito;
	}

	// METODO FILTRAR POR PRIORIDAD PRIMERO COMPRUEBA SI HAY ALGUNOS PROYECTOS
	// DISPONIBLE Y LUEGO IMPRIME SOLO POR PRIORIDAD QUE SE INGRESA

	public boolean filtrarPorPrioridad(Prioridad prioridad) {
		boolean exito = false;
		if (contadorProyectos < proyectos.length) {
			for (int i = 0; proyectos[i] != null && i < contadorProyectos; i++) {
				if (proyectos[i].getPrioridad() == prioridad) {
					proyectos[i].imprimirInformacion();
					exito = true;
				}
			}
		}
		return exito;
	}
}