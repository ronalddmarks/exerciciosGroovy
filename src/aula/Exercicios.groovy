package aula


import org.junit.Test

import classes.Cliente
import classes.Produto
import classes.Somar
import classes.Venda
import classes.Cliente as Cl
import static javax.swing.JFrame.EXIT_ON_CLOSE as ex


class Exercicios {

	@Test
	void exercicio1ponto2() {
		int a = 10;
		println a.class
		println a.toString()
		println 12l.class.name

		println 11g.class.name

		BigDecimal valor = 200.50


		println valor;
	}

	@Test
	void exercicio2() {
		Cliente c = new Cliente()
		c.setNome "Fer"
		c.setData new Date()
		println c.somar(10, 10)
		println c.getNome() + " " + c.getData()
	}

	@Test
	void exercicio3() {
		Cliente c = new Cliente()
		println c.getNome() + " - " + c.getData()

		c = new Cliente(nome: "fernando")
		println c.getNome() + " - " + c.getData()

		c = new Cliente(data: new Date())
		println c.getNome() + " - " + c.getData()

		c = new Cliente(nome: "fernando", data: new Date())
		println c.getNome() + " - " + c.getData()
	}

	@Test
	void exercicio4() {
		Cliente c = new Cliente(nome: "fernando", data: new Date())
		println c.getNome()
		println c.getData()
		println c["nome"]
		println c["data"]

		c["nome"] = "Marcão"

		println c["nome"]
	}

	@Test
	void exercicio5() {
		Produto p = new Produto("CD" ,12.00)
		println p.nome
		println p.nome = "CD Calcinha preta"
		p.valor = 15.00
		println p.nome + " - " + p.valor
	}

	@Test
	void exercicio6() {
		Cl c = new Cl(nome: "fernando", data: new Date())
		println c.getNome() + " - " + c.getData()
		println ex
	}

	//aula 10
	@Test
	void exercicio7() {
		Venda v = new Venda()
		println v.vender(100)
		println v.vender(100 , 15)

	}


	@Test
	void exercicio8() {
		Somar soma = new Somar()
		println	soma.somar(10)
		println	soma.somar(10,10)
		println	soma.somar(10,10,10)

	}


	@Test
	void exercicio9() {
		Cliente c = null
		c?.nome = "Fernando"
		println c?.getNome()

		Cliente c2 = new Cliente()
		c2?.nome = "Fernando"
		println c2.getNome()
		println c2.nome
	}

	@Test
	void exercicio10() {
		List<String> colecao = new ArrayList()
		colecao.add("Fernando")
		colecao.add(null)
		colecao.add("anny")
		colecao.add("rita")
		println colecao

		//    Java
		//	for (String item: colecao) {
		//		if (item != null) {
		//			item = item.toUpperCase()

		//		}

		//	}

		colecao = colecao*.toUpperCase()
		println colecao

		colecao = colecao*.replace("A", "@")
		println colecao


	}

	@Test
	void exercicio11() {

		//		try {
		//			URL url = new URL ("http://www.goog.e.com.br")
		//		} catch (Exception e) {
		//			e.printStackTrace()
		//		}
		//		println url

		URL url = new URL ("http://www.goog.e.com.br")
		println url

	}
	
	@Test
	void exercicio12() {
		
		String nome = null
		if(nome) {
			println true
		}else { 
			println false
		}
		
		
		nome = "Fer"
		if (nome) {
			println true
		}else {
			println false
		}
		
			
		int valor = 0
		if(valor) {
			println true 
		}else {
			println false
		}	
		
		valor = 1
		if(valor) {
			println true
		}else {
			println false
		}
		
		List<String> colecao = new ArrayList(0)
		if(colecao) {
			println true
		}else {
			println false
		}
		
		colecao.add("Fer")
		if(colecao) {
			println true
		}else {
			println false
		}
	// nemum desses funcionam em java
	}


}
