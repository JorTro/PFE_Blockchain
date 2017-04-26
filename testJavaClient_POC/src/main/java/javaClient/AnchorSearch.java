package javaClient;

import io.woleet.api.*;
import io.woleet.api.auth.*;
import io.woleet.api.client.AnchorApi;
import io.woleet.api.client.model.Anchor;
import io.woleet.api.client.model.AnchorIds;
import net.codejava.security.FileHashGenerator_SHA256;

import java.io.File;
import java.util.*;

public class AnchorSearch {

    public static void main(String[] args) {
    	String anchorId = args[0];
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("jordan.troesch@telecom-sudparis.eu");
        BasicAuth.setPassword("2345Douli@doud");

        AnchorApi apiInstance = new AnchorApi();
        Anchor anchor = new Anchor(); // Anchor | Anchor object to search. 
             
        try {
        	
            // Search an Anchor            
        	anchor = apiInstance.getAnchor(anchorId);
        	System.out.println("Id of the Anchor to search : " + anchorId);
        	System.out.println("Name of the Anchor : " + anchor.getName()); // Name of the Anchor
            System.out.println("Anchor found");
            
        } catch (ApiException e) {
            System.err.println("Exception when calling AnchorApi#createAnchor");
            e.printStackTrace();
        }
    }
}

