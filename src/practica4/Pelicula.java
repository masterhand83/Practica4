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
    protected int duracion;
    protected String horario;
    protected String director;
    protected double precio;
    

    public Pelicula(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }
    public Pelicula(String nombre, String horario, String director, 
                double preci, int duracion){
        this("f", "f");

        this.nombre = nombre;
        this.horario = horario;
        this.director = director;
        this.precio = preci;
        this.duracion = duracion;
        
    }
    public String toString(){
            return ""
                    + "duracion: " + String.valueOf(duracion) + " minutos \n"
                    + "horario: " + this.horario + "\n"
                    + "director: " + this.director + "\n"
                    + "precio: $"+this.precio+ "\n";
        }
    /**
     * Nombre,
     * Director,
     * Horario,
     * Precio de entrada
     */
    public void imprimirDatos(){
        System.out.println(this.toString());
    }   

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
