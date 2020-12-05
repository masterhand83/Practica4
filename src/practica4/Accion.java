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
public class Accion extends Pelicula {
    private int numPersecuciones;
    private int numEnfrentamientos;
    private double nivelViolencia;
    public Accion(String nombre) {
        super(nombre);
    }
    public Accion(String nombre, Date duracion, Date horario){
        super(nombre, duracion);
    }
}
