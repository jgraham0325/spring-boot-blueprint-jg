package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class ExampleController {

	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory.getLogger(ExampleController.class);

	// example of loading a property value from application.properties into a Java file
	@Value("${propValue1}")
	private String propValue;

	@RequestMapping(path="/api/v1/endpoint", method=RequestMethod.GET)
	@ApiOperation(value="endpoint short description",notes="some notes about endpoint")
	public String index() throws Exception {
		return "Endpoint is working..." + propValue;
	}

	/**
	 * Example of throwing runtime exception
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(path="/api/v1/exception-endpoint", method=RequestMethod.GET)
	public String exceptionEndpoint() throws Exception {

		if (true) {
			logger.error("TEST ERROR MESSAGE 1", new Exception("exception123"));
		}

		return "Endpoint is working..." + propValue;
	}

}
