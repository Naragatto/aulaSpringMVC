package br.csi.dao;

import java.util.ArrayList;

import br.csi.model.Cliente;

public class ClienteDao {
	
private ArrayList<Cliente> clientes;
	
	private void initClientes(){
		
		clientes = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		c.setNome("Test1");
		c.setBairro("Test1");
		c.setRuaNumComp("Test1");
		c.setCidade("Test1");
		
		Cliente c1 = new Cliente();
		c1.setNome("Test2");
		c1.setBairro("Test2");
		c1.setRuaNumComp("Test2");
		c1.setCidade("Test2");
		
		clientes.add(c);
		clientes.add(c1);
		
	}

	public boolean adicionar(Cliente c){
		System.out.println("Nome: "+c.getNome());
		System.out.println("Rua "+c.getRuaNumComp());
		
		return true;
	}
	
	
	public ArrayList<Cliente> listaCliente(){
		initClientes();
		return clientes;
	}
}
