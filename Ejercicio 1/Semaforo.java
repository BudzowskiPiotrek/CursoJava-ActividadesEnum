public class Semaforo {
	private ColorSemaforo color;

	public Semaforo(ColorSemaforo colorInicial) {
		this.color = colorInicial;
	}

	// METODO PARA SECUENCIA DE SEMAFOROS

	public void cambiarColor() {
		switch (color) {
		case ROJO:
			color = ColorSemaforo.VERDE;
			break;
		case AMARILLO:
			color = ColorSemaforo.ROJO;
			break;
		case VERDE:
			color = ColorSemaforo.AMARILLO;
			break;
		}
	}

	// METODO PARA IMPRIMIR

	public void imprimirEstado() {
		System.out.println(color);
	}
}