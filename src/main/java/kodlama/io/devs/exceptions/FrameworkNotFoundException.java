package kodlama.io.devs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FrameworkNotFoundException extends RuntimeException {
    public FrameworkNotFoundException(String message) {
        super(message);
    }
}
