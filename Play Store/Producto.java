
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Producto 
{
    private String nombre;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
    }

    protected String getTituloONombre()
    {
        return nombre;
    }
   
}
