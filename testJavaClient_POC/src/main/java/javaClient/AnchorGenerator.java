package javaClient;

import io.woleet.api.*;
import io.woleet.api.auth.*;
import io.woleet.api.client.AnchorApi;
import io.woleet.api.client.model.Anchor;
import io.woleet.api.client.model.AnchorIds;
import net.codejava.security.FileHashGenerator_SHA256;

import java.io.File;
import java.util.*;

/**
 * 
 * Generate an Anchor with the Woleet.io API
 * 1. Connection to the API
 * 2. Generate the Hash of the file with the SHA_256 algorithm
 * 3. Configure properties of the Anchor
 * 4. Create the Anchor 
 */
public class AnchorGenerator {

    public static void main(String[] args) {
    	String filePath = args[0];
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("jordan.troesch@telecom-sudparis.eu");
        BasicAuth.setPassword("2345Douli@doud");

        AnchorApi apiInstance = new AnchorApi();
        Anchor anchor = new Anchor(); // Anchor | Anchor object to create.         
        FileHashGenerator_SHA256 hash = new FileHashGenerator_SHA256(); // Hash to create
        
        // Configure properties of the Anchor
        anchor.setHash(hash.generateHash(filePath)); // Put the file path >>> mandatory field            
        anchor.setName("test03"); // Put the name of the Anchor >>> Mandatory field
        
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
