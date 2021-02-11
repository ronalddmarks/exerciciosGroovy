package aula


import static javax.swing.JFrame.EXIT_ON_CLOSE as ex

import org.junit.Test

import classes.Cliente
import classes.Cliente as Cl
import classes.Comida
import classes.Conexao
import classes.Funcionario
import classes.Funcionario2
import classes.Nota
import classes.Pedido
import classes.Produto
import classes.Somar
import classes.Venda


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

		URL url = new URL ("http://www.google.com.br")
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

	@Test
	void exercicio13() {
		Nota n1 = new Nota(itens: 2, valor: 20)
		Nota n2 = new Nota(itens: 2, valor: 20)
		Nota n3 = n1 + n2
		println n3.valor + " - " + n3.itens
		n1++
		println n1.valor + " - " + n1.itens


	}

	@Test
	void exercicio13ponto2() {
		//BigDecimal vl = new BigDecimal(10)

		BigDecimal vl = 10
		println vl


		//BigDecimal x = vl.add(BigDecimal(1))
		vl = vl +1
		println vl
		vl++
		println vl
		println vl - 5


		Date data = new Date()
		println data
		//	data++
		println data
		//	data--
		println data
		//	println data + 10

	}

	@Test
	void exercicio14() {
		Funcionario f = new Funcionario(nome: "Fer", idade: 10, salario: 1500.59)
		println f



	}

	@Test
	void exercicio15() {
		Funcionario2 f1 = new Funcionario2(nome: "Fer", idade: 10, salario: 10)
		Funcionario2 f2 = new Funcionario2(nome: "Fer", idade: 10, salario: 10)
		println f1.equals(f2)
		println f2.equals(f2)

	}

	@Test
	void exercicio16() {

		Pedido p = new Pedido(cliente: "Fernando", numero: 10)
		println p.cliente + " - " + p.numero
		println p

		//	p.cliente = "fer"

	}

	@Test
	void exercicio17() {

		Conexao.instance.valor = 10
		println Conexao.instance.valor
		Conexao con = Conexao.instance
		con.valor = 11
		println Conexao.instance.valor

		//	Conexao x = new Conexao()


	}

	@Test
	void exercicio18() {

		Comida comida = Comida.builder().fruta("marca").bebida("Coca-cola").doce("casadinho").build()
		println comida.fruta
		println comida.bebida
		println comida.doce



	}

	@Test
	void exercicio19() {
		
		def objeto = "texto"
		println objeto.getClass()
		
		objeto = 10
		println objeto.getClass()
		
		objeto = 10.00
		println objeto.getClass()
		
		objeto = new Nota(itens: 2, valor: 20)
		println objeto.getClass()
		
		objeto = new Pedido(cliente: "fernando", numero: 10)
		println objeto.getClass()
		

	}








}
