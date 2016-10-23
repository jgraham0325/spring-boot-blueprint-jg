package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory
			.getLogger(HelloController.class);
	
	//example of loading a property value from application.properties into a Java file
	@Value("${propValue1}")
	private String propValue;
    
    @RequestMapping("/endpoint")
    public String index() throws Exception {
    	
    	if (true){
    		
    		logger.error("TEST ERROR MESSAGE 1", new Exception("exception123"));
    	}
    	
        return "Endpoint is working..."+propValue;
    }
    
}