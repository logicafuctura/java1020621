package br.com.fuctura.principal;

public class TestandoLacoFor {
	
	static int variavelGlobal = 100;
	
	public static void main(String[] args) {
		
		int contadorWhile = 0;
		int somatorio = 0;
		int contadorImpares = 1, outraVariavel = 44, qtdAlunos =1, qtdFaltas = 1 ;
		while(contadorWhile <= 10) {
			System.out.println(contadorWhile);
			contadorWhile = contadorWhile + 1; 
			somatorio = somatorio + contadorWhile;
		}
		System.out.println("Somat�rio �: " + somatorio);
		
		
		
		//somar todos os n�meros de 0 a 10
		//0+1+2+3+4+5+6+7+8+9+10
		//1� - declara��o/inicializa��o
		//2� - express�o
		//3� - atualizacao de vari�vel (incremento ou decremento)
		
		//1� declara��o/inicializa��o
		//2� avaliar express�o, se verdadeiro executa
		//3� terminou o bloco, atualizar
		//4� pular para o passo 2

		// x   x   x   x   x   x 
		///0,1,2,3,4,5,6,7,8,9,10
		for(int contador = 0; contador <= 10; contador = contador + 2) {
			System.out.println("contador: " + contador);
			System.out.println(variavelGlobal);
		}
		
		//   x   x   x   x   x    
		///0,1,2,3,4,5,6,7,8,9,10
		for(int contador = 1, outra = 10 ; contador <= 10 ; contador = contador + 2, qtdAlunos = qtdAlunos+1) {
			System.out.println("contador: " + contador);
			if(true) {
				int soma = 10;
			}
			System.out.println(soma);
		}
	}
}
