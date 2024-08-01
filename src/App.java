

    import java.util.Scanner;

public class App {
       public static void main(String[] args) {


            int n1=2;
            int n2=2;
    
            int res = n1+n2;
            int res2 = n1-n2;
            int res3 = n1*n2;
            int res4 = n1/n2;
    
            System.out.println("Desafio 1");
            System.out.println("\n2+2=" + res);
            System.out.println("2-2=" + res2);
            System.out.println("4*2=" + res3);
            System.out.println("4/2=" + res4);
    
            n1 += 5;
    
            System.out.println("\nDesafio 2");
            System.out.println("Resultado " +n1);
    
            System.out.println("\nDesafio 3");
            
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        

        System.out.print("Digite um número inteiro: "); 
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\nTexto digitado pelo usuário: " + texto);
        System.out.println("Número digitado pelo usuário: " + numero);

        scanner.close();
        }
        
}
