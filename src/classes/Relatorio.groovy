package classes

class Relatorio {
	void emitir(cliente, cabecalho) {
		def rel = cabecalho(cliente)
		println "Relat�rio de vendas: " + rel + "****"
	}
	
}
