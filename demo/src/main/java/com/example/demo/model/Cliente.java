package com.example.demo.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cliente_id")
	private Integer clienteId;

	@Column(name = "nome")
	private String nome;

	@Column(name = "documento")
	private String documento;

	@Column(name = "tipo_cliente")
	private String tipoCliente;

	@Column(name = "login")
	private String login;

	@Column(name = "senha")
	private String senha;

	@Column(name = "senha_app")
	private String senhaApp;

	@Column(name = "email")
	private String email;

	@Column(name = "email_secundario")
	private String emailSecundario;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "celular")
	private String celular;

	@Column(name = "data_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Column(name = "data_ultimo_login")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimoLogin;

	@Column(name = "status")
	private String status;

	@Column(name = "nascimento")
	@Temporal(TemporalType.DATE)
	private Date nascimento;

	@JoinColumn(name = "endereco_id", referencedColumnName = "endereco_id")
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	private Endereco endereco;

	@Column(name = "whitelist")
	private Boolean whitelist;

	@Column(name = "token")
	private boolean token;

	@Column(name = "redefinicao_senha")
	private Boolean redefinicaoSenha;

	@Column(name = "redefinicao_hash")
	private String redefinicaoHash;
	
	@Column(name = "numCardBilheteEletronico")
	private String numeroCartaoBilheteEletronico;

	@Column(name = "usuCardBilheteEletronico")
	private String usuarioCartaoBilheteEletronico;

	@Column(name = "compraRioCard")
	private Boolean compraRioCard;

	@Column(name = "informativoEmail")
	private Boolean informativoEmail;

	@Column(name = "nomeMae")
	private String nomeMae;

	@Column(name = "nomePai")
	private String nomePai;

	@Column(name = "tituloEleitor")
	private String tituloEleitor;

	@Column(name = "rg")
	private String rg;

	@Column(name = "ufRg")
	private String ufRg;

	@Column(name = "idoso_intermunicipal")
	private Boolean idosoIntermunicipal;

	@Column(name = "idoso_interestadual")
	private Boolean idosoInterestadual;

	@Column(name = "reserva_idoso")
	private Boolean reservaIdoso;

	@Column(name = "data_alteracao_usuarios_int")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;

	@Column(name = "nome_usuarios_int")
	private String nomeUsuariosInt;

	@Column(name = "codigo_usuarios_int")
	private Integer codigoUsuariosInt;

	@Column(name = "hash_ativacao")
	private String hashAtivacao;

	@Column(name = "token_ios")
	private String tokenIos;

	@Column(name = "token_android")
	private String tokenAndroid;

	@Column(name = "habilita_pagamento")
	private Boolean habilitaPagamento;

	@Column(name = "genero")
	private String genero;
	
	@Column(name = "data_ultimo_login_auxiliar")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimoLoginAuxiliar;

	@Column(name = "data_envio_sms")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEnvioSMS;

	@Column(name = "tipo_faturamento")
	private Integer tipoFaturamento;

	@Column(name = "area_atuacao")
	private String areaAtuacao;

	@Column(name = "opt_in")
	private Boolean optIn;

	@Column(name = "loginClearSale")
	private String loginClearSale;

	@Column(name = "origem_cadastro")
	private String origemCadastro;

	@Column(name = "pendente")
	private Boolean pendente;

	@Column(name = "marka_fidelidade")
	private boolean markaFidelidade;

	@Column(name = "user_id_apple")
	private String userIdApple;
	
	@Column(name="lgpd_resposta_aceite", length = 10)
	private String lgpdRespostaAceite;
	
	@Column(name = "lgpd_data_hora_resposta_aceite")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lgpdDataHoraRespostaAceite;

	@Column(name = "lgpd_data_hora_servidor_resposta_aceite")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lgpdDataHoraServidorRespostaAceite;
	
	@Column(name = "numero_compras_efetuadas")
	private Integer numeroComprasEfetuadas;
}