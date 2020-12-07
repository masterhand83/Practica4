/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: POO
 * Grupo: 2CV3
 * Profesor: Miguel Angel Rodriguez Castillo
 * Alumno(s): Santiago Apreza Robin Miguel
 *              Gustavo Lopez Gonzalez
 * Clase Accion
 */

package practica4;

import java.util.Date;
public class Accion extends Pelicula {
    private int numPersecuciones;
    private int numEnfrentamientos;
    private double nivelViolencia;
    public Accion(
            String nombre, 
            String horario, 
            String director, 
            double precio,
            int numPersecuciones,
            int numEnfrentamientos,
            double nivelViolencia,
            int duracion){
        super(nombre, horario, director, precio, duracion);
        this.numPersecuciones = numPersecuciones;
        this.numEnfrentamientos = numEnfrentamientos;
        this.nivelViolencia = nivelViolencia;
    }

    public int getNumPersecuciones() {
        return numPersecuciones;
    }

    public void setNumPersecuciones(int numPersecuciones) {
        this.numPersecuciones = numPersecuciones;
    }

    public int getNumEnfrentamientos() {
        return numEnfrentamientos;
    }

    public void setNumEnfrentamientos(int numEnfrentamientos) {
        this.numEnfrentamientos = numEnfrentamientos;
    }

    public double getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(double nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }
    
    public String toString(){
        return super.toString()
                + "Personajes Principales: "
                    + String.valueOf(numPersecuciones) + "\n"
                + "Enfrentamientos: " + String.valueOf(numEnfrentamientos) + "\n"
                + "nivel de violencia: "+String.valueOf(nivelViolencia) + "\n"; 
    }

}
