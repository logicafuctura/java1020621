package br.com.fuctura.principal;
//atalho: ctrl + shift + o - automaticamente adiciona os imports necessários


import java.util.Scanner;

public class GerenciadorDeTarefas {
	
	public static void main(String[] args) {
		
		//ler da entrada (in) padrão do usuário (console)
		Scanner entradaDoUsuario = new Scanner(System.in);
		
		//regra para declarar variável: tipo nome;
		//boas práticas na declaração de variável: camelCase
		int qtdTarefasUsuarioDeseja = 10;
		
		char tipoDaTarefa = 'D';
		
		qtdTarefasUsuarioDeseja = 50; //apaga o valor anterior (10), coloca um novo (50)
		
		qtdTarefasUsuarioDeseja = 75; //apaga o valor anterior (50), coloca um novo (75)
		
		System.out.println("Digite a quantidade de tarefas: ");
		
		//nextInt -> int
		//nextDouble -> double
		//nextBoolean -> boolean
		//next e nextLine -> String
		
		//vai capturar o valor que o usuário digitado no teclado e converter:
											    
		qtdTarefasUsuarioDeseja = entradaDoUsuario.nextInt(); //retornando o número que o usuário dig
				
		//exibir na saída (out) padrão do usuário (console)
		System.out.println("O usuário deseja criar:  " + qtdTarefasUsuarioDeseja + " tarefas"); 
		System.out.println("O tipo da tarefa é: "  + tipoDaTarefa);
		
		
		int opcaoSelecionada;
		System.out.println("Deseja enviar as tarefas para a nuvem? ");
		System.out.println("1 - Sim ");
		System.out.println("2 - Não ");
		opcaoSelecionada = entradaDoUsuario.nextInt();

		//expressao boleana - verdadeiro ou falso
		//operadores relacionais: <, <=, >, >=, ==, !=
		//operador relacional: && (E), || (OU)
		if(opcaoSelecionada  == 1) {
			
			String nomeDaNuvem;
			
			System.out.println("Digite o nome da nuvem: ");
			nomeDaNuvem = entradaDoUsuario.next();
			
			//só executará o bloco de comandos quando a expressão for verdadeira
			//condicionar esse comando, só quero executar esse comando se opSelecionada for sim (1)
			System.out.println("As " + qtdTarefasUsuarioDeseja + " tarefas foram enviadas para a nuvem " + nomeDaNuvem);	
		}else {
			
			//apenas quando a expressão for falsa
			System.out.println("As suas tarefas não serão enviadas.");		
		}		
		
	}
}
