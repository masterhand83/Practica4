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
public class Terror extends Pelicula {
    private String personajeTerror;
    private double nivelMiedo;
    public Terror(String nombre) {
        super(nombre);
    }
    public Terror(String nombre, Date duracion, Date horario){
        super(nombre, duracion);
    }
}
