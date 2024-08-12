import Models.Jogador;
public class App {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Diego", 18, "Ala-armador", 0, 166, 60);

        System.out.println("Nome: " + jogador1.getNome());
        System.out.println("Idade: " + jogador1.getIdade());
        System.out.println("Posiçao: " + jogador1.getPosicao());
        System.out.println("Número da camisa: " + jogador1.getNumCamisa());
        System.out.println("Altura: " + jogador1.getAltura());
        System.out.println("Peso: " + jogador1.getPeso());
        
        Jogador jogador2 = new Jogador();

        jogador2.setNome("Rafael");
        jogador2.setIdade(18);
        jogador2.setPosicao("Ala");
        jogador2.setNumCamisa(32);
        jogador2.setAtura(178);
        jogador2.setPeso(60);

        
        System.out.println("\nNome: " + jogador2.getNome());
        System.out.println("Idade: " + jogador2.getIdade());
        System.out.println("Posiçao: " + jogador2.getPosicao());
        System.out.println("Número da camisa: " + jogador2.getNumCamisa());
        System.out.println("Altura: " + jogador2.getAltura());
        System.out.println("Peso: " + jogador2.getPeso());
        
        
    }
}


//import java.util.Scanner;
//public class App {
       //public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
            
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

        //System.out.println("Verificador de números");
        //for (int i = 0; i < 5; i++) {
            //System.out.println("\nDigite o número ");
            //int scanInteiro = scanner.nextInt();
            //System.out.print(scanInteiro + " = ");

            //if (scanInteiro > 0) {
            //    System.out.println("Positivo");
            //} else if (scanInteiro < 0) {
            //    System.out.println("Negativo");
            //} else {
            //    System.out.println("Zero");
            //}
           
        //}
        //scanner.close();
    
    //}
            
            
//}

