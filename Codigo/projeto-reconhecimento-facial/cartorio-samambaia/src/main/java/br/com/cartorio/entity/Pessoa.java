/**
 * 
 */
package br.com.cartorio.entity;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Grupo 3
 *
 * Classe que representa a pessoa que vai ser cadastrada, com todos seus dados.
 * 
 *  
 */

@Getter
@Setter
public class Pessoa {

	private long id;

	@Expose
	@NotNull (message = "Preencha o nome")
	private String nome;
	
	/**
	 * 	Nome do usuario a ser cadastrado
	 *  @Param nome
	 */

	@Expose
	@CPF(message="Cpf precisa ser válido")
	private String cpf;
	
	/**
	 * 	CPF do usuario a ser cadastrado
	 *  @Param cpf
	 */

	@Expose
	@NotNull (message = "Preencha o rg")
	private String rg;
	
	/**
	 * 	Rg do usuario a ser cadastrado
	 *  @Param rg 
	 */

	@Expose
	@NotNull (message = "Preencha o telefone")
	@Pattern(regexp = "[0-9]*", message = "Atenção, digite somente números")
	private String telefoneresidencial;
	
	/**
	 * 	Telefone residencial do usuario a ser cadastrado
	 *  @Param telefoneresidencial 
	 */

	@SuppressWarnings("deprecation")
	@Expose
	@Email(message="E-mail precisa ser válido")
	@NotNull (message = "Preencha o e-mail")
	private String email;
	
	/**
	 * 	Email do usuario a ser cadastrado
	 *  @Param email
	 */

	@Expose
	private String personId;
	
	/**
	 * 	ID do usuario a ser cadastrado, o id � autoincremente 
	 *  @Param id 
	 */

	@Expose
	private String personGroupId;
	
	/**
	 * 	Grupo ao qual o ID do usuario a ser cadastrado esta relacionado
	 *  @Param personGroupId
	 */

	@Expose
	private byte[] imagem;
	
	/**
	 * 	Foto do usuario a ser cadastrado
	 *  @Param imagem
	 */

	@Expose
	@Valid
	private Endereco endereco;
	
	/**
	 * 	Endereco do usuario a ser cadastrado
	 *  @Param Endereco 
	 */
	
}
