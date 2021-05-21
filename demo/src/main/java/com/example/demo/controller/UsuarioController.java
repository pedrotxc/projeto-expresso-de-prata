package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Usuario;
import com.example.demo.service.ClienteService;
import com.example.demo.service.UsuarioExtraService;
import com.example.demo.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	ClienteService clienteService;
	@Autowired
	UsuarioExtraService usuarioExtraService;
	
	@GetMapping(value = "/teste")
	public ResponseEntity<String> buscarTodos() throws ParseException {
		usuarioService.buscaTodos();
		return ResponseEntity.ok().body("");
	}
	
	@GetMapping(value = "/teste2")
	public ResponseEntity<Usuario> buscaUm() throws ParseException{
		Usuario usuario = usuarioService.buscarUmBurro();
		Cliente cliente = usuarioService.converteUsuarioToCliente(usuario);
		clienteService.salvarBurro(cliente);
		return ResponseEntity.ok().body(usuario);
	}
	
	@GetMapping(value = "/teste3")
	public ResponseEntity<List<Cliente>> buscarTodosClientes(){
		List<Cliente> teste = clienteService.buscarTodos();
		return ResponseEntity.ok().body(teste);
	}
	
}