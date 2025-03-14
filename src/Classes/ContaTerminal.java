package Classes;

public class ContaTerminal {
	
	private int numero;
	private String agencia, nomeCliente;
	private double saldo;
	
	public ContaTerminal(int numero, String agencia, double saldo, String nomeCliente) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.saldo =  saldo;
		this.nomeCliente =nomeCliente;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
