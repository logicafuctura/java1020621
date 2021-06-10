package br.com.fuctura.principal;

import java.util.Scanner;

public class TestarRepeticao {
	public static void main(String[] args) {
		//
		Scanner entradaDoUsuario = new Scanner(System.in);
		double notaDoAluno;
		
		//1ª avalia a expressão
		//2º se verdadeira, executa bloco
		//3º voltar para o primeiro passo
		
		int opcaoSelecionada = 1;
		
		while(opcaoSelecionada == 1){
			System.out.println("Digite a nota do aluno: ");
			notaDoAluno = entradaDoUsuario.nextDouble();
			System.out.println("A nota do aluno é: " + notaDoAluno);
	
			//média é 7.0
			if(notaDoAluno >= 7 ) {
				System.out.println("Aluno aprovado");
			}else {
				System.out.println("Aluno reprovado");
			}
			
			System.out.println("Deseja continuar?");
			System.out.println("1 - Para sim");
			System.out.println("2 - Para não");
			opcaoSelecionada = entradaDoUsuario.nextInt();
			
			//pule para a linha 17
		}
		
		//voltar para a linha 13
		
		//System.out.println("Programa finalizado!");
	}
}


