package wooletApiCommunication;

import io.woleet.api.ApiClient;
import io.woleet.api.ApiException;
import io.woleet.api.Configuration;
import io.woleet.api.auth.HttpBasicAuth;
import io.woleet.api.client.AnchorApi;
import io.woleet.api.client.model.Anchor;

public class AnchorCreator {

	public static void createAnchor(String userName, String password, String name, String hash_SHA256, 
			Boolean publicAnchor //, ArrayList<String> tags, Object metadata
			) {
        
		ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername(userName);
        BasicAuth.setPassword(password);

        AnchorApi apiInstance = new AnchorApi();
        Anchor anchor = new Anchor(); // Anchor | Anchor object to create.         
        
        // Configure properties of the Anchor
        anchor.setName(name); // Put the name of the Anchor >>> Mandatory field
        anchor.setHash(hash_SHA256); // Put the file path >>> mandatory field   
        anchor.setPublic(publicAnchor);
        //TODO anchor.setTags(tags);
        //TODO anchor.setMetadata(metadata);
        
        
        
        try {
        	// Create Anchor 
        	Anchor result = apiInstance.createAnchor(anchor);
            System.out.println(result);
           
            
        } catch (ApiException e) {
            System.err.println("Exception when calling AnchorApi#createAnchor");
            e.printStackTrace();
        }

	}

}
