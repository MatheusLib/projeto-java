package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.acesso.Materiais;
import ecommerce.manipulation.ManipulacaoMaterial;

public class CompraMateriais implements ManipulacaoMaterial {

	ArrayList<Materiais> Carrinho = new ArrayList<Materiais>();
	private int quantidade;
	private int codigo=0;

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public void procurarPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		var material = buscarNaCollection(codigo);
		if (material != null)
			material.visualizar();
		else
			System.out.println("Material não encontrado");
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for (var materiais : Carrinho) {
			materiais.visualizar();

		}

	}

	@Override
	public void cadastrar(Materiais material) {
		// TODO Auto-generated method stub
		Carrinho.add(material);
		System.out.println("Material " + material.getNome() + " adicionado com sucesso!");
	}


	@Override
	public void deletar(int codigo) {
		// TODO Auto-generated method stub
		var material = buscarNaCollection(codigo);
		if (material != null) {
			if(Carrinho.remove(material)==true) {
				System.out.println("\nMaterial "+material.getNome()+" removido do carrinho com sucesso");
			}
		}
		else
			System.out.println("Material não encontrado");
		}

	public void valorDaCompra() {

	}

	public Materiais buscarNaCollection(int codigo) {
		for (var material : Carrinho) {
			if (material.getCodigo() == codigo) {
				return material;
			}
		}

		return null;
	}

	public void visualizacaosimples() {
		for (var materiais : Carrinho) {
			materiais.visuSimples();

		}

	}
	
	public int gerarCodigo() {
		return ++codigo;
	}	
	
	public void addCarrinho(Materiais material, int quantidade) {
		this.cadastrar(material);
		this.setQuantidade(quantidade);
		
		System.out.println(this.getQuantidade()+" materiais adicionados");
	}


}
