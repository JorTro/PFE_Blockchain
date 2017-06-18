package hashGeneration;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class HashSha256Application extends Application<Configuration> {
	
	public static void main(String [] args) throws Exception {
		new HashSha256Application().run(args); 
	}
	
	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
		environment.jersey().register(new HashSha256Ressource());
	}
}

