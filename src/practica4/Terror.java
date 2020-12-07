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
    public Terror(
            String nombre, 
            String horario, 
            String director, 
            double precio,
            String personajeTerror,
            double nivelMiedo,
            int duracion){
        super(nombre, horario, director, precio, duracion);
        this.personajeTerror = personajeTerror;
        this.nivelMiedo = nivelMiedo;
    }

    public String getPersonajeTerror() {
        return personajeTerror;
    }

    public void setPersonajeTerror(String personajeTerror) {
        this.personajeTerror = personajeTerror;
    }

    public double getNivelMiedo() {
        return nivelMiedo;
    }

    public void setNivelMiedo(double nivelMiedo) {
        this.nivelMiedo = nivelMiedo;
    }
    public String toString(){
        return super.toString()
                + "Personaje de Terror: " + personajeTerror+ "\n"
                + "nivel de miedo: " + String.valueOf(nivelMiedo) + "\n";
    }
    
    
}