
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int numeroPaginas;
    private boolean ficcion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombre, int anno, int numeroPaginas, boolean ficcion)
    {
       super(nombre,anno);
       this.numeroPaginas = numeroPaginas;
       this.ficcion = ficcion;
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public boolean getFiccion()
    {
        return ficcion;
    }

    public double getPrecio(){
        double precioDevolver = 1;

        precioDevolver = (numeroPaginas / 100 ) * (getAno() - 2010);

        return precioDevolver;
    } 
}
