/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: [MATERIA]
 * Grupo: [GRUPO]
 * Profesor: [Profesor]
 * Alumno(s): Santiago Apreza Robin Miguel
 * [Uso y proposito de la clase]
 */

package practica4;

import java.util.Date;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class Comedia extends Pelicula{
    private int numPersonajesPrincipales;
    private int numChistes;
    private double nivelFelicidad;
    public Comedia(String nombre) {
        super(nombre);
    }
    public Comedia(String nombre, Date duracion, Date horario){
        super(nombre, duracion);
    }
    
    

}
