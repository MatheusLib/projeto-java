package ecommerce.acesso;

public class ContaCliente extends Conta {
	private int numero;

	public ContaCliente(String login, String senha, int tipo, int numero) {
		super(login, senha, tipo);
		this.numero = numero;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nº da conta: " + this.numero);
	}
	

}
