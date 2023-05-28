/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularnomina;

/**
 *
 * @author Usuario
 */
public class Trabajador extends CalcularNomina {
    
    String nombre;
    double precioHora;
    double horasTrabajadas;
    int irfp= 5;

    public Trabajador(String nombre, double precioHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getIrfp() {
        return irfp;
    }

    public void setIrfp(int irfp) {
        this.irfp = irfp;
    }
    
    
    
}
