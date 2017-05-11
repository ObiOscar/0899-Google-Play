
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private String correo;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String correo)
    {
       this.correo=correo;
    }
    
    public String getNombreCuenta(){
        return correo;
    }
}
