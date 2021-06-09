package br.com.fuctura.principal;
//atalho: ctrl + shift + o - automaticamente adiciona os imports necess�rios


import java.util.Scanner;

public class GerenciadorDeTarefas {
	
	public static void main(String[] args) {
		
		//ler da entrada (in) padr�o do usu�rio (console)
		Scanner entradaDoUsuario = new Scanner(System.in);
		
		//regra para declarar vari�vel: tipo nome;
		//boas pr�ticas na declara��o de vari�vel: camelCase
		int qtdTarefasUsuarioDeseja = 10;
		
		char tipoDaTarefa = 'D';
		
		qtdTarefasUsuarioDeseja = 50; //apaga o valor anterior (10), coloca um novo (50)
		
		qtdTarefasUsuarioDeseja = 75; //apaga o valor anterior (50), coloca um novo (75)
		
		System.out.println("Digite a quantidade de tarefas: ");
		
		//nextInt -> int
		//nextDouble -> double
		//nextBoolean -> boolean
		//next e nextLine -> String
		
		//vai capturar o valor que o usu�rio digitado no teclado e converter:
											    
		qtdTarefasUsuarioDeseja = entradaDoUsuario.nextInt(); //retornando o n�mero que o usu�rio dig
				
		//exibir na sa�da (out) padr�o do usu�rio (console)
		System.out.println("O usu�rio deseja criar:  " + qtdTarefasUsuarioDeseja + " tarefas"); 
		System.out.println("O tipo da tarefa �: "  + tipoDaTarefa);
		
		
		int opcaoSelecionada;
		System.out.println("Deseja enviar as tarefas para a nuvem? ");
		System.out.println("1 - Sim ");
		System.out.println("2 - N�o ");
		opcaoSelecionada = entradaDoUsuario.nextInt();

		//expressao boleana - verdadeiro ou falso
		//operadores relacionais: <, <=, >, >=, ==, !=
		//operador relacional: && (E), || (OU)
		if(opcaoSelecionada  == 1) {
			
			String nomeDaNuvem;
			
			System.out.println("Digite o nome da nuvem: ");
			nomeDaNuvem = entradaDoUsuario.next();
			
			//s� executar� o bloco de comandos quando a express�o for verdadeira
			//condicionar esse comando, s� quero executar esse comando se opSelecionada for sim (1)
			System.out.println("As " + qtdTarefasUsuarioDeseja + " tarefas foram enviadas para a nuvem " + nomeDaNuvem);	
		}else {
			
			//apenas quando a express�o for falsa
			System.out.println("As suas tarefas n�o ser�o enviadas.");		
		}		
		
	}
}
