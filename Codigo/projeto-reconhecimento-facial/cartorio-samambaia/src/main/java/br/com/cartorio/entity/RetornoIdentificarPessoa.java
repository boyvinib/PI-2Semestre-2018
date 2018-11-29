/**
 * 
 */
package br.com.cartorio.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Grupo 3
 * Classe que mostra todas as pessoas cadastrada 
 *
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RetornoIdentificarPessoa {

	private String mensagem;
	private List<PessoasIdentificadas> identificarPessoa;
	
}
