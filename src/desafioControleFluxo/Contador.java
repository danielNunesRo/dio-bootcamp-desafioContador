package desafioControleFluxo;

import java.util.Scanner;

import handlerExceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println("Digite o primeiro número");
			int numero1 = sc.nextInt();
			
			System.out.println("Digite o segundo numero");
			int numero2 = sc.nextInt();
			
			if(numero1 > numero2) {
				throw new ParametrosInvalidosException();
			}
			
			for(int i = numero1; i <= numero2; i++) {
				System.out.println(i);
			}
		} catch (ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
