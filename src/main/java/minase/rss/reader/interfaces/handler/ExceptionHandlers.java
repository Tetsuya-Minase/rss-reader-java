package minase.rss.reader.interfaces.handler;

import lombok.extern.slf4j.Slf4j;
import minase.rss.reader.domains.model.FeedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception handlers.
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandlers {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({FeedException.class})
    public FeedException handleFeedError(final FeedException ex) {
        log.warn("status: " + ex.getCode() + " message: " + ex.getMessage());
        return ex;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public Exception unhandledException(final Exception ex) {
        log.error("status: 500" + " error: " + ex.toString());
        return ex;
    }
}
