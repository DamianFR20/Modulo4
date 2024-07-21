/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestorempleado gestor = new Gestorempleado();

        while (true) {
            System.out.println("\n1. Agregar empleado");
            System.out.println("2. Mostrar detalles de empleados");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();

                    Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado agregado ");
                    break;

                case 2:
                    gestor.mostrarDetallesEmpleados();
                    break;

                case 3:
                    System.out.println("Gracias");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("intente de nuevo.");
            }
        }
    }
}