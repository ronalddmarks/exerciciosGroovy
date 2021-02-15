package classes

class Viajar {
	void viajar(String destino, BigDecimal valor) {
		valor += 0.50
		println "Viagem até $destino custa $valor"
	}
}
