package aula


import static javax.swing.JFrame.EXIT_ON_CLOSE as ex

import org.junit.Test

import classes.Cantor
import classes.Cliente
import classes.Cliente as Cl
import classes.Comida
import classes.Conexao
import classes.Fatura
import classes.Funcionario
import classes.Funcionario2
import classes.Nota
import classes.Palco
import classes.Pedido
import classes.Produto
import classes.Relatorio
import classes.Somar
import classes.Tela
import classes.Teste
import classes.Torcida
import classes.Venda
import classes.Viajar



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

		c["nome"] = "Marc√£o"

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

	@Test
	void exercicio20() {

		def teste = new Teste()
		def v1 = teste.metodo("fer")
		println v1.getClass()
		println v1


		v1 = teste.metodo(5)
		println v1.getClass()
		println v1

		v1 = teste.metodo(new BigDecimal(5))
		println v1.getClass()
		println v1

		def data = new Date()
		print data
		//	v1 = teste.metodo(data)
		println v1.getClass()
		println v1


	}

	@Test
	void exercicio21() {

		def colecao = new ArrayList<String>()
		colecao.add("fer")
		colecao.add("anny")
		for (item in colecao) {
			println item

		}

		colecao = new ArrayList<Integer>()
		colecao.add(1)
		colecao.add(2)
		for (item in colecao) {
			println item

		}

		colecao = "Ronald Melo Marques"
		for (item in colecao) {
			println item

		}

		colecao = 10
		for (item in colecao) {
			println item

		}

	}


	@Test
	void exercicio22() {

		def metodo = {int v1, int v2 -> v1 + v2}
		println metodo(1, 2)
		println metodo(2, 3)

	}


	@Test
	void exercicio23() {

		def imprimir = {String v ->
			String temp = v.trim().replace("a","@")
			temp = temp.toUpperCase()
			temp
		}
		println imprimir("  Ronald   ")
		println imprimir ("Indira")


	}

	@Test
	void exercicio24() {

		def funcao = {v1, v2 -> v1 + v2}
		def r1 = funcao(5, 5)
		println r1.class
		println r1

		def r2 = funcao("Ron", "ald")
		println r2.class
		println r2

		def r3 = funcao(10.50, 5.50)
		println r3.class
		println r3



	}


	@Test
	void exercicio25() {
		def limpeza = {texto -> texto.trim().replace("a","@").replace(" ","").capitalize()}
		def rel = new Relatorio()
		rel.emitir(" r o n a l d ", limpeza)
		rel.emitir(" i n d i r a ", limpeza)
	}

	@Test
	void exercicio26() {

		def rel = new Relatorio()
		rel.emitir("RONALD") {v -> v + " MARQUES"}
		rel.emitir("RONALD") {a -> a.replace("N","#")}

	}

	@Test
	void exercicio27() {


		def rel = new Relatorio()
		rel.emitir("RONALD") {it + " Marques"}
		rel.emitir("RONALD") {it.reverse()}

	}

	@Test
	void exercicio28() {
		Palco palco = new Palco()
		Cantor cantor = null

		def imp = {println "vou cantar"}
		cantor = imp
		cantor.cantar()

		palco.show(cantor)

		cantor = {println "agora vou chorar"}
		cantor.cantar()

		palco.show({println "closure cantando como se fosse cantor"})

	}

	@Test
	void exercicio29() {

		Torcida t = null
		def flamenguista = [
			pular : {println "flamenguista pulando"},
			gritar: {p ->
				println "flamengo - " + p}
		] as Torcida

		t = flamenguista
		t.pular()
		t.gritar("vai ae")

		def porcada = [
			pular : {println "proco eo"},
			gritar : {p ->
				println "procooo - " + p  }
		] as Torcida

		t = porcada
		t.pular()
		t.gritar("verd„o")



	}


	void exercicio30() {
		//static main(arg) {
		def tela = new Tela()
		tela.setVisible(true)

	}

	@Test
	void exercicio31ponto1() {
		def fat = new Fatura()

		// criando dinamicamente um novo metodo chamado vender()
		fat.metaClass.vender = {valor -> println "venda no valor " + valor}
		fat.vender(10.00)
		fat.vender(1052.98)

	}

	@Test
	void exercicio31ponto2() {
		def f1 = new Fatura()
		//1)tente executar a 1 vez, n„o vai dar pq n„o existe
		//f1.fatura(10)

		//2)Adicionando mÈtodo dinamico na classe
		Fatura.metaClass.faturar = {valor -> println "fatura no valor = " + valor}

		def f2 = new Fatura()
		f2.faturar(10)

		def f3 = new Fatura()
		f3.faturar(22)

	}

	@Test
	void exercicio32ponto1() {
		def fat = new Fatura()
		//fat.nome = "Fernando"

		fat.metaClass.nome = "Fernando"
		println fat.nome
		fat.nome = "Outro nome"
		println fat.nome

	}

	@Test
	void exercicio32ponto2() {
		def f1 = new Fatura()
		//f1.cliente = "teste"

		Fatura.metaClass.cliente = ""

		def fat = new Fatura()
		fat.cliente = "Luna"
		println fat.cliente
	}

	@Test
	void exercicio32ponto3() {
		Fatura.metaClass.static.impressao = {println "metodo estatico ok"}
		Fatura.impressao()

		def f = new Fatura()
		f.impressao()

	}


	@Test
	void exercicio32ponto4() {
		Viajar v = new Viajar()
		v.viajar("Curitiba",10)


		def nomeMetodo = {String lugar, BigDecimal valor ->
			valor += 3.50
			println "Novo preÁo "
		}

		v.metaClass.viajar = nomeMetodo
		v.viajar("Curitiba", 10)
	}

	@Test
	void exercicio32ponto5() {
		Expando cliente = new Expando()
		cliente.nome = "Fernando"
		cliente.idade = 37
		cliente.impressao = {println "Nome: $nome idade: $idade"}
		cliente.impressao()

		Expando livro = new Expando(autor: "Jonas", paginas: 100)
		println livro.autor
		println livro.paginas

	}

	@Test
	void exercicio33() {
		def v1 = new BigDecimal("10.50")
		def v2 = 10.50

		println v2.getClass().name

		def v3 = v1 + v2
		println v3.getClass()

		v3 = v1 -v1
		println v3

		v3 = v1 * v1
		println v3
	}

	@Test
	void exercicio34() {
		def v1 = "Fernando"
		def v2 = "Fernando"
		println v1 == v2

		def v3 = v1 - "nando"
		println v3

		String texto = "fernando"
		println texto.capitalize()
		println texto.findIndexOf { it == "o" }

		String textoGrande = '''
        Meu texto grande
		… muito grande 
		e n„o e preciso ficar usando + toda hora        
		'''

		println textoGrande

		def nome = "fernando"
		def idade = 35
		def salario = 1555.80
		def sql = "insert into cliente (nome, idade, salario) value ($nome, $idade, $salario)"
		println sql
	}



	@Test
	void exercicio35() {

		def data1 = new Date()
		//data1[YEAR] = 2010
		//data1[MONTH] = 1
		//data1[DATE] = 14
		println data1

		def data2 = new Date()
		//data2[YEAR] = 2015
		//data2[MONTH] = DECEMBER
		//data2[DATE] = 14
		println data2

		if (data2 >= data1) {
			println "maior " + data2

		}

		Date data = new Date()
		println data
		//data += 1
		///println data
		//data -= 2
		//println data
		//data --
		//println data

		//formataÁ„o na mesma classe
		//println data.format("dd/MM/yyy hh:mm:ss")


	}

	@Test
	void exercicio36() {
		10.times { println it }
		1.upto(10) { println it }
		5.downto(1){ println it }
	}

	@Test
	void exercicio37() {
		def x = new FileWriter("d:/1.txt").withWriter { e -> e.write("Ronald Marques") }

		def a = new File("d:/2.txt")
		a.write("outro")

		def b = new File("d:/3.txt")
		b.text = "Linha 1"
		5.times { b <<  "\nnova linha usando sobrecarga de operador" }

		def c = new File("d:/3.txt")
		println c.text

		println c.readLines()*.toUpperCase()

		new File("d:/3.txt").eachLine { linha -> println linha }

		a.delete()
		b.delete()
		c.delete()
		new File("d:/1.txt").delete()

		new File("c:/").eachFile { println it.name }
	}

	@Test
	void exercicio38() {

		//static main(args) {
		Thread.start { 10.times{println "rodando na outra thread " + it} }

	}

	@Test
	void exercicio39() {

//		Sql con = Sql.newInstance("jdbc:hsqldb:file:D:/hsqldb/base;shutdown=true", "sa", "1234")
		con.eachRow("select * from cliente") {p -> println p.id  + " - " + p.nome + " - " + p.email }

		def lista = con.rows("select * from cliente")
		lista.each { cli -> println.email }

		con.executeInsert("insert into cliente(nome, email) values('groovy xuxu', 'groovy@groovy.com')")
		println "pulando"
		con.eachRow("select * from cliente") {p -> println p.nome}

//		DataSet tabela = dataSet("cliente")
		tabela.add(nome: "g2", email : "g@g.com")
		println "pulando ..."
		con.eachRow("select * from cliente") {p -> println p.nome}


	}
	
	@Test
	void exercicio40() {
		
		def lista1 = [1,2,3,4]
		println lista1.getClass().name
		
		def lista2 = ["Fer","Anny","Lucas","Cida"]
		println lista1.getClass().name
		
		def lista3 = new ArrayList<BigDecimal>()
		lista3.add(10.50)
        lista3 << 10.50		
		lista3 << 20.50
		
		lista1.each { println it }
		lista2.each { println it }
		lista3.each { println it }
		
		def total = 0
		lista3.each { total += it }
		println total
		
		
		def clientes = []
		clientes << new Cliente(nome: "Xico", data : new Date())
		clientes << new Cliente(nome: "Luana", data : new Date())
		clientes << new Cliente(nome: "Fernando", data : new Date())
		clientes << new Cliente(nome: "Luciano", data : new Date())
		
		
		def achou = clientes.find{c -> c.nome.contains("Lu")}
		println achou
		
		
		def encontradors = clientes.findAll{c -> c.nome.contains("Lu")}
		encontradors.each { c -> println c }
		
		clientes.sort {c1, c2 -> c1.nome.compareTo(c2.nome)}
		println clientes
		
		def set = clientes as Set
		println set.getMetaClass().name
		set.each{c -> println c}
		
		def lista4 = set as List
		
		def listaImutavel = lista4.asImmutable()
		def setImutavel = set.asImmutable()
		
		def listaSys = lista4.asSynchronized()
		def setSys = set.asSynchronized()
		
		
	}










}
