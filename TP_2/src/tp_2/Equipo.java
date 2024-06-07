package tp_2;

import java.util.LinkedList;

public class Equipo {
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> jugadores = new LinkedList<>();;
	
	public Equipo(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getCantidadTotalJugadores() {
	    return jugadores.size();
	}
	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", jugadores=" + jugadores + "]";
	}
	
	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	public void eliminarJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}
	public void agregarManualmente() {
		// TODO Auto-generated method stub
		
	}
}	
