package ecommerce.acesso;

public class ContaAdm extends Conta {
	private int autorizacaoAcesso;

	public ContaAdm(String login, String senha, int tipo, int autorizacaoAcesso) {
		super(login, senha, tipo);
		this.autorizacaoAcesso = autorizacaoAcesso;
	}

	/**
	 * @return the autorizacaoAcesso
	 */
	public int getAutorizacaoAcesso() {
		return autorizacaoAcesso;
	}

	/**
	 * @param autorizacaoAcesso the autorizacaoAcesso to set
	 */
	public void setAutorizacaoAcesso(int autorizacaoAcesso) {
		this.autorizacaoAcesso = autorizacaoAcesso;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		String autorizacaoAcesso = "";

		switch (this.autorizacaoAcesso) {
		case 1:
			autorizacaoAcesso = "ADM Completo";
			break;
		case 2:
			autorizacaoAcesso = "ADM Visulização de clientes";
			break;
		case 3:
			autorizacaoAcesso = "ADM Atualização de materiais";
		}
		
		System.out.println("Tipo de autorização de Acesso: " + autorizacaoAcesso);
	}
	

}
