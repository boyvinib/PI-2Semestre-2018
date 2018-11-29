/**
 * 
 */
package br.com.cartorio.entity;

import javax.validation.constraints.NotNull;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Grupo 3
 *
 */
@Getter @Setter
public class Endereco {
	
	private long id;
	
	@Expose
	@NotNull (message = "Preencha o endereço")
	private String endereco;
	
	/**
	 * 	Endereco a ser cadastrado
	 *  @Param endereco
	 */
	
	@Expose
	@NotNull (message = "Preencha o número")
	private String numero;
	
	/**
	 * 	Numero da residencia a ser cadastrado
	 *  @Param numero
	 */
	
	@Expose
	@NotNull (message = "Preencha o cep")
	private String cep;
	
	/**
	 * 	Cep da residencia a ser cadastrado
	 *  @Param cep
	 */
	
	@Expose
	@NotNull(message = "Preencha o bairro")
	private String logradouro;
	
	/**
	 * 	logradouro da residencia a ser cadastrado
	 *  @Param logradouro
	 */
	
	@Expose
	@NotNull (message = "Preencha o bairro")
	private String bairro;
	
	/**
	 * 	bairro da residencia a ser cadastrado
	 *  @Param bairro
	 */
	
	@Expose
	@NotNull (message = "Preencha a cidade")
	private String cidade;
	
	/**
	 * 	cidade da residencia a ser cadastrado
	 *  @Param cidade
	 */
	
	@Expose
	@NotNull (message = "Preencha o estado")
	private String estado;
	
	/**
	 * 	estado da residencia a ser cadastrado
	 *  @Param estado
	 */
	
	@Expose
	@NotNull (message = "Preencha o pais")
	private String pais;
	
	/**
	 * 	pais da residencia a ser cadastrado
	 *  @Param pais
	 */
	
	@Expose
	private Pessoa pessoa;
	
	/**
	 * 	pessoa a qual a residencia vai ser associado
	 *  @Param pessoa
	 */

	
}
