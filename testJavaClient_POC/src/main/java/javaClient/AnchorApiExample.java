package javaClient;

import io.woleet.api.*;
import io.woleet.api.auth.*;
import io.woleet.api.client.AnchorApi;
import io.woleet.api.client.model.Anchor;
import io.woleet.api.client.model.AnchorIds;

import java.io.File;
import java.util.*;

public class AnchorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("jordan.troesch@telecom-sudparis.eu");
        BasicAuth.setPassword("2345Douli@doud");

        AnchorApi apiInstance = new AnchorApi();
        Anchor anchor = new Anchor(); // Anchor | Anchor object to create. 
        /*
        anchor.setHash("2ed0f0289930159765073fe775e4f3c33c822ed73703a5c6196b7692d70e222b");
        anchor.setName("test the API with the javaClient");
        */
        try {
        	// Create Anchor -> OK
        	/*
            Anchor result = apiInstance.createAnchor(anchor);
            System.out.println(result);
            */
            // Search an Anchor -> OK            
            AnchorIds Id = apiInstance.searchAnchorIds( "f871ed3af6d8fbaa2cbba4ba76a90666a03f8fd237c81c1c35cdb672d7a0fb70" , 1, 14);
            System.out.println(Id);
            
        } catch (ApiException e) {
            System.err.println("Exception when calling AnchorApi#createAnchor");
            e.printStackTrace();
        }
    }
}
