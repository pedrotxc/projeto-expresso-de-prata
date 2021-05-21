package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
	private String ultimo_login;
	@Id
	private String username;
	private String password;
	private String nombre;
	private String tarjeta;
	private String direccion;
	private String cpostal;
	private String ciudad;
	private String provincia;
	private String pais;
	private String telefono;
	private String ativo;
	private String telefonecel;
	private String documento;
	private String celular;
	private String comercial;
	private String extra;
	private String activo;
	private Integer gacetilla;
	private String cliente;
	private String alta;
	private String email;
	private String tipodoc;
	@JoinColumn(name = "username", referencedColumnName = "username")
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	private UsuarioExtra usuarioExtra;
}
