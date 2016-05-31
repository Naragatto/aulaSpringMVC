package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.csi.dao.ClienteDao;
import br.csi.model.Cliente;

@Controller
public class ClienteController {
	
	
	@RequestMapping("clientes")
	public String msgTeste(){
		System.out.println("chamou o controlador");
		return "cliente";
	}
	
	@RequestMapping("addClientes")
	public String adiciona(Cliente c){
		
		boolean  retorno = new ClienteDao().adicionar(c);
		
		if(retorno)
			return "cliente";
		else
			return "erro";
	}
	
	
	@RequestMapping("listaClientes")
	public ModelAndView lista(){
		
		ModelAndView mv= new ModelAndView("cliente");
		
		mv.addObject("clientes", new ClienteDao().listaCliente());
				
		return mv;
		
	}
	
}
