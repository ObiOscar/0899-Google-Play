import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Producto> productosGooglePlay;    
    
    public GooglePlay()
    {
        listaUsuarios = new ArrayList<>();
        productosGooglePlay = new ArrayList<>();
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

	public int comprar(String correo, String titulo){
		int resultadoCompra = -1;		//devuelve -1 si no encuentra titulo
		boolean correoExiste = false;
		boolean tituloExiste = false;
		
		for(Usuario usuario : listaUsuarios){
			if(usuario.getNombreCuenta().equals(correo)){
				correoExiste = true;
			}
		}

		for(Producto productoGoogle : productosGooglePlay){
			if(productoGoogle.getTituloONombre().equals(titulo) && tituloExiste){
				tituloExiste = true;
			}
		}

		if(correoExiste && tituloExiste){
			//compruebo el precio
		}

		return resultadoCompra;
	}
}
