package net.codejava.security;

import java.io.File;

/**
 * Test generating hash values from File.
 * @author www.codejava.net
 *
 */
public class FileHashGenerator_SHA256 {

	public String generateHash(String filePath) {
		String sha256Hash="";
		try {
			System.out.println("File Path: " + filePath);
			File file = new File(filePath);
			
			// SHA256 for Woleet API
			sha256Hash = HashGeneratorUtils.generateSHA256(file);						

		} catch (HashGenerationException ex) {
			ex.printStackTrace();
		}
		// return Hash
		return sha256Hash;
	}

}

