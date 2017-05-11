
/**
 * Write a description of class ProductosMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    private String nombre;
    private int anno;
    

    /**
     * Constructor for objects of class ProductosMultimedia
     */
    public ProductoMultimedia(String nombre, int anno)
    {
        super(nombre);
        this.anno = anno;
      
    }
    
    public String getTitulo(){
        return getTituloONombre();
    }
    
    public int getAno(){
        return anno;
    }

	abstract double getPrecio();
}
