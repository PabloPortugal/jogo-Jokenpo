package jogoJoken;

import java.util.Random;
import java.util.Scanner;


public class JogoJoken {

	public static void main(String[] args) {
		
		
		System.out.println("Regras do jogo:");
		System.out.println(" ");
		System.out.println("1 equivale a PEDRA");
		System.out.println("2 equivale a PAPEL");
		System.out.println("3 equivale a TESOURA");
		System.out.println(" ");
		
		int numSorteado, jogador, valor1, valor2, valor3;
				
		Scanner teclado = new Scanner (System.in); // chamei scanner de teclado
		System.out.print("Faça sua jogada: ");
		jogador= teclado.nextInt();
		teclado.close();	
		
		Random sorteio= new Random(); // chamei random de sorteio
		numSorteado = sorteio.nextInt(3)+1; // +1 soma ao número sorteado pelo random
		System.out.println("O computador escolheu: "+numSorteado);
		
		
		// determinar quem venceu
		
		if (jogador==1) {
			if(numSorteado==1) {
				System.out.println("Empate!");
			}else if(numSorteado==2) {
			System.out.println("O Computador Venceu!");
			}else {
				System.out.println("Você venceu!!");
			}
			
		}else if(jogador==2) {
			if(numSorteado==2) {
				System.out.println("Empate!");
			}else if(numSorteado==1) {
				System.out.println("Você venceu!!");
			}else {
				System.out.println("Computador venceu!");
			}
		}else {
			if(numSorteado==3) {
				System.out.println("Empate!");
			}else if(numSorteado==1) {
				System.out.println("O Computador venceu!");
			}else {
				System.out.println("Você venceu!!");
			}
		}
	
		
		
		
		
		
		
		

}
}