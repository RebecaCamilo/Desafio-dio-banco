
public class Principal {

	public static void main(String[] args) {

		Cliente rebeca = new Cliente();
		rebeca.setNome("Rebeca");
		
		Conta cc = new ContaCorrente(rebeca);
		Conta poupanca = new ContaPoupanca(rebeca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
