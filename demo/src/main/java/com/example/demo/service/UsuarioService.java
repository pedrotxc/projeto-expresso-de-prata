package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.model.Endereco;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	EntityManager em;
	
	public void buscaTodos(){
		for(int i = 0; i <= 3; i++) {
			 usuarioRepository.findAll(PageRequest.of(i, 100000)).getContent().stream().forEach(x -> {
				 try {
					em.persist(converteUsuarioToCliente(x));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			});
			 System.out.println(i);
		}
	}
	
	public Usuario buscarUmBurro() {
		Usuario burro = usuarioRepository.findById("327.267.158-77").get();
		return burro;
	}
	
	public Cliente converteUsuarioToCliente(Usuario usuario) throws ParseException {
		Cliente cliente = new Cliente();
		cliente.setDataUltimoLogin(converteData(usuario.getUltimo_login()));
		cliente.setLogin(usuario.getUsername());
		cliente.setSenha(usuario.getPassword());
		cliente.setNome(usuario.getNombre());
		cliente.setTelefone(usuario.getTelefono());
		cliente.setStatus("1");
		cliente.setCelular(usuario.getTelefonecel());
		cliente.setDocumento(usuario.getDocumento());
		cliente.setEmail(usuario.getEmail());
		cliente.setNumeroComprasEfetuadas(0);
		cliente.setOptIn(false);
		//Instanciando Endereco
		Endereco endereco = new Endereco();
		endereco.setRua(usuario.getDireccion());
		endereco.setCep(usuario.getCpostal());
		endereco.setCidade(usuario.getCiudad());
		endereco.setEstado(usuario.getProvincia());
		endereco.setPais(usuario.getPais());
		endereco.setNumero(usuario.getUsuarioExtra().getNumero());
		endereco.setComplemento(usuario.getUsuarioExtra().getComplemento());
		endereco.setBairro(usuario.getUsuarioExtra().getBairro());
		
		cliente.setEndereco(endereco);
		
		
		return cliente;
	}
	
	private Date converteData(String date) throws ParseException {
		Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
		return date1;
	}
}