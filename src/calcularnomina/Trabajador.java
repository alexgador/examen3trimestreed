/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularnomina;

/**
 * La clase Trabajador representa a un trabajador con su información. Contiene
 * los campos de nombre, precioHora, horasTrabajadas e irfp, y los métodos para
 * acceder y modificar estos campos.
 *
 * @author Usuario
 */
public class Trabajador extends Principal {

    /**
     * Variables de la clase Trabajador: El campo nombre define el nombre del
     * trabajador. El campo precioHora es el precio por hora que cobra el
     * trabajador. El campo horasTrabajadas son las horas trabajadas por el
     * trabajador. El campo irfp es la retención del trabajador.
     */
    private String nombre;
    private double precioHora;
    private double horasTrabajadas;
    private int irfp = 5;

    /**
     * Constructor de la clase Trabajador que establece las siguientes
     * variables.
     *
     * @param nombre el nombre del trabajador
     * @param precioHora el precio por hora del trabajador
     * @param horasTrabajadas las horas trabajadas por el trabajador
     */
    public Trabajador(String nombre, double precioHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Obtiene el nombre del trabajador.
     *
     * @return el nombre del trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del trabajador.
     *
     * @param nombre el nombre del trabajador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio por hora del trabajador.
     *
     * @return el precio por hora del trabajador
     */
    public double getPrecioHora() {
        return precioHora;
    }

    /**
     * Establece el precio por hora del trabajador.
     *
     * @param precioHora el precio por hora del trabajador
     */
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    /**
     * Obtiene las horas trabajadas del trabajador.
     *
     * @return las horas trabajadas del trabajador
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Establece las horas trabajadas del trabajador.
     *
     * @param horasTrabajadas las horas trabajadas del trabajador
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Obtiene el IRPF del trabajador.
     *
     * @return el IRPF del trabajador
     */
    public int getIrfp() {
        return irfp;
    }

    /**
     * Establece el IRPF del trabajador.
     *
     * @param irfp el IRPF del trabajador
     */
    public void setIrfp(int irfp) {
        this.irfp = irfp;
    }

    /**
     * Devuelve una representación en cadena de texto de los parámetros: nombre,
     * precioHora, horasTrabajadas e irfp del trabajador.
     *
     * @return una representación en cadena de texto de los parámetros del
     * trabajador
     */
    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", precioHora=" + precioHora + ", horasTrabajadas=" + horasTrabajadas + ", irfp=" + irfp + '}';
    }

}
