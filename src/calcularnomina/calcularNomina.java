/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularnomina;

/**
 *
 * @author Usuario
 */
public class calcularNomina {

    protected static int retencionIrpf = 5;

    public static double calcularSueldoBruto(Trabajador trabajador) throws Exception {
        if (trabajador.getPrecioHora() < 0 || trabajador.getHorasTrabajadas() < 0) {
            throw new Exception("Los valores no puede ser menores a 0");
        }
        double sueldoBruto = trabajador.getPrecioHora() * trabajador.getHorasTrabajadas();
        return sueldoBruto;
    }


    public static double calcularIRPF(double sueldoBruto) throws Exception {
        if (sueldoBruto < 0) {
            throw new Exception("El valor no puede ser menor a 0");
        }
        double retencionesSueldo = sueldoBruto * retencionIrpf / 100;
        return sueldoBruto;
    }

    public static double calcularSueldoNeto(double sueldoBruto, double retencionesSueldo) throws Exception {
        if (sueldoBruto < 0 || retencionesSueldo < 0) {
            throw new Exception("Los valores no pueden ser menor a 0");
        }
        double sueldoNeto = sueldoBruto - retencionesSueldo;
        return sueldoNeto;
    }

}
