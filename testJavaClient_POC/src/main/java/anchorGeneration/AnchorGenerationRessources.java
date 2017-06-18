package anchorGeneration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import wooletApiCommunication.AnchorCreator;

@Path("/generation") 
public class AnchorGenerationRessources {
	 
	public AnchorGenerationRessources() {}
	 
	
	
	/**
	 * 
	 * @param userName: (String, mandatory) name of the user for woleet authentication
	 * @param password: (String, mandatory) password of the user for woleet authentication
	 * @param name: (String, mandatory) Anchor name (don't need to be unique)
	 * @param hash_SHA256): (String, mandatory) SHA256 hash (ie. the fingerprint) of the original data to anchor.
	 * @param publicAnchor: (Boolean, optional) true (or unset) if the anchor is public. false if the anchor is private.
							If this field is not set at creation time, the anchor is public by default. 
	 * @param tags (ArrayList<String>, optional) Set of tags associated to the anchor. There is no restriction on tag names, except they cannot contain spaces.
					Tags are aimed at classifying and searching anchors.
	 * @param metadata (Object, optional) A JSON object containing a set of key/values to store with the anchor and giving additional information about the anchored data.
	 * @return
	 */
	@GET
	@Path("/generateWoleetAnchor")
	public String generateWoleetAnchor(@QueryParam("userName") String userName,
			@QueryParam("password") String password,
			@QueryParam("anchorName") String anchorName, 
			@QueryParam("hash_SHA256") String hash_SHA256, 
			@QueryParam("publicAnchor") Boolean publicAnchor
			//@QueryParam("tags") ArrayList<String> tags,  >>> ERROR dropwizard does not accept list ???
			//@QueryParam("metadata") Object metadata  >>> ERROR dropwizard does not accept Object ???
			)
			{
	
		AnchorCreator.createAnchor(userName, password, anchorName, hash_SHA256, publicAnchor //, tags, metadata
		);
		return "generation OK";		
	}
}
