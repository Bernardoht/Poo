
public class Conta {
	private int numero;
	private Cliente titular = new Cliente();
	private double saldo;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	public void mostraDados() {
		System.out.println("Número: "+this.numero);
		System.out.println("Saldo: R$"+this.saldo);
		System.out.println("Dados do titular: ");
		this.titular.mostraDados();
	}
	public double getSaldo() {
		return this.saldo;
	}

	boolean saca(double valor) {
		if (this.saldo < valor)
			return false;
		else {
			this.saldo -= valor;
			return true;
		}
	}

	boolean deposita(double valor) {
		if (valor <= 0)
			return false;
		else {
			this.saldo += valor;
			return true;
		}
	}

	public boolean transferePara(Conta contaDestino, double valor) {
		if (this.saca(valor) == true) {
			contaDestino.deposita(valor);
			return true;
		} else
			return false;
	}
}
