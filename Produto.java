import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		//TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD = A * B;   

		System.out.println("PROD = " + PROD);

        // Fechando o scanner
         sc.close();
	}
}