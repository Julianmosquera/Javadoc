package libretaapp;
/**
 * That class have the methdos releted with the accions for the user.
 * @author julianlinux
 * @version 1.0
 */
public class Usuario {

    private String nombre;

    private String pass;

    private String id;

    /**
     *
     */
    public Usuario() {
    }
   /**
    * 
    * @param nombre the name of the owner of the notebook.
    * @param pass the password of the notebook.
    * @param id identificador.
    */
    public Usuario(String nombre, String pass, String id) {
        this.nombre = nombre;
        this.pass = pass;
        this.id = id;
    }
    
    

    /**
     *Add contact to the notebook
     */
    public void engadirLibreta() {
    }

    /**
     *Delete a contact for the notebook.
     */
    public void borrarlibreta() {
    }

    /**
     * we can make changes in the notebook
     */
    public void editarLibreta() {
    }
}
