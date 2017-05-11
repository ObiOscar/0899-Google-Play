
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    static final int FULLHD = 1080;
    private int duracionMinutos;
    private int calidad;

    /**
     * Constructor for objects of class Libro
     */
    public Pelicula(String nombre, int anno, int duracionMinutos, int calidad)
    {
       super(nombre,anno);
       this.duracionMinutos = duracionMinutos;
       this.calidad = calidad;
    }

    public int getDuracion(){
        return duracionMinutos;
    }
    
    /**
     * Nos devuelve FullHD si la calidad es mayor a o igual a la constante FULLHD, y sino pues HD
     */
    public String getCalidad()
    {
        String cadenaADevolver = "";
      
        cadenaADevolver = (calidad >= FULLHD) ? "FullHD" : "HD";
         
        return cadenaADevolver;
    }
}
