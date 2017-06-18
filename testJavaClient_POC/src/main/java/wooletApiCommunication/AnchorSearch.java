package wooletApiCommunication;

import io.woleet.api.*;
import io.woleet.api.auth.*;
import io.woleet.api.client.AnchorApi;
import io.woleet.api.client.model.Anchor;

public class AnchorSearch {

    public static String searchAnchor(String userName, String password, String anchorId) {
    	String anchorDescription="";
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername(userName);
        BasicAuth.setPassword(password);

        AnchorApi apiInstance = new AnchorApi();
        Anchor anchor = new Anchor(); // Anchor | Anchor object to search. 
             
        try {        	
            // Search an Anchor            
        	anchor = apiInstance.getAnchor(anchorId);
        	anchorDescription= String.format("Id:%s, name:%s, hash:%s, status:%s \n",
            		anchor.getId(), anchor.getName(), anchor.getHash(), anchor.getStatus());
            
        } catch (ApiException e) {
            System.err.println("Exception when calling AnchorApi#findAnchor");
            e.printStackTrace();
        }
        return anchorDescription;
    }
}

