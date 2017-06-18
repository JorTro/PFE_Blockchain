package anchorGeneration;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class AnchorGenerationApplication extends Application<Configuration> {
	
	public static void main(String [] args) throws Exception {
		new AnchorGenerationApplication().run(args); 
	}
	
	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
		environment.jersey().register(new AnchorGenerationRessources());
	}
}
