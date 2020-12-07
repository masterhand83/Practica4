/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: POO
 * Grupo: 2CV3
 * Profesor: Miguel Angel Rodriguez Castillo
 * Alumno(s): Santiago Apreza Robin Miguel
 *              Gustavo Lopez Gonzalez
 * Clase Cine
 */

package practica4;

public class Cine {
    protected String nombre;
    private String ubicacion;
    protected int entradas;
    public Cine(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.entradas = 10;
    }
    
    public int venderEntrada(int cantidad){
        if (cantidad > entradas){
            return 0;
        }
        entradas -= cantidad;
        return entradas;
    }
    
    /**
     * nombre,
     * ubicacion
     */
    public void imprimirDatos(){
        System.out.println("nombre: "+ nombre);
        System.out.println("ubicacion: " + ubicacion);
        System.out.println("entradas" + String.valueOf(entradas));
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
