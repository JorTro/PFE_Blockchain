*** Projet de Fin d'Etudes ***

Imane El_Bagdouri
Jordan Troesch


I. Build the project
	- Configure your work environment with a stable version of Java, Maven, and Dropwizard.
	- Follow the installation of Woleet.io api : https://github.com/woleet/woleet-openapi-java-client
	- Import our project in a new Maven repository
	- Configure your Build Path 
	

II. Run Clients
1) Generate an Anchor
	- Go to the package anchorGeneration
	- Run the java Application to launch the REST service
	- The service is available to http://localhost:8080/generation/generateWoleetAnchor
	example: http://localhost:8080/generation/generateWoleetAnchor?userName=yourUserName&password=yourpassword&hash_SHA256=yourHash
	
2) Search for an existing Anchor
	- Go to the package anchorFinder
	- Run the java Application to launch the REST service
	- The service is available to http://localhost:8080/finder/findWoleetAnchorById
	example: http://localhost:8080/generation/generateWoleetAnchor?userName=yourUserName&password=yourpassword&anchorId=yourAnchorId
	
3) Generate the hash SHA256 of a file
	- Got to the package hashGeneration
	- Run the java Application to launch the REST service
	- The service is available to http://localhost:8080/hash/generateSha256
	example: http://localhost:8080/hash/generateSha256?filePath=yourFilePath
	
	
III Verify trees without Woleet.io 
	- merkel root on bitcoin verification website
	

	

	

	
