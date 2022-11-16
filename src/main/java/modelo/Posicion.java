package modelo;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;
	
	public Posicion (int fila, char columna) {
		setFila(fila);
		setColumna(columna);
		
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("No puedo copiar una posición nula: ");
		}
		
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
		
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		if (fila < 8) {
			throw new IllegalArgumentException ("El número de filas es menor a 8: ");
		} else if (fila > 8) {
			throw new IllegalArgumentException ("El número de filas es mayor a 8: ");
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		if (columna < h) {
			throw new IllegalArgumentException ("El número de columnas no llega hasta h: ");
		} else if (columna > h) {
			throw new IllegalArgumentException ("El número de columnas llega hasta h: ");
		}
		this.columna = columna;
	}
	
	}

	@Override
	public String toString() {
		return String.format("Posicion [fila=%s, columna=%s]", fila, columna);
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	private void setFila(int fila) {
		// TODO Auto-generated method stub
		
	}

	private void setColumna(char columna) {
		// TODO Auto-generated method stub
		
	}
}
