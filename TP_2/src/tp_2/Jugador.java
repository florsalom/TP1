package tp_2;

public class Jugador {
	private String nombre;
	private String posicion;
	private int edad;
	private int nrocamiseta;
	
	public Jugador(String nombre, String posicion, int edad, int nrocamiseta) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;
		this.nrocamiseta = nrocamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNrocamiseta() {
		return nrocamiseta;
	}

	public void setNrocamiseta(int nrocamiseta) {
		this.nrocamiseta = nrocamiseta;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", edad=" + edad + ", nrocamiseta="
				+ nrocamiseta + "]";
	}
	

}
