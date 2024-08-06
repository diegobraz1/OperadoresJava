

    import java.util.Scanner;

public class App {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        // int n1 = 2;
        // int n2 = 2;

        // int res = n1+n2;
        // int res2 = n1-n2;
        // int res3 = n1*n2;
        // int res4 = n1/n2;

        // System.out.println("Desafio 1");
        // System.out.println("\n2+2=" + res);
        // System.out.println("2-2=" + res2);
        // System.out.println("4*2=" + res3);
        // System.out.println("4/2=" + res4);

        // n1 += 5;

        // System.out.println("\n2+5=" + n1);
        // System.out.println("\nCalculadora de soma");    
        // System.out.print("Digite um número inteiro para a soma: "); 
        // int numero1 = scanner.nextInt();
        // scanner.nextLine();
        
        // System.out.print("Digite um número inteiro para a soma: "); 
        // int numero2 = scanner.nextInt();
        // scanner.nextLine();
        // int resultado =numero1+numero2;
        // System.out.println(numero1 + "+" + numero2 + "=" + resultado);   
        // scanner.close();

        //verificador de números//

        System.out.println("Verificador de números");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nDigite o número ");
            int scanInteiro = scanner.nextInt();
            System.out.print(scanInteiro + " = ");

            if (scanInteiro > 0) {
                System.out.println("Positivo");
            } else if (scanInteiro < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
           
        }
        scanner.close();
    
    }
            
            
}
