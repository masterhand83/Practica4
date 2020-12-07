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

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class Cine {
    protected String nombre;
    private String ubicacion;
    
    public Cine(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public void venderEntrada(int cantidad){
        
    }
    
    /**
     * nombre,
     * ubicacion
     */
    public void imprimirDatos(){
        System.out.println("nombre: "+ nombre);
        System.out.println("ubicacion: " + ubicacion);
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
