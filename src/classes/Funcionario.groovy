package classes

import groovy.transform.ToString

@ToString // Exemplo 1
//@ToString(excludes=["idade"]) //Exemplo 2
//@ToString(includeNames=true, excludes="idade, salario") //Exemplo3
class Funcionario {
	
	String nome
	Integer idade
	Double salario
	
	
}
