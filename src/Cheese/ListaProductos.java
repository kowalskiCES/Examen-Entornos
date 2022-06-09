/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }

    /**
     * Constructor de la clase ListaProductos.
     * @param nombre de la lista
     */
    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    
    /**
     * Metodo para saber el numero de productos totales en una lista de productos
     * @return numero de productos en la lista
     */
    public int totalProductos(){
            return this.getNumProductos();
    }
        
    /**
     * Metodo para a�adir un producto a la lista
     * @param producto a registrar
     * @return producto pasado por parametros si el metodo se ha ejecutado correctamente
     */
    public Producto registraProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }

    /**
     * Elimina un producto de una lista
     * @param codigo del producto a eliminar
     * @return producto eliminado
     */
    public Producto descartaProducto(String codigo) { 
        
        Producto prod = encuentraProducto(codigo);
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }

    /**
     * Devuelve un producto en base a su codigo de producto
     * @param codigo del producto a buscar
     * @return si el producto existe devuelve su codigo, si no null
     */
    public Producto encuentraProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
