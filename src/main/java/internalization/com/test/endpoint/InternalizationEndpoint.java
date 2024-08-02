package internalization.com.test.endpoint;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InternalizationEndpoint {
	
	private static final Logger log = LoggerFactory.getLogger(InternalizationEndpoint.class);

	@Autowired
    MessageSource messageSource;
     
    @GetMapping("/")
    
    public String index(Locale locale) {
    	log.info("locale:{}",locale);

        return messageSource.getMessage("welcome.text", null, locale);
    }
	

}
