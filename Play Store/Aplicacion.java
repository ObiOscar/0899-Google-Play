
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private String nombre;
    private double tamañoMB;
    private Categoria tipo;

    /**
     * Constructor de la calse Apliacion
     * Necesita un nombre, un tamaño y una categoria que lo coge de la clase enum
     */
    public Aplicacion(String nombre, double tamaño,Categoria tipo)
    {
        super(nombre);
        tamañoMB = tamaño;
        this.tipo = tipo;       
    }

    public String getNombre()
    {
       return getTituloONombre();
    }
    
    public double getTamanoEnMB()
    {
        return tamañoMB;
    }
    
    public String getCategoria()
    {
		String cadena = tipo + "";

		String primeraLetra = cadena.substring(0,1);
		String restoCadena = cadena.substring(1,cadena.length());

		cadena = primeraLetra.toUpperCase() + restoCadena.toLowerCase();

		return cadena;
    }
}
