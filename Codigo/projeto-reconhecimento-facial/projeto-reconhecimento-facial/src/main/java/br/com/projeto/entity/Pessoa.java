/**
 * 
 */
package br.com.projeto.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Grupo 3
 *
 * Classe que representa a pessoa que vai ser cadastrada, com todos seus dados.
 * 
 *  
 */

@Entity
@Table(name = "PESSOA")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Pessoa {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome", nullable=false)
	@NotBlank(message = "Preencha o nome")
	@NotNull (message = "Preencha o nome")
	private String nome;
	/**
	 * 	Nome do usuario a ser cadastrado
	 *  @Param nome
	 */
	
	@CPF(message="Cpf precisa ser válido")
	@Column(name="cpf", unique = true, nullable=false)
	private String cpf;
	/**
	 * 	CPF do usuario a ser cadastrado
	 *  @Param cpf
	 */
	@Column(name="rg", nullable=false)
	@NotBlank(message = "Preencha o rg")
	@NotNull (message = "Preencha o rg")
	private String rg;
	/**
	 * 	Rg do usuario a ser cadastrado
	 *  @Param rg 
	 */
	@Column(name="telefoneresidencial", nullable=false)
	@NotBlank(message = "Preencha o telefone")
	@NotNull (message = "Preencha o telefone")
	@Pattern(regexp = "[0-9]*", message = "Atenção, digite somente números")
	private String telefoneresidencial;
	/**
	 * 	Telefone residencial do usuario a ser cadastrado
	 *  @Param telefoneresidencial 
	 */
	@Email(message="E-mail precisa ser válido")
	@Column(name="email", nullable=false)
	@NotBlank(message = "Preencha o e-mail")
	@NotNull (message = "Preencha o e-mail")
	private String email;
	/**
	 * 	Email do usuario a ser cadastrado
	 *  @Param email
	 */
	@Column(name="personid", nullable=true)
	private String personId;
	/**
	 * 	ID do usuario a ser cadastrado, o id � autoincremente 
	 *  @Param id 
	 */
	@Column(name="persongroupid", nullable=true)
	private String personGroupId;
	/**
	 * 	Grupo ao qual o ID do usuario a ser cadastrado esta relacionado
	 *  @Param personGroupId
	 */
	@Lob
	@Column(name="imagem", nullable=false, columnDefinition="mediumblob")
	private byte[] imagem;
	/**
	 * 	Foto do usuario a ser cadastrado
	 *  @Param imagem
	 */
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="endereco_id")
	@Valid
	private Endereco endereco;
	/**
	 * 	Endereco do usuario a ser cadastrado e associado ao usuario
	 *  @Param Endereco 
	 */
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefoneresidencial="
				+ telefoneresidencial + ", email=" + email + ", personId=" + personId + ", personGroupId="
				+ personGroupId + "endereco=" + endereco + "]";
	}
	
	
}
