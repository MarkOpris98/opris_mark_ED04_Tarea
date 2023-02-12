package cuentas;

/**
 * Clase CCuenta para la gestión de cuentas bancarias.
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * 
     * Nombre del titular de la cuenta.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés de la cuenta.
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interes de la cuenta.
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor que permite inicializar los valores de nombre, cuenta, saldo y tipo de interés.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo actual de la cuenta.
     * @param tipo Tasa de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
    * Método que permite conocer el saldo actual de la cuenta.
    * @return Saldo actual de la cuenta.
    */
    public double estado()
    {
        return getSaldo();
    }

    /**
    * Método que permite realizar un ingreso en la cuenta.
    * @param cantidad Cantidad a ingresar en la cuenta.
    * @throws Exception Si la cantidad es negativa, se lanzará una excepción.
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de dinero de la cuenta.
     * @param cantidad la cantidad a retirar   
     * @throws Exception si la cantidad es negativa o si el saldo actual es insuficiente
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
