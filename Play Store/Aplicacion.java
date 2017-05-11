import java.util.ArrayList;
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    static final double PRECIO_INICIAL_APLICACIONES = 0.99;
    static final double PRECIO_APLICACIONES_VENDIDA_MAS_DOS_VECES_SI_ES_JUEGO = 5;
    static final double PRECIO_PRODUCTIVIDAD = 10;
    static final double PRECIO_MULTIMEDIA_Y_COMUNICACIONES = 2;
    static final double MINIMO_VECES_VENDIDA  = 2;
    private String nombre;
    private double tamañoMB;
    private Categoria tipo;
	private int aplicacionComprada;

    /**
     * Constructor de la calse Apliacion
     * Necesita un nombre, un tamaño y una categoria que lo coge de la clase enum
     */
    public Aplicacion(String nombre, double tamaño,Categoria tipo)
    {
        super(nombre);
        tamañoMB = tamaño;
        this.tipo = tipo;  
		aplicacionComprada = 0;   
    }

    public String getNombre()
    {
       return getTituloONombre();
    }
    
    public double getTamanoEnMB()
    {
        return tamañoMB;
    }

	public int vecesCompradoAplicacion(){
		return aplicacionComprada++;
	}
    
    public String getCategoria()
    {
		String cadena = tipo + "";

		String primeraLetra = cadena.substring(0,1);
		String restoCadena = cadena.substring(1,cadena.length());

		cadena = primeraLetra.toUpperCase() + restoCadena.toLowerCase();

		return cadena;
    }

	public double getPrecio(){
		double precioDevolver = PRECIO_INICIAL_APLICACIONES;
		
		if(aplicacionComprada >= MINIMO_VECES_VENDIDA && getCategoria().equals("Juegos")){
			precioDevolver = PRECIO_APLICACIONES_VENDIDA_MAS_DOS_VECES_SI_ES_JUEGO;
		}

		if(getCategoria().equals("Productividad")){
			precioDevolver = PRECIO_PRODUCTIVIDAD;
		}

		if(getCategoria().equals("Multimedia") || getCategoria().equals("Comunicaciones") ){
			precioDevolver = PRECIO_MULTIMEDIA_Y_COMUNICACIONES;
		}

		return precioDevolver;
	} 
}
