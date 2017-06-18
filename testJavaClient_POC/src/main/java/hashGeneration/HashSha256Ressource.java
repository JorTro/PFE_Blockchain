package hashGeneration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import net.codejava.security.FileHashGenerator_SHA256;

@Path("/hash") 
public class HashSha256Ressource {
	 
	public HashSha256Ressource() {}
	 
	
	
	/**
	 * generate the hash SHA256 of a file
	 * @param filePath
	 * @return the hash
	 */
	@GET
	@Path("/generateSha256")
	public String generateSha256(@QueryParam("filePath") String filePath)
			{		
			FileHashGenerator_SHA256 hash = new FileHashGenerator_SHA256();
			return hash.generateHash(filePath);			
	}
}

