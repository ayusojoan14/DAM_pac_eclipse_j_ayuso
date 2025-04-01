import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] arrayNombres = new String[20];
        int[] arrayPuntuacion = new int[20];
        
        // Rellenar nombres de equipos
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            arrayNombres[i] = scanner.nextLine();
        }
        
        // Rellenar puntuaciones aleatorias entre 35 y 100
        for (int i = 0; i < 20; i++) {
            arrayPuntuacion[i] = random.nextInt(66) + 35; // Genera valores entre 35 y 100
        }
        
        // Determinar equipo ganador y último clasificado
        int maxPuntos = arrayPuntuacion[0];
        int minPuntos = arrayPuntuacion[0];
        int indiceGanador = 0;
        int indiceUltimo = 0;
        int sumaPuntos = 0;
        
        for (int i = 0; i < 20; i++) {
            sumaPuntos += arrayPuntuacion[i];
            
            if (arrayPuntuacion[i] > maxPuntos) {
                maxPuntos = arrayPuntuacion[i];
                indiceGanador = i;
            }
            
            if (arrayPuntuacion[i] < minPuntos) {
                minPuntos = arrayPuntuacion[i];
                indiceUltimo = i;
            }
        }
        
        // Calcular puntuación media
        double puntuacionMedia = (double) sumaPuntos / 20;
        
        // Mostrar resultados
        System.out.println("\nEquipo ganador: " + arrayNombres[indiceGanador] + " con " + maxPuntos + " puntos.");
        System.out.println("Equipo último clasificado: " + arrayNombres[indiceUltimo] + " con " + minPuntos + " puntos.");
        System.out.println("Puntuación media de los equipos: " + puntuacionMedia);
        
        scanner.close();
    }
}
