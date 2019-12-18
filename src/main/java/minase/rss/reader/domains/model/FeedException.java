package minase.rss.reader.domains.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Feed Exception.
 */
@Getter
@AllArgsConstructor
public class FeedException extends RuntimeException {
    /**
     * status code.
     */
    private final int code;
    /**
     * error message.
     */
    private final String message;
}
