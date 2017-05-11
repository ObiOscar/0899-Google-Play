import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    static final double PRECIO_INICIAL_APLICACIONES = 0.99;
    static final double MINIMO_VECES_VENDIDA  = 2;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Producto> productosGooglePlay; 
    private ArrayList<Producto> productosComprados;
    
    
    public GooglePlay()
    {
        listaUsuarios = new ArrayList<>();
        productosGooglePlay = new ArrayList<>();
        productosComprados = new ArrayList<>();
    }
    
    public int getNumeroProductos(){
        return productosGooglePlay.size();
    }
    
    public void addProducto(Producto producto)
    {
        productosGooglePlay.add(producto);
    }
    
    public int getNumeroUsuarios(){
        return listaUsuarios.size();
    }
    
    public void addUsuario(Usuario usuario)
    {
        listaUsuarios.add(usuario);
    }

    public double comprar(String correo, String titulo){
        double resultadoCompra = -1;        //devuelve -1 si no encuentra titulo
        boolean correoExiste = false;
        boolean tituloExiste = false;
        int numeroProducto = 0;
        int contadorProductoEncontrado = 0;
        
        int contadorUsuario = 0;
        while (!correoExiste && listaUsuarios.size() > contadorUsuario){
            if(listaUsuarios.get(contadorUsuario).getNombreCuenta().equals(correo)){
                correoExiste = true;
            }
            contadorUsuario++;
        }
        
        int contadorProducto = 0;
        while (!tituloExiste && productosGooglePlay.size() > contadorProducto){
            if(productosGooglePlay.get(contadorProducto).getTituloONombre().equals(titulo) && !tituloExiste){
                tituloExiste = true;
                numeroProducto = contadorProducto;
            }
            contadorProducto++;
        }


        
        
        if(correoExiste && tituloExiste){
            resultadoCompra = PRECIO_INICIAL_APLICACIONES;
            for(int i = 0; i<productosComprados.size(); i++){
                if(productosComprados.get(i).getTituloONombre().equals(titulo)){  
                    contadorProductoEncontrado++;
              }
            }
            if(contadorProductoEncontrado >= MINIMO_VECES_VENDIDA){
                resultadoCompra = productosGooglePlay.get(numeroProducto).getPrecio();//comprueb    o el precio
             }
            productosComprados.add(productosGooglePlay.get(numeroProducto));
             if(productosGooglePlay.get(numeroProducto).getClass().getSimpleName().equals("Libro")){             
                 resultadoCompra = productosGooglePlay.get(numeroProducto).getPrecio();
            }
             if(productosGooglePlay.get(numeroProducto).getClass().getSimpleName().equals("Pelicula")){             
                 resultadoCompra = productosGooglePlay.get(numeroProducto).getPrecio();
            }
        }
        

        return resultadoCompra;
    }
    
    public boolean estaDuplicadoEnCompra(ArrayList<Producto> lista){
        boolean estaDuplicado = false;
        for(int i=0;i<lista.size()-1;i++){
                for(int j=i+1;j<lista.size();j++){
                    if(lista.get(i).getTituloONombre().equals(lista.get(j).getTituloONombre())){
                        estaDuplicado = true;
                    }
                }
            }
        return estaDuplicado;
    }
}
