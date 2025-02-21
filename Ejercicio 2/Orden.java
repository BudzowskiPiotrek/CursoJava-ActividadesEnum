public class Orden {
	private EstadoOrden estado;

	// CONSTRUCTOR EMPIEZA EN UN ESTADO PENDIENTE

	public Orden() {
		this.estado = EstadoOrden.PENDIENTE;
	}

	// METODO PARA AVANZAR DEL ESTADO CON SEGURO QUE SI ESTA YA ENTREGADO NO PUEDE
	// AVANZAR MAS

	public boolean avanzarEstado() {
		boolean exito = true;
		if (estado != EstadoOrden.ENTREGADA) {
			switch (estado) {
			case PENDIENTE:
				estado = EstadoOrden.PROCESANDO;
				break;
			case PROCESANDO:
				estado = EstadoOrden.ENVIADA;
				break;
			case ENVIADA:
				estado = EstadoOrden.ENTREGADA;
				break;
			}
		} else {
			exito = false;
		}
		return exito;

	}

	public void imprimirEstado() {
		System.out.println(estado);
	}
}