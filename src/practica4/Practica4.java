/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: [MATERIA]
 * Grupo: [GRUPO]
 * Profesor: Miguel Anfel Rodriguez Castillo
 * Alumno(s): Santiago Apreza Robin Miguel
 * [Uso y proposito de la clase]
 */
package practica4;

import java.util.Date;

/**
 *
 * @author Skynet
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comedia com = new Comedia(
                "La risa en vacaciones 4",
                "11 a 12", "Roberto Gomez Bolaños", 
                58.0, 4, 2, 100, 120);
        Terror terr = new Terror(
                "2020", 
                "7am A 8pm", 
                "Omar chaparro", 
                30.0, "Peniuais", 50, 320);
        Accion acc = new Accion(
                "No manches Frida 10", 
                "8pm a 10pm", 
                "Eugenio Derbez", 40.5, 
                19, 2, 100, 160);
        
        Cine cin = new Cine("Cinepolis", "Edomex. Toreo. C.P: 53718");
        
        cin.imprimirDatos();
        com.imprimirDatos();
        terr.imprimirDatos();
        acc.imprimirDatos();
    }
    
}
