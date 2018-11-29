/**
 * 
 */
package br.com.projeto.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Grupo 3
 * Classe que transforma a imagem em bytes 
 *
 *
 */
public class imagemUtil {

	public static byte[] extractBytes(String ImageName) throws IOException {
		File imgPath = new File(ImageName);
		byte[] fileContent = Files.readAllBytes(imgPath.toPath());
		
		return fileContent;
	}

}
