
package empleado;

import java.util.ArrayList;
import java.util.List;

public class Gestorempleado {
    private final List<Empleado> empleados;

    public Gestorempleado() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarDetallesEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Detalles de los empleados:");
            for (Empleado empleado : empleados) {
                empleado.imprimirInformacion();
                System.out.println("--------------------");
            }
        }
    }
}