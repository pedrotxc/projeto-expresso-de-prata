package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "usuario_extra")
public class UsuarioExtra {
	@Id
	@Column(name = "username")
	private String username;
	private String sexo;
	private String nacimiento_dia;
	private String nacimiento_mes;
	private String nacimiento_ano;
	private String numero;
	private String bairro;
	private String complemento;
}