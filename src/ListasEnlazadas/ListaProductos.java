package ListasEnlazadas;

public class ListaProductos {
    Producto cabeza = null;
    int longitudLista;
    
    //Añadimos los productos al final de la lista
    public void añadirProducto(String nombre, double precio){
        this.longitudLista ++;
        if (cabeza != null) {
            Producto producto = new Producto(nombre, precio);
            producto.apuntador = cabeza;
            cabeza = producto;
        }else{
            cabeza = new Producto(nombre, precio);
        }
    }
    
    //Insertamos los productos al inicio de la lista
    public void insertarProducto(String nombre, double precio){
        this.longitudLista ++;
        if (cabeza != null) {
            Producto producto = new Producto(nombre, precio);
            Producto producto_antes = cabeza;
            while(producto_antes.apuntador!=null){
                producto_antes = producto_antes.apuntador;
            }
            producto_antes.apuntador = producto;
        }else{
            Producto producto = new Producto(nombre, precio);
            cabeza = producto;
        }
    }
    
    //Eliminamos un producto en un índice indicado
    public void eliminarProducto(int position){
        this.longitudLista --;
        if (cabeza != null && position < this.longitudLista) {
            int contador = 0;
            Producto producto_anterior = cabeza;
            while(contador < (position-1) && producto_anterior.apuntador!=null){
                contador ++;
                producto_anterior = producto_anterior.apuntador;
            }
            Producto producto_eliminar = producto_anterior;
            producto_anterior.apuntador = producto_eliminar.apuntador.apuntador;
        }else{
            System.out.println("Erorr : La lista esta vacía");
        }
        
    }
    
    //Mostramos los productos del final al inicio
    public void mostrarProductos(){
        Producto producto = cabeza;
        while(producto!=null){
            System.out.println(producto);
            producto = producto.apuntador;
        }
    } 
    
    public int getLongitud(){
        return this.longitudLista;
    }
}
