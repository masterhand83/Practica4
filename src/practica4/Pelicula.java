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
public class Pelicula extends Cine {
    protected Date duracion;
    protected Date horario;
    protected String director;
    protected double precio;
    

    public Pelicula(String nombre) {
        super(nombre);
    }
    public Pelicula(String nombre, Date date ){
        super(nombre);
        
    }

}
