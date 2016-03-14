package libretaapp;
/**
 * Is for doing mains methods of the proyect
 * @author julianlinux
 * @version 1.0 
 */
public class Libreta {

   
    public String nombre;
    private String email;

  
   /**
    * 
    * @param nombre 
    * @param email 
    * 
    */
    public Libreta(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    

    /**
     * Builder of the class with out parameters
     */
    public Libreta() {
    }

    /**
     *
     * Add a contact
     *
     */
    public void engadir() {
    }

    /**
     *
     * @return free contact
     */
    public int cualLibre(int lib) {
        return lib;
    }

    /**
     *Make list with contacts 
     */
    public void listar() {
    }

    /**
     *Make groups with the contacts 
     */
    public void engadirGrupo() {
    }

    /**
     *Delete a group
     */
    public void borrarGrupo() {
    }

    /**
     *Make list with the gruops
     */
    public void listarGrupo() {
    }
}
