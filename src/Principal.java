import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		List<Conta> contas = new ArrayList<>(Arrays.asList(cc, poupanca));
		
		Banco bancoB = new Banco("Bradesco");
		
		bancoB.setContas(contas);
		
		System.out.println(bancoB);

	}

}
