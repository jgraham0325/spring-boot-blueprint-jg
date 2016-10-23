package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory.getLogger(ExampleController.class);

	// example of loading a property value from application.properties into a Java file
	@Value("${propValue1}")
	private String propValue;

	@RequestMapping("/endpoint")
	public String index() throws Exception {
		return "Endpoint is working..." + propValue;
	}

	/**
	 * Example of throwing runtime exception
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exception-endpoint")
	public String exceptionEndpoint() throws Exception {

		if (true) {
			logger.error("TEST ERROR MESSAGE 1", new Exception("exception123"));
		}

		return "Endpoint is working..." + propValue;
	}

}
