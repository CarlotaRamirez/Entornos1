package cuentas;
/**
 * 
 * @author Carlota Ramirez
 *
 * El Objeto CCuenta para crear cuentas bancarias  "nombre", "numero de cuenta", "saldo", "interes
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * 
     * 
     *1Constructor: si no se especifica ningún parámetro, no se dará ninguna variable
     */
    
    
    public CCuenta()
    {
    }

    /**
     * 2Constructor: creará la cuenta dados los parametros que se han enviado
     * @param nom el nombre de  cuenta
     * @param cue   Nº de  cuenta
     * @param sal   Salario
     * @param tipo  Cantidad de interes
     */
    
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Getter de saldo
     * @return saldo
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Añade el dinero especificado a la cuenta
     * Añade la cantidad dada a la variable cantidad
     * @param cantidad que se le ingresa a la cuenta
     * @throws Exception cuando ocurre un error, no se puede ingresar esa cantidades negativas
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * 
     * Saca el dinero de la cuenta
     * Resta una cantidad dada a la variable cantidad
     * @param cantidad de dinero que vas ha retirar
     * @throws Exception Exception cuando ocurre un error, no se puede retirar esa cantidades negativas
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Getter de nombre
     * @return
     */

	private String getNombre() {
		return nombre;
	}

	
	/**
	 * Setter de nombre
	 * @param nombre que se le va ha asignar al dueño
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de cuenta
	 * @return 
	 */
	private String getCuenta() {
		return cuenta;
	}

	
	/**
	 * Setter de cuenta
	 * @param cuenta, el número de la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	
	/**
	 * Getter de tipoInterés
	 * @return
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	
	/**
	 * Setter de tipoInterés
	 * @param tipoInteres, tipo de interes que se le va asignar
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Getter de saldo
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 *  Setter de saldo
	 * @param saldo, la cantidad de dinero 
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
