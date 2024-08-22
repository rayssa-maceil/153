import java.util.Scanner;

public class ativi {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número entre 1 a 5:");
        int numero = leia.nextInt();
        switch (numero) {
            
            case 1:
            System.out.print("Número 1 foi digiado: ");    
                break;

                case 2:
                System.out.print("Número 2 foi digiado: ");
                break;

                case 3:
                System.out.print("Número 3 foi digiado: ");
                break;

                case 4: 
                System.out.print("Número 4 foi digiado: ");
                break;

                case 5:
                System.out.print("Número 5 foi digiado: ");
                break;

                default:
                System.out.print("Número inválido");
                break;
        
        }
    }
 }
     