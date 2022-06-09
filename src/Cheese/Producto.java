package Cheese;
/**
 * Clase para la gestión de productos lácteos
 * @author loned
 */
public class Producto {
/**
 * Código único del producto
 */
    private String code;
 /**
 * Procedencia del lacteo
 */   
    private String tipo;
 /**
  * Porentaje de lacteo utilizada
  */   
    private int cantidad_lacteo;
 /**
  * Peso del lácteo
  */   
    private double peso;

    /**
     * Constructor sin argumentos
     */
    public Producto() {
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param codigo del producto
     * @param tipo del producto
     * @param cantidad en litros
     * @param peso en gramos
     */
    public Producto(String codigo,String tipo, int cantidad, double peso) {
        this.code = codigo;
        this.tipo = tipo;
        this.cantidad_lacteo = cantidad;
        this.peso = peso;
    }
    /**
     * @return Devuelve el código del producto lácteo
     */
    public String getcode() {
        return code;
    }

    /**
     * @param codigo Establce el código del lácteo.
     */
    public void setcode(String codigo) {
        this.code = codigo;
    }
    /**
     * Devuelve el tipo de lacteo que usa el producto
     * @return nombre del tipo de lacteo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el valor del atributo tipo de lacteo
     * @param tipo cabra, vaca...
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna el porcentaje de lacteo utilizado
     * @return cantidad de lacteo en litros
     */
    public int getCantidad() {
        return cantidad_lacteo;
    }

    /**
     * Establece el porcentaje de leche utilizado
     * @param cantidad_leche nueva cantidad de leche
     */
    public void setCantidad(int cantidad_leche) {
        this.cantidad_lacteo = cantidad_leche;
    }

    /**
     * Obtiene el peso del lácteo
     * @return el peso en gramos
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el peso del lácteo
     * @param peso que le queremos poner
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

/**
 * Método que nos permite imprimir_cabecera la etiqueta con los datos de
 * fabricación del producto
 */
    public void imprime_etiqueta() {
        System.out.println("+----------------------------------------------------+");
        System.out.println("+ SMR, S.A.                                          +");
        System.out.println("+ Registro Sanitario Nº 55/5555                      +");
        System.out.println("+----------------------------------------------------+");
        this.imprime_detalle();
        System.out.println();
    }
/**
 * Imprime el detalle del producto seleccionado
 * 
 */
    public void imprime_detalle() {
        
        System.out.println("Código  : " + this.getcode());
        System.out.println("Tipo    : " + this.getTipo());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("Peso    : " + this.getPeso());
    }

}
