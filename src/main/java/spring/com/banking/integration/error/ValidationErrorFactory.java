package spring.com.banking.integration.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ValidationErrorFactory {

    Logger log = LoggerFactory.getLogger(ValidationErrorFactory.class);
    private ValidationError validationError;


    public ValidationError customerEmailArealdyExist() {
        return validationError;
    }
}
