import java.util.Scanner;

public class IEEE754Converter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir binario a decimal (IEEE 754)");
            System.out.println("2. Convertir decimal a binario (IEEE 754)");
            System.out.println("3. Salir");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Introduzca el número binario (32 bits):");
                    String binary = scanner.next();
                    float decimalFromBinary = binaryToDecimal(binary);
                    System.out.println("Decimal: " + decimalFromBinary);
                    break;
                case 2:
                    System.out.println("Introduzca el número decimal:");
                    float decimal = scanner.nextFloat();
                    String binaryFromDecimal = decimalToBinary(decimal);
                    System.out.println("Binario (IEEE 754): " + binaryFromDecimal);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (choice != 3);
        
        scanner.close();
    }

    public static float binaryToDecimal(String binary) {
        int intBits = Integer.parseInt(binary, 2);
        return Float.intBitsToFloat(intBits);
    }

    public static String decimalToBinary(float decimal) {
        int intBits = Float.floatToIntBits(decimal);
        return Integer.toBinaryString(intBits);
    }
}

