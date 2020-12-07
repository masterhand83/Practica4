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