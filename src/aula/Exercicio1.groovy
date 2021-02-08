package aula

class Exercicio1 {

	static main (args) {
		println "Olá Mundo Groovy";
		
		String nome = "Fernando"
		int idade = 36
		
		String frase = "o " + nome + " tem " + idade + " anos"
		
		println frase	
		
	    frase = "o $nome tem $idade anos"
		
		println frase
	}
}
