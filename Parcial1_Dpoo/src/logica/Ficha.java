package logica;

public abstract class Ficha {
	protected double posInicialCol;

	public double getposInicialCol() {
		return posInicialCol;
	}

	public void setposInicialCol(double posInicialCol) {
		this.posInicialCol = posInicialCol;
	}
	
	

	public Ficha(double posInicialCol, double posInicialFila) {
		this.posInicialCol = posInicialCol;
		this.posInicialFila = posInicialFila;
	}
	
	
	protected double posInicialFila;

	public double getposInicialFila() {
		return posInicialFila;
	}

	public void setposInicialFila(double posInicialFila) {
		this.posInicialFila = posInicialFila;
	}

	public Ficha(double posInicialFila) {
		this.posInicialFila = posInicialFila;
	}
	
	public abstract double calcularMovCol();
	
	public abstract double calcularMovFila();
	
	
}

