package logg;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class helloWorld {

	// TODO Auto-generated constructor stub

	private static final Logger logger = Logger.getLogger(helloWorld.class);

	public static void main(String[] args) {
		// basic log4j configurator
		BasicConfigurator.configure();
		logger.info("Hello world");
		logger.info("we are in logger info mode");
	}

}
