package com.mkss.infotek.SistemasVentasWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkss.infotek.SistemasVentasWeb.entity.Cliente;
import com.mkss.infotek.SistemasVentasWeb.repository.Dao;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private Dao<Cliente> dao;
	
	
	@GetMapping("/listar")
	public String listarClientes(Model model) { // doGet
		
		Iterable<Cliente> listadoClientes = dao.obtenerTodos();
		
		model.addAttribute("titulo", "Listado de Platos");
		model.addAttribute("platos", listadoClientes);
		log.info(listadoClientes.toString());

		return "/cliente";
	}

}
