import java.util.Scanner;

public class Ejercicio1 {
    public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
        
        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditor�a ya que no ha terminado los proyectos acordados");
            return false;
        }
        
        double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
        
        if (gastoTotal > 20000) {
            System.out.println("No ha pasado la auditor�a ya que el gasto en personal es de " + gastoTotal + " y excede el l�mite mensual de 20.000 euros");
            return false;
        }
        
        if (presupuestoEmpresa > 100000) {
            System.out.println("No ha pasado la auditor�a ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el l�mite establecido en 100.000 euros");
            return false;
        }
        
        System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene");
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Men� Auditor�a Empresa ---");
            System.out.println("1. Realizar auditor�a");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opci�n: ");
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
                
                System.out.print("Ingrese el n�mero de Oficinistas: ");
                int numeroOficinistas = scanner.nextInt();
                
                System.out.print("�Los proyectos han sido terminados? (true/false): ");
                boolean proyectosTerminados = scanner.nextBoolean();
                
                System.out.print("Ingrese el presupuesto de la empresa: ");
                double presupuestoEmpresa = scanner.nextDouble();
                
                boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
                System.out.println("Resultado de la auditor�a: " + (resultado ? "Apto" : "No apto"));
            } else {
                System.out.println("Opci�n no v�lida. Intente de nuevo.");
            }
        }
        
        scanner.close();
    }
}
