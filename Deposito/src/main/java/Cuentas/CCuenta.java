package Cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Permite realizar operaciones como ingresar, retirar y obtener el saldo actual.
 * Además proporciona información sobre el estado de la cuenta.
 *
 * @author Igdiel
 * @version 1.0
 * @since 2024-05-26
 * @see <a href="https://docs.oracle.com/en/java/">JavaDcoumentation</a>
 */

public class CCuenta {

    // Encapsulamos los atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     * Crea una nueva instancia de CCuenta con los valores especificados.
     *
     * @param nom   El nombre del titular de la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial de la cuenta.
     * @param tipo  El tipo de interés de la cuenta.
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public double estado() {
        return getSaldo();
    }

     /**
     * Permite retirar una cantidad de dinero de la cuenta.
     *
     * @param cantidad La cantidad de dinero a retirar.
     */
    
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No se hay suficiente saldo");
            }
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     *
     * @param cantidad La cantidad de dinero a ingresar.
     */
    
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);
            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Método que realiza operaciones de saldo
    public void operaciones() {
        retirar(2300); // Operación para retirar
        ingresar(685); // Operación de ingresar
    }

    public static void main(String[] args) {
        CCuenta cuenta1; // Cambiamos el nombre de la variable
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        // Operaciones de ingreso y retiro
        cuenta1.operaciones(); // Llamamos al nuevo método que realiza las operaciones de saldo
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
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
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
