package anchorFinder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import wooletApiCommunication.AnchorSearch;

@Path("/finder") 
public class AnchorFinderRessources {
	 
	public AnchorFinderRessources() {}
	 
	
	
	/**
	 * Find a Woleet Anchor by its Id
	 * @param userName: (String, mandatory) name of the user for woleet authentication
	 * @param password: (String, mandatory) password of the user for woleet authentication
	 * @param anchorId: (String, mandatory) Anchor Id
	 * @return
	 */
	@GET
	@Path("/findWoleetAnchorById")
	public String findWoleetAnchorById(@QueryParam("userName") String userName,
			@QueryParam("password") String password,
			@QueryParam("anchorId") String anchorId)
			{		
		return AnchorSearch.searchAnchor(userName, password, anchorId);		
	}
}

