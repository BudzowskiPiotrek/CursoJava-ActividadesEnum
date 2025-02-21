public class Main {

	public static void main(String[] args) {

		Semaforo semaforo = new Semaforo(ColorSemaforo.VERDE);

		// UN BUCLE INFINITO CON METODO SLEEP PARA RELANTIZAR
		while (true) {
			semaforo.cambiarColor();
			semaforo.imprimirEstado();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}
