package br.com.fuctura.principal;

public class TestarCondicionais {
	public static void main(String[] args) {
		
		int opcaoSelecionada = 1;
		
		if(opcaoSelecionada == 1) {
			System.out.println("Op��o selecionada foi 1");
		}
		else if(opcaoSelecionada == 2) {
			System.out.println("Op��o selecionada foi 2");
		}
		else if(opcaoSelecionada == 3) {
			System.out.println("Op��o selecionada foi 3");
		}
		else {
			System.out.println("Op��o selecionada � inv�lida!");
		}
		
		System.out.println("Finalizou.");
		
	}
}
