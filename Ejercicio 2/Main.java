public class Main {

	public static void main(String[] args) {
		// CREO EL OBJETO Y IMPRIMO SU ESTADO

		Orden o1 = new Orden();
		o1.imprimirEstado();

		// LO PASAMOS POR LAS TRES FASES
		for (int i = 0; i < 5; i++) {
			boolean estado = o1.avanzarEstado();
			if (estado) {
				o1.imprimirEstado();
			} else {
				System.out.println("No se puede avanzar mas, ya fue entregado");
			}
		}
	}
}
