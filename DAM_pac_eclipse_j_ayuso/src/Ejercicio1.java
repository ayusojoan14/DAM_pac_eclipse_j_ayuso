import java.util.Scanner;

public class Ejercicio1 {
    public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
        
        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
            return false;
        }
        
        double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
        
        if (gastoTotal > 20000) {
            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoTotal + " y excede el límite mensual de 20.000 euros");
            return false;
        }
        
        if (presupuestoEmpresa > 100000) {
            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
            return false;
        }
        
        System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Menú Auditoría Empresa ---");
            System.out.println("1. Realizar auditoría");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 2) {
                System.out.println("Saliendo del programa...");
                break;
            } else if (opcion == 1) {
                System.out.print("Ingrese el salario del Jefe: ");
                double salarioJefe = scanner.nextDouble();
                
                System.out.print("Ingrese el salario del Encargado: ");
                double salarioEncargado = scanner.nextDouble();
                
                System.out.print("Ingrese el salario de los Oficinistas: ");
                double salarioOficinistas = scanner.nextDouble();
                
                System.out.print("Ingrese el número de Oficinistas: ");
                int numeroOficinistas = scanner.nextInt();
                
                System.out.print("¿Los proyectos han sido terminados? (true/false): ");
                boolean proyectosTerminados = scanner.nextBoolean();
                
                System.out.print("Ingrese el presupuesto de la empresa: ");
                double presupuestoEmpresa = scanner.nextDouble();
                
                boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
                System.out.println("Resultado de la auditoría: " + (resultado ? "Apto" : "No apto"));
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        scanner.close();
    }
}
