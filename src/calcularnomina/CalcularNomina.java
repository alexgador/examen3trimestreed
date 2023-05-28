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
public class CalcularNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cual es el nombre del trabajador?");
        String nombre = teclado.nextLine();
        
        System.out.println("¿Cual es el precio por hora?");
        double precioHora = teclado.nextDouble();
        
        System.out.println("¿Cuales han sido las horas trabajadas?");
        double horasTrabajadas = teclado.nextDouble();
        
//        Retencion del trabajador
        int irpf= 5;
//        Operaciones para calcular el sueldo
        double sueldoBruto = precioHora * horasTrabajadas;
        double retencionesSueldo = sueldoBruto * irpf / 100;
        double sueldoNeto = sueldoBruto - retencionesSueldo;
        
        Trabajador trabajador = new Trabajador(nombre, precioHora, horasTrabajadas);
        
        System.out.println("El nombre del trabajador es: "+ trabajador.getNombre());
        System.out.println("El precio por horas es: "+ trabajador.getPrecioHora());
        System.out.println("Las horas trabajadas son: "+ trabajador.getHorasTrabajadas());
        
        System.out.println("El sueldo bruto es: "+sueldoBruto);
        System.out.println("Las retenciones del sueldo son: "+retencionesSueldo);
        System.out.println("El sueldo neto es: "+sueldoNeto);
    }
    
}
