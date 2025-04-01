import java.util.Scanner;

public class Ejercicio2 {
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
    
    public static boolean procesoSeleccion() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad > 40) {
            System.out.println("Lo sentimos, queda descartado del proceso de selección por superar la edad máxima permitida.");
            return false;
        }
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        
        System.out.print("Ingrese los años trabajados: ");
        int añosTrabajados = scanner.nextInt();
        
        System.out.print("Ingrese su sueldo bruto anual anterior: ");
        double sueldoBrutoAnterior = scanner.nextDouble();
        
        if (sueldoBrutoAnterior > 30000) {
            System.out.println("Lo sentimos, queda descartado del proceso de selección por tener un sueldo anterior superior a 30.000 euros.");
            return false;
        }
        
        double sumaNominas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el importe de su nómina " + i + ": ");
            sumaNominas += scanner.nextDouble();
        }
        
        double mediaNominas = sumaNominas / 5;
        double incremento;
        
        if (mediaNominas > 2500) {
            incremento = mediaNominas * 0.05;
            System.out.println("Se le sube el sueldo en un 5%. Su nueva nómina mensual será de: " + (mediaNominas + incremento));
        } else {
            incremento = mediaNominas * 0.10;
            System.out.println("Se le sube el sueldo en un 10%. Su nueva nómina mensual será de: " + (mediaNominas + incremento));
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Realizar auditoría");
            System.out.println("2. Proceso de selección");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 3) {
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
            } else if (opcion == 2) {
                boolean resultado = procesoSeleccion();
                System.out.println("Resultado del proceso de selección: " + (resultado ? "Contratado" : "No contratado"));
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        scanner.close();
    }
}
