/*
*	grupo  : GDAM 1-2
*	alumno : Alberto Ramos Morlanes
*	n.exp. : 7258
*	fecha  : 2022/06/09
 */
package Cheese;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         System.out.println();
         
         Producto producto01 = new Producto("01", "alimentacion", 1, 100);
         Producto producto02 = new Producto("02", "ferreteria", 2, 1500);
         
         ListaProductos lista = new ListaProductos("lista");
         lista.registraProducto(producto01);
         lista.registraProducto(producto02);
         
         for (Producto producto : lista.recuperaProductos()) {
        	 producto.imprime_etiqueta();
         }
     }
}
