package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.acesso.Conta;
import ecommerce.manipulation.ManipulacaoConta;

public class ControladorDeConta implements ManipulacaoConta {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++numero;
	}
	
	
	

}
