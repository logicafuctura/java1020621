package br.com.fuctura.principal;

import java.util.Scanner;

public class TestandoBreak {
	
	public static void main(String[] args) {
		
		Scanner entradaDoUsuario = new Scanner(System.in);
		
		int valorDigitado;
		while(true) {
			while(true) {
				valorDigitado = entradaDoUsuario.nextInt();
				if(valorDigitado == 10) {
					System.out.println("Usuário digitou 10 e vai sair");
					break;
				}
			}
			System.out.println("Saindo do While do escopo menor");
			break;
		}
		
	}
}
