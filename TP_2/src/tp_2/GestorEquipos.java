package tp_2;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class GestorEquipos {
	private LinkedList<Equipo> equipos;
	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}
	public GestorEquipos() {
		equipos = new LinkedList<>();
	}
	public GestorEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
			}
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
			}
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}
	public int getCantidadTotalEquipos() {
	    return equipos.size();
	}
	public LinkedList<Equipo> obtenerListaEquipos() {
	    return equipos;
	}
			
	public void jugarPartido(Equipo equipo1, Equipo equipo2) {
		if (equipo1==equipo2) {
			JOptionPane.showMessageDialog(null, "Los datos del partido no son válidos");
			return;
		} else {
			if (equipo1.getJugadores().size()<7 || equipo2.getJugadores().size()<7) {
				JOptionPane.showMessageDialog(null, "No hay suficientes jugadores");
				return;
			}
		}
	        if (equipo1 == equipo2) {
	            JOptionPane.showMessageDialog(null, "Los datos del partido no son válidos");
	            return;
	        } else {
	            if (equipo1.getJugadores().size() < 7 || equipo2.getJugadores().size() < 7) {
	                JOptionPane.showMessageDialog(null, "No hay suficientes jugadores");
	                return;
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Juegan: " + equipo1.getNombre() + " contra " + equipo2.getNombre());
	        JOptionPane.showMessageDialog(null, "Inicio del primer tiempo");

	        int tarjetasAmarillasEquipo1PT = 0;
	        int tarjetasAmarillasEquipo2PT = 0;
	        int tarjetasRojasEquipo1PT = 0;
	        int tarjetasRojasEquipo2PT = 0;

	        double randomAmEquipo1 = Math.random()*5;
	        double randomRoEquipo1 = Math.random()*5;
	        
	        int golesEquipo1PT = 0;
	        int golesEquipo2PT = 0;
	        
	        if (Math.random() >= 0) {
	            golesEquipo1PT++; 
	            JOptionPane.showMessageDialog(null, equipo1.getNombre() + " anotó un gol");
	        }
	        if (randomAmEquipo1 >= 0.5) {
	            tarjetasAmarillasEquipo1PT++;
	            JOptionPane.showMessageDialog(null, "Hubo tarjeta(s) amarillas para " + equipo1.getNombre());
	        }
	        if (randomRoEquipo1 >= 0.5) {
	            tarjetasRojasEquipo1PT++;
	            JOptionPane.showMessageDialog(null, "Hubo tarjeta(s) rojas para " + equipo1.getNombre());
	        }
	        double randomAmEquipo2 = Math.random();
	        double randomRoEquipo2 = Math.random();
	        if (randomAmEquipo2 >= 0.5) {
	            tarjetasAmarillasEquipo2PT++;
	            JOptionPane.showMessageDialog(null, "Hubo tarjeta(s) amarillas para " + equipo2.getNombre());
	        }
	        if (randomRoEquipo2 >= 0.5) {
	            tarjetasRojasEquipo2PT++;
	            JOptionPane.showMessageDialog(null, "Hubo tarjeta(s) rojas para " + equipo2.getNombre());

	            
	        int tarjetasAmarillasEquipo1ST = 0;
	        int tarjetasAmarillasEquipo2ST = 0;
	        int tarjetasRojasEquipo1ST = 0;
	        int tarjetasRojasEquipo2ST = 0;

	        double randomAmEquipo1ST = Math.random();
	        double randomRoEquipo1ST = Math.random();
	        

	        if (randomAmEquipo1ST <= 0.5) {
	            tarjetasAmarillasEquipo1ST++;
	            JOptionPane.showMessageDialog(null, "No hubo tarjetas amarillas para " + equipo1.getNombre() + " en el primer tiempo");
	        }
	        if (randomRoEquipo1ST <= 0.5) {
	            tarjetasRojasEquipo1ST++;
	            JOptionPane.showMessageDialog(null, "No hubo tarjetas rojas para " + equipo1.getNombre() + " en el primer tiempo");
	        }
	        JOptionPane.showMessageDialog(null, "Fin del primer tiempo");
	        
	        JOptionPane.showMessageDialog(null, "Resultados del primer tiempo: Tarjetas rojas " + tarjetasRojasEquipo1PT + ", Tarjetas amarillas " + tarjetasAmarillasEquipo2PT + ", Goles " + golesEquipo1PT + ", Goles " + golesEquipo2PT);

	        JOptionPane.showMessageDialog(null, "Inicio del segundo tiempo");
	        
	        double randomAmEquipo2ST = Math.random();
	        double randomRoEquipo2ST = Math.random();
	        if (randomAmEquipo2ST >= 0.5) {
	            tarjetasAmarillasEquipo2ST++;
	            JOptionPane.showMessageDialog(null, "Hubo tarjeta(s) amarillas para " + equipo2.getNombre() + " en el segundo tiempo");
	        } else {
	            JOptionPane.showMessageDialog(null, "No hubo tarjetas amarillas para " + equipo2.getNombre() + " en el segundo tiempo");
	        }
	        if (randomRoEquipo2ST >= 0.5) {
	            tarjetasRojasEquipo2ST++;
	            JOptionPane.showMessageDialog(null, "Hubo tarjeta(s) rojas para " + equipo2.getNombre() + " en el segundo tiempo");
	        } else {
	            JOptionPane.showMessageDialog(null, "No hubo tarjetas rojas para " + equipo2.getNombre() + " en el segundo tiempo");
	        }
	        int golesEquipo1ST = (int) (Math.random())*5;
	        int golesEquipo2ST = (int) (Math.random())*5;
	        
	        if (golesEquipo1ST >= 1 ) {
	        JOptionPane.showMessageDialog(null, equipo1.getNombre() + " anotó un gol");
	        }
	        if (golesEquipo2ST >= 1 ) {
		        JOptionPane.showMessageDialog(null, equipo2.getNombre() + " anotó un gol");
		        }

	        JOptionPane.showMessageDialog(null, "Fin del partido");

	        JOptionPane.showMessageDialog(null, "Resultados finales del partido:");
	        JOptionPane.showMessageDialog(null, "Tarjetas Amarillas " + equipo1.getNombre() + ": " + (tarjetasAmarillasEquipo1PT + tarjetasAmarillasEquipo1ST) + "\n" + "Tarjetas Amarillas " + equipo2.getNombre() + ": " + (tarjetasAmarillasEquipo2PT + tarjetasAmarillasEquipo2ST) + "\n" + "Tarjetas Rojas " + equipo1.getNombre() + ": " + (tarjetasRojasEquipo1PT + tarjetasRojasEquipo1ST) + "\n" + "Tarjetas Rojas " + equipo2.getNombre() + ": " + (tarjetasRojasEquipo2PT + tarjetasRojasEquipo2ST) + "\n" + "Goles " + equipo1.getNombre() + ": " + (golesEquipo1PT + golesEquipo1ST) + "\n" + "Goles " + equipo2.getNombre() + ": " + (golesEquipo2PT + golesEquipo2ST));

	        if (golesEquipo1PT + golesEquipo1ST > golesEquipo2PT + golesEquipo2ST) {
	            JOptionPane.showMessageDialog(null, "Ganó: " + equipo1.getNombre());
	        } else if (golesEquipo2PT + golesEquipo2ST > golesEquipo1PT + golesEquipo1ST) {
	            JOptionPane.showMessageDialog(null, "Ganó: " + equipo2.getNombre());
	        } else {
	            JOptionPane.showMessageDialog(null, "El partido terminó en empate");
	        }
	    }
	}}