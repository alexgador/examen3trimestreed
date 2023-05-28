/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularnomina;

/**
 * La clase calcularNomina proporciona métodos para calcular el sueldo de un
 * trabajador. Contiene el método para calcular el sueldo bruto, el método para
 * calcular las retenciones del sueldo y el método para calcular el sueldo neto.
 * Además, incluye la variable de clase para la retención del IRPF del
 * trabajador.
 *
 * @author Usuario
 */
public class calcularNomina {

    /**
     * Variable para la retencion del irfp del trabajador
     */
    protected static int retencionIrpf = 5;

    /**
     * Calcula el sueldo bruto de un trabajador multiplicando el precio por hora
     * y las horas trabajadas del trabajador.
     *
     * @param trabajador el trabajador del cual se calcula el sueldo bruto
     * @return el sueldo bruto del trabajador
     * @throws Exception si el precio por hora o las horas trabajadas son
     * menores a 0
     */
    public static double calcularSueldoBruto(Trabajador trabajador) throws Exception {
        if (trabajador.getPrecioHora() < 0 || trabajador.getHorasTrabajadas() < 0) {
            throw new Exception("Los valores no puede ser menores a 0");
        }
        double sueldoBruto = trabajador.getPrecioHora() * trabajador.getHorasTrabajadas();
        return sueldoBruto;
    }

    /**
     * Calcula las retenciones del sueldo del trabajador multiplicando el sueldo
     * bruto por la retención del IRPF y dividiendo el resultado por 100.
     *
     * @param sueldoBruto el sueldo bruto del trabajador
     * @return las retenciones del sueldo del trabajador
     * @throws Exception si el sueldo bruto es menor a 0
     */
    public static double calcularIRPF(double sueldoBruto) throws Exception {
        if (sueldoBruto < 0) {
            throw new Exception("El valor no puede ser menor a 0");
        }
        double retencionesSueldo = sueldoBruto * retencionIrpf / 100;
        return sueldoBruto;
    }

    /**
     * Calcula el sueldo neto del trabajador restando las retenciones del sueldo
     * al sueldo bruto.
     *
     * @param sueldoBruto el sueldo bruto del trabajador
     * @param retencionesSueldo las retenciones del sueldo del trabajador
     * @return el sueldo neto que ganaría el trabajador
     * @throws Exception si el sueldo bruto o las retenciones del sueldo son
     * menores a 0
     */
    public static double calcularSueldoNeto(double sueldoBruto, double retencionesSueldo) throws Exception {
        if (sueldoBruto < 0 || retencionesSueldo < 0) {
            throw new Exception("Los valores no pueden ser menor a 0");
        }
        double sueldoNeto = sueldoBruto - retencionesSueldo;
        return sueldoNeto;
    }

}
