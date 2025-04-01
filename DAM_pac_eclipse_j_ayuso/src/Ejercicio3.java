import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Datos iniciales del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese su peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura (m): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese su sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        System.out.print("Ingrese su velocidad inicial (km/h): ");
        double velocidadInicial = scanner.nextDouble();
        
        System.out.print("Ingrese su distancia inicial (km): ");
        double distanciaInicial = scanner.nextDouble();
        
        System.out.print("Ingrese sus calor�as quemadas iniciales: ");
        double caloriasIniciales = scanner.nextDouble();
        
        // C�lculo del IMC
        double imc = peso / (altura * altura);
        
        // Variables para promedios y m�ximos
        double sumaVelocidad = 0, sumaDistancia = 0, sumaCalorias = 0;
        double maxDistancia = 0, maxCalorias = 0;
        
        // Registro de 10 sesiones
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nIngrese los datos de la sesi�n " + i + ":");
            
            System.out.print("Velocidad (km/h): ");
            double velocidad = scanner.nextDouble();
            sumaVelocidad += velocidad;
            
            System.out.print("Distancia recorrida (km): ");
            double distancia = scanner.nextDouble();
            sumaDistancia += distancia;
            if (distancia > maxDistancia) {
                maxDistancia = distancia;
            }
            
            System.out.print("Calor�as quemadas: ");
            double calorias = scanner.nextDouble();
            sumaCalorias += calorias;
            if (calorias > maxCalorias) {
                maxCalorias = calorias;
            }
        }
        
        // C�lculo de promedios
        double velocidadMedia = sumaVelocidad / 10;
        double distanciaMedia = sumaDistancia / 10;
        double caloriasMedia = sumaCalorias / 10;
        
        // Mostrar ficha de seguimiento
        System.out.println("\nHola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento:");
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sexo: " + sexo);
        System.out.println("�ndice de masa corporal: " + imc);
        System.out.println("\nLa media del entrenamiento en 10 sesiones es:");
        System.out.println("Velocidad media: " + velocidadMedia + " km/h");
        System.out.println("Distancia recorrida media: " + distanciaMedia + " km");
        System.out.println("Calor�as quemadas media: " + caloriasMedia);
        System.out.println("M�xima distancia recorrida: " + maxDistancia + " km");
        System.out.println("M�ximo n�mero de calor�as quemadas en una sesi�n: " + maxCalorias);
        
        // Comparaci�n con datos iniciales
        if (velocidadMedia > velocidadInicial || distanciaMedia > distanciaInicial || caloriasMedia > caloriasIniciales) {
            System.out.println("\n�Enhorabuena! Has mejorado en:");
            if (velocidadMedia > velocidadInicial) {
                System.out.println("- Velocidad");
            }
            if (distanciaMedia > distanciaInicial) {
                System.out.println("- Distancia recorrida");
            }
            if (caloriasMedia > caloriasIniciales) {
                System.out.println("- Calor�as quemadas");
            }
        }
        
        scanner.close();
    }
}