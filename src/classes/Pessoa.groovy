package classes

class Pessoa implements Animal, Lutador{

	@Override
	public void pular() {
		println "pessoa" + nome + "pulando"
	}


	@Override
	public void correr() {
		println "pessoa" + nome + "correndo"
	}
}
