package questao1e2;

import java.util.Scanner;

public class PessoaTeste {
	
	
public static void main(String[] args) {
	
	
	
	Pessoa pessoa =new Pessoa( ) ;
	
	Scanner leitor =new Scanner(System.in);
	
	System.out.println("informe seu nome");
	pessoa.nome=leitor.nextLine();
	System.out.println("informe sua idade ");
	pessoa.idade=leitor.nextInt();
	
	
	System.out.println("Seu nome e "+pessoa.nome  +" e sua idade e "+ pessoa.idade);
	
	
   System.out.println(pessoa.comprimentar());
	
}
	
	
	
	
}
