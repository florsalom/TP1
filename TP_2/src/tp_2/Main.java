package tp_2;

public class Main {
	public static void main(String[] args) {
		
GestorEquipos nuevo = new GestorEquipos();
Equipo barcelona = new Equipo("Barcelona", "Barcelona");
Equipo psg = new Equipo("PSG", "Paris");
	
	nuevo.getEquipos().add(barcelona);
	nuevo.getEquipos().add(psg);
	
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Lionel Messi", "Delantero", 10, 34));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Gerard Piqué", "Defensa", 3, 34));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Sergio Busquets", "Centrocampista", 5, 33));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Jordi Alba", "Defensa", 18, 32));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Pedri", "Centrocampista", 16, 19));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Frenkie de Jong", "Centrocampista", 21, 24));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Ansu Fati", "Delantero", 22, 19));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Sergio Agüero", "Delantero", 19, 33));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Ronald Araújo", "Defensa", 4, 22));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Memphis Depay", "Delantero", 9, 28));
	nuevo.getEquipos().get(0).agregarJugador(new Jugador("Marc-André ter Stegen", "Portero", 1, 29));
	
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Neymar Jr.", "Delantero", 10, 30));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Kylian Mbappé", "Delantero", 7, 24));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Marco Verratti", "Centrocampista", 6, 29));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Achraf Hakimi", "Defensa", 2, 23));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Marquinhos", "Defensa", 5, 27));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Angel Di María", "Centrocampista", 11, 33));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Gianluigi Donnarumma", "Portero", 1, 26));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Presnel Kimpembe", "Defensa", 3, 25));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Leandro Paredes", "Centrocampista", 8, 27));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Idrissa Gueye", "Centrocampista", 27, 32));
	nuevo.getEquipos().get(1).agregarJugador(new Jugador("Mauro Icardi", "Delantero", 9, 28));
	
	nuevo.jugarPartido(nuevo.getEquipos().get(0), nuevo.getEquipos().get(1));
	
}}
