package ecommerce.manipulation;

import ecommerce.acesso.Materiais;

public interface ManipulacaoMaterial {
	
	// CRUD das contas e do carrinho
	public void procurarPorCodigo(int codigo);
	public void listarTodas();
	public void deletar(int codigo);
	void cadastrar(Materiais material);
	
}
