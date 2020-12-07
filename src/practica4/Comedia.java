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


public class Comedia extends Pelicula{
    private int numPersonajesPrincipales;
    private int numChistes;
    private double nivelFelicidad;
    public Comedia(
            String nombre, 
            String horario, 
            String director, 
            double precio, 
            int numPersonajesPrincipales,
            int numChistes,
            double nivelFelicidad,
            int duracion){

        super(nombre, horario, director, precio, duracion);
        this.numPersonajesPrincipales = numPersonajesPrincipales;
        this.numChistes = numChistes;
        this.nivelFelicidad = nivelFelicidad;
    }

    public int getNumPersonajesPrincipales() {
        return numPersonajesPrincipales;
    }

    public void setNumPersonajesPrincipales(int numPersonajesPrincipales) {
        this.numPersonajesPrincipales = numPersonajesPrincipales;
    }

    public int getNumChistes() {
        return numChistes;
    }

    public void setNumChistes(int numChistes) {
        this.numChistes = numChistes;
    }

    public double getNivelFelicidad() {
        return nivelFelicidad;
    }

    public void setNivelFelicidad(double nivelFelicidad) {
        this.nivelFelicidad = nivelFelicidad;
    }
    
    public String toString(){
        return super.toString()
                + "número de personajes principales: "
                    + String.valueOf(numPersonajesPrincipales) + "\n"
                + "numero de chistes: " + String.valueOf(numChistes) + "\n"
                + "nivel de felicidad: "+String.valueOf(nivelFelicidad) + "\n"; 
    }
}
