/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularnomina;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal extends calcularNomina {

    /**
     * La clase Principal es la clase principal del programa de cálculo de
     * nómina. Permite ingresar los datos del trabajador y realiza los cálculos
     * necesarios para determinar el sueldo bruto, las retenciones y el sueldo
     * neto. Finalmente, muestra los resultados por pantalla.
     *
     * En el método main, se solicitan los siguientes datos por pantalla: -
     * Nombre del trabajador - Precio por hora - Horas trabajadas
     *
     * A continuación, se crea una instancia del objeto Trabajador y se llaman a
     * los métodos correspondientes para realizar los cálculos.
     *
     * Por último, se muestra por pantalla toda la información obtenida.
     *
     * @param args los argumentos de la línea de comandos
     * @throws Exception si ocurre algún error durante el cálculo de la nómina
     */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es el nombre del trabajador?");
        String nombre = teclado.nextLine();

        System.out.println("¿Cual es el precio por hora?");
        double precioHora = teclado.nextDouble();

        System.out.println("¿Cuales han sido las horas trabajadas?");
        double horasTrabajadas = teclado.nextDouble();

        Trabajador trabajador = new Trabajador(nombre, precioHora, horasTrabajadas);

//        Operaciones para calcular el sueldo
        double sueldoBruto = calcularSueldoBruto(trabajador);
        double retencionesSueldo = calcularIRPF(sueldoBruto);
        double sueldoNeto = calcularSueldoNeto(sueldoBruto, retencionesSueldo);

        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("El precio por horas es: " + trabajador.getPrecioHora());
        System.out.println("Las horas trabajadas son: " + trabajador.getHorasTrabajadas());

        System.out.println("El sueldo bruto es: " + sueldoBruto);
        System.out.println("Las retenciones del sueldo son: " + retencionesSueldo);
        System.out.println("El sueldo neto es: " + sueldoNeto);
    }

}
