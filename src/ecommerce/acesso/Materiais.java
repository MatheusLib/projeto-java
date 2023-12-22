package ecommerce.acesso;

public class Materiais {

	private String nome;
	private int codigo;
	private float valor;
	private int quantidade;

	public Materiais(String nome, int codigo, float valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}

	
	public Materiais(String nome, int codigo, float valor, int quantidade) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}


	public void visualizar() {
		System.out.println("\n*****************************************************");
		System.out.println("\n Material: " + this.nome);
		System.out.println("\n Código do Material: " + this.codigo);
		System.out.println("\n Preço: R$" + this.valor);

	}
	public void visuSimples() {
		System.out.println(" Material: " + this.nome+"\tCódigo do Material: "+ this.codigo+ "\tPreço: R$" + this.valor);
		if (quantidade >= 0)
			System.out.println("Quantidade: "+quantidade);
	}

}
