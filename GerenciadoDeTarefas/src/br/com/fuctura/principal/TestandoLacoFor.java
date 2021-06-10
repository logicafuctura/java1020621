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
		System.out.println("Somatório é: " + somatorio);
		
		
		
		//somar todos os números de 0 a 10
		//0+1+2+3+4+5+6+7+8+9+10
		//1ª - declaração/inicialização
		//2º - expressão
		//3º - atualizacao de variável (incremento ou decremento)
		
		//1ª declaração/inicialização
		//2º avaliar expressão, se verdadeiro executa
		//3º terminou o bloco, atualizar
		//4º pular para o passo 2

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
