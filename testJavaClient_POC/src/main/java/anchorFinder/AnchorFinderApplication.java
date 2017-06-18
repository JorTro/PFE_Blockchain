package anchorFinder;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class AnchorFinderApplication extends Application<Configuration> {
	
	public static void main(String [] args) throws Exception {
		new AnchorFinderApplication().run(args); 
	}
	
	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
		environment.jersey().register(new AnchorFinderRessources());
	}
}

