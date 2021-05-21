package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UsuarioExtra;
import com.example.demo.repository.UsuarioExtraRepository;

@Service
public class UsuarioExtraService {
	
	@Autowired
	UsuarioExtraRepository usuarioExtraRepository;
	
	public UsuarioExtra buscaUm() {
		UsuarioExtra usuario = usuarioExtraRepository.findById("327.267.158-77").get();
		return usuario;
	}
	
	public List<UsuarioExtra> buscaTodos(){
		List<UsuarioExtra> listarTodos = usuarioExtraRepository.findAll();
		return listarTodos;
	}
}