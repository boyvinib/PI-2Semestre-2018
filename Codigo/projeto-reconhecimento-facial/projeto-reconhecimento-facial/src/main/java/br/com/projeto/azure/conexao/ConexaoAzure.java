/**
 * 
 */
package br.com.projeto.azure.conexao;

import br.com.microsoft.azure.cognitiveservices.vision.faceapi.FaceAPI;
import br.com.microsoft.azure.cognitiveservices.vision.faceapi.FaceAPIManager;
import br.com.microsoft.azure.cognitiveservices.vision.faceapi.models.AzureRegions;
import br.com.projeto.constants.Constantes;

/**
 * @author Grupo 3
 * Classe que faz a autenticacao com o servidor da azure
 *
 */
public class ConexaoAzure {
	
	public static FaceAPI ConectaAzureBrasil() {
		return FaceAPIManager.authenticate(AzureRegions.BRAZILSOUTH, Constantes.subscriptionKey);
		
		/**
		 * @author Grupo 3
		 * @return retorna a conexao 
		 * 
		 */
		
	}

}
