package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> buscarTodos(){
		List<Cliente> lista = clienteRepository.findAll();
		return lista;		
	}
	
	public void salvarBurro(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void salvarOsBurroTudo(List<Cliente> clientes) {
		clienteRepository.saveAll(clientes);
	}
}