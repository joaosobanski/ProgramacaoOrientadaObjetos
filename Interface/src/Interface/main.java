package Interface;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1200.20);
		cc.sacar(300);
		
		

		cc.depositar(100200.20);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(500.50);
		cp.sacar(25);


		GeradorExtratos gerador = new GeradorExtratos();
		gerador.geradorConta(cc);
		gerador.geradorConta(cp);
	}

}
